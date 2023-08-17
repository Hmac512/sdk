package services

import (
	"context"

	"github.com/trinsic-id/sdk/go/proto/services/universalwallet/v1/wallet"
)

// NewWalletService returns a wallet service with the base service configured
// using the provided options
func NewWalletService(options *Options) (WalletService, error) {
	base, err := NewServiceBase(options)
	if err != nil {
		return nil, err
	}
	service := &universalWalletBase{
		Service: base,
		client:  wallet.NewUniversalWalletClient(base.GetChannel()),
	}

	return service, nil
}

// WalletService defines the interface for interacting with wallet
type WalletService interface {
	Service

	// Search searches the wallet using a SQL-like syntax
	SearchWallet(userContext context.Context, request *wallet.SearchRequest) (*wallet.SearchResponse, error)

// BEGIN Interface Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: C:\work\sdk\go\services\wallet_service.go

    // GetItem  Retrieve an item from the wallet with a given item identifier 
    GetItem(userContext context.Context, request *wallet.GetItemRequest) (*wallet.GetItemResponse, error)
    // Search  Search the wallet using a SQL syntax 
    Search(userContext context.Context, request *wallet.SearchRequest) (*wallet.SearchResponse, error)
    // InsertItem  Insert an item into the wallet 
    InsertItem(userContext context.Context, request *wallet.InsertItemRequest) (*wallet.InsertItemResponse, error)
    // UpdateItem  Update an item in the wallet 
    UpdateItem(userContext context.Context, request *wallet.UpdateItemRequest) (*wallet.UpdateItemResponse, error)
    // DeleteItem  Delete an item from the wallet permanently 
    DeleteItem(userContext context.Context, request *wallet.DeleteItemRequest) (*wallet.DeleteItemResponse, error)
    // DeleteWallet  Delete a wallet and its credentials 
    DeleteWallet(userContext context.Context, request *wallet.DeleteWalletRequest) (*wallet.DeleteWalletResponse, error)
    // CreateWallet  Create a new wallet and generate an auth token for access 
    CreateWallet(userContext context.Context, request *wallet.CreateWalletRequest) (*wallet.CreateWalletResponse, error)
    // GetWalletInfo  Retrieve wallet details and configuration 
    GetWalletInfo(userContext context.Context, request *wallet.GetWalletInfoRequest) (*wallet.GetWalletInfoResponse, error)
    // GetMyInfo  Retrieve wallet details and configuration about the currently authenticated wallet 
    GetMyInfo(userContext context.Context) (*wallet.GetMyInfoResponse, error)
    // GenerateAuthToken  Generate new token for a given wallet and add it to the collection of known auth tokens.
// This endpoint requires authentication and will return a new token ID and auth token.
// Use this endpoint if you want to authorize another device, without having to share your
// existing auth token. 
    GenerateAuthToken(userContext context.Context, request *wallet.GenerateAuthTokenRequest) (*wallet.GenerateAuthTokenResponse, error)
    // RevokeAuthToken  Revokes a previously issued auth token and updates the collection of known auth tokens.
// This endpoint requires authentication. 
    RevokeAuthToken(userContext context.Context, request *wallet.RevokeAuthTokenRequest) (*wallet.RevokeAuthTokenResponse, error)
    // AddExternalIdentityInit  Add new external identity to the current wallet, such as email, sms, ethereum address, etc.
// This identity ownership must be confirmed using `AddIdentityConfirm` via OTP, signature, etc. 
    AddExternalIdentityInit(userContext context.Context, request *wallet.AddExternalIdentityInitRequest) (*wallet.AddExternalIdentityInitResponse, error)
    // AddExternalIdentityConfirm  Confirm identity added to the current wallet using `AddExternalIdentityInit` 
    AddExternalIdentityConfirm(userContext context.Context, request *wallet.AddExternalIdentityConfirmRequest) (*wallet.AddExternalIdentityConfirmResponse, error)
    // RemoveExternalIdentity  Remove an external identity from the current wallet 
    RemoveExternalIdentity(userContext context.Context, request *wallet.RemoveExternalIdentityRequest) (*wallet.RemoveExternalIdentityResponse, error)
    // AuthenticateInit  Sign-in to an already existing wallet, using an identity added that was previously registered
// This endpoint does not require authentication, and will return a challenge to be signed or verified 
    AuthenticateInit(userContext context.Context, request *wallet.AuthenticateInitRequest) (*wallet.AuthenticateInitResponse, error)
    // AuthenticateConfirm  Confirm sign-in to an already existing wallet and return authentication token 
    AuthenticateConfirm(userContext context.Context, request *wallet.AuthenticateConfirmRequest) (*wallet.AuthenticateConfirmResponse, error)
    // AuthenticateResendCode  Resend previous authentication code 
    AuthenticateResendCode(userContext context.Context, request *wallet.AuthenticateResendCodeRequest) (*wallet.AuthenticateResendCodeResponse, error)
    // ListWallets  List all wallets in the ecosystem 
    ListWallets(userContext context.Context, request *wallet.ListWalletsRequest) (*wallet.ListWalletsResponse, error)
    // ListByVerificationTemplate  List credentials which match a given verification template 
    ListByVerificationTemplate(userContext context.Context, request *wallet.ListByVerificationTemplateRequest) (*wallet.ListByVerificationTemplateResponse, error)

// END Interface Code generated by protoc-gen-trinsic. DO NOT EDIT.
}

type universalWalletBase struct {
	Service
	client wallet.UniversalWalletClient
}

func (w *universalWalletBase) SearchWallet(userContext context.Context, request *wallet.SearchRequest) (*wallet.SearchResponse, error) {
	if request == nil {
		request = &wallet.SearchRequest{}
	}

	if len(request.Query) == 0 {
		request.Query = "SELECT c.id, c.type, c.data FROM c OFFSET 0 LIMIT 100"
	}

	return w.Search(userContext, request)
}

// BEGIN Implementation Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: C:\work\sdk\go\services\wallet_service.go

// GetItem  Retrieve an item from the wallet with a given item identifier
func (w *universalWalletBase) GetItem(userContext context.Context, request *wallet.GetItemRequest) (*wallet.GetItemResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.GetItem(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// Search  Search the wallet using a SQL syntax
func (w *universalWalletBase) Search(userContext context.Context, request *wallet.SearchRequest) (*wallet.SearchResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.Search(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// InsertItem  Insert an item into the wallet
func (w *universalWalletBase) InsertItem(userContext context.Context, request *wallet.InsertItemRequest) (*wallet.InsertItemResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.InsertItem(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// UpdateItem  Update an item in the wallet
func (w *universalWalletBase) UpdateItem(userContext context.Context, request *wallet.UpdateItemRequest) (*wallet.UpdateItemResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.UpdateItem(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// DeleteItem  Delete an item from the wallet permanently
func (w *universalWalletBase) DeleteItem(userContext context.Context, request *wallet.DeleteItemRequest) (*wallet.DeleteItemResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.DeleteItem(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// DeleteWallet  Delete a wallet and its credentials
func (w *universalWalletBase) DeleteWallet(userContext context.Context, request *wallet.DeleteWalletRequest) (*wallet.DeleteWalletResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.DeleteWallet(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// CreateWallet  Create a new wallet and generate an auth token for access
func (w *universalWalletBase) CreateWallet(userContext context.Context, request *wallet.CreateWalletRequest) (*wallet.CreateWalletResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.CreateWallet(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// GetWalletInfo  Retrieve wallet details and configuration
func (w *universalWalletBase) GetWalletInfo(userContext context.Context, request *wallet.GetWalletInfoRequest) (*wallet.GetWalletInfoResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.GetWalletInfo(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// GetMyInfo  Retrieve wallet details and configuration about the currently authenticated wallet
func (w *universalWalletBase) GetMyInfo(userContext context.Context) (*wallet.GetMyInfoResponse, error) {
    request := &wallet.GetMyInfoRequest{};
md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.GetMyInfo(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// GenerateAuthToken  Generate new token for a given wallet and add it to the collection of known auth tokens.
// This endpoint requires authentication and will return a new token ID and auth token.
// Use this endpoint if you want to authorize another device, without having to share your
// existing auth token.
func (w *universalWalletBase) GenerateAuthToken(userContext context.Context, request *wallet.GenerateAuthTokenRequest) (*wallet.GenerateAuthTokenResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.GenerateAuthToken(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// RevokeAuthToken  Revokes a previously issued auth token and updates the collection of known auth tokens.
// This endpoint requires authentication.
func (w *universalWalletBase) RevokeAuthToken(userContext context.Context, request *wallet.RevokeAuthTokenRequest) (*wallet.RevokeAuthTokenResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.RevokeAuthToken(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// AddExternalIdentityInit  Add new external identity to the current wallet, such as email, sms, ethereum address, etc.
// This identity ownership must be confirmed using `AddIdentityConfirm` via OTP, signature, etc.
func (w *universalWalletBase) AddExternalIdentityInit(userContext context.Context, request *wallet.AddExternalIdentityInitRequest) (*wallet.AddExternalIdentityInitResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.AddExternalIdentityInit(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// AddExternalIdentityConfirm  Confirm identity added to the current wallet using `AddExternalIdentityInit`
func (w *universalWalletBase) AddExternalIdentityConfirm(userContext context.Context, request *wallet.AddExternalIdentityConfirmRequest) (*wallet.AddExternalIdentityConfirmResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.AddExternalIdentityConfirm(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// RemoveExternalIdentity  Remove an external identity from the current wallet
func (w *universalWalletBase) RemoveExternalIdentity(userContext context.Context, request *wallet.RemoveExternalIdentityRequest) (*wallet.RemoveExternalIdentityResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.RemoveExternalIdentity(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// AuthenticateInit  Sign-in to an already existing wallet, using an identity added that was previously registered
// This endpoint does not require authentication, and will return a challenge to be signed or verified
func (w *universalWalletBase) AuthenticateInit(userContext context.Context, request *wallet.AuthenticateInitRequest) (*wallet.AuthenticateInitResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.AuthenticateInit(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// AuthenticateConfirm  Confirm sign-in to an already existing wallet and return authentication token
func (w *universalWalletBase) AuthenticateConfirm(userContext context.Context, request *wallet.AuthenticateConfirmRequest) (*wallet.AuthenticateConfirmResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.AuthenticateConfirm(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// AuthenticateResendCode  Resend previous authentication code
func (w *universalWalletBase) AuthenticateResendCode(userContext context.Context, request *wallet.AuthenticateResendCodeRequest) (*wallet.AuthenticateResendCodeResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.AuthenticateResendCode(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// ListWallets  List all wallets in the ecosystem
func (w *universalWalletBase) ListWallets(userContext context.Context, request *wallet.ListWalletsRequest) (*wallet.ListWalletsResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.ListWallets(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// ListByVerificationTemplate  List credentials which match a given verification template
func (w *universalWalletBase) ListByVerificationTemplate(userContext context.Context, request *wallet.ListByVerificationTemplateRequest) (*wallet.ListByVerificationTemplateResponse, error) {
    md, err := w.GetMetadataContext(userContext, request)
    if err != nil {
        return nil, err
    }
    response, err := w.client.ListByVerificationTemplate(md, request)
    if err != nil {
		return nil, err
	}
	return response, nil
}
// END Implementation Code generated by protoc-gen-trinsic. DO NOT EDIT.
