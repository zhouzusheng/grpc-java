// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/consumer.proto

package com.google.api;

/**
 * <pre>
 * A descriptor for defining project properties for a service. One service may
 * have many consumer projects, and the service may want to behave differently
 * depending on some properties on the project. For example, a project may be
 * associated with a school, or a business, or a government agency, a business
 * type property on the project may affect how a service responds to the client.
 * This descriptor defines which properties are allowed to be set on a project.
 * Example:
 *    project_properties:
 *      properties:
 *      - name: NO_WATERMARK
 *        type: BOOL
 *        description: Allows usage of the API without watermarks.
 *      - name: EXTENDED_TILE_CACHE_PERIOD
 *        type: INT64
 * </pre>
 *
 * Protobuf type {@code google.api.ProjectProperties}
 */
public  final class ProjectProperties extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.ProjectProperties)
    ProjectPropertiesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProjectProperties.newBuilder() to construct.
  private ProjectProperties(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProjectProperties() {
    properties_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProjectProperties(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              properties_ = new java.util.ArrayList<Property>();
              mutable_bitField0_ |= 0x00000001;
            }
            properties_.add(
                input.readMessage(Property.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        properties_ = java.util.Collections.unmodifiableList(properties_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ConsumerProto.internal_static_google_api_ProjectProperties_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ConsumerProto.internal_static_google_api_ProjectProperties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ProjectProperties.class, Builder.class);
  }

  public static final int PROPERTIES_FIELD_NUMBER = 1;
  private java.util.List<Property> properties_;
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  public java.util.List<Property> getPropertiesList() {
    return properties_;
  }
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  public java.util.List<? extends PropertyOrBuilder>
      getPropertiesOrBuilderList() {
    return properties_;
  }
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  public int getPropertiesCount() {
    return properties_.size();
  }
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  public Property getProperties(int index) {
    return properties_.get(index);
  }
  /**
   * <pre>
   * List of per consumer project-specific properties.
   * </pre>
   *
   * <code>repeated .google.api.Property properties = 1;</code>
   */
  public PropertyOrBuilder getPropertiesOrBuilder(
      int index) {
    return properties_.get(index);
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
    for (int i = 0; i < properties_.size(); i++) {
      output.writeMessage(1, properties_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < properties_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, properties_.get(i));
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
    if (!(obj instanceof ProjectProperties)) {
      return super.equals(obj);
    }
    ProjectProperties other = (ProjectProperties) obj;

    if (!getPropertiesList()
        .equals(other.getPropertiesList())) return false;
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
    if (getPropertiesCount() > 0) {
      hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + getPropertiesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ProjectProperties parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ProjectProperties parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ProjectProperties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ProjectProperties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ProjectProperties parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ProjectProperties parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ProjectProperties parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ProjectProperties parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ProjectProperties parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ProjectProperties parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ProjectProperties parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ProjectProperties parseFrom(
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
  public static Builder newBuilder(ProjectProperties prototype) {
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
   * A descriptor for defining project properties for a service. One service may
   * have many consumer projects, and the service may want to behave differently
   * depending on some properties on the project. For example, a project may be
   * associated with a school, or a business, or a government agency, a business
   * type property on the project may affect how a service responds to the client.
   * This descriptor defines which properties are allowed to be set on a project.
   * Example:
   *    project_properties:
   *      properties:
   *      - name: NO_WATERMARK
   *        type: BOOL
   *        description: Allows usage of the API without watermarks.
   *      - name: EXTENDED_TILE_CACHE_PERIOD
   *        type: INT64
   * </pre>
   *
   * Protobuf type {@code google.api.ProjectProperties}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.ProjectProperties)
      ProjectPropertiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ConsumerProto.internal_static_google_api_ProjectProperties_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ConsumerProto.internal_static_google_api_ProjectProperties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ProjectProperties.class, Builder.class);
    }

    // Construct using com.google.api.ProjectProperties.newBuilder()
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
        getPropertiesFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (propertiesBuilder_ == null) {
        properties_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        propertiesBuilder_.clear();
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ConsumerProto.internal_static_google_api_ProjectProperties_descriptor;
    }

    @Override
    public ProjectProperties getDefaultInstanceForType() {
      return ProjectProperties.getDefaultInstance();
    }

    @Override
    public ProjectProperties build() {
      ProjectProperties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ProjectProperties buildPartial() {
      ProjectProperties result = new ProjectProperties(this);
      int from_bitField0_ = bitField0_;
      if (propertiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          properties_ = java.util.Collections.unmodifiableList(properties_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.properties_ = properties_;
      } else {
        result.properties_ = propertiesBuilder_.build();
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
      if (other instanceof ProjectProperties) {
        return mergeFrom((ProjectProperties)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ProjectProperties other) {
      if (other == ProjectProperties.getDefaultInstance()) return this;
      if (propertiesBuilder_ == null) {
        if (!other.properties_.isEmpty()) {
          if (properties_.isEmpty()) {
            properties_ = other.properties_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePropertiesIsMutable();
            properties_.addAll(other.properties_);
          }
          onChanged();
        }
      } else {
        if (!other.properties_.isEmpty()) {
          if (propertiesBuilder_.isEmpty()) {
            propertiesBuilder_.dispose();
            propertiesBuilder_ = null;
            properties_ = other.properties_;
            bitField0_ = (bitField0_ & ~0x00000001);
            propertiesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPropertiesFieldBuilder() : null;
          } else {
            propertiesBuilder_.addAllMessages(other.properties_);
          }
        }
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
      ProjectProperties parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ProjectProperties) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<Property> properties_ =
      java.util.Collections.emptyList();
    private void ensurePropertiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        properties_ = new java.util.ArrayList<Property>(properties_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        Property, Property.Builder, PropertyOrBuilder> propertiesBuilder_;

    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public java.util.List<Property> getPropertiesList() {
      if (propertiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(properties_);
      } else {
        return propertiesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public int getPropertiesCount() {
      if (propertiesBuilder_ == null) {
        return properties_.size();
      } else {
        return propertiesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Property getProperties(int index) {
      if (propertiesBuilder_ == null) {
        return properties_.get(index);
      } else {
        return propertiesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder setProperties(
        int index, Property value) {
      if (propertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertiesIsMutable();
        properties_.set(index, value);
        onChanged();
      } else {
        propertiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder setProperties(
        int index, Property.Builder builderForValue) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        properties_.set(index, builderForValue.build());
        onChanged();
      } else {
        propertiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder addProperties(Property value) {
      if (propertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertiesIsMutable();
        properties_.add(value);
        onChanged();
      } else {
        propertiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder addProperties(
        int index, Property value) {
      if (propertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePropertiesIsMutable();
        properties_.add(index, value);
        onChanged();
      } else {
        propertiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder addProperties(
        Property.Builder builderForValue) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        properties_.add(builderForValue.build());
        onChanged();
      } else {
        propertiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder addProperties(
        int index, Property.Builder builderForValue) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        properties_.add(index, builderForValue.build());
        onChanged();
      } else {
        propertiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder addAllProperties(
        Iterable<? extends Property> values) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, properties_);
        onChanged();
      } else {
        propertiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder clearProperties() {
      if (propertiesBuilder_ == null) {
        properties_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        propertiesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Builder removeProperties(int index) {
      if (propertiesBuilder_ == null) {
        ensurePropertiesIsMutable();
        properties_.remove(index);
        onChanged();
      } else {
        propertiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Property.Builder getPropertiesBuilder(
        int index) {
      return getPropertiesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public PropertyOrBuilder getPropertiesOrBuilder(
        int index) {
      if (propertiesBuilder_ == null) {
        return properties_.get(index);  } else {
        return propertiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public java.util.List<? extends PropertyOrBuilder>
         getPropertiesOrBuilderList() {
      if (propertiesBuilder_ != null) {
        return propertiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(properties_);
      }
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Property.Builder addPropertiesBuilder() {
      return getPropertiesFieldBuilder().addBuilder(
          Property.getDefaultInstance());
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public Property.Builder addPropertiesBuilder(
        int index) {
      return getPropertiesFieldBuilder().addBuilder(
          index, Property.getDefaultInstance());
    }
    /**
     * <pre>
     * List of per consumer project-specific properties.
     * </pre>
     *
     * <code>repeated .google.api.Property properties = 1;</code>
     */
    public java.util.List<Property.Builder>
         getPropertiesBuilderList() {
      return getPropertiesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        Property, Property.Builder, PropertyOrBuilder>
        getPropertiesFieldBuilder() {
      if (propertiesBuilder_ == null) {
        propertiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            Property, Property.Builder, PropertyOrBuilder>(
                properties_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        properties_ = null;
      }
      return propertiesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.api.ProjectProperties)
  }

  // @@protoc_insertion_point(class_scope:google.api.ProjectProperties)
  private static final ProjectProperties DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ProjectProperties();
  }

  public static ProjectProperties getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProjectProperties>
      PARSER = new com.google.protobuf.AbstractParser<ProjectProperties>() {
    @Override
    public ProjectProperties parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProjectProperties(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProjectProperties> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ProjectProperties> getParserForType() {
    return PARSER;
  }

  @Override
  public ProjectProperties getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

