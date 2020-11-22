// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/audit/audit_log.proto

package com.google.cloud.audit;

/**
 * <pre>
 * Metadata about the request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.audit.RequestMetadata}
 */
public  final class RequestMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.audit.RequestMetadata)
    RequestMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestMetadata.newBuilder() to construct.
  private RequestMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestMetadata() {
    callerIp_ = "";
    callerSuppliedUserAgent_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RequestMetadata(
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

            callerIp_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            callerSuppliedUserAgent_ = s;
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
    return AuditLogProto.internal_static_google_cloud_audit_RequestMetadata_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return AuditLogProto.internal_static_google_cloud_audit_RequestMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            RequestMetadata.class, Builder.class);
  }

  public static final int CALLER_IP_FIELD_NUMBER = 1;
  private volatile Object callerIp_;
  /**
   * <pre>
   * The IP address of the caller.
   * </pre>
   *
   * <code>string caller_ip = 1;</code>
   */
  public String getCallerIp() {
    Object ref = callerIp_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      callerIp_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The IP address of the caller.
   * </pre>
   *
   * <code>string caller_ip = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCallerIpBytes() {
    Object ref = callerIp_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      callerIp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER = 2;
  private volatile Object callerSuppliedUserAgent_;
  /**
   * <pre>
   * The user agent of the caller.
   * This information is not authenticated and should be treated accordingly.
   * For example:
   * +   `google-api-python-client/1.4.0`:
   *     The request was made by the Google API client for Python.
   * +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:
   *     The request was made by the Google Cloud SDK CLI (gcloud).
   * +   `AppEngine-Google; (+http://code.google.com/appengine; appid:
   * s~my-project`:
   *     The request was made from the `my-project` App Engine app.
   * </pre>
   *
   * <code>string caller_supplied_user_agent = 2;</code>
   */
  public String getCallerSuppliedUserAgent() {
    Object ref = callerSuppliedUserAgent_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      callerSuppliedUserAgent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The user agent of the caller.
   * This information is not authenticated and should be treated accordingly.
   * For example:
   * +   `google-api-python-client/1.4.0`:
   *     The request was made by the Google API client for Python.
   * +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:
   *     The request was made by the Google Cloud SDK CLI (gcloud).
   * +   `AppEngine-Google; (+http://code.google.com/appengine; appid:
   * s~my-project`:
   *     The request was made from the `my-project` App Engine app.
   * </pre>
   *
   * <code>string caller_supplied_user_agent = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCallerSuppliedUserAgentBytes() {
    Object ref = callerSuppliedUserAgent_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      callerSuppliedUserAgent_ = b;
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
    if (!getCallerIpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, callerIp_);
    }
    if (!getCallerSuppliedUserAgentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, callerSuppliedUserAgent_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCallerIpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, callerIp_);
    }
    if (!getCallerSuppliedUserAgentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, callerSuppliedUserAgent_);
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
    if (!(obj instanceof RequestMetadata)) {
      return super.equals(obj);
    }
    RequestMetadata other = (RequestMetadata) obj;

    if (!getCallerIp()
        .equals(other.getCallerIp())) return false;
    if (!getCallerSuppliedUserAgent()
        .equals(other.getCallerSuppliedUserAgent())) return false;
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
    hash = (37 * hash) + CALLER_IP_FIELD_NUMBER;
    hash = (53 * hash) + getCallerIp().hashCode();
    hash = (37 * hash) + CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER;
    hash = (53 * hash) + getCallerSuppliedUserAgent().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static RequestMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RequestMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RequestMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RequestMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RequestMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RequestMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RequestMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RequestMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static RequestMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static RequestMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static RequestMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RequestMetadata parseFrom(
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
  public static Builder newBuilder(RequestMetadata prototype) {
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
   * Metadata about the request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.audit.RequestMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.audit.RequestMetadata)
      RequestMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return AuditLogProto.internal_static_google_cloud_audit_RequestMetadata_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return AuditLogProto.internal_static_google_cloud_audit_RequestMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestMetadata.class, Builder.class);
    }

    // Construct using com.google.cloud.audit.RequestMetadata.newBuilder()
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
      callerIp_ = "";

      callerSuppliedUserAgent_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return AuditLogProto.internal_static_google_cloud_audit_RequestMetadata_descriptor;
    }

    @Override
    public RequestMetadata getDefaultInstanceForType() {
      return RequestMetadata.getDefaultInstance();
    }

    @Override
    public RequestMetadata build() {
      RequestMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public RequestMetadata buildPartial() {
      RequestMetadata result = new RequestMetadata(this);
      result.callerIp_ = callerIp_;
      result.callerSuppliedUserAgent_ = callerSuppliedUserAgent_;
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
      if (other instanceof RequestMetadata) {
        return mergeFrom((RequestMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(RequestMetadata other) {
      if (other == RequestMetadata.getDefaultInstance()) return this;
      if (!other.getCallerIp().isEmpty()) {
        callerIp_ = other.callerIp_;
        onChanged();
      }
      if (!other.getCallerSuppliedUserAgent().isEmpty()) {
        callerSuppliedUserAgent_ = other.callerSuppliedUserAgent_;
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
      RequestMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (RequestMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object callerIp_ = "";
    /**
     * <pre>
     * The IP address of the caller.
     * </pre>
     *
     * <code>string caller_ip = 1;</code>
     */
    public String getCallerIp() {
      Object ref = callerIp_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        callerIp_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * The IP address of the caller.
     * </pre>
     *
     * <code>string caller_ip = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCallerIpBytes() {
      Object ref = callerIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        callerIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The IP address of the caller.
     * </pre>
     *
     * <code>string caller_ip = 1;</code>
     */
    public Builder setCallerIp(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      callerIp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The IP address of the caller.
     * </pre>
     *
     * <code>string caller_ip = 1;</code>
     */
    public Builder clearCallerIp() {
      
      callerIp_ = getDefaultInstance().getCallerIp();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The IP address of the caller.
     * </pre>
     *
     * <code>string caller_ip = 1;</code>
     */
    public Builder setCallerIpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      callerIp_ = value;
      onChanged();
      return this;
    }

    private Object callerSuppliedUserAgent_ = "";
    /**
     * <pre>
     * The user agent of the caller.
     * This information is not authenticated and should be treated accordingly.
     * For example:
     * +   `google-api-python-client/1.4.0`:
     *     The request was made by the Google API client for Python.
     * +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:
     *     The request was made by the Google Cloud SDK CLI (gcloud).
     * +   `AppEngine-Google; (+http://code.google.com/appengine; appid:
     * s~my-project`:
     *     The request was made from the `my-project` App Engine app.
     * </pre>
     *
     * <code>string caller_supplied_user_agent = 2;</code>
     */
    public String getCallerSuppliedUserAgent() {
      Object ref = callerSuppliedUserAgent_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        callerSuppliedUserAgent_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * The user agent of the caller.
     * This information is not authenticated and should be treated accordingly.
     * For example:
     * +   `google-api-python-client/1.4.0`:
     *     The request was made by the Google API client for Python.
     * +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:
     *     The request was made by the Google Cloud SDK CLI (gcloud).
     * +   `AppEngine-Google; (+http://code.google.com/appengine; appid:
     * s~my-project`:
     *     The request was made from the `my-project` App Engine app.
     * </pre>
     *
     * <code>string caller_supplied_user_agent = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCallerSuppliedUserAgentBytes() {
      Object ref = callerSuppliedUserAgent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        callerSuppliedUserAgent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The user agent of the caller.
     * This information is not authenticated and should be treated accordingly.
     * For example:
     * +   `google-api-python-client/1.4.0`:
     *     The request was made by the Google API client for Python.
     * +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:
     *     The request was made by the Google Cloud SDK CLI (gcloud).
     * +   `AppEngine-Google; (+http://code.google.com/appengine; appid:
     * s~my-project`:
     *     The request was made from the `my-project` App Engine app.
     * </pre>
     *
     * <code>string caller_supplied_user_agent = 2;</code>
     */
    public Builder setCallerSuppliedUserAgent(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      callerSuppliedUserAgent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user agent of the caller.
     * This information is not authenticated and should be treated accordingly.
     * For example:
     * +   `google-api-python-client/1.4.0`:
     *     The request was made by the Google API client for Python.
     * +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:
     *     The request was made by the Google Cloud SDK CLI (gcloud).
     * +   `AppEngine-Google; (+http://code.google.com/appengine; appid:
     * s~my-project`:
     *     The request was made from the `my-project` App Engine app.
     * </pre>
     *
     * <code>string caller_supplied_user_agent = 2;</code>
     */
    public Builder clearCallerSuppliedUserAgent() {
      
      callerSuppliedUserAgent_ = getDefaultInstance().getCallerSuppliedUserAgent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The user agent of the caller.
     * This information is not authenticated and should be treated accordingly.
     * For example:
     * +   `google-api-python-client/1.4.0`:
     *     The request was made by the Google API client for Python.
     * +   `Cloud SDK Command Line Tool apitools-client/1.0 gcloud/0.9.62`:
     *     The request was made by the Google Cloud SDK CLI (gcloud).
     * +   `AppEngine-Google; (+http://code.google.com/appengine; appid:
     * s~my-project`:
     *     The request was made from the `my-project` App Engine app.
     * </pre>
     *
     * <code>string caller_supplied_user_agent = 2;</code>
     */
    public Builder setCallerSuppliedUserAgentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      callerSuppliedUserAgent_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.audit.RequestMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.audit.RequestMetadata)
  private static final RequestMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RequestMetadata();
  }

  public static RequestMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestMetadata>
      PARSER = new com.google.protobuf.AbstractParser<RequestMetadata>() {
    @Override
    public RequestMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RequestMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestMetadata> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<RequestMetadata> getParserForType() {
    return PARSER;
  }

  @Override
  public RequestMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

