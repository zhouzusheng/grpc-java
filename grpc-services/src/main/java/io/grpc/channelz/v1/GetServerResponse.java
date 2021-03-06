// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

/**
 * Protobuf type {@code grpc.channelz.v1.GetServerResponse}
 */
public  final class GetServerResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.channelz.v1.GetServerResponse)
    GetServerResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetServerResponse.newBuilder() to construct.
  private GetServerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetServerResponse() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetServerResponse(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            Server.Builder subBuilder = null;
            if (server_ != null) {
              subBuilder = server_.toBuilder();
            }
            server_ = input.readMessage(Server.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(server_);
              server_ = subBuilder.buildPartial();
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
    return ChannelzProto.internal_static_grpc_channelz_v1_GetServerResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ChannelzProto.internal_static_grpc_channelz_v1_GetServerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GetServerResponse.class, Builder.class);
  }

  public static final int SERVER_FIELD_NUMBER = 1;
  private Server server_;
  /**
   * <pre>
   * The Server that corresponds to the requested server_id.  This field
   * should be set.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Server server = 1;</code>
   */
  public boolean hasServer() {
    return server_ != null;
  }
  /**
   * <pre>
   * The Server that corresponds to the requested server_id.  This field
   * should be set.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Server server = 1;</code>
   */
  public Server getServer() {
    return server_ == null ? Server.getDefaultInstance() : server_;
  }
  /**
   * <pre>
   * The Server that corresponds to the requested server_id.  This field
   * should be set.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Server server = 1;</code>
   */
  public ServerOrBuilder getServerOrBuilder() {
    return getServer();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (server_ != null) {
      output.writeMessage(1, getServer());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (server_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getServer());
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
    if (!(obj instanceof GetServerResponse)) {
      return super.equals(obj);
    }
    GetServerResponse other = (GetServerResponse) obj;

    boolean result = true;
    result = result && (hasServer() == other.hasServer());
    if (hasServer()) {
      result = result && getServer()
          .equals(other.getServer());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasServer()) {
      hash = (37 * hash) + SERVER_FIELD_NUMBER;
      hash = (53 * hash) + getServer().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GetServerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetServerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetServerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetServerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetServerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetServerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetServerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetServerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetServerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GetServerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetServerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetServerResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(GetServerResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.channelz.v1.GetServerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.channelz.v1.GetServerResponse)
      GetServerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChannelzProto.internal_static_grpc_channelz_v1_GetServerResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChannelzProto.internal_static_grpc_channelz_v1_GetServerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GetServerResponse.class, Builder.class);
    }

    // Construct using io.grpc.channelz.v1.GetServerResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      if (serverBuilder_ == null) {
        server_ = null;
      } else {
        server_ = null;
        serverBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ChannelzProto.internal_static_grpc_channelz_v1_GetServerResponse_descriptor;
    }

    public GetServerResponse getDefaultInstanceForType() {
      return GetServerResponse.getDefaultInstance();
    }

    public GetServerResponse build() {
      GetServerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public GetServerResponse buildPartial() {
      GetServerResponse result = new GetServerResponse(this);
      if (serverBuilder_ == null) {
        result.server_ = server_;
      } else {
        result.server_ = serverBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof GetServerResponse) {
        return mergeFrom((GetServerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GetServerResponse other) {
      if (other == GetServerResponse.getDefaultInstance()) return this;
      if (other.hasServer()) {
        mergeServer(other.getServer());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      GetServerResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (GetServerResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Server server_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        Server, Server.Builder, ServerOrBuilder> serverBuilder_;
    /**
     * <pre>
     * The Server that corresponds to the requested server_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Server server = 1;</code>
     */
    public boolean hasServer() {
      return serverBuilder_ != null || server_ != null;
    }
    /**
     * <pre>
     * The Server that corresponds to the requested server_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Server server = 1;</code>
     */
    public Server getServer() {
      if (serverBuilder_ == null) {
        return server_ == null ? Server.getDefaultInstance() : server_;
      } else {
        return serverBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Server that corresponds to the requested server_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Server server = 1;</code>
     */
    public Builder setServer(Server value) {
      if (serverBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        server_ = value;
        onChanged();
      } else {
        serverBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Server that corresponds to the requested server_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Server server = 1;</code>
     */
    public Builder setServer(
        Server.Builder builderForValue) {
      if (serverBuilder_ == null) {
        server_ = builderForValue.build();
        onChanged();
      } else {
        serverBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The Server that corresponds to the requested server_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Server server = 1;</code>
     */
    public Builder mergeServer(Server value) {
      if (serverBuilder_ == null) {
        if (server_ != null) {
          server_ =
            Server.newBuilder(server_).mergeFrom(value).buildPartial();
        } else {
          server_ = value;
        }
        onChanged();
      } else {
        serverBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Server that corresponds to the requested server_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Server server = 1;</code>
     */
    public Builder clearServer() {
      if (serverBuilder_ == null) {
        server_ = null;
        onChanged();
      } else {
        server_ = null;
        serverBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The Server that corresponds to the requested server_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Server server = 1;</code>
     */
    public Server.Builder getServerBuilder() {
      
      onChanged();
      return getServerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Server that corresponds to the requested server_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Server server = 1;</code>
     */
    public ServerOrBuilder getServerOrBuilder() {
      if (serverBuilder_ != null) {
        return serverBuilder_.getMessageOrBuilder();
      } else {
        return server_ == null ?
            Server.getDefaultInstance() : server_;
      }
    }
    /**
     * <pre>
     * The Server that corresponds to the requested server_id.  This field
     * should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Server server = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Server, Server.Builder, ServerOrBuilder>
        getServerFieldBuilder() {
      if (serverBuilder_ == null) {
        serverBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Server, Server.Builder, ServerOrBuilder>(
                getServer(),
                getParentForChildren(),
                isClean());
        server_ = null;
      }
      return serverBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.channelz.v1.GetServerResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.channelz.v1.GetServerResponse)
  private static final GetServerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GetServerResponse();
  }

  public static GetServerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetServerResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetServerResponse>() {
    public GetServerResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetServerResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetServerResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GetServerResponse> getParserForType() {
    return PARSER;
  }

  public GetServerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

