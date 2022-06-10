package trinsic.services

import com.google.protobuf.ByteString
import com.google.protobuf.InvalidProtocolBufferException
import trinsic.okapi.DidException
import trinsic.okapi.Oberon
import trinsic.okapi.security.v1.Security.BlindOberonTokenRequest
import trinsic.okapi.security.v1.Security.UnBlindOberonTokenRequest
import trinsic.sdk.options.v1.Options
import trinsic.services.account.v1.AccountGrpcKt
import trinsic.services.account.v1.AccountOuterClass.*
import java.util.*

class AccountServiceKt(options: Options.ServiceOptions?) : ServiceBase(options) {
    var stub: AccountGrpcKt.AccountCoroutineStub = AccountGrpcKt.AccountCoroutineStub(this.channel)

    suspend fun signIn(): String {
        return signIn(SignInRequest.newBuilder().build())
    }

    suspend fun signIn(request: SignInRequest): String {
        var request2 = request
        if (request.ecosystemId.isBlank()) request2 =
            SignInRequest.newBuilder(request).setEcosystemId(options.defaultEcosystem).build()
        return Base64.getUrlEncoder().encodeToString(stub.signIn(request2).profile.toByteArray())
    }

    companion object {
        @JvmStatic
        @Throws(InvalidProtocolBufferException::class, DidException::class)
        fun unprotect(base64Profile: String?, securityCode: String?): String {
            var profile = AccountProfile.newBuilder().mergeFrom(Base64.getUrlDecoder().decode(base64Profile)).build()
            val request = UnBlindOberonTokenRequest.newBuilder().setToken(profile.authToken)
                .addBlinding(ByteString.copyFromUtf8(securityCode)).build()
            val result = Oberon.unBlindToken(request)
            profile = AccountProfile.newBuilder(profile).setAuthToken(result.token).setProtection(
                    TokenProtection.newBuilder().setMethod(ConfirmationMethod.None).setEnabled(false).build()
                ).build()
            return Base64.getUrlEncoder().encodeToString(profile.toByteArray())
        }

        @JvmStatic
        @Throws(InvalidProtocolBufferException::class, DidException::class)
        fun protect(base64Profile: String?, securityCode: String?): String {
            var profile = AccountProfile.newBuilder().mergeFrom(Base64.getUrlDecoder().decode(base64Profile)).build()
            val request = BlindOberonTokenRequest.newBuilder().setToken(profile.authToken)
                .addBlinding(ByteString.copyFromUtf8(securityCode)).build()
            val result = Oberon.blindToken(request)
            profile = AccountProfile.newBuilder(profile).setAuthToken(result.token).setProtection(
                    TokenProtection.newBuilder().setMethod(ConfirmationMethod.Other).setEnabled(true).build()
                ).build()
            return Base64.getUrlEncoder().encodeToString(profile.toByteArray())
        }
    }

    @Throws(InvalidProtocolBufferException::class, DidException::class)
    suspend fun login(request: LoginRequest): LoginResponse {
        return withMetadata(stub, request).login(request)
    }

    @Throws(InvalidProtocolBufferException::class, DidException::class)
    suspend fun loginConfirm(request: LoginConfirmRequest): LoginConfirmResponse {
        return withMetadata(stub, request).loginConfirm(request)
    }

    suspend fun getInfo(): AccountInfoResponse {
        val request = AccountInfoRequest.newBuilder().build()
        return withMetadata(stub, request).info(request)
    }

    @Throws(InvalidProtocolBufferException::class, DidException::class)
    suspend fun listDevices(request: ListDevicesRequest): ListDevicesResponse {
        return withMetadata(stub, request).listDevices(request)
    }

    @Throws(InvalidProtocolBufferException::class, DidException::class)
    suspend fun revokeDevice(request: RevokeDeviceRequest): RevokeDeviceResponse {
        return withMetadata(stub, request).revokeDevice(request)
    }

    @Throws(InvalidProtocolBufferException::class, DidException::class)
    suspend fun authorizeWebhook(request: AuthorizeWebhookRequest): AuthorizeWebhookResponse {
        return withMetadata(stub, request).authorizeWebhook(request)
    }
}
