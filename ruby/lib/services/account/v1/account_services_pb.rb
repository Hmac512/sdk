# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: services/account/v1/account.proto for package 'services.account.v1'

require 'grpc'
require 'services/account/v1/account_pb'

module Services
  module Account
    module V1
      module Account
        class Service

          include ::GRPC::GenericService

          self.marshal_class_method = :encode
          self.unmarshal_class_method = :decode
          self.service_name = 'services.account.v1.Account'

          # Sign in to an already existing account
          rpc :SignIn, ::Services::Account::V1::SignInRequest, ::Services::Account::V1::SignInResponse
          # Login to account. If account doesn't exist, new will be created
          rpc :Login, ::Services::Account::V1::LoginRequest, ::Services::Account::V1::LoginResponse
          # Confirm login step by responding to the challenge request
          rpc :LoginConfirm, ::Services::Account::V1::LoginConfirmRequest, ::Services::Account::V1::LoginConfirmResponse
          # Get account information
          rpc :Info, ::Services::Account::V1::AccountInfoRequest, ::Services::Account::V1::AccountInfoResponse
          # List all connected devices
          rpc :ListDevices, ::Services::Account::V1::ListDevicesRequest, ::Services::Account::V1::ListDevicesResponse
          # Revoke device access to the account's cloud wallet
          rpc :RevokeDevice, ::Services::Account::V1::RevokeDeviceRequest, ::Services::Account::V1::RevokeDeviceResponse
          # Authorize Ecosystem to receive webhook events
          rpc :AuthorizeWebhook, ::Services::Account::V1::AuthorizeWebhookRequest, ::Services::Account::V1::AuthorizeWebhookResponse
        end

        Stub = Service.rpc_stub_class
      end
    end
  end
end
