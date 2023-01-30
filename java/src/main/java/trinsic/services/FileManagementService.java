package trinsic.services;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.InvalidProtocolBufferException;
import trinsic.okapi.DidException;
import trinsic.sdk.options.v1.Options;
import trinsic.services.filemanagement.v1.*;

public class FileManagementService extends ServiceBase {
  private final FileManagementGrpc.FileManagementFutureStub stub;

  public FileManagementService() {
    this(null);
  }

  public FileManagementService(Options.ServiceOptions.Builder options) {
    super(options);

    this.stub = FileManagementGrpc.newFutureStub(this.getChannel());
  }
// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: D:\trinsic\sdk\java\src\main\java\trinsic\services\FileManagementService.java

  /** Upload a file to Trinsic's CDN */
  public ListenableFuture<UploadFileResponse> uploadFile(UploadFileRequest request)
      throws InvalidProtocolBufferException, DidException {
    
	return withMetadata(stub, request).uploadFile(request);
  }
  /** Fetch information about a file by its ID */
  public ListenableFuture<GetFileResponse> getFile(GetFileRequest request)
      throws InvalidProtocolBufferException, DidException {
    
	return withMetadata(stub, request).getFile(request);
  }
  /** Delete a file by its ID */
  public ListenableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request)
      throws InvalidProtocolBufferException, DidException {
    
	return withMetadata(stub, request).deleteFile(request);
  }
  /** List files the calling account has uploaded */
  public ListenableFuture<ListFilesResponse> listFiles(ListFilesRequest request)
      throws InvalidProtocolBufferException, DidException {
    
	return withMetadata(stub, request).listFiles(request);
  }
  /** Get statistics about files uploaded by the calling account */
  public ListenableFuture<GetStorageStatsResponse> getStorageStats(GetStorageStatsRequest request)
      throws InvalidProtocolBufferException, DidException {
    
	return withMetadata(stub, request).getStorageStats(request);
  }
// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
