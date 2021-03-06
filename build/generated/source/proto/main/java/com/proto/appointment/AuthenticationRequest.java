// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: clinic/authentication.proto

package com.proto.appointment;

/**
 * <pre>
 *Authenticate Method
 * </pre>
 *
 * Protobuf type {@code authentication.AuthenticationRequest}
 */
public final class AuthenticationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:authentication.AuthenticationRequest)
    AuthenticationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AuthenticationRequest.newBuilder() to construct.
  private AuthenticationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthenticationRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AuthenticationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AuthenticationRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.proto.appointment.UserCredentials.Builder subBuilder = null;
            if (userCredentials_ != null) {
              subBuilder = userCredentials_.toBuilder();
            }
            userCredentials_ = input.readMessage(com.proto.appointment.UserCredentials.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(userCredentials_);
              userCredentials_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.appointment.Authentication.internal_static_authentication_AuthenticationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.appointment.Authentication.internal_static_authentication_AuthenticationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.appointment.AuthenticationRequest.class, com.proto.appointment.AuthenticationRequest.Builder.class);
  }

  public static final int USERCREDENTIALS_FIELD_NUMBER = 1;
  private com.proto.appointment.UserCredentials userCredentials_;
  /**
   * <code>.authentication.UserCredentials userCredentials = 1;</code>
   * @return Whether the userCredentials field is set.
   */
  @java.lang.Override
  public boolean hasUserCredentials() {
    return userCredentials_ != null;
  }
  /**
   * <code>.authentication.UserCredentials userCredentials = 1;</code>
   * @return The userCredentials.
   */
  @java.lang.Override
  public com.proto.appointment.UserCredentials getUserCredentials() {
    return userCredentials_ == null ? com.proto.appointment.UserCredentials.getDefaultInstance() : userCredentials_;
  }
  /**
   * <code>.authentication.UserCredentials userCredentials = 1;</code>
   */
  @java.lang.Override
  public com.proto.appointment.UserCredentialsOrBuilder getUserCredentialsOrBuilder() {
    return getUserCredentials();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (userCredentials_ != null) {
      output.writeMessage(1, getUserCredentials());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userCredentials_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUserCredentials());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.proto.appointment.AuthenticationRequest)) {
      return super.equals(obj);
    }
    com.proto.appointment.AuthenticationRequest other = (com.proto.appointment.AuthenticationRequest) obj;

    if (hasUserCredentials() != other.hasUserCredentials()) return false;
    if (hasUserCredentials()) {
      if (!getUserCredentials()
          .equals(other.getUserCredentials())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasUserCredentials()) {
      hash = (37 * hash) + USERCREDENTIALS_FIELD_NUMBER;
      hash = (53 * hash) + getUserCredentials().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.appointment.AuthenticationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.appointment.AuthenticationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.appointment.AuthenticationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.appointment.AuthenticationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.appointment.AuthenticationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.appointment.AuthenticationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.appointment.AuthenticationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.appointment.AuthenticationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.appointment.AuthenticationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.appointment.AuthenticationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.appointment.AuthenticationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.appointment.AuthenticationRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.appointment.AuthenticationRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *Authenticate Method
   * </pre>
   *
   * Protobuf type {@code authentication.AuthenticationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:authentication.AuthenticationRequest)
      com.proto.appointment.AuthenticationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.appointment.Authentication.internal_static_authentication_AuthenticationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.appointment.Authentication.internal_static_authentication_AuthenticationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.appointment.AuthenticationRequest.class, com.proto.appointment.AuthenticationRequest.Builder.class);
    }

    // Construct using com.proto.appointment.AuthenticationRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userCredentialsBuilder_ == null) {
        userCredentials_ = null;
      } else {
        userCredentials_ = null;
        userCredentialsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.appointment.Authentication.internal_static_authentication_AuthenticationRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.appointment.AuthenticationRequest getDefaultInstanceForType() {
      return com.proto.appointment.AuthenticationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.appointment.AuthenticationRequest build() {
      com.proto.appointment.AuthenticationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.appointment.AuthenticationRequest buildPartial() {
      com.proto.appointment.AuthenticationRequest result = new com.proto.appointment.AuthenticationRequest(this);
      if (userCredentialsBuilder_ == null) {
        result.userCredentials_ = userCredentials_;
      } else {
        result.userCredentials_ = userCredentialsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.appointment.AuthenticationRequest) {
        return mergeFrom((com.proto.appointment.AuthenticationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.appointment.AuthenticationRequest other) {
      if (other == com.proto.appointment.AuthenticationRequest.getDefaultInstance()) return this;
      if (other.hasUserCredentials()) {
        mergeUserCredentials(other.getUserCredentials());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.proto.appointment.AuthenticationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.appointment.AuthenticationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.appointment.UserCredentials userCredentials_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.appointment.UserCredentials, com.proto.appointment.UserCredentials.Builder, com.proto.appointment.UserCredentialsOrBuilder> userCredentialsBuilder_;
    /**
     * <code>.authentication.UserCredentials userCredentials = 1;</code>
     * @return Whether the userCredentials field is set.
     */
    public boolean hasUserCredentials() {
      return userCredentialsBuilder_ != null || userCredentials_ != null;
    }
    /**
     * <code>.authentication.UserCredentials userCredentials = 1;</code>
     * @return The userCredentials.
     */
    public com.proto.appointment.UserCredentials getUserCredentials() {
      if (userCredentialsBuilder_ == null) {
        return userCredentials_ == null ? com.proto.appointment.UserCredentials.getDefaultInstance() : userCredentials_;
      } else {
        return userCredentialsBuilder_.getMessage();
      }
    }
    /**
     * <code>.authentication.UserCredentials userCredentials = 1;</code>
     */
    public Builder setUserCredentials(com.proto.appointment.UserCredentials value) {
      if (userCredentialsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userCredentials_ = value;
        onChanged();
      } else {
        userCredentialsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.authentication.UserCredentials userCredentials = 1;</code>
     */
    public Builder setUserCredentials(
        com.proto.appointment.UserCredentials.Builder builderForValue) {
      if (userCredentialsBuilder_ == null) {
        userCredentials_ = builderForValue.build();
        onChanged();
      } else {
        userCredentialsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.authentication.UserCredentials userCredentials = 1;</code>
     */
    public Builder mergeUserCredentials(com.proto.appointment.UserCredentials value) {
      if (userCredentialsBuilder_ == null) {
        if (userCredentials_ != null) {
          userCredentials_ =
            com.proto.appointment.UserCredentials.newBuilder(userCredentials_).mergeFrom(value).buildPartial();
        } else {
          userCredentials_ = value;
        }
        onChanged();
      } else {
        userCredentialsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.authentication.UserCredentials userCredentials = 1;</code>
     */
    public Builder clearUserCredentials() {
      if (userCredentialsBuilder_ == null) {
        userCredentials_ = null;
        onChanged();
      } else {
        userCredentials_ = null;
        userCredentialsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.authentication.UserCredentials userCredentials = 1;</code>
     */
    public com.proto.appointment.UserCredentials.Builder getUserCredentialsBuilder() {
      
      onChanged();
      return getUserCredentialsFieldBuilder().getBuilder();
    }
    /**
     * <code>.authentication.UserCredentials userCredentials = 1;</code>
     */
    public com.proto.appointment.UserCredentialsOrBuilder getUserCredentialsOrBuilder() {
      if (userCredentialsBuilder_ != null) {
        return userCredentialsBuilder_.getMessageOrBuilder();
      } else {
        return userCredentials_ == null ?
            com.proto.appointment.UserCredentials.getDefaultInstance() : userCredentials_;
      }
    }
    /**
     * <code>.authentication.UserCredentials userCredentials = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.appointment.UserCredentials, com.proto.appointment.UserCredentials.Builder, com.proto.appointment.UserCredentialsOrBuilder> 
        getUserCredentialsFieldBuilder() {
      if (userCredentialsBuilder_ == null) {
        userCredentialsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.appointment.UserCredentials, com.proto.appointment.UserCredentials.Builder, com.proto.appointment.UserCredentialsOrBuilder>(
                getUserCredentials(),
                getParentForChildren(),
                isClean());
        userCredentials_ = null;
      }
      return userCredentialsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:authentication.AuthenticationRequest)
  }

  // @@protoc_insertion_point(class_scope:authentication.AuthenticationRequest)
  private static final com.proto.appointment.AuthenticationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.appointment.AuthenticationRequest();
  }

  public static com.proto.appointment.AuthenticationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthenticationRequest>
      PARSER = new com.google.protobuf.AbstractParser<AuthenticationRequest>() {
    @java.lang.Override
    public AuthenticationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AuthenticationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AuthenticationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuthenticationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.appointment.AuthenticationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

