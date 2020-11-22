// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/http.proto

package com.google.api;

public interface HttpRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.HttpRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Selects a method to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  String getSelector();
  /**
   * <pre>
   * Selects a method to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  com.google.protobuf.ByteString
      getSelectorBytes();

  /**
   * <pre>
   * Maps to HTTP GET. Used for listing and getting information about
   * resources.
   * </pre>
   *
   * <code>string get = 2;</code>
   */
  String getGet();
  /**
   * <pre>
   * Maps to HTTP GET. Used for listing and getting information about
   * resources.
   * </pre>
   *
   * <code>string get = 2;</code>
   */
  com.google.protobuf.ByteString
      getGetBytes();

  /**
   * <pre>
   * Maps to HTTP PUT. Used for replacing a resource.
   * </pre>
   *
   * <code>string put = 3;</code>
   */
  String getPut();
  /**
   * <pre>
   * Maps to HTTP PUT. Used for replacing a resource.
   * </pre>
   *
   * <code>string put = 3;</code>
   */
  com.google.protobuf.ByteString
      getPutBytes();

  /**
   * <pre>
   * Maps to HTTP POST. Used for creating a resource or performing an action.
   * </pre>
   *
   * <code>string post = 4;</code>
   */
  String getPost();
  /**
   * <pre>
   * Maps to HTTP POST. Used for creating a resource or performing an action.
   * </pre>
   *
   * <code>string post = 4;</code>
   */
  com.google.protobuf.ByteString
      getPostBytes();

  /**
   * <pre>
   * Maps to HTTP DELETE. Used for deleting a resource.
   * </pre>
   *
   * <code>string delete = 5;</code>
   */
  String getDelete();
  /**
   * <pre>
   * Maps to HTTP DELETE. Used for deleting a resource.
   * </pre>
   *
   * <code>string delete = 5;</code>
   */
  com.google.protobuf.ByteString
      getDeleteBytes();

  /**
   * <pre>
   * Maps to HTTP PATCH. Used for updating a resource.
   * </pre>
   *
   * <code>string patch = 6;</code>
   */
  String getPatch();
  /**
   * <pre>
   * Maps to HTTP PATCH. Used for updating a resource.
   * </pre>
   *
   * <code>string patch = 6;</code>
   */
  com.google.protobuf.ByteString
      getPatchBytes();

  /**
   * <pre>
   * The custom pattern is used for specifying an HTTP method that is not
   * included in the `pattern` field, such as HEAD, or "*" to leave the
   * HTTP method unspecified for this rule. The wild-card rule is useful
   * for services that provide content to Web (HTML) clients.
   * </pre>
   *
   * <code>.google.api.CustomHttpPattern custom = 8;</code>
   */
  boolean hasCustom();
  /**
   * <pre>
   * The custom pattern is used for specifying an HTTP method that is not
   * included in the `pattern` field, such as HEAD, or "*" to leave the
   * HTTP method unspecified for this rule. The wild-card rule is useful
   * for services that provide content to Web (HTML) clients.
   * </pre>
   *
   * <code>.google.api.CustomHttpPattern custom = 8;</code>
   */
  CustomHttpPattern getCustom();
  /**
   * <pre>
   * The custom pattern is used for specifying an HTTP method that is not
   * included in the `pattern` field, such as HEAD, or "*" to leave the
   * HTTP method unspecified for this rule. The wild-card rule is useful
   * for services that provide content to Web (HTML) clients.
   * </pre>
   *
   * <code>.google.api.CustomHttpPattern custom = 8;</code>
   */
  CustomHttpPatternOrBuilder getCustomOrBuilder();

  /**
   * <pre>
   * The name of the request field whose value is mapped to the HTTP request
   * body, or `*` for mapping all request fields not captured by the path
   * pattern to the HTTP body, or omitted for not having any HTTP request body.
   * NOTE: the referred field must be present at the top-level of the request
   * message type.
   * </pre>
   *
   * <code>string body = 7;</code>
   */
  String getBody();
  /**
   * <pre>
   * The name of the request field whose value is mapped to the HTTP request
   * body, or `*` for mapping all request fields not captured by the path
   * pattern to the HTTP body, or omitted for not having any HTTP request body.
   * NOTE: the referred field must be present at the top-level of the request
   * message type.
   * </pre>
   *
   * <code>string body = 7;</code>
   */
  com.google.protobuf.ByteString
      getBodyBytes();

  /**
   * <pre>
   * Optional. The name of the response field whose value is mapped to the HTTP
   * response body. When omitted, the entire response message will be used
   * as the HTTP response body.
   * NOTE: The referred field must be present at the top-level of the response
   * message type.
   * </pre>
   *
   * <code>string response_body = 12;</code>
   */
  String getResponseBody();
  /**
   * <pre>
   * Optional. The name of the response field whose value is mapped to the HTTP
   * response body. When omitted, the entire response message will be used
   * as the HTTP response body.
   * NOTE: The referred field must be present at the top-level of the response
   * message type.
   * </pre>
   *
   * <code>string response_body = 12;</code>
   */
  com.google.protobuf.ByteString
      getResponseBodyBytes();

  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must
   * not contain an `additional_bindings` field themselves (that is,
   * the nesting may only be one level deep).
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  java.util.List<HttpRule>
      getAdditionalBindingsList();
  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must
   * not contain an `additional_bindings` field themselves (that is,
   * the nesting may only be one level deep).
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  HttpRule getAdditionalBindings(int index);
  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must
   * not contain an `additional_bindings` field themselves (that is,
   * the nesting may only be one level deep).
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  int getAdditionalBindingsCount();
  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must
   * not contain an `additional_bindings` field themselves (that is,
   * the nesting may only be one level deep).
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  java.util.List<? extends HttpRuleOrBuilder>
      getAdditionalBindingsOrBuilderList();
  /**
   * <pre>
   * Additional HTTP bindings for the selector. Nested bindings must
   * not contain an `additional_bindings` field themselves (that is,
   * the nesting may only be one level deep).
   * </pre>
   *
   * <code>repeated .google.api.HttpRule additional_bindings = 11;</code>
   */
  HttpRuleOrBuilder getAdditionalBindingsOrBuilder(
      int index);

  public HttpRule.PatternCase getPatternCase();
}
