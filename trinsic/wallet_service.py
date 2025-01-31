from grpclib.client import Channel

from trinsic.proto.sdk.options.v1 import TrinsicOptions
from trinsic.proto.services.universalwallet.v1 import *

from trinsic.service_base import ServiceBase


class WalletService(ServiceBase):
    """
    Wrapper for the [Wallet Service](/reference/services/wallet-service/)
    """

    def __init__(
        self,
        *,
        server_config: TrinsicOptions | Channel = None,
    ):
        """
        Initialize a connection to the server.
        Args:
            server_config: The URL of the server, or a channel which encapsulates the connection already.
        """
        super().__init__(server_config)
        self.client = UniversalWalletStub(super().channel)

    async def search_wallet(self, request: SearchRequest = None) -> SearchResponse:
        """
        [Search for crdentials](/reference/services/wallet-service/#search-query)
        Args:
             request: Request object
        Returns:
            The search response object information
        """
        request = request or SearchRequest()
        request.query = (
            request.query or "SELECT c.id, c.type, c.data FROM c OFFSET 0 LIMIT 100"
        )
        return await self.client.search(
            search_request=request, metadata=self.build_metadata(request)
        )

    # BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
    # target: /home/runner/work/sdk/sdk/python/trinsic/wallet_service.py

    async def get_item(self, *, request: GetItemRequest) -> GetItemResponse:
        """Retrieve an item from the wallet with a given item identifier"""

        return await self.client.get_item(
            request, metadata=self.build_metadata(request)
        )

    async def search(self, *, request: SearchRequest) -> SearchResponse:
        """Search the wallet using a SQL syntax"""

        return await self.client.search(request, metadata=self.build_metadata(request))

    async def insert_item(self, *, request: InsertItemRequest) -> InsertItemResponse:
        """Insert an item into the wallet"""

        return await self.client.insert_item(
            request, metadata=self.build_metadata(request)
        )

    async def update_item(self, *, request: UpdateItemRequest) -> UpdateItemResponse:
        """Update an item in the wallet"""

        return await self.client.update_item(
            request, metadata=self.build_metadata(request)
        )

    async def delete_item(self, *, request: DeleteItemRequest) -> DeleteItemResponse:
        """Delete an item from the wallet permanently"""

        return await self.client.delete_item(
            request, metadata=self.build_metadata(request)
        )

    async def delete_wallet(
        self, *, request: DeleteWalletRequest
    ) -> DeleteWalletResponse:
        """Delete a wallet and its credentials"""

        return await self.client.delete_wallet(
            request, metadata=self.build_metadata(request)
        )

    async def create_wallet(
        self, *, request: CreateWalletRequest
    ) -> CreateWalletResponse:
        """Create a new wallet and generate an auth token for access"""

        return await self.client.create_wallet(
            request, metadata=self.build_metadata(request)
        )

    async def get_wallet_info(
        self, *, request: GetWalletInfoRequest
    ) -> GetWalletInfoResponse:
        """Retrieve wallet details and configuration"""

        return await self.client.get_wallet_info(
            request, metadata=self.build_metadata(request)
        )

    async def get_my_info(self) -> GetMyInfoResponse:
        """Retrieve wallet details and configuration about the currently authenticated wallet"""
        request = GetMyInfoRequest()
        return await self.client.get_my_info(
            request, metadata=self.build_metadata(request)
        )

    async def generate_auth_token(
        self, *, request: GenerateAuthTokenRequest
    ) -> GenerateAuthTokenResponse:
        """
        Generate new token for a given wallet and add it to the collection of known auth tokens.
         This endpoint requires authentication and will return a new token ID and auth token.
         Use this endpoint if you want to authorize another device, without having to share your
         existing auth token.
        """

        return await self.client.generate_auth_token(
            request, metadata=self.build_metadata(request)
        )

    async def revoke_auth_token(
        self, *, request: RevokeAuthTokenRequest
    ) -> RevokeAuthTokenResponse:
        """
        Revokes a previously issued auth token and updates the collection of known auth tokens.
         This endpoint requires authentication.
        """

        return await self.client.revoke_auth_token(
            request, metadata=self.build_metadata(request)
        )

    async def add_external_identity_init(
        self, *, request: AddExternalIdentityInitRequest
    ) -> AddExternalIdentityInitResponse:
        """
        Add new external identity to the current wallet, such as email, sms, ethereum address, etc.
         This identity ownership must be confirmed using `AddIdentityConfirm` via OTP, signature, etc.
        """

        return await self.client.add_external_identity_init(
            request, metadata=self.build_metadata(request)
        )

    async def add_external_identity_confirm(
        self, *, request: AddExternalIdentityConfirmRequest
    ) -> AddExternalIdentityConfirmResponse:
        """Confirm identity added to the current wallet using `AddExternalIdentityInit`"""

        return await self.client.add_external_identity_confirm(
            request, metadata=self.build_metadata(request)
        )

    async def remove_external_identity(
        self, *, request: RemoveExternalIdentityRequest
    ) -> RemoveExternalIdentityResponse:
        """Remove an external identity from the current wallet"""

        return await self.client.remove_external_identity(
            request, metadata=self.build_metadata(request)
        )

    async def authenticate_init(
        self, *, request: AuthenticateInitRequest
    ) -> AuthenticateInitResponse:
        """
        Sign-in to an already existing wallet, using an identity added that was previously registered
         This endpoint does not require authentication, and will return a challenge to be signed or verified
        """

        return await self.client.authenticate_init(
            request, metadata=self.build_metadata(request)
        )

    async def authenticate_confirm(
        self, *, request: AuthenticateConfirmRequest
    ) -> AuthenticateConfirmResponse:
        """Confirm sign-in to an already existing wallet and return authentication token"""

        return await self.client.authenticate_confirm(
            request, metadata=self.build_metadata(request)
        )

    async def authenticate_resend_code(
        self, *, request: AuthenticateResendCodeRequest
    ) -> AuthenticateResendCodeResponse:
        """Resend previous authentication code"""

        return await self.client.authenticate_resend_code(
            request, metadata=self.build_metadata(request)
        )

    async def list_wallets(self, *, request: ListWalletsRequest) -> ListWalletsResponse:
        """List all wallets in the ecosystem"""

        return await self.client.list_wallets(
            request, metadata=self.build_metadata(request)
        )

    async def list_by_verification_template(
        self, *, request: ListByVerificationTemplateRequest
    ) -> ListByVerificationTemplateResponse:
        """List credentials which match a given verification template"""

        return await self.client.list_by_verification_template(
            request, metadata=self.build_metadata(request)
        )


# END Code generated by protoc-gen-trinsic. DO NOT EDIT.
