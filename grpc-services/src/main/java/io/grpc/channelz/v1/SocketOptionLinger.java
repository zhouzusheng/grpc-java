// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

/**
 * <pre>
 * For use with SocketOption's additional field.  This is primarily used for
 * SO_LINGER.
 * </pre>
 *
 * Protobuf type {@code grpc.channelz.v1.SocketOptionLinger}
 */
public  final class SocketOptionLinger extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.channelz.v1.SocketOptionLinger)
    SocketOptionLingerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SocketOptionLinger.newBuilder() to construct.
  private SocketOptionLinger(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SocketOptionLinger() {
    active_ = false;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SocketOptionLinger(
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
          case 8: {

            active_ = input.readBool();
            break;
          }
          case 18: {
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (duration_ != null) {
              subBuilder = duration_.toBuilder();
            }
            duration_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(duration_);
              duration_ = subBuilder.buildPartial();
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
    return ChannelzProto.internal_static_grpc_channelz_v1_SocketOptionLinger_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ChannelzProto.internal_static_grpc_channelz_v1_SocketOptionLinger_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SocketOptionLinger.class, Builder.class);
  }

  public static final int ACTIVE_FIELD_NUMBER = 1;
  private boolean active_;
  /**
   * <pre>
   * active maps to `struct linger.l_onoff`
   * </pre>
   *
   * <code>bool active = 1;</code>
   */
  public boolean getActive() {
    return active_;
  }

  public static final int DURATION_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration duration_;
  /**
   * <pre>
   * duration maps to `struct linger.l_linger`
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   */
  public boolean hasDuration() {
    return duration_ != null;
  }
  /**
   * <pre>
   * duration maps to `struct linger.l_linger`
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   */
  public com.google.protobuf.Duration getDuration() {
    return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
  }
  /**
   * <pre>
   * duration maps to `struct linger.l_linger`
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 2;</code>
   */
  public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
    return getDuration();
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
    if (active_ != false) {
      output.writeBool(1, active_);
    }
    if (duration_ != null) {
      output.writeMessage(2, getDuration());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (active_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, active_);
    }
    if (duration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDuration());
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
    if (!(obj instanceof SocketOptionLinger)) {
      return super.equals(obj);
    }
    SocketOptionLinger other = (SocketOptionLinger) obj;

    boolean result = true;
    result = result && (getActive()
        == other.getActive());
    result = result && (hasDuration() == other.hasDuration());
    if (hasDuration()) {
      result = result && getDuration()
          .equals(other.getDuration());
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
    hash = (37 * hash) + ACTIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getActive());
    if (hasDuration()) {
      hash = (37 * hash) + DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getDuration().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SocketOptionLinger parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SocketOptionLinger parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SocketOptionLinger parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SocketOptionLinger parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SocketOptionLinger parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SocketOptionLinger parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SocketOptionLinger parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SocketOptionLinger parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SocketOptionLinger parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SocketOptionLinger parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SocketOptionLinger parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SocketOptionLinger parseFrom(
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
  public static Builder newBuilder(SocketOptionLinger prototype) {
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
   * For use with SocketOption's additional field.  This is primarily used for
   * SO_LINGER.
   * </pre>
   *
   * Protobuf type {@code grpc.channelz.v1.SocketOptionLinger}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.channelz.v1.SocketOptionLinger)
      SocketOptionLingerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChannelzProto.internal_static_grpc_channelz_v1_SocketOptionLinger_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChannelzProto.internal_static_grpc_channelz_v1_SocketOptionLinger_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SocketOptionLinger.class, Builder.class);
    }

    // Construct using io.grpc.channelz.v1.SocketOptionLinger.newBuilder()
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
      active_ = false;

      if (durationBuilder_ == null) {
        duration_ = null;
      } else {
        duration_ = null;
        durationBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ChannelzProto.internal_static_grpc_channelz_v1_SocketOptionLinger_descriptor;
    }

    public SocketOptionLinger getDefaultInstanceForType() {
      return SocketOptionLinger.getDefaultInstance();
    }

    public SocketOptionLinger build() {
      SocketOptionLinger result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public SocketOptionLinger buildPartial() {
      SocketOptionLinger result = new SocketOptionLinger(this);
      result.active_ = active_;
      if (durationBuilder_ == null) {
        result.duration_ = duration_;
      } else {
        result.duration_ = durationBuilder_.build();
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
      if (other instanceof SocketOptionLinger) {
        return mergeFrom((SocketOptionLinger)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SocketOptionLinger other) {
      if (other == SocketOptionLinger.getDefaultInstance()) return this;
      if (other.getActive() != false) {
        setActive(other.getActive());
      }
      if (other.hasDuration()) {
        mergeDuration(other.getDuration());
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
      SocketOptionLinger parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SocketOptionLinger) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean active_ ;
    /**
     * <pre>
     * active maps to `struct linger.l_onoff`
     * </pre>
     *
     * <code>bool active = 1;</code>
     */
    public boolean getActive() {
      return active_;
    }
    /**
     * <pre>
     * active maps to `struct linger.l_onoff`
     * </pre>
     *
     * <code>bool active = 1;</code>
     */
    public Builder setActive(boolean value) {
      
      active_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * active maps to `struct linger.l_onoff`
     * </pre>
     *
     * <code>bool active = 1;</code>
     */
    public Builder clearActive() {
      
      active_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration duration_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> durationBuilder_;
    /**
     * <pre>
     * duration maps to `struct linger.l_linger`
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public boolean hasDuration() {
      return durationBuilder_ != null || duration_ != null;
    }
    /**
     * <pre>
     * duration maps to `struct linger.l_linger`
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public com.google.protobuf.Duration getDuration() {
      if (durationBuilder_ == null) {
        return duration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : duration_;
      } else {
        return durationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * duration maps to `struct linger.l_linger`
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public Builder setDuration(com.google.protobuf.Duration value) {
      if (durationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        duration_ = value;
        onChanged();
      } else {
        durationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * duration maps to `struct linger.l_linger`
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public Builder setDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (durationBuilder_ == null) {
        duration_ = builderForValue.build();
        onChanged();
      } else {
        durationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * duration maps to `struct linger.l_linger`
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public Builder mergeDuration(com.google.protobuf.Duration value) {
      if (durationBuilder_ == null) {
        if (duration_ != null) {
          duration_ =
            com.google.protobuf.Duration.newBuilder(duration_).mergeFrom(value).buildPartial();
        } else {
          duration_ = value;
        }
        onChanged();
      } else {
        durationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * duration maps to `struct linger.l_linger`
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public Builder clearDuration() {
      if (durationBuilder_ == null) {
        duration_ = null;
        onChanged();
      } else {
        duration_ = null;
        durationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * duration maps to `struct linger.l_linger`
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getDurationBuilder() {
      
      onChanged();
      return getDurationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * duration maps to `struct linger.l_linger`
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getDurationOrBuilder() {
      if (durationBuilder_ != null) {
        return durationBuilder_.getMessageOrBuilder();
      } else {
        return duration_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : duration_;
      }
    }
    /**
     * <pre>
     * duration maps to `struct linger.l_linger`
     * </pre>
     *
     * <code>.google.protobuf.Duration duration = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getDurationFieldBuilder() {
      if (durationBuilder_ == null) {
        durationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getDuration(),
                getParentForChildren(),
                isClean());
        duration_ = null;
      }
      return durationBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.channelz.v1.SocketOptionLinger)
  }

  // @@protoc_insertion_point(class_scope:grpc.channelz.v1.SocketOptionLinger)
  private static final SocketOptionLinger DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SocketOptionLinger();
  }

  public static SocketOptionLinger getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SocketOptionLinger>
      PARSER = new com.google.protobuf.AbstractParser<SocketOptionLinger>() {
    public SocketOptionLinger parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SocketOptionLinger(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SocketOptionLinger> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SocketOptionLinger> getParserForType() {
    return PARSER;
  }

  public SocketOptionLinger getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

