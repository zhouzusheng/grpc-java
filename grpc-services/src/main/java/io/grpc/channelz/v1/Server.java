// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

/**
 * <pre>
 * Server represents a single server.  There may be multiple servers in a single
 * program.
 * </pre>
 *
 * Protobuf type {@code grpc.channelz.v1.Server}
 */
public  final class Server extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.channelz.v1.Server)
    ServerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Server.newBuilder() to construct.
  private Server(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Server() {
    listenSocket_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Server(
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
            ServerRef.Builder subBuilder = null;
            if (ref_ != null) {
              subBuilder = ref_.toBuilder();
            }
            ref_ = input.readMessage(ServerRef.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ref_);
              ref_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            ServerData.Builder subBuilder = null;
            if (data_ != null) {
              subBuilder = data_.toBuilder();
            }
            data_ = input.readMessage(ServerData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(data_);
              data_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              listenSocket_ = new java.util.ArrayList<SocketRef>();
              mutable_bitField0_ |= 0x00000004;
            }
            listenSocket_.add(
                input.readMessage(SocketRef.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        listenSocket_ = java.util.Collections.unmodifiableList(listenSocket_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ChannelzProto.internal_static_grpc_channelz_v1_Server_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ChannelzProto.internal_static_grpc_channelz_v1_Server_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Server.class, Builder.class);
  }

  private int bitField0_;
  public static final int REF_FIELD_NUMBER = 1;
  private ServerRef ref_;
  /**
   * <pre>
   * The identifier for a Server.  This should be set.
   * </pre>
   *
   * <code>.grpc.channelz.v1.ServerRef ref = 1;</code>
   */
  public boolean hasRef() {
    return ref_ != null;
  }
  /**
   * <pre>
   * The identifier for a Server.  This should be set.
   * </pre>
   *
   * <code>.grpc.channelz.v1.ServerRef ref = 1;</code>
   */
  public ServerRef getRef() {
    return ref_ == null ? ServerRef.getDefaultInstance() : ref_;
  }
  /**
   * <pre>
   * The identifier for a Server.  This should be set.
   * </pre>
   *
   * <code>.grpc.channelz.v1.ServerRef ref = 1;</code>
   */
  public ServerRefOrBuilder getRefOrBuilder() {
    return getRef();
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private ServerData data_;
  /**
   * <pre>
   * The associated data of the Server.
   * </pre>
   *
   * <code>.grpc.channelz.v1.ServerData data = 2;</code>
   */
  public boolean hasData() {
    return data_ != null;
  }
  /**
   * <pre>
   * The associated data of the Server.
   * </pre>
   *
   * <code>.grpc.channelz.v1.ServerData data = 2;</code>
   */
  public ServerData getData() {
    return data_ == null ? ServerData.getDefaultInstance() : data_;
  }
  /**
   * <pre>
   * The associated data of the Server.
   * </pre>
   *
   * <code>.grpc.channelz.v1.ServerData data = 2;</code>
   */
  public ServerDataOrBuilder getDataOrBuilder() {
    return getData();
  }

  public static final int LISTEN_SOCKET_FIELD_NUMBER = 3;
  private java.util.List<SocketRef> listenSocket_;
  /**
   * <pre>
   * The sockets that the server is listening on.  There are no ordering
   * guarantees.  This may be absent.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
   */
  public java.util.List<SocketRef> getListenSocketList() {
    return listenSocket_;
  }
  /**
   * <pre>
   * The sockets that the server is listening on.  There are no ordering
   * guarantees.  This may be absent.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
   */
  public java.util.List<? extends SocketRefOrBuilder>
      getListenSocketOrBuilderList() {
    return listenSocket_;
  }
  /**
   * <pre>
   * The sockets that the server is listening on.  There are no ordering
   * guarantees.  This may be absent.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
   */
  public int getListenSocketCount() {
    return listenSocket_.size();
  }
  /**
   * <pre>
   * The sockets that the server is listening on.  There are no ordering
   * guarantees.  This may be absent.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
   */
  public SocketRef getListenSocket(int index) {
    return listenSocket_.get(index);
  }
  /**
   * <pre>
   * The sockets that the server is listening on.  There are no ordering
   * guarantees.  This may be absent.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
   */
  public SocketRefOrBuilder getListenSocketOrBuilder(
      int index) {
    return listenSocket_.get(index);
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
    if (ref_ != null) {
      output.writeMessage(1, getRef());
    }
    if (data_ != null) {
      output.writeMessage(2, getData());
    }
    for (int i = 0; i < listenSocket_.size(); i++) {
      output.writeMessage(3, listenSocket_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ref_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRef());
    }
    if (data_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getData());
    }
    for (int i = 0; i < listenSocket_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, listenSocket_.get(i));
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
    if (!(obj instanceof Server)) {
      return super.equals(obj);
    }
    Server other = (Server) obj;

    boolean result = true;
    result = result && (hasRef() == other.hasRef());
    if (hasRef()) {
      result = result && getRef()
          .equals(other.getRef());
    }
    result = result && (hasData() == other.hasData());
    if (hasData()) {
      result = result && getData()
          .equals(other.getData());
    }
    result = result && getListenSocketList()
        .equals(other.getListenSocketList());
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
    if (hasRef()) {
      hash = (37 * hash) + REF_FIELD_NUMBER;
      hash = (53 * hash) + getRef().hashCode();
    }
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    if (getListenSocketCount() > 0) {
      hash = (37 * hash) + LISTEN_SOCKET_FIELD_NUMBER;
      hash = (53 * hash) + getListenSocketList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Server parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Server parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Server parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Server parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Server parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Server parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Server parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Server parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Server parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Server parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Server parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Server parseFrom(
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
  public static Builder newBuilder(Server prototype) {
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
   * <pre>
   * Server represents a single server.  There may be multiple servers in a single
   * program.
   * </pre>
   *
   * Protobuf type {@code grpc.channelz.v1.Server}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.channelz.v1.Server)
      ServerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChannelzProto.internal_static_grpc_channelz_v1_Server_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChannelzProto.internal_static_grpc_channelz_v1_Server_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Server.class, Builder.class);
    }

    // Construct using io.grpc.channelz.v1.Server.newBuilder()
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
        getListenSocketFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (refBuilder_ == null) {
        ref_ = null;
      } else {
        ref_ = null;
        refBuilder_ = null;
      }
      if (dataBuilder_ == null) {
        data_ = null;
      } else {
        data_ = null;
        dataBuilder_ = null;
      }
      if (listenSocketBuilder_ == null) {
        listenSocket_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        listenSocketBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ChannelzProto.internal_static_grpc_channelz_v1_Server_descriptor;
    }

    public Server getDefaultInstanceForType() {
      return Server.getDefaultInstance();
    }

    public Server build() {
      Server result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public Server buildPartial() {
      Server result = new Server(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (refBuilder_ == null) {
        result.ref_ = ref_;
      } else {
        result.ref_ = refBuilder_.build();
      }
      if (dataBuilder_ == null) {
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
      }
      if (listenSocketBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          listenSocket_ = java.util.Collections.unmodifiableList(listenSocket_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.listenSocket_ = listenSocket_;
      } else {
        result.listenSocket_ = listenSocketBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof Server) {
        return mergeFrom((Server)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Server other) {
      if (other == Server.getDefaultInstance()) return this;
      if (other.hasRef()) {
        mergeRef(other.getRef());
      }
      if (other.hasData()) {
        mergeData(other.getData());
      }
      if (listenSocketBuilder_ == null) {
        if (!other.listenSocket_.isEmpty()) {
          if (listenSocket_.isEmpty()) {
            listenSocket_ = other.listenSocket_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureListenSocketIsMutable();
            listenSocket_.addAll(other.listenSocket_);
          }
          onChanged();
        }
      } else {
        if (!other.listenSocket_.isEmpty()) {
          if (listenSocketBuilder_.isEmpty()) {
            listenSocketBuilder_.dispose();
            listenSocketBuilder_ = null;
            listenSocket_ = other.listenSocket_;
            bitField0_ = (bitField0_ & ~0x00000004);
            listenSocketBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getListenSocketFieldBuilder() : null;
          } else {
            listenSocketBuilder_.addAllMessages(other.listenSocket_);
          }
        }
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
      Server parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Server) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private ServerRef ref_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        ServerRef, ServerRef.Builder, ServerRefOrBuilder> refBuilder_;
    /**
     * <pre>
     * The identifier for a Server.  This should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerRef ref = 1;</code>
     */
    public boolean hasRef() {
      return refBuilder_ != null || ref_ != null;
    }
    /**
     * <pre>
     * The identifier for a Server.  This should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerRef ref = 1;</code>
     */
    public ServerRef getRef() {
      if (refBuilder_ == null) {
        return ref_ == null ? ServerRef.getDefaultInstance() : ref_;
      } else {
        return refBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The identifier for a Server.  This should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerRef ref = 1;</code>
     */
    public Builder setRef(ServerRef value) {
      if (refBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ref_ = value;
        onChanged();
      } else {
        refBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The identifier for a Server.  This should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerRef ref = 1;</code>
     */
    public Builder setRef(
        ServerRef.Builder builderForValue) {
      if (refBuilder_ == null) {
        ref_ = builderForValue.build();
        onChanged();
      } else {
        refBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The identifier for a Server.  This should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerRef ref = 1;</code>
     */
    public Builder mergeRef(ServerRef value) {
      if (refBuilder_ == null) {
        if (ref_ != null) {
          ref_ =
            ServerRef.newBuilder(ref_).mergeFrom(value).buildPartial();
        } else {
          ref_ = value;
        }
        onChanged();
      } else {
        refBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The identifier for a Server.  This should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerRef ref = 1;</code>
     */
    public Builder clearRef() {
      if (refBuilder_ == null) {
        ref_ = null;
        onChanged();
      } else {
        ref_ = null;
        refBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The identifier for a Server.  This should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerRef ref = 1;</code>
     */
    public ServerRef.Builder getRefBuilder() {
      
      onChanged();
      return getRefFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The identifier for a Server.  This should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerRef ref = 1;</code>
     */
    public ServerRefOrBuilder getRefOrBuilder() {
      if (refBuilder_ != null) {
        return refBuilder_.getMessageOrBuilder();
      } else {
        return ref_ == null ?
            ServerRef.getDefaultInstance() : ref_;
      }
    }
    /**
     * <pre>
     * The identifier for a Server.  This should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerRef ref = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ServerRef, ServerRef.Builder, ServerRefOrBuilder>
        getRefFieldBuilder() {
      if (refBuilder_ == null) {
        refBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ServerRef, ServerRef.Builder, ServerRefOrBuilder>(
                getRef(),
                getParentForChildren(),
                isClean());
        ref_ = null;
      }
      return refBuilder_;
    }

    private ServerData data_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        ServerData, ServerData.Builder, ServerDataOrBuilder> dataBuilder_;
    /**
     * <pre>
     * The associated data of the Server.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerData data = 2;</code>
     */
    public boolean hasData() {
      return dataBuilder_ != null || data_ != null;
    }
    /**
     * <pre>
     * The associated data of the Server.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerData data = 2;</code>
     */
    public ServerData getData() {
      if (dataBuilder_ == null) {
        return data_ == null ? ServerData.getDefaultInstance() : data_;
      } else {
        return dataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The associated data of the Server.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerData data = 2;</code>
     */
    public Builder setData(ServerData value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        data_ = value;
        onChanged();
      } else {
        dataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The associated data of the Server.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerData data = 2;</code>
     */
    public Builder setData(
        ServerData.Builder builderForValue) {
      if (dataBuilder_ == null) {
        data_ = builderForValue.build();
        onChanged();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The associated data of the Server.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerData data = 2;</code>
     */
    public Builder mergeData(ServerData value) {
      if (dataBuilder_ == null) {
        if (data_ != null) {
          data_ =
            ServerData.newBuilder(data_).mergeFrom(value).buildPartial();
        } else {
          data_ = value;
        }
        onChanged();
      } else {
        dataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The associated data of the Server.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerData data = 2;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = null;
        onChanged();
      } else {
        data_ = null;
        dataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The associated data of the Server.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerData data = 2;</code>
     */
    public ServerData.Builder getDataBuilder() {
      
      onChanged();
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The associated data of the Server.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerData data = 2;</code>
     */
    public ServerDataOrBuilder getDataOrBuilder() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        return data_ == null ?
            ServerData.getDefaultInstance() : data_;
      }
    }
    /**
     * <pre>
     * The associated data of the Server.
     * </pre>
     *
     * <code>.grpc.channelz.v1.ServerData data = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ServerData, ServerData.Builder, ServerDataOrBuilder>
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ServerData, ServerData.Builder, ServerDataOrBuilder>(
                getData(),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
    }

    private java.util.List<SocketRef> listenSocket_ =
      java.util.Collections.emptyList();
    private void ensureListenSocketIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        listenSocket_ = new java.util.ArrayList<SocketRef>(listenSocket_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        SocketRef, SocketRef.Builder, SocketRefOrBuilder> listenSocketBuilder_;

    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public java.util.List<SocketRef> getListenSocketList() {
      if (listenSocketBuilder_ == null) {
        return java.util.Collections.unmodifiableList(listenSocket_);
      } else {
        return listenSocketBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public int getListenSocketCount() {
      if (listenSocketBuilder_ == null) {
        return listenSocket_.size();
      } else {
        return listenSocketBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public SocketRef getListenSocket(int index) {
      if (listenSocketBuilder_ == null) {
        return listenSocket_.get(index);
      } else {
        return listenSocketBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public Builder setListenSocket(
        int index, SocketRef value) {
      if (listenSocketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListenSocketIsMutable();
        listenSocket_.set(index, value);
        onChanged();
      } else {
        listenSocketBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public Builder setListenSocket(
        int index, SocketRef.Builder builderForValue) {
      if (listenSocketBuilder_ == null) {
        ensureListenSocketIsMutable();
        listenSocket_.set(index, builderForValue.build());
        onChanged();
      } else {
        listenSocketBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public Builder addListenSocket(SocketRef value) {
      if (listenSocketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListenSocketIsMutable();
        listenSocket_.add(value);
        onChanged();
      } else {
        listenSocketBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public Builder addListenSocket(
        int index, SocketRef value) {
      if (listenSocketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListenSocketIsMutable();
        listenSocket_.add(index, value);
        onChanged();
      } else {
        listenSocketBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public Builder addListenSocket(
        SocketRef.Builder builderForValue) {
      if (listenSocketBuilder_ == null) {
        ensureListenSocketIsMutable();
        listenSocket_.add(builderForValue.build());
        onChanged();
      } else {
        listenSocketBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public Builder addListenSocket(
        int index, SocketRef.Builder builderForValue) {
      if (listenSocketBuilder_ == null) {
        ensureListenSocketIsMutable();
        listenSocket_.add(index, builderForValue.build());
        onChanged();
      } else {
        listenSocketBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public Builder addAllListenSocket(
        Iterable<? extends SocketRef> values) {
      if (listenSocketBuilder_ == null) {
        ensureListenSocketIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, listenSocket_);
        onChanged();
      } else {
        listenSocketBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public Builder clearListenSocket() {
      if (listenSocketBuilder_ == null) {
        listenSocket_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        listenSocketBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public Builder removeListenSocket(int index) {
      if (listenSocketBuilder_ == null) {
        ensureListenSocketIsMutable();
        listenSocket_.remove(index);
        onChanged();
      } else {
        listenSocketBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public SocketRef.Builder getListenSocketBuilder(
        int index) {
      return getListenSocketFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public SocketRefOrBuilder getListenSocketOrBuilder(
        int index) {
      if (listenSocketBuilder_ == null) {
        return listenSocket_.get(index);  } else {
        return listenSocketBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public java.util.List<? extends SocketRefOrBuilder>
         getListenSocketOrBuilderList() {
      if (listenSocketBuilder_ != null) {
        return listenSocketBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(listenSocket_);
      }
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public SocketRef.Builder addListenSocketBuilder() {
      return getListenSocketFieldBuilder().addBuilder(
          SocketRef.getDefaultInstance());
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public SocketRef.Builder addListenSocketBuilder(
        int index) {
      return getListenSocketFieldBuilder().addBuilder(
          index, SocketRef.getDefaultInstance());
    }
    /**
     * <pre>
     * The sockets that the server is listening on.  There are no ordering
     * guarantees.  This may be absent.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.SocketRef listen_socket = 3;</code>
     */
    public java.util.List<SocketRef.Builder>
         getListenSocketBuilderList() {
      return getListenSocketFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        SocketRef, SocketRef.Builder, SocketRefOrBuilder>
        getListenSocketFieldBuilder() {
      if (listenSocketBuilder_ == null) {
        listenSocketBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            SocketRef, SocketRef.Builder, SocketRefOrBuilder>(
                listenSocket_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        listenSocket_ = null;
      }
      return listenSocketBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.channelz.v1.Server)
  }

  // @@protoc_insertion_point(class_scope:grpc.channelz.v1.Server)
  private static final Server DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Server();
  }

  public static Server getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Server>
      PARSER = new com.google.protobuf.AbstractParser<Server>() {
    public Server parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Server(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Server> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Server> getParserForType() {
    return PARSER;
  }

  public Server getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

