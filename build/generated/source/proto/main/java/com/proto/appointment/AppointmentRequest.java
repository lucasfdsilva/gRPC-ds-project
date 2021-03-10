// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: appointment/appointment.proto

package com.proto.appointment;

/**
 * Protobuf type {@code appointment.AppointmentRequest}
 */
public final class AppointmentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:appointment.AppointmentRequest)
    AppointmentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AppointmentRequest.newBuilder() to construct.
  private AppointmentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AppointmentRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AppointmentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AppointmentRequest(
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
            com.proto.appointment.Appointment.Builder subBuilder = null;
            if (appointment_ != null) {
              subBuilder = appointment_.toBuilder();
            }
            appointment_ = input.readMessage(com.proto.appointment.Appointment.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(appointment_);
              appointment_ = subBuilder.buildPartial();
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
    return com.proto.appointment.AppointmentOuterClass.internal_static_appointment_AppointmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.appointment.AppointmentOuterClass.internal_static_appointment_AppointmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.appointment.AppointmentRequest.class, com.proto.appointment.AppointmentRequest.Builder.class);
  }

  public static final int APPOINTMENT_FIELD_NUMBER = 1;
  private com.proto.appointment.Appointment appointment_;
  /**
   * <code>.appointment.Appointment appointment = 1;</code>
   * @return Whether the appointment field is set.
   */
  @java.lang.Override
  public boolean hasAppointment() {
    return appointment_ != null;
  }
  /**
   * <code>.appointment.Appointment appointment = 1;</code>
   * @return The appointment.
   */
  @java.lang.Override
  public com.proto.appointment.Appointment getAppointment() {
    return appointment_ == null ? com.proto.appointment.Appointment.getDefaultInstance() : appointment_;
  }
  /**
   * <code>.appointment.Appointment appointment = 1;</code>
   */
  @java.lang.Override
  public com.proto.appointment.AppointmentOrBuilder getAppointmentOrBuilder() {
    return getAppointment();
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
    if (appointment_ != null) {
      output.writeMessage(1, getAppointment());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (appointment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAppointment());
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
    if (!(obj instanceof com.proto.appointment.AppointmentRequest)) {
      return super.equals(obj);
    }
    com.proto.appointment.AppointmentRequest other = (com.proto.appointment.AppointmentRequest) obj;

    if (hasAppointment() != other.hasAppointment()) return false;
    if (hasAppointment()) {
      if (!getAppointment()
          .equals(other.getAppointment())) return false;
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
    if (hasAppointment()) {
      hash = (37 * hash) + APPOINTMENT_FIELD_NUMBER;
      hash = (53 * hash) + getAppointment().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.appointment.AppointmentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.appointment.AppointmentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.appointment.AppointmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.appointment.AppointmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.appointment.AppointmentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.appointment.AppointmentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.appointment.AppointmentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.appointment.AppointmentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.appointment.AppointmentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.appointment.AppointmentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.appointment.AppointmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.appointment.AppointmentRequest parseFrom(
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
  public static Builder newBuilder(com.proto.appointment.AppointmentRequest prototype) {
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
   * Protobuf type {@code appointment.AppointmentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:appointment.AppointmentRequest)
      com.proto.appointment.AppointmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.appointment.AppointmentOuterClass.internal_static_appointment_AppointmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.appointment.AppointmentOuterClass.internal_static_appointment_AppointmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.appointment.AppointmentRequest.class, com.proto.appointment.AppointmentRequest.Builder.class);
    }

    // Construct using com.proto.appointment.AppointmentRequest.newBuilder()
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
      if (appointmentBuilder_ == null) {
        appointment_ = null;
      } else {
        appointment_ = null;
        appointmentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.appointment.AppointmentOuterClass.internal_static_appointment_AppointmentRequest_descriptor;
    }

    @java.lang.Override
    public com.proto.appointment.AppointmentRequest getDefaultInstanceForType() {
      return com.proto.appointment.AppointmentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.appointment.AppointmentRequest build() {
      com.proto.appointment.AppointmentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.appointment.AppointmentRequest buildPartial() {
      com.proto.appointment.AppointmentRequest result = new com.proto.appointment.AppointmentRequest(this);
      if (appointmentBuilder_ == null) {
        result.appointment_ = appointment_;
      } else {
        result.appointment_ = appointmentBuilder_.build();
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
      if (other instanceof com.proto.appointment.AppointmentRequest) {
        return mergeFrom((com.proto.appointment.AppointmentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.appointment.AppointmentRequest other) {
      if (other == com.proto.appointment.AppointmentRequest.getDefaultInstance()) return this;
      if (other.hasAppointment()) {
        mergeAppointment(other.getAppointment());
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
      com.proto.appointment.AppointmentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.appointment.AppointmentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.proto.appointment.Appointment appointment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.appointment.Appointment, com.proto.appointment.Appointment.Builder, com.proto.appointment.AppointmentOrBuilder> appointmentBuilder_;
    /**
     * <code>.appointment.Appointment appointment = 1;</code>
     * @return Whether the appointment field is set.
     */
    public boolean hasAppointment() {
      return appointmentBuilder_ != null || appointment_ != null;
    }
    /**
     * <code>.appointment.Appointment appointment = 1;</code>
     * @return The appointment.
     */
    public com.proto.appointment.Appointment getAppointment() {
      if (appointmentBuilder_ == null) {
        return appointment_ == null ? com.proto.appointment.Appointment.getDefaultInstance() : appointment_;
      } else {
        return appointmentBuilder_.getMessage();
      }
    }
    /**
     * <code>.appointment.Appointment appointment = 1;</code>
     */
    public Builder setAppointment(com.proto.appointment.Appointment value) {
      if (appointmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        appointment_ = value;
        onChanged();
      } else {
        appointmentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.appointment.Appointment appointment = 1;</code>
     */
    public Builder setAppointment(
        com.proto.appointment.Appointment.Builder builderForValue) {
      if (appointmentBuilder_ == null) {
        appointment_ = builderForValue.build();
        onChanged();
      } else {
        appointmentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.appointment.Appointment appointment = 1;</code>
     */
    public Builder mergeAppointment(com.proto.appointment.Appointment value) {
      if (appointmentBuilder_ == null) {
        if (appointment_ != null) {
          appointment_ =
            com.proto.appointment.Appointment.newBuilder(appointment_).mergeFrom(value).buildPartial();
        } else {
          appointment_ = value;
        }
        onChanged();
      } else {
        appointmentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.appointment.Appointment appointment = 1;</code>
     */
    public Builder clearAppointment() {
      if (appointmentBuilder_ == null) {
        appointment_ = null;
        onChanged();
      } else {
        appointment_ = null;
        appointmentBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.appointment.Appointment appointment = 1;</code>
     */
    public com.proto.appointment.Appointment.Builder getAppointmentBuilder() {
      
      onChanged();
      return getAppointmentFieldBuilder().getBuilder();
    }
    /**
     * <code>.appointment.Appointment appointment = 1;</code>
     */
    public com.proto.appointment.AppointmentOrBuilder getAppointmentOrBuilder() {
      if (appointmentBuilder_ != null) {
        return appointmentBuilder_.getMessageOrBuilder();
      } else {
        return appointment_ == null ?
            com.proto.appointment.Appointment.getDefaultInstance() : appointment_;
      }
    }
    /**
     * <code>.appointment.Appointment appointment = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.appointment.Appointment, com.proto.appointment.Appointment.Builder, com.proto.appointment.AppointmentOrBuilder> 
        getAppointmentFieldBuilder() {
      if (appointmentBuilder_ == null) {
        appointmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.appointment.Appointment, com.proto.appointment.Appointment.Builder, com.proto.appointment.AppointmentOrBuilder>(
                getAppointment(),
                getParentForChildren(),
                isClean());
        appointment_ = null;
      }
      return appointmentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:appointment.AppointmentRequest)
  }

  // @@protoc_insertion_point(class_scope:appointment.AppointmentRequest)
  private static final com.proto.appointment.AppointmentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.appointment.AppointmentRequest();
  }

  public static com.proto.appointment.AppointmentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AppointmentRequest>
      PARSER = new com.google.protobuf.AbstractParser<AppointmentRequest>() {
    @java.lang.Override
    public AppointmentRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AppointmentRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AppointmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AppointmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.appointment.AppointmentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

