// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

/**
 * Protobuf type {@code grpc.channelz.v1.GetSubchannelResponse}
 */
public  final class GetSubchannelResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.channelz.v1.GetSubchannelResponse)
    GetSubchannelResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSubchannelResponse.newBuilder() to construct.
  private GetSubchannelResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSubchannelResponse() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetSubchannelResponse(
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
            Subchannel.Builder subBuilder = null;
            if (subchannel_ != null) {
              subBuilder = subchannel_.toBuilder();
            }
            subchannel_ = input.readMessage(Subchannel.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(subchannel_);
              subchannel_ = subBuilder.buildPartial();
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
    return ChannelzProto.internal_static_grpc_channelz_v1_GetSubchannelResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ChannelzProto.internal_static_grpc_channelz_v1_GetSubchannelResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            GetSubchannelResponse.class, Builder.class);
  }

  public static final int SUBCHANNEL_FIELD_NUMBER = 1;
  private Subchannel subchannel_;
  /**
   * <pre>
   * The Subchannel that corresponds to the requested subchannel_id.  This
   * field should be set.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Subchannel subchannel = 1;</code>
   */
  public boolean hasSubchannel() {
    return subchannel_ != null;
  }
  /**
   * <pre>
   * The Subchannel that corresponds to the requested subchannel_id.  This
   * field should be set.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Subchannel subchannel = 1;</code>
   */
  public Subchannel getSubchannel() {
    return subchannel_ == null ? Subchannel.getDefaultInstance() : subchannel_;
  }
  /**
   * <pre>
   * The Subchannel that corresponds to the requested subchannel_id.  This
   * field should be set.
   * </pre>
   *
   * <code>.grpc.channelz.v1.Subchannel subchannel = 1;</code>
   */
  public SubchannelOrBuilder getSubchannelOrBuilder() {
    return getSubchannel();
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
    if (subchannel_ != null) {
      output.writeMessage(1, getSubchannel());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (subchannel_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSubchannel());
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
    if (!(obj instanceof GetSubchannelResponse)) {
      return super.equals(obj);
    }
    GetSubchannelResponse other = (GetSubchannelResponse) obj;

    boolean result = true;
    result = result && (hasSubchannel() == other.hasSubchannel());
    if (hasSubchannel()) {
      result = result && getSubchannel()
          .equals(other.getSubchannel());
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
    if (hasSubchannel()) {
      hash = (37 * hash) + SUBCHANNEL_FIELD_NUMBER;
      hash = (53 * hash) + getSubchannel().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static GetSubchannelResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetSubchannelResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetSubchannelResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetSubchannelResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetSubchannelResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static GetSubchannelResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static GetSubchannelResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetSubchannelResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetSubchannelResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static GetSubchannelResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static GetSubchannelResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static GetSubchannelResponse parseFrom(
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
  public static Builder newBuilder(GetSubchannelResponse prototype) {
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
   * Protobuf type {@code grpc.channelz.v1.GetSubchannelResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.channelz.v1.GetSubchannelResponse)
      GetSubchannelResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChannelzProto.internal_static_grpc_channelz_v1_GetSubchannelResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChannelzProto.internal_static_grpc_channelz_v1_GetSubchannelResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GetSubchannelResponse.class, Builder.class);
    }

    // Construct using io.grpc.channelz.v1.GetSubchannelResponse.newBuilder()
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
      if (subchannelBuilder_ == null) {
        subchannel_ = null;
      } else {
        subchannel_ = null;
        subchannelBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ChannelzProto.internal_static_grpc_channelz_v1_GetSubchannelResponse_descriptor;
    }

    public GetSubchannelResponse getDefaultInstanceForType() {
      return GetSubchannelResponse.getDefaultInstance();
    }

    public GetSubchannelResponse build() {
      GetSubchannelResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public GetSubchannelResponse buildPartial() {
      GetSubchannelResponse result = new GetSubchannelResponse(this);
      if (subchannelBuilder_ == null) {
        result.subchannel_ = subchannel_;
      } else {
        result.subchannel_ = subchannelBuilder_.build();
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
      if (other instanceof GetSubchannelResponse) {
        return mergeFrom((GetSubchannelResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(GetSubchannelResponse other) {
      if (other == GetSubchannelResponse.getDefaultInstance()) return this;
      if (other.hasSubchannel()) {
        mergeSubchannel(other.getSubchannel());
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
      GetSubchannelResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (GetSubchannelResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Subchannel subchannel_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        Subchannel, Subchannel.Builder, SubchannelOrBuilder> subchannelBuilder_;
    /**
     * <pre>
     * The Subchannel that corresponds to the requested subchannel_id.  This
     * field should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Subchannel subchannel = 1;</code>
     */
    public boolean hasSubchannel() {
      return subchannelBuilder_ != null || subchannel_ != null;
    }
    /**
     * <pre>
     * The Subchannel that corresponds to the requested subchannel_id.  This
     * field should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Subchannel subchannel = 1;</code>
     */
    public Subchannel getSubchannel() {
      if (subchannelBuilder_ == null) {
        return subchannel_ == null ? Subchannel.getDefaultInstance() : subchannel_;
      } else {
        return subchannelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Subchannel that corresponds to the requested subchannel_id.  This
     * field should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Subchannel subchannel = 1;</code>
     */
    public Builder setSubchannel(Subchannel value) {
      if (subchannelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        subchannel_ = value;
        onChanged();
      } else {
        subchannelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Subchannel that corresponds to the requested subchannel_id.  This
     * field should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Subchannel subchannel = 1;</code>
     */
    public Builder setSubchannel(
        Subchannel.Builder builderForValue) {
      if (subchannelBuilder_ == null) {
        subchannel_ = builderForValue.build();
        onChanged();
      } else {
        subchannelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The Subchannel that corresponds to the requested subchannel_id.  This
     * field should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Subchannel subchannel = 1;</code>
     */
    public Builder mergeSubchannel(Subchannel value) {
      if (subchannelBuilder_ == null) {
        if (subchannel_ != null) {
          subchannel_ =
            Subchannel.newBuilder(subchannel_).mergeFrom(value).buildPartial();
        } else {
          subchannel_ = value;
        }
        onChanged();
      } else {
        subchannelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Subchannel that corresponds to the requested subchannel_id.  This
     * field should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Subchannel subchannel = 1;</code>
     */
    public Builder clearSubchannel() {
      if (subchannelBuilder_ == null) {
        subchannel_ = null;
        onChanged();
      } else {
        subchannel_ = null;
        subchannelBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The Subchannel that corresponds to the requested subchannel_id.  This
     * field should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Subchannel subchannel = 1;</code>
     */
    public Subchannel.Builder getSubchannelBuilder() {
      
      onChanged();
      return getSubchannelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Subchannel that corresponds to the requested subchannel_id.  This
     * field should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Subchannel subchannel = 1;</code>
     */
    public SubchannelOrBuilder getSubchannelOrBuilder() {
      if (subchannelBuilder_ != null) {
        return subchannelBuilder_.getMessageOrBuilder();
      } else {
        return subchannel_ == null ?
            Subchannel.getDefaultInstance() : subchannel_;
      }
    }
    /**
     * <pre>
     * The Subchannel that corresponds to the requested subchannel_id.  This
     * field should be set.
     * </pre>
     *
     * <code>.grpc.channelz.v1.Subchannel subchannel = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Subchannel, Subchannel.Builder, SubchannelOrBuilder>
        getSubchannelFieldBuilder() {
      if (subchannelBuilder_ == null) {
        subchannelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Subchannel, Subchannel.Builder, SubchannelOrBuilder>(
                getSubchannel(),
                getParentForChildren(),
                isClean());
        subchannel_ = null;
      }
      return subchannelBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.channelz.v1.GetSubchannelResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.channelz.v1.GetSubchannelResponse)
  private static final GetSubchannelResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GetSubchannelResponse();
  }

  public static GetSubchannelResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSubchannelResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetSubchannelResponse>() {
    public GetSubchannelResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetSubchannelResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetSubchannelResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<GetSubchannelResponse> getParserForType() {
    return PARSER;
  }

  public GetSubchannelResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
