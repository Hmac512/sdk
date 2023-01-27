# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: services/verifiable-credentials/v1/verifiable-credentials.proto
# plugin: python-betterproto
import warnings
from dataclasses import dataclass
from typing import (
    TYPE_CHECKING,
    Dict,
    List,
    Optional,
)

import betterproto
import grpclib
from betterproto.grpc.grpclib_server import ServiceBase


if TYPE_CHECKING:
    from betterproto.grpc.grpclib_client import MetadataLike
    from grpclib.metadata import Deadline


@dataclass(eq=False, repr=False)
class IssueRequest(betterproto.Message):
    """Request to sign a JSON-LD Credential using public key tied to caller"""

    document_json: str = betterproto.string_field(1)
    """Valid JSON-LD Credential document to be signed, in string form"""


@dataclass(eq=False, repr=False)
class IssueResponse(betterproto.Message):
    """Response to `IssueRequest`"""

    signed_document_json: str = betterproto.string_field(1)
    """
    Verifiable Credential document, signed with public key tied to caller of
    `IssueRequest`
    """


@dataclass(eq=False, repr=False)
class IssueFromTemplateRequest(betterproto.Message):
    """
    Request to create and sign a JSON-LD Verifiable Credential from a template
    using public key tied to caller
    """

    template_id: str = betterproto.string_field(1)
    """ID of template to use"""

    values_json: str = betterproto.string_field(2)
    """
    JSON document string with keys corresponding to the fields of the template
    referenced by `template_id`
    """

    framework_id: str = betterproto.string_field(3)
    """
    Governance framework ID to use with issuance of this credential. If
    specified, the issued credential will contain extended issuer metadata with
    membership info for the given ecosystem governance framework (EGF)
    """

    save_copy: bool = betterproto.bool_field(4)
    """
    Save a copy of the issued credential to this user's wallet. This copy will
    only contain the credential data, but not the secret proof value. Issuers
    may use this data to keep track of the details for revocation status.
    """


@dataclass(eq=False, repr=False)
class IssueFromTemplateResponse(betterproto.Message):
    """Response to `IssueFromTemplateRequest`"""

    document_json: str = betterproto.string_field(1)
    """
    Verifiable Credential document, in JSON-LD form, constructed from the
    specified template and values; signed with public key tied to caller of
    `IssueFromTemplateRequest`
    """


@dataclass(eq=False, repr=False)
class CreateProofRequest(betterproto.Message):
    """
    Request to create a proof for a Verifiable Credential using public key tied
    to caller. Either `item_id` or `document_json` may be provided, not both.
    """

    reveal_document_json: str = betterproto.string_field(1, group="disclosure")
    """
    A valid JSON-LD frame describing which fields should be revealed in the
    generated proof. If unspecified, all fields in the document will be
    revealed
    """

    reveal_template: "RevealTemplateAttributes" = betterproto.message_field(
        11, group="disclosure"
    )
    """Information about what sections of the document to reveal"""

    item_id: str = betterproto.string_field(2, group="proof")
    """ID of wallet item stored in a Trinsic cloud wallet"""

    document_json: str = betterproto.string_field(3, group="proof")
    """
    A valid JSON-LD Verifiable Credential document string with an unbound
    signature. The proof will be derived from this document directly. The
    document will not be stored in the wallet.
    """

    nonce: bytes = betterproto.bytes_field(10)
    """
    Nonce value used to derive the proof. If not specified, a random nonce will
    be generated. This value may be represented in base64 format in the proof
    model.
    """


@dataclass(eq=False, repr=False)
class RevealTemplateAttributes(betterproto.Message):
    template_attributes: List[str] = betterproto.string_field(1)
    """
    A list of document attributes to reveal. If unset, all attributes will be
    returned.
    """


@dataclass(eq=False, repr=False)
class CreateProofResponse(betterproto.Message):
    """Response to `CreateProofRequest`"""

    proof_document_json: str = betterproto.string_field(1)
    """Valid JSON-LD proof for the specified credential"""


@dataclass(eq=False, repr=False)
class VerifyProofRequest(betterproto.Message):
    """Request to verify a proof"""

    proof_document_json: str = betterproto.string_field(1)
    """JSON-LD proof document string to verify"""


@dataclass(eq=False, repr=False)
class VerifyProofResponse(betterproto.Message):
    """Response to `VerifyProofRequest`"""

    is_valid: bool = betterproto.bool_field(1)
    """Whether all validations in `validation_results` passed"""

    validation_messages: List[str] = betterproto.string_field(2)
    """Use `validation_results` instead"""

    validation_results: Dict[str, "ValidationMessage"] = betterproto.map_field(
        3, betterproto.TYPE_STRING, betterproto.TYPE_MESSAGE
    )
    """
    Results of each validation check performed, such as schema conformance,
    revocation status, signature, etc. Detailed results are provided for failed
    validations.
    """

    def __post_init__(self) -> None:
        super().__post_init__()
        if self.is_set("validation_messages"):
            warnings.warn(
                "VerifyProofResponse.validation_messages is deprecated",
                DeprecationWarning,
            )


@dataclass(eq=False, repr=False)
class ValidationMessage(betterproto.Message):
    """Result of a validation check on a proof"""

    is_valid: bool = betterproto.bool_field(1)
    """Whether this validation check passed"""

    messages: List[str] = betterproto.string_field(2)
    """If validation failed, contains messages explaining why"""


@dataclass(eq=False, repr=False)
class SendRequest(betterproto.Message):
    """Request to send a document to another user's wallet"""

    email: str = betterproto.string_field(1, group="delivery_method")
    """Email address of user to send item to"""

    wallet_id: str = betterproto.string_field(5, group="delivery_method")
    """
    DID of recipient (presently unsupported) string did_uri = 2
    [deprecated=true]; DIDComm out-of-band invitation JSON (presently
    unsupported) string didcomm_invitation_json = 3 [deprecated=true]; Wallet
    ID of the recipient within the ecosystem
    """

    send_notification: bool = betterproto.bool_field(4)
    """Send email notification that credential has been sent to a wallet"""

    document_json: str = betterproto.string_field(100)
    """JSON document to send to recipient"""


@dataclass(eq=False, repr=False)
class SendResponse(betterproto.Message):
    """Response to `SendRequest`"""

    pass


@dataclass(eq=False, repr=False)
class UpdateStatusRequest(betterproto.Message):
    """Request to update a credential's revocation status"""

    credential_status_id: str = betterproto.string_field(1)
    """
    Credential Status ID to update. This is not the same as the credential's
    ID.
    """

    revoked: bool = betterproto.bool_field(2)
    """New revocation status of credential"""


@dataclass(eq=False, repr=False)
class UpdateStatusResponse(betterproto.Message):
    """Response to `UpdateStatusRequest`"""

    pass


@dataclass(eq=False, repr=False)
class CheckStatusRequest(betterproto.Message):
    """Request to check a credential's revocation status"""

    credential_status_id: str = betterproto.string_field(1)
    """
    Credential Status ID to check. This is not the same as the credential's ID.
    """


@dataclass(eq=False, repr=False)
class CheckStatusResponse(betterproto.Message):
    """Response to `CheckStatusRequest`"""

    revoked: bool = betterproto.bool_field(1)
    """The credential's revocation status"""


class VerifiableCredentialStub(betterproto.ServiceStub):
    async def issue(
        self,
        issue_request: "IssueRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "IssueResponse":
        return await self._unary_unary(
            "/services.verifiablecredentials.v1.VerifiableCredential/Issue",
            issue_request,
            IssueResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def issue_from_template(
        self,
        issue_from_template_request: "IssueFromTemplateRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "IssueFromTemplateResponse":
        return await self._unary_unary(
            "/services.verifiablecredentials.v1.VerifiableCredential/IssueFromTemplate",
            issue_from_template_request,
            IssueFromTemplateResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def check_status(
        self,
        check_status_request: "CheckStatusRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "CheckStatusResponse":
        return await self._unary_unary(
            "/services.verifiablecredentials.v1.VerifiableCredential/CheckStatus",
            check_status_request,
            CheckStatusResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def update_status(
        self,
        update_status_request: "UpdateStatusRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "UpdateStatusResponse":
        return await self._unary_unary(
            "/services.verifiablecredentials.v1.VerifiableCredential/UpdateStatus",
            update_status_request,
            UpdateStatusResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def create_proof(
        self,
        create_proof_request: "CreateProofRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "CreateProofResponse":
        return await self._unary_unary(
            "/services.verifiablecredentials.v1.VerifiableCredential/CreateProof",
            create_proof_request,
            CreateProofResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def verify_proof(
        self,
        verify_proof_request: "VerifyProofRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "VerifyProofResponse":
        return await self._unary_unary(
            "/services.verifiablecredentials.v1.VerifiableCredential/VerifyProof",
            verify_proof_request,
            VerifyProofResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )

    async def send(
        self,
        send_request: "SendRequest",
        timeout: Optional[float] = None,
        deadline: Optional["Deadline"] = None,
        metadata: Optional["_MetadataLike"] = None,
    ) -> "SendResponse":
        return await self._unary_unary(
            "/services.verifiablecredentials.v1.VerifiableCredential/Send",
            send_request,
            SendResponse,
            timeout=timeout,
            deadline=deadline,
            metadata=metadata,
        )


class VerifiableCredentialBase(ServiceBase):
    async def issue(self, issue_request: "IssueRequest") -> "IssueResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def issue_from_template(
        self, issue_from_template_request: "IssueFromTemplateRequest"
    ) -> "IssueFromTemplateResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def check_status(
        self, check_status_request: "CheckStatusRequest"
    ) -> "CheckStatusResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def update_status(
        self, update_status_request: "UpdateStatusRequest"
    ) -> "UpdateStatusResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def create_proof(
        self, create_proof_request: "CreateProofRequest"
    ) -> "CreateProofResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def verify_proof(
        self, verify_proof_request: "VerifyProofRequest"
    ) -> "VerifyProofResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def send(self, send_request: "SendRequest") -> "SendResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_issue(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.issue(request)
        await stream.send_message(response)

    async def __rpc_issue_from_template(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.issue_from_template(request)
        await stream.send_message(response)

    async def __rpc_check_status(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.check_status(request)
        await stream.send_message(response)

    async def __rpc_update_status(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.update_status(request)
        await stream.send_message(response)

    async def __rpc_create_proof(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.create_proof(request)
        await stream.send_message(response)

    async def __rpc_verify_proof(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.verify_proof(request)
        await stream.send_message(response)

    async def __rpc_send(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()
        response = await self.send(request)
        await stream.send_message(response)

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/services.verifiablecredentials.v1.VerifiableCredential/Issue": grpclib.const.Handler(
                self.__rpc_issue,
                grpclib.const.Cardinality.UNARY_UNARY,
                IssueRequest,
                IssueResponse,
            ),
            "/services.verifiablecredentials.v1.VerifiableCredential/IssueFromTemplate": grpclib.const.Handler(
                self.__rpc_issue_from_template,
                grpclib.const.Cardinality.UNARY_UNARY,
                IssueFromTemplateRequest,
                IssueFromTemplateResponse,
            ),
            "/services.verifiablecredentials.v1.VerifiableCredential/CheckStatus": grpclib.const.Handler(
                self.__rpc_check_status,
                grpclib.const.Cardinality.UNARY_UNARY,
                CheckStatusRequest,
                CheckStatusResponse,
            ),
            "/services.verifiablecredentials.v1.VerifiableCredential/UpdateStatus": grpclib.const.Handler(
                self.__rpc_update_status,
                grpclib.const.Cardinality.UNARY_UNARY,
                UpdateStatusRequest,
                UpdateStatusResponse,
            ),
            "/services.verifiablecredentials.v1.VerifiableCredential/CreateProof": grpclib.const.Handler(
                self.__rpc_create_proof,
                grpclib.const.Cardinality.UNARY_UNARY,
                CreateProofRequest,
                CreateProofResponse,
            ),
            "/services.verifiablecredentials.v1.VerifiableCredential/VerifyProof": grpclib.const.Handler(
                self.__rpc_verify_proof,
                grpclib.const.Cardinality.UNARY_UNARY,
                VerifyProofRequest,
                VerifyProofResponse,
            ),
            "/services.verifiablecredentials.v1.VerifiableCredential/Send": grpclib.const.Handler(
                self.__rpc_send,
                grpclib.const.Cardinality.UNARY_UNARY,
                SendRequest,
                SendResponse,
            ),
        }
