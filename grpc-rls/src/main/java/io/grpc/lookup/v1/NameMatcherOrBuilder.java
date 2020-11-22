// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/lookup/v1/rls_config.proto

package io.grpc.lookup.v1;

public interface NameMatcherOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.lookup.v1.NameMatcher)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name that will be used in the RLS key_map to refer to this value.
   * </pre>
   *
   * <code>string key = 1;</code>
   */
  String getKey();
  /**
   * <pre>
   * The name that will be used in the RLS key_map to refer to this value.
   * </pre>
   *
   * <code>string key = 1;</code>
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * Ordered list of names (headers or query parameter names) that can supply
   * this value; the first one with a non-empty value is used.
   * </pre>
   *
   * <code>repeated string names = 2;</code>
   */
  java.util.List<String>
      getNamesList();
  /**
   * <pre>
   * Ordered list of names (headers or query parameter names) that can supply
   * this value; the first one with a non-empty value is used.
   * </pre>
   *
   * <code>repeated string names = 2;</code>
   */
  int getNamesCount();
  /**
   * <pre>
   * Ordered list of names (headers or query parameter names) that can supply
   * this value; the first one with a non-empty value is used.
   * </pre>
   *
   * <code>repeated string names = 2;</code>
   */
  String getNames(int index);
  /**
   * <pre>
   * Ordered list of names (headers or query parameter names) that can supply
   * this value; the first one with a non-empty value is used.
   * </pre>
   *
   * <code>repeated string names = 2;</code>
   */
  com.google.protobuf.ByteString
      getNamesBytes(int index);

  /**
   * <pre>
   * If true, make this extraction required; the key builder will not match
   * if no value is found.
   * </pre>
   *
   * <code>bool required_match = 3;</code>
   */
  boolean getRequiredMatch();
}
