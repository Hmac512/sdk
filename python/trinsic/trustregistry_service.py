from grpclib.client import Channel

from trinsic.proto.sdk.options.v1 import TrinsicOptions
from trinsic.proto.services.trustregistry.v1 import *

from trinsic.service_base import ServiceBase


class TrustRegistryService(ServiceBase):
    """
    Wrapper for [Trust Registry Service](/reference/services/trust-registry/)
    """

    def __init__(
        self,
        *,
        server_config: TrinsicOptions | Channel = None,
    ):
        super().__init__(server_config)
        self.client = TrustRegistryStub(super().channel)

    # BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
    # target: /home/runner/work/sdk/sdk/python/trinsic/trustregistry_service.py

    async def register_member(
        self, *, request: RegisterMemberRequest
    ) -> RegisterMemberResponse:
        """Register an authoritative issuer for a credential schema"""

        return await self.client.register_member(
            request, metadata=self.build_metadata(request)
        )

    async def unregister_member(
        self, *, request: UnregisterMemberRequest
    ) -> UnregisterMemberResponse:
        """Removes an authoritative issuer for a credential schema from the trust registry"""

        return await self.client.unregister_member(
            request, metadata=self.build_metadata(request)
        )

    async def get_member_authorization_status(
        self, *, request: GetMemberAuthorizationStatusRequest
    ) -> GetMemberAuthorizationStatusResponse:
        """Fetch the status of a member for a given credential schema in a trust registry"""

        return await self.client.get_member_authorization_status(
            request, metadata=self.build_metadata(request)
        )

    async def list_authorized_members(
        self, *, request: ListAuthorizedMembersRequest
    ) -> ListAuthorizedMembersResponse:
        """Fetch the ecosystem's authorized issuers and the respective templates against which it can issue"""

        return await self.client.list_authorized_members(
            request, metadata=self.build_metadata(request)
        )

    async def get_member(self, *, request: GetMemberRequest) -> GetMemberResponse:
        """Get member for a given did in a trust registry"""

        return await self.client.get_member(
            request, metadata=self.build_metadata(request)
        )


# END Code generated by protoc-gen-trinsic. DO NOT EDIT.
