// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/provider/v1/access-management.proto

package trinsic.services.provider.v1;

/**
 *
 *
 * <pre>
 * Role management
 * </pre>
 *
 * Protobuf type {@code services.provider.v1.AddRoleAssignmentRequest}
 */
public final class AddRoleAssignmentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:services.provider.v1.AddRoleAssignmentRequest)
    AddRoleAssignmentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AddRoleAssignmentRequest.newBuilder() to construct.
  private AddRoleAssignmentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AddRoleAssignmentRequest() {
    role_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AddRoleAssignmentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return trinsic.services.provider.v1.AccessManagementOuterClass
        .internal_static_services_provider_v1_AddRoleAssignmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return trinsic.services.provider.v1.AccessManagementOuterClass
        .internal_static_services_provider_v1_AddRoleAssignmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            trinsic.services.provider.v1.AddRoleAssignmentRequest.class,
            trinsic.services.provider.v1.AddRoleAssignmentRequest.Builder.class);
  }

  private int accountCase_ = 0;
  private java.lang.Object account_;

  public enum AccountCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    EMAIL(2),
    WALLET_ID(3),
    DID_URI(4),
    ACCOUNT_NOT_SET(0);
    private final int value;

    private AccountCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AccountCase valueOf(int value) {
      return forNumber(value);
    }

    public static AccountCase forNumber(int value) {
      switch (value) {
        case 2:
          return EMAIL;
        case 3:
          return WALLET_ID;
        case 4:
          return DID_URI;
        case 0:
          return ACCOUNT_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public AccountCase getAccountCase() {
    return AccountCase.forNumber(accountCase_);
  }

  public static final int ROLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object role_;
  /**
   *
   *
   * <pre>
   * Role to assign
   * </pre>
   *
   * <code>string role = 1;</code>
   *
   * @return The role.
   */
  @java.lang.Override
  public java.lang.String getRole() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      role_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Role to assign
   * </pre>
   *
   * <code>string role = 1;</code>
   *
   * @return The bytes for role.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRoleBytes() {
    java.lang.Object ref = role_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      role_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMAIL_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Email address of account to assign role.
   * Mutually exclusive with `walletId` and `didUri`.
   * </pre>
   *
   * <code>string email = 2;</code>
   *
   * @return Whether the email field is set.
   */
  public boolean hasEmail() {
    return accountCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Email address of account to assign role.
   * Mutually exclusive with `walletId` and `didUri`.
   * </pre>
   *
   * <code>string email = 2;</code>
   *
   * @return The email.
   */
  public java.lang.String getEmail() {
    java.lang.Object ref = "";
    if (accountCase_ == 2) {
      ref = account_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (accountCase_ == 2) {
        account_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Email address of account to assign role.
   * Mutually exclusive with `walletId` and `didUri`.
   * </pre>
   *
   * <code>string email = 2;</code>
   *
   * @return The bytes for email.
   */
  public com.google.protobuf.ByteString getEmailBytes() {
    java.lang.Object ref = "";
    if (accountCase_ == 2) {
      ref = account_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (accountCase_ == 2) {
        account_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WALLET_ID_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * Wallet ID of account to assign role to.
   * Mutually exclusive with `email` and `didUri`.
   * </pre>
   *
   * <code>string wallet_id = 3;</code>
   *
   * @return Whether the walletId field is set.
   */
  public boolean hasWalletId() {
    return accountCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * Wallet ID of account to assign role to.
   * Mutually exclusive with `email` and `didUri`.
   * </pre>
   *
   * <code>string wallet_id = 3;</code>
   *
   * @return The walletId.
   */
  public java.lang.String getWalletId() {
    java.lang.Object ref = "";
    if (accountCase_ == 3) {
      ref = account_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (accountCase_ == 3) {
        account_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Wallet ID of account to assign role to.
   * Mutually exclusive with `email` and `didUri`.
   * </pre>
   *
   * <code>string wallet_id = 3;</code>
   *
   * @return The bytes for walletId.
   */
  public com.google.protobuf.ByteString getWalletIdBytes() {
    java.lang.Object ref = "";
    if (accountCase_ == 3) {
      ref = account_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (accountCase_ == 3) {
        account_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DID_URI_FIELD_NUMBER = 4;
  /**
   *
   *
   * <pre>
   * DID URI of the account to assign role.
   * Mutually exclusive with `email` and `walletId`.
   * </pre>
   *
   * <code>string did_uri = 4;</code>
   *
   * @return Whether the didUri field is set.
   */
  public boolean hasDidUri() {
    return accountCase_ == 4;
  }
  /**
   *
   *
   * <pre>
   * DID URI of the account to assign role.
   * Mutually exclusive with `email` and `walletId`.
   * </pre>
   *
   * <code>string did_uri = 4;</code>
   *
   * @return The didUri.
   */
  public java.lang.String getDidUri() {
    java.lang.Object ref = "";
    if (accountCase_ == 4) {
      ref = account_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (accountCase_ == 4) {
        account_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * DID URI of the account to assign role.
   * Mutually exclusive with `email` and `walletId`.
   * </pre>
   *
   * <code>string did_uri = 4;</code>
   *
   * @return The bytes for didUri.
   */
  public com.google.protobuf.ByteString getDidUriBytes() {
    java.lang.Object ref = "";
    if (accountCase_ == 4) {
      ref = account_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (accountCase_ == 4) {
        account_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(role_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, role_);
    }
    if (accountCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, account_);
    }
    if (accountCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, account_);
    }
    if (accountCase_ == 4) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, account_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(role_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, role_);
    }
    if (accountCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, account_);
    }
    if (accountCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, account_);
    }
    if (accountCase_ == 4) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, account_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof trinsic.services.provider.v1.AddRoleAssignmentRequest)) {
      return super.equals(obj);
    }
    trinsic.services.provider.v1.AddRoleAssignmentRequest other =
        (trinsic.services.provider.v1.AddRoleAssignmentRequest) obj;

    if (!getRole().equals(other.getRole())) return false;
    if (!getAccountCase().equals(other.getAccountCase())) return false;
    switch (accountCase_) {
      case 2:
        if (!getEmail().equals(other.getEmail())) return false;
        break;
      case 3:
        if (!getWalletId().equals(other.getWalletId())) return false;
        break;
      case 4:
        if (!getDidUri().equals(other.getDidUri())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + getRole().hashCode();
    switch (accountCase_) {
      case 2:
        hash = (37 * hash) + EMAIL_FIELD_NUMBER;
        hash = (53 * hash) + getEmail().hashCode();
        break;
      case 3:
        hash = (37 * hash) + WALLET_ID_FIELD_NUMBER;
        hash = (53 * hash) + getWalletId().hashCode();
        break;
      case 4:
        hash = (37 * hash) + DID_URI_FIELD_NUMBER;
        hash = (53 * hash) + getDidUri().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static trinsic.services.provider.v1.AddRoleAssignmentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.AddRoleAssignmentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.AddRoleAssignmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.AddRoleAssignmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.AddRoleAssignmentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static trinsic.services.provider.v1.AddRoleAssignmentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static trinsic.services.provider.v1.AddRoleAssignmentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.AddRoleAssignmentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.provider.v1.AddRoleAssignmentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.AddRoleAssignmentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static trinsic.services.provider.v1.AddRoleAssignmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static trinsic.services.provider.v1.AddRoleAssignmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      trinsic.services.provider.v1.AddRoleAssignmentRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Role management
   * </pre>
   *
   * Protobuf type {@code services.provider.v1.AddRoleAssignmentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:services.provider.v1.AddRoleAssignmentRequest)
      trinsic.services.provider.v1.AddRoleAssignmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return trinsic.services.provider.v1.AccessManagementOuterClass
          .internal_static_services_provider_v1_AddRoleAssignmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return trinsic.services.provider.v1.AccessManagementOuterClass
          .internal_static_services_provider_v1_AddRoleAssignmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              trinsic.services.provider.v1.AddRoleAssignmentRequest.class,
              trinsic.services.provider.v1.AddRoleAssignmentRequest.Builder.class);
    }

    // Construct using trinsic.services.provider.v1.AddRoleAssignmentRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      role_ = "";

      accountCase_ = 0;
      account_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return trinsic.services.provider.v1.AccessManagementOuterClass
          .internal_static_services_provider_v1_AddRoleAssignmentRequest_descriptor;
    }

    @java.lang.Override
    public trinsic.services.provider.v1.AddRoleAssignmentRequest getDefaultInstanceForType() {
      return trinsic.services.provider.v1.AddRoleAssignmentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public trinsic.services.provider.v1.AddRoleAssignmentRequest build() {
      trinsic.services.provider.v1.AddRoleAssignmentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public trinsic.services.provider.v1.AddRoleAssignmentRequest buildPartial() {
      trinsic.services.provider.v1.AddRoleAssignmentRequest result =
          new trinsic.services.provider.v1.AddRoleAssignmentRequest(this);
      result.role_ = role_;
      if (accountCase_ == 2) {
        result.account_ = account_;
      }
      if (accountCase_ == 3) {
        result.account_ = account_;
      }
      if (accountCase_ == 4) {
        result.account_ = account_;
      }
      result.accountCase_ = accountCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof trinsic.services.provider.v1.AddRoleAssignmentRequest) {
        return mergeFrom((trinsic.services.provider.v1.AddRoleAssignmentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(trinsic.services.provider.v1.AddRoleAssignmentRequest other) {
      if (other == trinsic.services.provider.v1.AddRoleAssignmentRequest.getDefaultInstance())
        return this;
      if (!other.getRole().isEmpty()) {
        role_ = other.role_;
        onChanged();
      }
      switch (other.getAccountCase()) {
        case EMAIL:
          {
            accountCase_ = 2;
            account_ = other.account_;
            onChanged();
            break;
          }
        case WALLET_ID:
          {
            accountCase_ = 3;
            account_ = other.account_;
            onChanged();
            break;
          }
        case DID_URI:
          {
            accountCase_ = 4;
            account_ = other.account_;
            onChanged();
            break;
          }
        case ACCOUNT_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                role_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                accountCase_ = 2;
                account_ = s;
                break;
              } // case 18
            case 26:
              {
                java.lang.String s = input.readStringRequireUtf8();
                accountCase_ = 3;
                account_ = s;
                break;
              } // case 26
            case 34:
              {
                java.lang.String s = input.readStringRequireUtf8();
                accountCase_ = 4;
                account_ = s;
                break;
              } // case 34
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int accountCase_ = 0;
    private java.lang.Object account_;

    public AccountCase getAccountCase() {
      return AccountCase.forNumber(accountCase_);
    }

    public Builder clearAccount() {
      accountCase_ = 0;
      account_ = null;
      onChanged();
      return this;
    }

    private java.lang.Object role_ = "";
    /**
     *
     *
     * <pre>
     * Role to assign
     * </pre>
     *
     * <code>string role = 1;</code>
     *
     * @return The role.
     */
    public java.lang.String getRole() {
      java.lang.Object ref = role_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        role_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Role to assign
     * </pre>
     *
     * <code>string role = 1;</code>
     *
     * @return The bytes for role.
     */
    public com.google.protobuf.ByteString getRoleBytes() {
      java.lang.Object ref = role_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        role_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Role to assign
     * </pre>
     *
     * <code>string role = 1;</code>
     *
     * @param value The role to set.
     * @return This builder for chaining.
     */
    public Builder setRole(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      role_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Role to assign
     * </pre>
     *
     * <code>string role = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRole() {

      role_ = getDefaultInstance().getRole();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Role to assign
     * </pre>
     *
     * <code>string role = 1;</code>
     *
     * @param value The bytes for role to set.
     * @return This builder for chaining.
     */
    public Builder setRoleBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      role_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Email address of account to assign role.
     * Mutually exclusive with `walletId` and `didUri`.
     * </pre>
     *
     * <code>string email = 2;</code>
     *
     * @return Whether the email field is set.
     */
    @java.lang.Override
    public boolean hasEmail() {
      return accountCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Email address of account to assign role.
     * Mutually exclusive with `walletId` and `didUri`.
     * </pre>
     *
     * <code>string email = 2;</code>
     *
     * @return The email.
     */
    @java.lang.Override
    public java.lang.String getEmail() {
      java.lang.Object ref = "";
      if (accountCase_ == 2) {
        ref = account_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (accountCase_ == 2) {
          account_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Email address of account to assign role.
     * Mutually exclusive with `walletId` and `didUri`.
     * </pre>
     *
     * <code>string email = 2;</code>
     *
     * @return The bytes for email.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEmailBytes() {
      java.lang.Object ref = "";
      if (accountCase_ == 2) {
        ref = account_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (accountCase_ == 2) {
          account_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Email address of account to assign role.
     * Mutually exclusive with `walletId` and `didUri`.
     * </pre>
     *
     * <code>string email = 2;</code>
     *
     * @param value The email to set.
     * @return This builder for chaining.
     */
    public Builder setEmail(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      accountCase_ = 2;
      account_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Email address of account to assign role.
     * Mutually exclusive with `walletId` and `didUri`.
     * </pre>
     *
     * <code>string email = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEmail() {
      if (accountCase_ == 2) {
        accountCase_ = 0;
        account_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Email address of account to assign role.
     * Mutually exclusive with `walletId` and `didUri`.
     * </pre>
     *
     * <code>string email = 2;</code>
     *
     * @param value The bytes for email to set.
     * @return This builder for chaining.
     */
    public Builder setEmailBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      accountCase_ = 2;
      account_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Wallet ID of account to assign role to.
     * Mutually exclusive with `email` and `didUri`.
     * </pre>
     *
     * <code>string wallet_id = 3;</code>
     *
     * @return Whether the walletId field is set.
     */
    @java.lang.Override
    public boolean hasWalletId() {
      return accountCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * Wallet ID of account to assign role to.
     * Mutually exclusive with `email` and `didUri`.
     * </pre>
     *
     * <code>string wallet_id = 3;</code>
     *
     * @return The walletId.
     */
    @java.lang.Override
    public java.lang.String getWalletId() {
      java.lang.Object ref = "";
      if (accountCase_ == 3) {
        ref = account_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (accountCase_ == 3) {
          account_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Wallet ID of account to assign role to.
     * Mutually exclusive with `email` and `didUri`.
     * </pre>
     *
     * <code>string wallet_id = 3;</code>
     *
     * @return The bytes for walletId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getWalletIdBytes() {
      java.lang.Object ref = "";
      if (accountCase_ == 3) {
        ref = account_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (accountCase_ == 3) {
          account_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Wallet ID of account to assign role to.
     * Mutually exclusive with `email` and `didUri`.
     * </pre>
     *
     * <code>string wallet_id = 3;</code>
     *
     * @param value The walletId to set.
     * @return This builder for chaining.
     */
    public Builder setWalletId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      accountCase_ = 3;
      account_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Wallet ID of account to assign role to.
     * Mutually exclusive with `email` and `didUri`.
     * </pre>
     *
     * <code>string wallet_id = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWalletId() {
      if (accountCase_ == 3) {
        accountCase_ = 0;
        account_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Wallet ID of account to assign role to.
     * Mutually exclusive with `email` and `didUri`.
     * </pre>
     *
     * <code>string wallet_id = 3;</code>
     *
     * @param value The bytes for walletId to set.
     * @return This builder for chaining.
     */
    public Builder setWalletIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      accountCase_ = 3;
      account_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * DID URI of the account to assign role.
     * Mutually exclusive with `email` and `walletId`.
     * </pre>
     *
     * <code>string did_uri = 4;</code>
     *
     * @return Whether the didUri field is set.
     */
    @java.lang.Override
    public boolean hasDidUri() {
      return accountCase_ == 4;
    }
    /**
     *
     *
     * <pre>
     * DID URI of the account to assign role.
     * Mutually exclusive with `email` and `walletId`.
     * </pre>
     *
     * <code>string did_uri = 4;</code>
     *
     * @return The didUri.
     */
    @java.lang.Override
    public java.lang.String getDidUri() {
      java.lang.Object ref = "";
      if (accountCase_ == 4) {
        ref = account_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (accountCase_ == 4) {
          account_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * DID URI of the account to assign role.
     * Mutually exclusive with `email` and `walletId`.
     * </pre>
     *
     * <code>string did_uri = 4;</code>
     *
     * @return The bytes for didUri.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getDidUriBytes() {
      java.lang.Object ref = "";
      if (accountCase_ == 4) {
        ref = account_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (accountCase_ == 4) {
          account_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * DID URI of the account to assign role.
     * Mutually exclusive with `email` and `walletId`.
     * </pre>
     *
     * <code>string did_uri = 4;</code>
     *
     * @param value The didUri to set.
     * @return This builder for chaining.
     */
    public Builder setDidUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      accountCase_ = 4;
      account_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * DID URI of the account to assign role.
     * Mutually exclusive with `email` and `walletId`.
     * </pre>
     *
     * <code>string did_uri = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDidUri() {
      if (accountCase_ == 4) {
        accountCase_ = 0;
        account_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * DID URI of the account to assign role.
     * Mutually exclusive with `email` and `walletId`.
     * </pre>
     *
     * <code>string did_uri = 4;</code>
     *
     * @param value The bytes for didUri to set.
     * @return This builder for chaining.
     */
    public Builder setDidUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      accountCase_ = 4;
      account_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:services.provider.v1.AddRoleAssignmentRequest)
  }

  // @@protoc_insertion_point(class_scope:services.provider.v1.AddRoleAssignmentRequest)
  private static final trinsic.services.provider.v1.AddRoleAssignmentRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new trinsic.services.provider.v1.AddRoleAssignmentRequest();
  }

  public static trinsic.services.provider.v1.AddRoleAssignmentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddRoleAssignmentRequest> PARSER =
      new com.google.protobuf.AbstractParser<AddRoleAssignmentRequest>() {
        @java.lang.Override
        public AddRoleAssignmentRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<AddRoleAssignmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddRoleAssignmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public trinsic.services.provider.v1.AddRoleAssignmentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
