package trinsic.services

import com.google.protobuf.InvalidProtocolBufferException
import trinsic.sdk.options.v1.Options
import trinsic.services.provider.v1.*

class AccessManagementServiceKt(options: Options.TrinsicOptions.Builder?) : ServiceBase(options) {
  var stub = AccessManagementGrpcKt.AccessManagementCoroutineStub(this.channel)

// BEGIN Code generated by protoc-gen-trinsic. DO NOT EDIT.
// target: C:\work\sdk\java\src\main\java\trinsic\services\AccessManagementServiceKt.kt

  @Throws(InvalidProtocolBufferException::class)
  @Deprecated("This method is experimental")
  suspend fun addRoleAssignment(request: AddRoleAssignmentRequest): AddRoleAssignmentResponse {
	 /** This method is experimental
*  Adds a role assignment to an account
*/
    
    return withMetadata(stub, request).addRoleAssignment(request)
  }
  @Throws(InvalidProtocolBufferException::class)
  @Deprecated("This method is experimental")
  suspend fun removeRoleAssignment(request: RemoveRoleAssignmentRequest): RemoveRoleAssignmentResponse {
	 /** This method is experimental
*  Removes a role assignment from the account
*/
    
    return withMetadata(stub, request).removeRoleAssignment(request)
  }
  @Throws(InvalidProtocolBufferException::class)
  @Deprecated("This method is experimental")
  suspend fun listRoleAssignments(request: ListRoleAssignmentsRequest): ListRoleAssignmentsResponse {
	 /** This method is experimental
*  List the role assignments for the given account
*/
    
    return withMetadata(stub, request).listRoleAssignments(request)
  }
// END Code generated by protoc-gen-trinsic. DO NOT EDIT.
}
