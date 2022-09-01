package services

import (
	"context"
	"github.com/trinsic-id/sdk/go/proto/services/provider/v1/provider"
)

// NewProviderService returns a provider service with the base service configured
// using the provided options
func NewProviderService(options *Options) (ProviderService, error) {
	base, err := NewServiceBase(options)
	if err != nil {
		return nil, err
	}
	service := &providerBase{
		Service: base,
		client:  provider.NewProviderClient(base.GetChannel()),
	}

	return service, nil
}

// ProviderService wraps all the functions for interacting with providers (ecosystems)
type ProviderService interface {
	Service
	// CreateEcosystem creates a new ecosystem
	CreateEcosystem(ctx context.Context, request *provider.CreateEcosystemRequest) (*provider.CreateEcosystemResponse, error)
	// BEGIN Interface Code generated by protoc-gen-trinsic. DO NOT EDIT.
	// target: C:\work\sdk\go\services\provider_service.go

	// UpdateEcosystem  Update an existing ecosystem
	UpdateEcosystem(userContext context.Context, request *provider.UpdateEcosystemRequest) (*provider.UpdateEcosystemResponse, error)
	// GrantAuthorization  Grant user authorization to ecosystem resources
	GrantAuthorization(userContext context.Context, request *provider.GrantAuthorizationRequest) (*provider.GrantAuthorizationResponse, error)
	// RevokeAuthorization  Revoke user authorization to ecosystem resources
	RevokeAuthorization(userContext context.Context, request *provider.RevokeAuthorizationRequest) (*provider.RevokeAuthorizationResponse, error)
	// GetAuthorizations  Retreive the list of permissions for this particular account/ecosystem
	GetAuthorizations(userContext context.Context, request *provider.GetAuthorizationsRequest) (*provider.GetAuthorizationsResponse, error)
	// AddWebhook  Add a webhook endpoint to the ecosystem
	AddWebhook(userContext context.Context, request *provider.AddWebhookRequest) (*provider.AddWebhookResponse, error)
	// DeleteWebhook  Delete a webhook endpoint from the ecosystem
	DeleteWebhook(userContext context.Context, request *provider.DeleteWebhookRequest) (*provider.DeleteWebhookResponse, error)
	// EcosystemInfo  Get ecosystem information
	EcosystemInfo(userContext context.Context, request *provider.EcosystemInfoRequest) (*provider.EcosystemInfoResponse, error)
	// GenerateToken  Generates an unprotected authentication token that can be used to
	// configure server side applications
	GenerateToken(userContext context.Context, request *provider.GenerateTokenRequest) (*provider.GenerateTokenResponse, error)
	// Invite  Invite a user to the ecosystem
	Invite(userContext context.Context, request *provider.InviteRequest) (*provider.InviteResponse, error)
	// InvitationStatus  Check the status of an invitation
	InvitationStatus(userContext context.Context, request *provider.InvitationStatusRequest) (*provider.InvitationStatusResponse, error)
	// GetOberonKey  Returns the public key being used to create/verify oberon tokens
	GetOberonKey(userContext context.Context, request *provider.GetOberonKeyRequest) (*provider.GetOberonKeyResponse, error)
	// GetEventToken  Generate a signed token (JWT) that can be used to connect to the message bus
	GetEventToken(userContext context.Context, request *provider.GetEventTokenRequest) (*provider.GetEventTokenResponse, error)
	// RetrieveVerificationRecord  Retrieve a random hash TXT that can be used to verify domain ownership
	RetrieveVerificationRecord(userContext context.Context, request *provider.RetrieveVerificationRecordRequest) (*provider.RetrieveVerificationRecordResponse, error)
	// RefreshVerificationStatus  Call to verif
	RefreshVerificationStatus(userContext context.Context, request *provider.RefreshVerificationStatusRequest) (*provider.RefreshVerificationStatusResponse, error)

	// END Interface Code generated by protoc-gen-trinsic. DO NOT EDIT.
}

type providerBase struct {
	Service
	client provider.ProviderClient
}

func (p *providerBase) CreateEcosystem(ctx context.Context, request *provider.CreateEcosystemRequest) (*provider.CreateEcosystemResponse, error) {
	if request == nil {
		request = &provider.CreateEcosystemRequest{}
	}
	var err error
	var resp *provider.CreateEcosystemResponse
	if len(request.Name) > 0 || (request.Details != nil && len(request.Details.Email) > 0) {
		md, err := p.GetMetadataContext(ctx, request)
		if err != nil {
			return nil, err
		}
		resp, err = p.client.CreateEcosystem(md, request)
	} else {
		resp, err = p.client.CreateEcosystem(ctx, request)
	}
	if err != nil {
		return nil, err
	}

	authToken, err := ProfileToToken(resp.GetProfile())
	if err != nil {
		return nil, err
	}

	p.SetAuthToken(authToken)

	return resp, nil
}

// BEGIN Implementation Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: C:\work\sdk\go\services\provider_service.go

// UpdateEcosystem  Update an existing ecosystem
func (p *providerBase) UpdateEcosystem(userContext context.Context, request *provider.UpdateEcosystemRequest) (*provider.UpdateEcosystemResponse, error) {
	// TODO - Handle a flag for the metadata context
	md, err := p.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := p.client.UpdateEcosystem(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// GrantAuthorization  Grant user authorization to ecosystem resources
func (p *providerBase) GrantAuthorization(userContext context.Context, request *provider.GrantAuthorizationRequest) (*provider.GrantAuthorizationResponse, error) {
	// TODO - Handle a flag for the metadata context
	md, err := p.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := p.client.GrantAuthorization(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// RevokeAuthorization  Revoke user authorization to ecosystem resources
func (p *providerBase) RevokeAuthorization(userContext context.Context, request *provider.RevokeAuthorizationRequest) (*provider.RevokeAuthorizationResponse, error) {
	// TODO - Handle a flag for the metadata context
	md, err := p.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := p.client.RevokeAuthorization(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// GetAuthorizations  Retreive the list of permissions for this particular account/ecosystem
func (p *providerBase) GetAuthorizations(userContext context.Context, request *provider.GetAuthorizationsRequest) (*provider.GetAuthorizationsResponse, error) {
	// TODO - Handle a flag for the metadata context
	md, err := p.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := p.client.GetAuthorizations(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// AddWebhook  Add a webhook endpoint to the ecosystem
func (p *providerBase) AddWebhook(userContext context.Context, request *provider.AddWebhookRequest) (*provider.AddWebhookResponse, error) {
	// TODO - Handle a flag for the metadata context
	md, err := p.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := p.client.AddWebhook(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// DeleteWebhook  Delete a webhook endpoint from the ecosystem
func (p *providerBase) DeleteWebhook(userContext context.Context, request *provider.DeleteWebhookRequest) (*provider.DeleteWebhookResponse, error) {
	// TODO - Handle a flag for the metadata context
	md, err := p.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := p.client.DeleteWebhook(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// EcosystemInfo  Get ecosystem information
func (p *providerBase) EcosystemInfo(userContext context.Context, request *provider.EcosystemInfoRequest) (*provider.EcosystemInfoResponse, error) {
	// TODO - Handle a flag for the metadata context
	md, err := p.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := p.client.EcosystemInfo(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// GenerateToken  Generates an unprotected authentication token that can be used to
// configure server side applications
func (p *providerBase) GenerateToken(userContext context.Context, request *provider.GenerateTokenRequest) (*provider.GenerateTokenResponse, error) {
	// TODO - Handle a flag for the metadata context
	md, err := p.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := p.client.GenerateToken(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// Invite  Invite a user to the ecosystem
func (p *providerBase) Invite(userContext context.Context, request *provider.InviteRequest) (*provider.InviteResponse, error) {
	// TODO - Handle a flag for the metadata context
	md, err := p.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := p.client.Invite(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// InvitationStatus  Check the status of an invitation
func (p *providerBase) InvitationStatus(userContext context.Context, request *provider.InvitationStatusRequest) (*provider.InvitationStatusResponse, error) {
	// TODO - Handle a flag for the metadata context
	md, err := p.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := p.client.InvitationStatus(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// GetOberonKey  Returns the public key being used to create/verify oberon tokens
func (p *providerBase) GetOberonKey(userContext context.Context, request *provider.GetOberonKeyRequest) (*provider.GetOberonKeyResponse, error) {
	// TODO - Handle a flag for the metadata context
	md, err := p.GetMetadataContext(userContext, nil)
	if err != nil {
		return nil, err
	}
	response, err := p.client.GetOberonKey(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// GetEventToken  Generate a signed token (JWT) that can be used to connect to the message bus
func (p *providerBase) GetEventToken(userContext context.Context, request *provider.GetEventTokenRequest) (*provider.GetEventTokenResponse, error) {
	// TODO - Handle a flag for the metadata context
	md, err := p.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := p.client.GetEventToken(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// RetrieveVerificationRecord  Retrieve a random hash TXT that can be used to verify domain ownership
func (p *providerBase) RetrieveVerificationRecord(userContext context.Context, request *provider.RetrieveVerificationRecordRequest) (*provider.RetrieveVerificationRecordResponse, error) {
	// TODO - Handle a flag for the metadata context
	md, err := p.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := p.client.RetrieveVerificationRecord(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// RefreshVerificationStatus  Call to verif
func (p *providerBase) RefreshVerificationStatus(userContext context.Context, request *provider.RefreshVerificationStatusRequest) (*provider.RefreshVerificationStatusResponse, error) {
	// TODO - Handle a flag for the metadata context
	md, err := p.GetMetadataContext(userContext, request)
	if err != nil {
		return nil, err
	}
	response, err := p.client.RefreshVerificationStatus(md, request)
	if err != nil {
		return nil, err
	}
	return response, nil
}

// END Implementation Code generated by protoc-gen-trinsic. DO NOT EDIT.
