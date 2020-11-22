// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/geo/type/viewport.proto

package com.google.geo.type;

/**
 * <pre>
 * A latitude-longitude viewport, represented as two diagonally opposite `low`
 * and `high` points. A viewport is considered a closed region, i.e. it includes
 * its boundary. The latitude bounds must range between -90 to 90 degrees
 * inclusive, and the longitude bounds must range between -180 to 180 degrees
 * inclusive. Various cases include:
 *  - If `low` = `high`, the viewport consists of that single point.
 *  - If `low.longitude` &gt; `high.longitude`, the longitude range is inverted
 *    (the viewport crosses the 180 degree longitude line).
 *  - If `low.longitude` = -180 degrees and `high.longitude` = 180 degrees,
 *    the viewport includes all longitudes.
 *  - If `low.longitude` = 180 degrees and `high.longitude` = -180 degrees,
 *    the longitude range is empty.
 *  - If `low.latitude` &gt; `high.latitude`, the latitude range is empty.
 * Both `low` and `high` must be populated, and the represented box cannot be
 * empty (as specified by the definitions above). An empty viewport will result
 * in an error.
 * For example, this viewport fully encloses New York City:
 * {
 *     "low": {
 *         "latitude": 40.477398,
 *         "longitude": -74.259087
 *     },
 *     "high": {
 *         "latitude": 40.91618,
 *         "longitude": -73.70018
 *     }
 * }
 * </pre>
 *
 * Protobuf type {@code google.geo.type.Viewport}
 */
public  final class Viewport extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.geo.type.Viewport)
    ViewportOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Viewport.newBuilder() to construct.
  private Viewport(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Viewport() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Viewport(
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
            com.google.type.LatLng.Builder subBuilder = null;
            if (low_ != null) {
              subBuilder = low_.toBuilder();
            }
            low_ = input.readMessage(com.google.type.LatLng.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(low_);
              low_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.type.LatLng.Builder subBuilder = null;
            if (high_ != null) {
              subBuilder = high_.toBuilder();
            }
            high_ = input.readMessage(com.google.type.LatLng.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(high_);
              high_ = subBuilder.buildPartial();
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
    return ViewportProto.internal_static_google_geo_type_Viewport_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ViewportProto.internal_static_google_geo_type_Viewport_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Viewport.class, Builder.class);
  }

  public static final int LOW_FIELD_NUMBER = 1;
  private com.google.type.LatLng low_;
  /**
   * <pre>
   * Required. The low point of the viewport.
   * </pre>
   *
   * <code>.google.type.LatLng low = 1;</code>
   */
  public boolean hasLow() {
    return low_ != null;
  }
  /**
   * <pre>
   * Required. The low point of the viewport.
   * </pre>
   *
   * <code>.google.type.LatLng low = 1;</code>
   */
  public com.google.type.LatLng getLow() {
    return low_ == null ? com.google.type.LatLng.getDefaultInstance() : low_;
  }
  /**
   * <pre>
   * Required. The low point of the viewport.
   * </pre>
   *
   * <code>.google.type.LatLng low = 1;</code>
   */
  public com.google.type.LatLngOrBuilder getLowOrBuilder() {
    return getLow();
  }

  public static final int HIGH_FIELD_NUMBER = 2;
  private com.google.type.LatLng high_;
  /**
   * <pre>
   * Required. The high point of the viewport.
   * </pre>
   *
   * <code>.google.type.LatLng high = 2;</code>
   */
  public boolean hasHigh() {
    return high_ != null;
  }
  /**
   * <pre>
   * Required. The high point of the viewport.
   * </pre>
   *
   * <code>.google.type.LatLng high = 2;</code>
   */
  public com.google.type.LatLng getHigh() {
    return high_ == null ? com.google.type.LatLng.getDefaultInstance() : high_;
  }
  /**
   * <pre>
   * Required. The high point of the viewport.
   * </pre>
   *
   * <code>.google.type.LatLng high = 2;</code>
   */
  public com.google.type.LatLngOrBuilder getHighOrBuilder() {
    return getHigh();
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
    if (low_ != null) {
      output.writeMessage(1, getLow());
    }
    if (high_ != null) {
      output.writeMessage(2, getHigh());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (low_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLow());
    }
    if (high_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getHigh());
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
    if (!(obj instanceof Viewport)) {
      return super.equals(obj);
    }
    Viewport other = (Viewport) obj;

    if (hasLow() != other.hasLow()) return false;
    if (hasLow()) {
      if (!getLow()
          .equals(other.getLow())) return false;
    }
    if (hasHigh() != other.hasHigh()) return false;
    if (hasHigh()) {
      if (!getHigh()
          .equals(other.getHigh())) return false;
    }
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
    if (hasLow()) {
      hash = (37 * hash) + LOW_FIELD_NUMBER;
      hash = (53 * hash) + getLow().hashCode();
    }
    if (hasHigh()) {
      hash = (37 * hash) + HIGH_FIELD_NUMBER;
      hash = (53 * hash) + getHigh().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Viewport parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Viewport parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Viewport parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Viewport parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Viewport parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Viewport parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Viewport parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Viewport parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static Viewport parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static Viewport parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Viewport parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static Viewport parseFrom(
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
  public static Builder newBuilder(Viewport prototype) {
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
   * A latitude-longitude viewport, represented as two diagonally opposite `low`
   * and `high` points. A viewport is considered a closed region, i.e. it includes
   * its boundary. The latitude bounds must range between -90 to 90 degrees
   * inclusive, and the longitude bounds must range between -180 to 180 degrees
   * inclusive. Various cases include:
   *  - If `low` = `high`, the viewport consists of that single point.
   *  - If `low.longitude` &gt; `high.longitude`, the longitude range is inverted
   *    (the viewport crosses the 180 degree longitude line).
   *  - If `low.longitude` = -180 degrees and `high.longitude` = 180 degrees,
   *    the viewport includes all longitudes.
   *  - If `low.longitude` = 180 degrees and `high.longitude` = -180 degrees,
   *    the longitude range is empty.
   *  - If `low.latitude` &gt; `high.latitude`, the latitude range is empty.
   * Both `low` and `high` must be populated, and the represented box cannot be
   * empty (as specified by the definitions above). An empty viewport will result
   * in an error.
   * For example, this viewport fully encloses New York City:
   * {
   *     "low": {
   *         "latitude": 40.477398,
   *         "longitude": -74.259087
   *     },
   *     "high": {
   *         "latitude": 40.91618,
   *         "longitude": -73.70018
   *     }
   * }
   * </pre>
   *
   * Protobuf type {@code google.geo.type.Viewport}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.geo.type.Viewport)
      ViewportOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ViewportProto.internal_static_google_geo_type_Viewport_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ViewportProto.internal_static_google_geo_type_Viewport_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Viewport.class, Builder.class);
    }

    // Construct using com.google.geo.type.Viewport.newBuilder()
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
      if (lowBuilder_ == null) {
        low_ = null;
      } else {
        low_ = null;
        lowBuilder_ = null;
      }
      if (highBuilder_ == null) {
        high_ = null;
      } else {
        high_ = null;
        highBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ViewportProto.internal_static_google_geo_type_Viewport_descriptor;
    }

    @Override
    public Viewport getDefaultInstanceForType() {
      return Viewport.getDefaultInstance();
    }

    @Override
    public Viewport build() {
      Viewport result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Viewport buildPartial() {
      Viewport result = new Viewport(this);
      if (lowBuilder_ == null) {
        result.low_ = low_;
      } else {
        result.low_ = lowBuilder_.build();
      }
      if (highBuilder_ == null) {
        result.high_ = high_;
      } else {
        result.high_ = highBuilder_.build();
      }
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
      if (other instanceof Viewport) {
        return mergeFrom((Viewport)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Viewport other) {
      if (other == Viewport.getDefaultInstance()) return this;
      if (other.hasLow()) {
        mergeLow(other.getLow());
      }
      if (other.hasHigh()) {
        mergeHigh(other.getHigh());
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
      Viewport parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (Viewport) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.type.LatLng low_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder> lowBuilder_;
    /**
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     */
    public boolean hasLow() {
      return lowBuilder_ != null || low_ != null;
    }
    /**
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     */
    public com.google.type.LatLng getLow() {
      if (lowBuilder_ == null) {
        return low_ == null ? com.google.type.LatLng.getDefaultInstance() : low_;
      } else {
        return lowBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     */
    public Builder setLow(com.google.type.LatLng value) {
      if (lowBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        low_ = value;
        onChanged();
      } else {
        lowBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     */
    public Builder setLow(
        com.google.type.LatLng.Builder builderForValue) {
      if (lowBuilder_ == null) {
        low_ = builderForValue.build();
        onChanged();
      } else {
        lowBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     */
    public Builder mergeLow(com.google.type.LatLng value) {
      if (lowBuilder_ == null) {
        if (low_ != null) {
          low_ =
            com.google.type.LatLng.newBuilder(low_).mergeFrom(value).buildPartial();
        } else {
          low_ = value;
        }
        onChanged();
      } else {
        lowBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     */
    public Builder clearLow() {
      if (lowBuilder_ == null) {
        low_ = null;
        onChanged();
      } else {
        low_ = null;
        lowBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     */
    public com.google.type.LatLng.Builder getLowBuilder() {
      
      onChanged();
      return getLowFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     */
    public com.google.type.LatLngOrBuilder getLowOrBuilder() {
      if (lowBuilder_ != null) {
        return lowBuilder_.getMessageOrBuilder();
      } else {
        return low_ == null ?
            com.google.type.LatLng.getDefaultInstance() : low_;
      }
    }
    /**
     * <pre>
     * Required. The low point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng low = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder> 
        getLowFieldBuilder() {
      if (lowBuilder_ == null) {
        lowBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>(
                getLow(),
                getParentForChildren(),
                isClean());
        low_ = null;
      }
      return lowBuilder_;
    }

    private com.google.type.LatLng high_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder> highBuilder_;
    /**
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     */
    public boolean hasHigh() {
      return highBuilder_ != null || high_ != null;
    }
    /**
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     */
    public com.google.type.LatLng getHigh() {
      if (highBuilder_ == null) {
        return high_ == null ? com.google.type.LatLng.getDefaultInstance() : high_;
      } else {
        return highBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     */
    public Builder setHigh(com.google.type.LatLng value) {
      if (highBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        high_ = value;
        onChanged();
      } else {
        highBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     */
    public Builder setHigh(
        com.google.type.LatLng.Builder builderForValue) {
      if (highBuilder_ == null) {
        high_ = builderForValue.build();
        onChanged();
      } else {
        highBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     */
    public Builder mergeHigh(com.google.type.LatLng value) {
      if (highBuilder_ == null) {
        if (high_ != null) {
          high_ =
            com.google.type.LatLng.newBuilder(high_).mergeFrom(value).buildPartial();
        } else {
          high_ = value;
        }
        onChanged();
      } else {
        highBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     */
    public Builder clearHigh() {
      if (highBuilder_ == null) {
        high_ = null;
        onChanged();
      } else {
        high_ = null;
        highBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     */
    public com.google.type.LatLng.Builder getHighBuilder() {
      
      onChanged();
      return getHighFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     */
    public com.google.type.LatLngOrBuilder getHighOrBuilder() {
      if (highBuilder_ != null) {
        return highBuilder_.getMessageOrBuilder();
      } else {
        return high_ == null ?
            com.google.type.LatLng.getDefaultInstance() : high_;
      }
    }
    /**
     * <pre>
     * Required. The high point of the viewport.
     * </pre>
     *
     * <code>.google.type.LatLng high = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder> 
        getHighFieldBuilder() {
      if (highBuilder_ == null) {
        highBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.LatLng, com.google.type.LatLng.Builder, com.google.type.LatLngOrBuilder>(
                getHigh(),
                getParentForChildren(),
                isClean());
        high_ = null;
      }
      return highBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.geo.type.Viewport)
  }

  // @@protoc_insertion_point(class_scope:google.geo.type.Viewport)
  private static final Viewport DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Viewport();
  }

  public static Viewport getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Viewport>
      PARSER = new com.google.protobuf.AbstractParser<Viewport>() {
    @Override
    public Viewport parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Viewport(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Viewport> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Viewport> getParserForType() {
    return PARSER;
  }

  @Override
  public Viewport getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

