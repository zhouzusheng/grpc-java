// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

/**
 * <pre>
 * SocketOption represents socket options for a socket.  Specifically, these
 * are the options returned by getsockopt().
 * </pre>
 *
 * Protobuf type {@code grpc.channelz.v1.SocketOption}
 */
public  final class SocketOption extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.channelz.v1.SocketOption)
    SocketOptionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SocketOption.newBuilder() to construct.
  private SocketOption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SocketOption() {
    name_ = "";
    value_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SocketOption(
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
            String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            value_ = s;
            break;
          }
          case 26: {
            com.google.protobuf.Any.Builder subBuilder = null;
            if (additional_ != null) {
              subBuilder = additional_.toBuilder();
            }
            additional_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(additional_);
              additional_ = subBuilder.buildPartial();
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
    return ChannelzProto.internal_static_grpc_channelz_v1_SocketOption_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ChannelzProto.internal_static_grpc_channelz_v1_SocketOption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SocketOption.class, Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile Object name_;
  /**
   * <pre>
   * The full name of the socket option.  Typically this will be the upper case
   * name, such as "SO_REUSEPORT".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public String getName() {
    Object ref = name_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The full name of the socket option.  Typically this will be the upper case
   * name, such as "SO_REUSEPORT".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    Object ref = name_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private volatile Object value_;
  /**
   * <pre>
   * The human readable value of this socket option.  At least one of value or
   * additional will be set.
   * </pre>
   *
   * <code>string value = 2;</code>
   */
  public String getValue() {
    Object ref = value_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The human readable value of this socket option.  At least one of value or
   * additional will be set.
   * </pre>
   *
   * <code>string value = 2;</code>
   */
  public com.google.protobuf.ByteString
      getValueBytes() {
    Object ref = value_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDITIONAL_FIELD_NUMBER = 3;
  private com.google.protobuf.Any additional_;
  /**
   * <pre>
   * Additional data associated with the socket option.  At least one of value
   * or additional will be set.
   * </pre>
   *
   * <code>.google.protobuf.Any additional = 3;</code>
   */
  public boolean hasAdditional() {
    return additional_ != null;
  }
  /**
   * <pre>
   * Additional data associated with the socket option.  At least one of value
   * or additional will be set.
   * </pre>
   *
   * <code>.google.protobuf.Any additional = 3;</code>
   */
  public com.google.protobuf.Any getAdditional() {
    return additional_ == null ? com.google.protobuf.Any.getDefaultInstance() : additional_;
  }
  /**
   * <pre>
   * Additional data associated with the socket option.  At least one of value
   * or additional will be set.
   * </pre>
   *
   * <code>.google.protobuf.Any additional = 3;</code>
   */
  public com.google.protobuf.AnyOrBuilder getAdditionalOrBuilder() {
    return getAdditional();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
    }
    if (additional_ != null) {
      output.writeMessage(3, getAdditional());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
    }
    if (additional_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAdditional());
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
    if (!(obj instanceof SocketOption)) {
      return super.equals(obj);
    }
    SocketOption other = (SocketOption) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getValue()
        .equals(other.getValue());
    result = result && (hasAdditional() == other.hasAdditional());
    if (hasAdditional()) {
      result = result && getAdditional()
          .equals(other.getAdditional());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    if (hasAdditional()) {
      hash = (37 * hash) + ADDITIONAL_FIELD_NUMBER;
      hash = (53 * hash) + getAdditional().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SocketOption parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SocketOption parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SocketOption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SocketOption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SocketOption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SocketOption parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SocketOption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SocketOption parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SocketOption parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SocketOption parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SocketOption parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SocketOption parseFrom(
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
  public static Builder newBuilder(SocketOption prototype) {
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
   * SocketOption represents socket options for a socket.  Specifically, these
   * are the options returned by getsockopt().
   * </pre>
   *
   * Protobuf type {@code grpc.channelz.v1.SocketOption}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.channelz.v1.SocketOption)
      SocketOptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChannelzProto.internal_static_grpc_channelz_v1_SocketOption_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChannelzProto.internal_static_grpc_channelz_v1_SocketOption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SocketOption.class, Builder.class);
    }

    // Construct using io.grpc.channelz.v1.SocketOption.newBuilder()
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
      name_ = "";

      value_ = "";

      if (additionalBuilder_ == null) {
        additional_ = null;
      } else {
        additional_ = null;
        additionalBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ChannelzProto.internal_static_grpc_channelz_v1_SocketOption_descriptor;
    }

    public SocketOption getDefaultInstanceForType() {
      return SocketOption.getDefaultInstance();
    }

    public SocketOption build() {
      SocketOption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public SocketOption buildPartial() {
      SocketOption result = new SocketOption(this);
      result.name_ = name_;
      result.value_ = value_;
      if (additionalBuilder_ == null) {
        result.additional_ = additional_;
      } else {
        result.additional_ = additionalBuilder_.build();
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
      if (other instanceof SocketOption) {
        return mergeFrom((SocketOption)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SocketOption other) {
      if (other == SocketOption.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        onChanged();
      }
      if (other.hasAdditional()) {
        mergeAdditional(other.getAdditional());
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
      SocketOption parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SocketOption) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object name_ = "";
    /**
     * <pre>
     * The full name of the socket option.  Typically this will be the upper case
     * name, such as "SO_REUSEPORT".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public String getName() {
      Object ref = name_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * The full name of the socket option.  Typically this will be the upper case
     * name, such as "SO_REUSEPORT".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The full name of the socket option.  Typically this will be the upper case
     * name, such as "SO_REUSEPORT".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The full name of the socket option.  Typically this will be the upper case
     * name, such as "SO_REUSEPORT".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The full name of the socket option.  Typically this will be the upper case
     * name, such as "SO_REUSEPORT".
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private Object value_ = "";
    /**
     * <pre>
     * The human readable value of this socket option.  At least one of value or
     * additional will be set.
     * </pre>
     *
     * <code>string value = 2;</code>
     */
    public String getValue() {
      Object ref = value_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * The human readable value of this socket option.  At least one of value or
     * additional will be set.
     * </pre>
     *
     * <code>string value = 2;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The human readable value of this socket option.  At least one of value or
     * additional will be set.
     * </pre>
     *
     * <code>string value = 2;</code>
     */
    public Builder setValue(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The human readable value of this socket option.  At least one of value or
     * additional will be set.
     * </pre>
     *
     * <code>string value = 2;</code>
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The human readable value of this socket option.  At least one of value or
     * additional will be set.
     * </pre>
     *
     * <code>string value = 2;</code>
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      value_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any additional_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> additionalBuilder_;
    /**
     * <pre>
     * Additional data associated with the socket option.  At least one of value
     * or additional will be set.
     * </pre>
     *
     * <code>.google.protobuf.Any additional = 3;</code>
     */
    public boolean hasAdditional() {
      return additionalBuilder_ != null || additional_ != null;
    }
    /**
     * <pre>
     * Additional data associated with the socket option.  At least one of value
     * or additional will be set.
     * </pre>
     *
     * <code>.google.protobuf.Any additional = 3;</code>
     */
    public com.google.protobuf.Any getAdditional() {
      if (additionalBuilder_ == null) {
        return additional_ == null ? com.google.protobuf.Any.getDefaultInstance() : additional_;
      } else {
        return additionalBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Additional data associated with the socket option.  At least one of value
     * or additional will be set.
     * </pre>
     *
     * <code>.google.protobuf.Any additional = 3;</code>
     */
    public Builder setAdditional(com.google.protobuf.Any value) {
      if (additionalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        additional_ = value;
        onChanged();
      } else {
        additionalBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Additional data associated with the socket option.  At least one of value
     * or additional will be set.
     * </pre>
     *
     * <code>.google.protobuf.Any additional = 3;</code>
     */
    public Builder setAdditional(
        com.google.protobuf.Any.Builder builderForValue) {
      if (additionalBuilder_ == null) {
        additional_ = builderForValue.build();
        onChanged();
      } else {
        additionalBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Additional data associated with the socket option.  At least one of value
     * or additional will be set.
     * </pre>
     *
     * <code>.google.protobuf.Any additional = 3;</code>
     */
    public Builder mergeAdditional(com.google.protobuf.Any value) {
      if (additionalBuilder_ == null) {
        if (additional_ != null) {
          additional_ =
            com.google.protobuf.Any.newBuilder(additional_).mergeFrom(value).buildPartial();
        } else {
          additional_ = value;
        }
        onChanged();
      } else {
        additionalBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Additional data associated with the socket option.  At least one of value
     * or additional will be set.
     * </pre>
     *
     * <code>.google.protobuf.Any additional = 3;</code>
     */
    public Builder clearAdditional() {
      if (additionalBuilder_ == null) {
        additional_ = null;
        onChanged();
      } else {
        additional_ = null;
        additionalBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Additional data associated with the socket option.  At least one of value
     * or additional will be set.
     * </pre>
     *
     * <code>.google.protobuf.Any additional = 3;</code>
     */
    public com.google.protobuf.Any.Builder getAdditionalBuilder() {
      
      onChanged();
      return getAdditionalFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Additional data associated with the socket option.  At least one of value
     * or additional will be set.
     * </pre>
     *
     * <code>.google.protobuf.Any additional = 3;</code>
     */
    public com.google.protobuf.AnyOrBuilder getAdditionalOrBuilder() {
      if (additionalBuilder_ != null) {
        return additionalBuilder_.getMessageOrBuilder();
      } else {
        return additional_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : additional_;
      }
    }
    /**
     * <pre>
     * Additional data associated with the socket option.  At least one of value
     * or additional will be set.
     * </pre>
     *
     * <code>.google.protobuf.Any additional = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getAdditionalFieldBuilder() {
      if (additionalBuilder_ == null) {
        additionalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getAdditional(),
                getParentForChildren(),
                isClean());
        additional_ = null;
      }
      return additionalBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.channelz.v1.SocketOption)
  }

  // @@protoc_insertion_point(class_scope:grpc.channelz.v1.SocketOption)
  private static final SocketOption DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SocketOption();
  }

  public static SocketOption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SocketOption>
      PARSER = new com.google.protobuf.AbstractParser<SocketOption>() {
    public SocketOption parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SocketOption(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SocketOption> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SocketOption> getParserForType() {
    return PARSER;
  }

  public SocketOption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
