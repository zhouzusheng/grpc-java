// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/monitored_resource.proto

package com.google.api;

public interface MonitoredResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.MonitoredResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The monitored resource type. This field must match
   * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
   * example, the type of a Compute Engine VM instance is `gce_instance`.
   * </pre>
   *
   * <code>string type = 1;</code>
   */
  String getType();
  /**
   * <pre>
   * Required. The monitored resource type. This field must match
   * the `type` field of a [MonitoredResourceDescriptor][google.api.MonitoredResourceDescriptor] object. For
   * example, the type of a Compute Engine VM instance is `gce_instance`.
   * </pre>
   *
   * <code>string type = 1;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Compute Engine VM instances use the
   * labels `"project_id"`, `"instance_id"`, and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Compute Engine VM instances use the
   * labels `"project_id"`, `"instance_id"`, and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  boolean containsLabels(
      String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @Deprecated
  java.util.Map<String, String>
  getLabels();
  /**
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Compute Engine VM instances use the
   * labels `"project_id"`, `"instance_id"`, and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.util.Map<String, String>
  getLabelsMap();
  /**
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Compute Engine VM instances use the
   * labels `"project_id"`, `"instance_id"`, and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  String getLabelsOrDefault(
      String key,
      String defaultValue);
  /**
   * <pre>
   * Required. Values for all of the labels listed in the associated monitored
   * resource descriptor. For example, Compute Engine VM instances use the
   * labels `"project_id"`, `"instance_id"`, and `"zone"`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  String getLabelsOrThrow(
      String key);
}