import ServiceBase from "./ServiceBase";
import {
  CreateCredentialTemplateRequest,
  CreateCredentialTemplateResponse,
  CredentialTemplatesDefinition,
  DeleteCredentialTemplateRequest,
  DeleteCredentialTemplateResponse,
  GetCredentialTemplateRequest,
  GetCredentialTemplateResponse,
  ListCredentialTemplatesRequest,
  ListCredentialTemplatesResponse,
  SearchCredentialTemplatesRequest,
  SearchCredentialTemplatesResponse,
  ServiceOptions,
} from "./proto";

import type { Client as BrowserClient } from "nice-grpc-web";

export class TemplateService extends ServiceBase {
  client: BrowserClient<typeof CredentialTemplatesDefinition>;

  constructor(options?: ServiceOptions) {
    super(options);

    this.client = this.createClient(CredentialTemplatesDefinition);
  }
  
// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: /home/runner/work/sdk/sdk/web/src/TemplateService.ts

  /** Create a credential template in the current ecosystem */
  public async create(request: CreateCredentialTemplateRequest): Promise<CreateCredentialTemplateResponse> {
    
    return this.client.create(request, {
      metadata: await this.buildMetadata(CreateCredentialTemplateRequest.encode(request).finish())
    });
  }
  /** Fetch a credential template by ID */
  public async get(request: GetCredentialTemplateRequest): Promise<GetCredentialTemplateResponse> {
    
    return this.client.get(request, {
      metadata: await this.buildMetadata(GetCredentialTemplateRequest.encode(request).finish())
    });
  }
  /** Search credential templates using SQL, returning strongly-typed template data */
  public async list(request: ListCredentialTemplatesRequest): Promise<ListCredentialTemplatesResponse> {
    
    return this.client.list(request, {
      metadata: await this.buildMetadata(ListCredentialTemplatesRequest.encode(request).finish())
    });
  }
  /** Search credential templates using SQL, returning raw JSON data */
  public async search(request: SearchCredentialTemplatesRequest): Promise<SearchCredentialTemplatesResponse> {
    
    return this.client.search(request, {
      metadata: await this.buildMetadata(SearchCredentialTemplatesRequest.encode(request).finish())
    });
  }
  /** Delete a credential template from the current ecosystem by ID */
  public async delete(request: DeleteCredentialTemplateRequest): Promise<DeleteCredentialTemplateResponse> {
    
    return this.client.delete(request, {
      metadata: await this.buildMetadata(DeleteCredentialTemplateRequest.encode(request).finish())
    });
  }
// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
