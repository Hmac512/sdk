# frozen_string_literal: true

require 'services/service_base'

module Trinsic
  # Credential Template Service wrapper
  class TemplateService < ServiceBase
    def initialize(service_options = nil)
      super(service_options)
      if @service_options.server_use_tls
        channel_creds = GRPC::Core::ChannelCredentials.new
        @client = Template::CredentialTemplates::Stub.new(url_string, channel_creds)
      else
        @client = Template::CredentialTemplates::Stub.new(url_string, :this_channel_is_insecure)
      end
    end

    def create(request)
      @client.create(request, metadata: metadata(request))
    end

    def get(request)
      @client.get(request, metadata: metadata(request))
    end

    def list(request)
      @client.list(request, metadata: metadata(request))
    end

    def search(request)
      @client.search(request, metadata: metadata(request))
    end

    def delete(request)
      @client.delete(request, metadata: metadata(request))
    end
  end
end
