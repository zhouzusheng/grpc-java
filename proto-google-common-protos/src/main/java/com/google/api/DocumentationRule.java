// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/documentation.proto

package com.google.api;

/**
 * <pre>
 * A documentation rule provides information about individual API elements.
 * </pre>
 *
 * Protobuf type {@code google.api.DocumentationRule}
 */
public  final class DocumentationRule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.DocumentationRule)
    DocumentationRuleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DocumentationRule.newBuilder() to construct.
  private DocumentationRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocumentationRule() {
    selector_ = "";
    description_ = "";
    deprecationDescription_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DocumentationRule(
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

            selector_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            deprecationDescription_ = s;
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
    return DocumentationProto.internal_static_google_api_DocumentationRule_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return DocumentationProto.internal_static_google_api_DocumentationRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            DocumentationRule.class, Builder.class);
  }

  public static final int SELECTOR_FIELD_NUMBER = 1;
  private volatile Object selector_;
  /**
   * <pre>
   * The selector is a comma-separated list of patterns. Each pattern is a
   * qualified name of the element which may end in "*", indicating a wildcard.
   * Wildcards are only allowed at the end and for a whole component of the
   * qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A
   * wildcard will match one or more components. To specify a default for all
   * applicable elements, the whole pattern "*" is used.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  public String getSelector() {
    Object ref = selector_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      selector_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The selector is a comma-separated list of patterns. Each pattern is a
   * qualified name of the element which may end in "*", indicating a wildcard.
   * Wildcards are only allowed at the end and for a whole component of the
   * qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A
   * wildcard will match one or more components. To specify a default for all
   * applicable elements, the whole pattern "*" is used.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSelectorBytes() {
    Object ref = selector_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      selector_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private volatile Object description_;
  /**
   * <pre>
   * Description of the selected API(s).
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  public String getDescription() {
    Object ref = description_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Description of the selected API(s).
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    Object ref = description_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPRECATION_DESCRIPTION_FIELD_NUMBER = 3;
  private volatile Object deprecationDescription_;
  /**
   * <pre>
   * Deprecation description of the selected element(s). It can be provided if
   * an element is marked as `deprecated`.
   * </pre>
   *
   * <code>string deprecation_description = 3;</code>
   */
  public String getDeprecationDescription() {
    Object ref = deprecationDescription_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      deprecationDescription_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Deprecation description of the selected element(s). It can be provided if
   * an element is marked as `deprecated`.
   * </pre>
   *
   * <code>string deprecation_description = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDeprecationDescriptionBytes() {
    Object ref = deprecationDescription_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      deprecationDescription_ = b;
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
    if (!getSelectorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, selector_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (!getDeprecationDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, deprecationDescription_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSelectorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, selector_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (!getDeprecationDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, deprecationDescription_);
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
    if (!(obj instanceof DocumentationRule)) {
      return super.equals(obj);
    }
    DocumentationRule other = (DocumentationRule) obj;

    if (!getSelector()
        .equals(other.getSelector())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getDeprecationDescription()
        .equals(other.getDeprecationDescription())) return false;
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
    hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
    hash = (53 * hash) + getSelector().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + DEPRECATION_DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDeprecationDescription().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static DocumentationRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DocumentationRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DocumentationRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DocumentationRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DocumentationRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static DocumentationRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static DocumentationRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DocumentationRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static DocumentationRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static DocumentationRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static DocumentationRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static DocumentationRule parseFrom(
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
  public static Builder newBuilder(DocumentationRule prototype) {
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
   * A documentation rule provides information about individual API elements.
   * </pre>
   *
   * Protobuf type {@code google.api.DocumentationRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.DocumentationRule)
      DocumentationRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return DocumentationProto.internal_static_google_api_DocumentationRule_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return DocumentationProto.internal_static_google_api_DocumentationRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              DocumentationRule.class, Builder.class);
    }

    // Construct using com.google.api.DocumentationRule.newBuilder()
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
      selector_ = "";

      description_ = "";

      deprecationDescription_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return DocumentationProto.internal_static_google_api_DocumentationRule_descriptor;
    }

    @Override
    public DocumentationRule getDefaultInstanceForType() {
      return DocumentationRule.getDefaultInstance();
    }

    @Override
    public DocumentationRule build() {
      DocumentationRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public DocumentationRule buildPartial() {
      DocumentationRule result = new DocumentationRule(this);
      result.selector_ = selector_;
      result.description_ = description_;
      result.deprecationDescription_ = deprecationDescription_;
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
      if (other instanceof DocumentationRule) {
        return mergeFrom((DocumentationRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(DocumentationRule other) {
      if (other == DocumentationRule.getDefaultInstance()) return this;
      if (!other.getSelector().isEmpty()) {
        selector_ = other.selector_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (!other.getDeprecationDescription().isEmpty()) {
        deprecationDescription_ = other.deprecationDescription_;
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
      DocumentationRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (DocumentationRule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object selector_ = "";
    /**
     * <pre>
     * The selector is a comma-separated list of patterns. Each pattern is a
     * qualified name of the element which may end in "*", indicating a wildcard.
     * Wildcards are only allowed at the end and for a whole component of the
     * qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A
     * wildcard will match one or more components. To specify a default for all
     * applicable elements, the whole pattern "*" is used.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public String getSelector() {
      Object ref = selector_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        selector_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * The selector is a comma-separated list of patterns. Each pattern is a
     * qualified name of the element which may end in "*", indicating a wildcard.
     * Wildcards are only allowed at the end and for a whole component of the
     * qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A
     * wildcard will match one or more components. To specify a default for all
     * applicable elements, the whole pattern "*" is used.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSelectorBytes() {
      Object ref = selector_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        selector_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The selector is a comma-separated list of patterns. Each pattern is a
     * qualified name of the element which may end in "*", indicating a wildcard.
     * Wildcards are only allowed at the end and for a whole component of the
     * qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A
     * wildcard will match one or more components. To specify a default for all
     * applicable elements, the whole pattern "*" is used.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public Builder setSelector(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      selector_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The selector is a comma-separated list of patterns. Each pattern is a
     * qualified name of the element which may end in "*", indicating a wildcard.
     * Wildcards are only allowed at the end and for a whole component of the
     * qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A
     * wildcard will match one or more components. To specify a default for all
     * applicable elements, the whole pattern "*" is used.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public Builder clearSelector() {
      
      selector_ = getDefaultInstance().getSelector();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The selector is a comma-separated list of patterns. Each pattern is a
     * qualified name of the element which may end in "*", indicating a wildcard.
     * Wildcards are only allowed at the end and for a whole component of the
     * qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A
     * wildcard will match one or more components. To specify a default for all
     * applicable elements, the whole pattern "*" is used.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public Builder setSelectorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      selector_ = value;
      onChanged();
      return this;
    }

    private Object description_ = "";
    /**
     * <pre>
     * Description of the selected API(s).
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public String getDescription() {
      Object ref = description_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Description of the selected API(s).
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Description of the selected API(s).
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public Builder setDescription(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description of the selected API(s).
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description of the selected API(s).
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private Object deprecationDescription_ = "";
    /**
     * <pre>
     * Deprecation description of the selected element(s). It can be provided if
     * an element is marked as `deprecated`.
     * </pre>
     *
     * <code>string deprecation_description = 3;</code>
     */
    public String getDeprecationDescription() {
      Object ref = deprecationDescription_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        deprecationDescription_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     * Deprecation description of the selected element(s). It can be provided if
     * an element is marked as `deprecated`.
     * </pre>
     *
     * <code>string deprecation_description = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDeprecationDescriptionBytes() {
      Object ref = deprecationDescription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        deprecationDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Deprecation description of the selected element(s). It can be provided if
     * an element is marked as `deprecated`.
     * </pre>
     *
     * <code>string deprecation_description = 3;</code>
     */
    public Builder setDeprecationDescription(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deprecationDescription_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Deprecation description of the selected element(s). It can be provided if
     * an element is marked as `deprecated`.
     * </pre>
     *
     * <code>string deprecation_description = 3;</code>
     */
    public Builder clearDeprecationDescription() {
      
      deprecationDescription_ = getDefaultInstance().getDeprecationDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Deprecation description of the selected element(s). It can be provided if
     * an element is marked as `deprecated`.
     * </pre>
     *
     * <code>string deprecation_description = 3;</code>
     */
    public Builder setDeprecationDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deprecationDescription_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.api.DocumentationRule)
  }

  // @@protoc_insertion_point(class_scope:google.api.DocumentationRule)
  private static final DocumentationRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new DocumentationRule();
  }

  public static DocumentationRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentationRule>
      PARSER = new com.google.protobuf.AbstractParser<DocumentationRule>() {
    @Override
    public DocumentationRule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DocumentationRule(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DocumentationRule> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<DocumentationRule> getParserForType() {
    return PARSER;
  }

  @Override
  public DocumentationRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
