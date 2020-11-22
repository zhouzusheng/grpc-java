// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package com.google.rpc;

/**
 * <pre>
 * Contains metadata about the request that clients can attach when filing a bug
 * or providing other forms of feedback.
 * </pre>
 *
 * Protobuf type {@code google.rpc.RequestInfo}
 */
public  final class RequestInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.rpc.RequestInfo)
    RequestInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestInfo.newBuilder() to construct.
  private RequestInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestInfo() {
    requestId_ = "";
    servingData_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RequestInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            String s = input.readStringRequireUtf8();

            requestId_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            servingData_ = s;
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
    return ErrorDetailsProto.internal_static_google_rpc_RequestInfo_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ErrorDetailsProto.internal_static_google_rpc_RequestInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            RequestInfo.class, Builder.class);
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 1;
  private volatile Object requestId_;
  /**
   * <pre>
   * An opaque string that should only be interpreted by the service generating
   * it. For example, it can be used to identify requests in the service's logs.
   * </pre>
   *
   * <code>string request_id = 1;</code>
   */
  public String getRequestId() {
    Object ref = requestId_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      requestId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An opaque string that should only be interpreted by the service generating
   * it. For example, it can be used to identify requests in the service's logs.
   * </pre>
   *
   * <code>string request_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRequestIdBytes() {
    Object ref = requestId_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      requestId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVING_DATA_FIELD_NUMBER = 2;
  private volatile Object servingData_;
  /**
   * <pre>
   * Any data that was used to serve this request. For example, an encrypted
   * stack trace that can be sent back to the service provider for debugging.
   * </pre>
   *
   * <code>string serving_data = 2;</code>
   */
  public String getServingData() {
    Object ref = servingData_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      servingData_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Any data that was used to serve this request. For example, an encrypted
   * stack trace that can be sent back to the service provider for debugging.
   * </pre>
   *
   * <code>string serving_data = 2;</code>
   */
  public com.google.protobuf.ByteString
      getServingDataBytes() {
    Object ref = servingData_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      servingData_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getRequestIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, requestId_);
    }
    if (!getServingDataBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, servingData_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRequestIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, requestId_);
    }
    if (!getServingDataBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, servingData_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof RequestInfo)) {
      return super.equals(obj);
    }
    RequestInfo other = (RequestInfo) obj;

    if (!getRequestId()
        .equals(other.getRequestId())) return false;
    if (!getServingData()
        .equals(other.getServingData())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId().hashCode();
    hash = (37 * hash) + SERVING_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getServingData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static RequestInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RequestInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RequestInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RequestInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RequestInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RequestInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RequestInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RequestInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static RequestInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static RequestInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static RequestInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RequestInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(RequestInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Contains metadata about the request that clients can attach when filing a bug
   * or providing other forms of feedback.
   * </pre>
   *
   * Protobuf type {@code google.rpc.RequestInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.rpc.RequestInfo)
      RequestInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ErrorDetailsProto.internal_static_google_rpc_RequestInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ErrorDetailsProto.internal_static_google_rpc_RequestInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestInfo.class, Builder.class);
    }

    // Construct using com.google.rpc.RequestInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      requestId_ = "";

      servingData_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ErrorDetailsProto.internal_static_google_rpc_RequestInfo_descriptor;
    }

    @Override
    public RequestInfo getDefaultInstanceForType() {
      return RequestInfo.getDefaultInstance();
    }

    @Override
    public RequestInfo build() {
      RequestInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public RequestInfo buildPartial() {
      RequestInfo result = new RequestInfo(this);
      result.requestId_ = requestId_;
      result.servingData_ = servingData_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof RequestInfo) {
        return mergeFrom((RequestInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(RequestInfo other) {
      if (other == RequestInfo.getDefaultInstance()) return this;
      if (!other.getRequestId().isEmpty()) {
        requestId_ = other.requestId_;
        onChanged();
      }
      if (!other.getServingData().isEmpty()) {
        servingData_ = other.servingData_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      RequestInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (RequestInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object requestId_ = "";
    /**
     * <pre>
     * An opaque string that should only be interpreted by the service generating
     * it. For example, it can be used to identify requests in the service's logs.
     * </pre>
     *
     * <code>string request_id = 1;</code>
     */
    public String getRequestId() {
      Object ref = requestId_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        requestId_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * An opaque string that should only be interpreted by the service generating
     * it. For example, it can be used to identify requests in the service's logs.
     * </pre>
     *
     * <code>string request_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRequestIdBytes() {
      Object ref = requestId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        requestId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An opaque string that should only be interpreted by the service generating
     * it. For example, it can be used to identify requests in the service's logs.
     * </pre>
     *
     * <code>string request_id = 1;</code>
     */
    public Builder setRequestId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      requestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An opaque string that should only be interpreted by the service generating
     * it. For example, it can be used to identify requests in the service's logs.
     * </pre>
     *
     * <code>string request_id = 1;</code>
     */
    public Builder clearRequestId() {
      
      requestId_ = getDefaultInstance().getRequestId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An opaque string that should only be interpreted by the service generating
     * it. For example, it can be used to identify requests in the service's logs.
     * </pre>
     *
     * <code>string request_id = 1;</code>
     */
    public Builder setRequestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      requestId_ = value;
      onChanged();
      return this;
    }

    private Object servingData_ = "";
    /**
     * <pre>
     * Any data that was used to serve this request. For example, an encrypted
     * stack trace that can be sent back to the service provider for debugging.
     * </pre>
     *
     * <code>string serving_data = 2;</code>
     */
    public String getServingData() {
      Object ref = servingData_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        servingData_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Any data that was used to serve this request. For example, an encrypted
     * stack trace that can be sent back to the service provider for debugging.
     * </pre>
     *
     * <code>string serving_data = 2;</code>
     */
    public com.google.protobuf.ByteString
        getServingDataBytes() {
      Object ref = servingData_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        servingData_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Any data that was used to serve this request. For example, an encrypted
     * stack trace that can be sent back to the service provider for debugging.
     * </pre>
     *
     * <code>string serving_data = 2;</code>
     */
    public Builder setServingData(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      servingData_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Any data that was used to serve this request. For example, an encrypted
     * stack trace that can be sent back to the service provider for debugging.
     * </pre>
     *
     * <code>string serving_data = 2;</code>
     */
    public Builder clearServingData() {
      
      servingData_ = getDefaultInstance().getServingData();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Any data that was used to serve this request. For example, an encrypted
     * stack trace that can be sent back to the service provider for debugging.
     * </pre>
     *
     * <code>string serving_data = 2;</code>
     */
    public Builder setServingDataBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      servingData_ = value;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.rpc.RequestInfo)
  }

  // @@protoc_insertion_point(class_scope:google.rpc.RequestInfo)
  private static final RequestInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RequestInfo();
  }

  public static RequestInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestInfo>
      PARSER = new com.google.protobuf.AbstractParser<RequestInfo>() {
    @Override
    public RequestInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RequestInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestInfo> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<RequestInfo> getParserForType() {
    return PARSER;
  }

  @Override
  public RequestInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

