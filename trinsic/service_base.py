"""
Base class and helper methods for the Service wrappers
"""
from abc import ABC
from typing import Dict

from betterproto import Message
from grpclib.client import Channel

import trinsic
from trinsic.proto.sdk.options.v1 import TrinsicOptions
from trinsic.proto.services.common.v1 import ResponseStatus
from trinsic.trinsic_util import trinsic_config, create_channel


class ServiceBase(ABC):
    """
    Base class for service wrapper classes, provides the metadata functionality in a consistent manner.
    """

    def __init__(self, server_config: TrinsicOptions | Channel):
        if isinstance(server_config, Channel):
            # TODO - Cane we get the server_config from the channel?
            current_config = TrinsicOptions(
                server_endpoint=server_config._host,
                server_port=server_config._port,
                auth_token="",
                server_use_tls=server_config._scheme != "http",
            )
            self.service_options: TrinsicOptions = current_config or trinsic_config()
            self._channel = server_config
        else:
            self.service_options: TrinsicOptions = server_config or trinsic_config()
            self._channel: Channel = create_channel(self.service_options)

    def __enter__(self):
        return self

    def __exit__(self, exc_type, exc_val, exc_tb):
        self.close()

    def __del__(self):
        self.close()

    def close(self):
        """Close the underlying channel"""
        if hasattr(self, "_channel") and self._channel is not None:
            try:
                self._channel.close()
            except RuntimeError:
                # If the event loop is closed, NBD.
                pass

    def set_auth_token(self, auth_token: str) -> None:
        self.service_options.auth_token = auth_token

    def build_metadata(self, request: Message = None) -> Dict[str, str]:
        """
        Create call metadata by setting required authentication headers via `AccountProfile`
        :return: authentication headers with base-64 encoded Oberon
        """
        call_metadata = {
            "TrinsicSDKLanguage".lower(): "python",
            "TrinsicSDKVersion".lower(): trinsic.__version__(),
        }
        auth_token = ""
        if request is not None:
            if self.service_options and self.service_options.auth_token:
                auth_token = self.service_options.auth_token

            call_metadata["authorization"] = f"Bearer {auth_token}"
        return call_metadata

    @property
    def channel(self):
        """Underlying channel"""
        return self._channel


class ResponseStatusException(Exception):
    """
    Exception raised when an action has a non-success response status.
    """

    def __init__(self, action: str, status: ResponseStatus):
        super().__init__(f"{action}, status={repr(status)}")
        self.status = status

    @staticmethod
    def assert_success(status: ResponseStatus, action: str) -> None:
        if status != ResponseStatus.SUCCESS:
            raise ResponseStatusException(action, status)
