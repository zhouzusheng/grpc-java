// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/label.proto

package com.google.api;

public interface LabelDescriptorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.LabelDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The label key.
   * </pre>
   *
   * <code>string key = 1;</code>
   */
  String getKey();
  /**
   * <pre>
   * The label key.
   * </pre>
   *
   * <code>string key = 1;</code>
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * The type of data that can be assigned to the label.
   * </pre>
   *
   * <code>.google.api.LabelDescriptor.ValueType value_type = 2;</code>
   */
  int getValueTypeValue();
  /**
   * <pre>
   * The type of data that can be assigned to the label.
   * </pre>
   *
   * <code>.google.api.LabelDescriptor.ValueType value_type = 2;</code>
   */
  LabelDescriptor.ValueType getValueType();

  /**
   * <pre>
   * A human-readable description for the label.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  String getDescription();
  /**
   * <pre>
   * A human-readable description for the label.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}