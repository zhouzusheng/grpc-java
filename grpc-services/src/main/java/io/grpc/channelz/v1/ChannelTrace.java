// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

/**
 * <pre>
 * ChannelTrace represents the recent events that have occurred on the channel.
 * </pre>
 *
 * Protobuf type {@code grpc.channelz.v1.ChannelTrace}
 */
public  final class ChannelTrace extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.channelz.v1.ChannelTrace)
    ChannelTraceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChannelTrace.newBuilder() to construct.
  private ChannelTrace(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChannelTrace() {
    numEventsLogged_ = 0L;
    events_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChannelTrace(
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

            numEventsLogged_ = input.readInt64();
            break;
          }
          case 18: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (creationTimestamp_ != null) {
              subBuilder = creationTimestamp_.toBuilder();
            }
            creationTimestamp_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(creationTimestamp_);
              creationTimestamp_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              events_ = new java.util.ArrayList<ChannelTraceEvent>();
              mutable_bitField0_ |= 0x00000004;
            }
            events_.add(
                input.readMessage(ChannelTraceEvent.parser(), extensionRegistry));
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
        events_ = java.util.Collections.unmodifiableList(events_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ChannelzProto.internal_static_grpc_channelz_v1_ChannelTrace_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ChannelzProto.internal_static_grpc_channelz_v1_ChannelTrace_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ChannelTrace.class, Builder.class);
  }

  private int bitField0_;
  public static final int NUM_EVENTS_LOGGED_FIELD_NUMBER = 1;
  private long numEventsLogged_;
  /**
   * <pre>
   * Number of events ever logged in this tracing object. This can differ from
   * events.size() because events can be overwritten or garbage collected by
   * implementations.
   * </pre>
   *
   * <code>int64 num_events_logged = 1;</code>
   */
  public long getNumEventsLogged() {
    return numEventsLogged_;
  }

  public static final int CREATION_TIMESTAMP_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp creationTimestamp_;
  /**
   * <pre>
   * Time that this channel was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_timestamp = 2;</code>
   */
  public boolean hasCreationTimestamp() {
    return creationTimestamp_ != null;
  }
  /**
   * <pre>
   * Time that this channel was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_timestamp = 2;</code>
   */
  public com.google.protobuf.Timestamp getCreationTimestamp() {
    return creationTimestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : creationTimestamp_;
  }
  /**
   * <pre>
   * Time that this channel was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_timestamp = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getCreationTimestampOrBuilder() {
    return getCreationTimestamp();
  }

  public static final int EVENTS_FIELD_NUMBER = 3;
  private java.util.List<ChannelTraceEvent> events_;
  /**
   * <pre>
   * List of events that have occurred on this channel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
   */
  public java.util.List<ChannelTraceEvent> getEventsList() {
    return events_;
  }
  /**
   * <pre>
   * List of events that have occurred on this channel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
   */
  public java.util.List<? extends ChannelTraceEventOrBuilder>
      getEventsOrBuilderList() {
    return events_;
  }
  /**
   * <pre>
   * List of events that have occurred on this channel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
   */
  public int getEventsCount() {
    return events_.size();
  }
  /**
   * <pre>
   * List of events that have occurred on this channel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
   */
  public ChannelTraceEvent getEvents(int index) {
    return events_.get(index);
  }
  /**
   * <pre>
   * List of events that have occurred on this channel.
   * </pre>
   *
   * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
   */
  public ChannelTraceEventOrBuilder getEventsOrBuilder(
      int index) {
    return events_.get(index);
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
    if (numEventsLogged_ != 0L) {
      output.writeInt64(1, numEventsLogged_);
    }
    if (creationTimestamp_ != null) {
      output.writeMessage(2, getCreationTimestamp());
    }
    for (int i = 0; i < events_.size(); i++) {
      output.writeMessage(3, events_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numEventsLogged_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, numEventsLogged_);
    }
    if (creationTimestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCreationTimestamp());
    }
    for (int i = 0; i < events_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, events_.get(i));
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
    if (!(obj instanceof ChannelTrace)) {
      return super.equals(obj);
    }
    ChannelTrace other = (ChannelTrace) obj;

    boolean result = true;
    result = result && (getNumEventsLogged()
        == other.getNumEventsLogged());
    result = result && (hasCreationTimestamp() == other.hasCreationTimestamp());
    if (hasCreationTimestamp()) {
      result = result && getCreationTimestamp()
          .equals(other.getCreationTimestamp());
    }
    result = result && getEventsList()
        .equals(other.getEventsList());
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
    hash = (37 * hash) + NUM_EVENTS_LOGGED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumEventsLogged());
    if (hasCreationTimestamp()) {
      hash = (37 * hash) + CREATION_TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getCreationTimestamp().hashCode();
    }
    if (getEventsCount() > 0) {
      hash = (37 * hash) + EVENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEventsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ChannelTrace parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ChannelTrace parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ChannelTrace parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ChannelTrace parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ChannelTrace parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ChannelTrace parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ChannelTrace parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ChannelTrace parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ChannelTrace parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ChannelTrace parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ChannelTrace parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ChannelTrace parseFrom(
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
  public static Builder newBuilder(ChannelTrace prototype) {
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
   * ChannelTrace represents the recent events that have occurred on the channel.
   * </pre>
   *
   * Protobuf type {@code grpc.channelz.v1.ChannelTrace}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.channelz.v1.ChannelTrace)
      ChannelTraceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ChannelzProto.internal_static_grpc_channelz_v1_ChannelTrace_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ChannelzProto.internal_static_grpc_channelz_v1_ChannelTrace_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ChannelTrace.class, Builder.class);
    }

    // Construct using io.grpc.channelz.v1.ChannelTrace.newBuilder()
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
        getEventsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      numEventsLogged_ = 0L;

      if (creationTimestampBuilder_ == null) {
        creationTimestamp_ = null;
      } else {
        creationTimestamp_ = null;
        creationTimestampBuilder_ = null;
      }
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        eventsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ChannelzProto.internal_static_grpc_channelz_v1_ChannelTrace_descriptor;
    }

    public ChannelTrace getDefaultInstanceForType() {
      return ChannelTrace.getDefaultInstance();
    }

    public ChannelTrace build() {
      ChannelTrace result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ChannelTrace buildPartial() {
      ChannelTrace result = new ChannelTrace(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.numEventsLogged_ = numEventsLogged_;
      if (creationTimestampBuilder_ == null) {
        result.creationTimestamp_ = creationTimestamp_;
      } else {
        result.creationTimestamp_ = creationTimestampBuilder_.build();
      }
      if (eventsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          events_ = java.util.Collections.unmodifiableList(events_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.events_ = events_;
      } else {
        result.events_ = eventsBuilder_.build();
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
      if (other instanceof ChannelTrace) {
        return mergeFrom((ChannelTrace)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ChannelTrace other) {
      if (other == ChannelTrace.getDefaultInstance()) return this;
      if (other.getNumEventsLogged() != 0L) {
        setNumEventsLogged(other.getNumEventsLogged());
      }
      if (other.hasCreationTimestamp()) {
        mergeCreationTimestamp(other.getCreationTimestamp());
      }
      if (eventsBuilder_ == null) {
        if (!other.events_.isEmpty()) {
          if (events_.isEmpty()) {
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureEventsIsMutable();
            events_.addAll(other.events_);
          }
          onChanged();
        }
      } else {
        if (!other.events_.isEmpty()) {
          if (eventsBuilder_.isEmpty()) {
            eventsBuilder_.dispose();
            eventsBuilder_ = null;
            events_ = other.events_;
            bitField0_ = (bitField0_ & ~0x00000004);
            eventsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEventsFieldBuilder() : null;
          } else {
            eventsBuilder_.addAllMessages(other.events_);
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
      ChannelTrace parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ChannelTrace) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long numEventsLogged_ ;
    /**
     * <pre>
     * Number of events ever logged in this tracing object. This can differ from
     * events.size() because events can be overwritten or garbage collected by
     * implementations.
     * </pre>
     *
     * <code>int64 num_events_logged = 1;</code>
     */
    public long getNumEventsLogged() {
      return numEventsLogged_;
    }
    /**
     * <pre>
     * Number of events ever logged in this tracing object. This can differ from
     * events.size() because events can be overwritten or garbage collected by
     * implementations.
     * </pre>
     *
     * <code>int64 num_events_logged = 1;</code>
     */
    public Builder setNumEventsLogged(long value) {
      
      numEventsLogged_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of events ever logged in this tracing object. This can differ from
     * events.size() because events can be overwritten or garbage collected by
     * implementations.
     * </pre>
     *
     * <code>int64 num_events_logged = 1;</code>
     */
    public Builder clearNumEventsLogged() {
      
      numEventsLogged_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp creationTimestamp_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> creationTimestampBuilder_;
    /**
     * <pre>
     * Time that this channel was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp creation_timestamp = 2;</code>
     */
    public boolean hasCreationTimestamp() {
      return creationTimestampBuilder_ != null || creationTimestamp_ != null;
    }
    /**
     * <pre>
     * Time that this channel was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp creation_timestamp = 2;</code>
     */
    public com.google.protobuf.Timestamp getCreationTimestamp() {
      if (creationTimestampBuilder_ == null) {
        return creationTimestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : creationTimestamp_;
      } else {
        return creationTimestampBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Time that this channel was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp creation_timestamp = 2;</code>
     */
    public Builder setCreationTimestamp(com.google.protobuf.Timestamp value) {
      if (creationTimestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        creationTimestamp_ = value;
        onChanged();
      } else {
        creationTimestampBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Time that this channel was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp creation_timestamp = 2;</code>
     */
    public Builder setCreationTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (creationTimestampBuilder_ == null) {
        creationTimestamp_ = builderForValue.build();
        onChanged();
      } else {
        creationTimestampBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Time that this channel was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp creation_timestamp = 2;</code>
     */
    public Builder mergeCreationTimestamp(com.google.protobuf.Timestamp value) {
      if (creationTimestampBuilder_ == null) {
        if (creationTimestamp_ != null) {
          creationTimestamp_ =
            com.google.protobuf.Timestamp.newBuilder(creationTimestamp_).mergeFrom(value).buildPartial();
        } else {
          creationTimestamp_ = value;
        }
        onChanged();
      } else {
        creationTimestampBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Time that this channel was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp creation_timestamp = 2;</code>
     */
    public Builder clearCreationTimestamp() {
      if (creationTimestampBuilder_ == null) {
        creationTimestamp_ = null;
        onChanged();
      } else {
        creationTimestamp_ = null;
        creationTimestampBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Time that this channel was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp creation_timestamp = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getCreationTimestampBuilder() {
      
      onChanged();
      return getCreationTimestampFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Time that this channel was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp creation_timestamp = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getCreationTimestampOrBuilder() {
      if (creationTimestampBuilder_ != null) {
        return creationTimestampBuilder_.getMessageOrBuilder();
      } else {
        return creationTimestamp_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : creationTimestamp_;
      }
    }
    /**
     * <pre>
     * Time that this channel was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp creation_timestamp = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getCreationTimestampFieldBuilder() {
      if (creationTimestampBuilder_ == null) {
        creationTimestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getCreationTimestamp(),
                getParentForChildren(),
                isClean());
        creationTimestamp_ = null;
      }
      return creationTimestampBuilder_;
    }

    private java.util.List<ChannelTraceEvent> events_ =
      java.util.Collections.emptyList();
    private void ensureEventsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        events_ = new java.util.ArrayList<ChannelTraceEvent>(events_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ChannelTraceEvent, ChannelTraceEvent.Builder, ChannelTraceEventOrBuilder> eventsBuilder_;

    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public java.util.List<ChannelTraceEvent> getEventsList() {
      if (eventsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(events_);
      } else {
        return eventsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public int getEventsCount() {
      if (eventsBuilder_ == null) {
        return events_.size();
      } else {
        return eventsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public ChannelTraceEvent getEvents(int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);
      } else {
        return eventsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public Builder setEvents(
        int index, ChannelTraceEvent value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.set(index, value);
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public Builder setEvents(
        int index, ChannelTraceEvent.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.set(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public Builder addEvents(ChannelTraceEvent value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public Builder addEvents(
        int index, ChannelTraceEvent value) {
      if (eventsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventsIsMutable();
        events_.add(index, value);
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public Builder addEvents(
        ChannelTraceEvent.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public Builder addEvents(
        int index, ChannelTraceEvent.Builder builderForValue) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.add(index, builderForValue.build());
        onChanged();
      } else {
        eventsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public Builder addAllEvents(
        Iterable<? extends ChannelTraceEvent> values) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, events_);
        onChanged();
      } else {
        eventsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public Builder clearEvents() {
      if (eventsBuilder_ == null) {
        events_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        eventsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public Builder removeEvents(int index) {
      if (eventsBuilder_ == null) {
        ensureEventsIsMutable();
        events_.remove(index);
        onChanged();
      } else {
        eventsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public ChannelTraceEvent.Builder getEventsBuilder(
        int index) {
      return getEventsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public ChannelTraceEventOrBuilder getEventsOrBuilder(
        int index) {
      if (eventsBuilder_ == null) {
        return events_.get(index);  } else {
        return eventsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public java.util.List<? extends ChannelTraceEventOrBuilder>
         getEventsOrBuilderList() {
      if (eventsBuilder_ != null) {
        return eventsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(events_);
      }
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public ChannelTraceEvent.Builder addEventsBuilder() {
      return getEventsFieldBuilder().addBuilder(
          ChannelTraceEvent.getDefaultInstance());
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public ChannelTraceEvent.Builder addEventsBuilder(
        int index) {
      return getEventsFieldBuilder().addBuilder(
          index, ChannelTraceEvent.getDefaultInstance());
    }
    /**
     * <pre>
     * List of events that have occurred on this channel.
     * </pre>
     *
     * <code>repeated .grpc.channelz.v1.ChannelTraceEvent events = 3;</code>
     */
    public java.util.List<ChannelTraceEvent.Builder>
         getEventsBuilderList() {
      return getEventsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ChannelTraceEvent, ChannelTraceEvent.Builder, ChannelTraceEventOrBuilder>
        getEventsFieldBuilder() {
      if (eventsBuilder_ == null) {
        eventsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ChannelTraceEvent, ChannelTraceEvent.Builder, ChannelTraceEventOrBuilder>(
                events_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        events_ = null;
      }
      return eventsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.channelz.v1.ChannelTrace)
  }

  // @@protoc_insertion_point(class_scope:grpc.channelz.v1.ChannelTrace)
  private static final ChannelTrace DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ChannelTrace();
  }

  public static ChannelTrace getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChannelTrace>
      PARSER = new com.google.protobuf.AbstractParser<ChannelTrace>() {
    public ChannelTrace parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChannelTrace(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChannelTrace> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ChannelTrace> getParserForType() {
    return PARSER;
  }

  public ChannelTrace getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

