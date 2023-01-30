from trinsic.proto.sdk.options.v1 import ServiceOptions
from trinsic.proto.services.filemanagement.v1 import *
from trinsic.security_providers import ITokenProvider
from trinsic.service_base import ServiceBase


class FileManagementService(ServiceBase):
    """Wrapper for the [File Management Service](/reference/services/File-Management-service/)"""

    def __init__(
        self,
        *,
        server_config: ServiceOptions = None,
        token_provider: ITokenProvider = None
    ):
        """
        Initialize a connection to the server.
        Args:
            server_config: The URL of the server, or a channel which encapsulates the connection already.
        """
        super().__init__(server_config, token_provider)
        self.client = FileManagementStub(super().channel)

# BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
# target: D:\trinsic\sdk\python\trinsic\file_management_service.py

    async def upload_file(self, *, request: UploadFileRequest) -> UploadFileResponse:
        """  Upload a file to Trinsic's CDN """
        
        return await self.client.upload_file(request, metadata=self.build_metadata(request))
    
    async def get_file(self, *, request: GetFileRequest) -> GetFileResponse:
        """  Fetch information about a file by its ID """
        
        return await self.client.get_file(request, metadata=self.build_metadata(request))
    
    async def delete_file(self, *, request: DeleteFileRequest) -> DeleteFileResponse:
        """  Delete a file by its ID """
        
        return await self.client.delete_file(request, metadata=self.build_metadata(request))
    
    async def list_files(self, *, request: ListFilesRequest) -> ListFilesResponse:
        """  List files the calling account has uploaded """
        
        return await self.client.list_files(request, metadata=self.build_metadata(request))
    
    async def get_storage_stats(self, *, request: GetStorageStatsRequest) -> GetStorageStatsResponse:
        """  Get statistics about files uploaded by the calling account """
        
        return await self.client.get_storage_stats(request, metadata=self.build_metadata(request))
    

# END Code generated by protoc-gen-trinsic. DO NOT EDIT.
