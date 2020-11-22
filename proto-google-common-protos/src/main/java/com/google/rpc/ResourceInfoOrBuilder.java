// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/rpc/error_details.proto

package com.google.rpc;

public interface ResourceInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.rpc.ResourceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A name for the type of resource being accessed, e.g. "sql table",
   * "cloud storage bucket", "file", "Google calendar"; or the type URL
   * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
   * </pre>
   *
   * <code>string resource_type = 1;</code>
   */
  String getResourceType();
  /**
   * <pre>
   * A name for the type of resource being accessed, e.g. "sql table",
   * "cloud storage bucket", "file", "Google calendar"; or the type URL
   * of the resource: e.g. "type.googleapis.com/google.pubsub.v1.Topic".
   * </pre>
   *
   * <code>string resource_type = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceTypeBytes();

  /**
   * <pre>
   * The name of the resource being accessed.  For example, a shared calendar
   * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
   * error is
   * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
   * </pre>
   *
   * <code>string resource_name = 2;</code>
   */
  String getResourceName();
  /**
   * <pre>
   * The name of the resource being accessed.  For example, a shared calendar
   * name: "example.com_4fghdhgsrgh&#64;group.calendar.google.com", if the current
   * error is
   * [google.rpc.Code.PERMISSION_DENIED][google.rpc.Code.PERMISSION_DENIED].
   * </pre>
   *
   * <code>string resource_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The owner of the resource (optional).
   * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
   * id&gt;".
   * </pre>
   *
   * <code>string owner = 3;</code>
   */
  String getOwner();
  /**
   * <pre>
   * The owner of the resource (optional).
   * For example, "user:&lt;owner email&gt;" or "project:&lt;Google developer project
   * id&gt;".
   * </pre>
   *
   * <code>string owner = 3;</code>
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <pre>
   * Describes what error is encountered when accessing this resource.
   * For example, updating a cloud project may require the `writer` permission
   * on the developer console project.
   * </pre>
   *
   * <code>string description = 4;</code>
   */
  String getDescription();
  /**
   * <pre>
   * Describes what error is encountered when accessing this resource.
   * For example, updating a cloud project may require the `writer` permission
   * on the developer console project.
   * </pre>
   *
   * <code>string description = 4;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
