// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/endpoint.proto

package com.google.api;

public interface EndpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Endpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The canonical name of this endpoint.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  String getName();
  /**
   * <pre>
   * The canonical name of this endpoint.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * DEPRECATED: This field is no longer supported. Instead of using aliases,
   * please specify multiple [google.api.Endpoint][google.api.Endpoint] for each of the intended
   * aliases.
   * Additional names that this endpoint will be hosted on.
   * </pre>
   *
   * <code>repeated string aliases = 2 [deprecated = true];</code>
   */
  @Deprecated java.util.List<String>
      getAliasesList();
  /**
   * <pre>
   * DEPRECATED: This field is no longer supported. Instead of using aliases,
   * please specify multiple [google.api.Endpoint][google.api.Endpoint] for each of the intended
   * aliases.
   * Additional names that this endpoint will be hosted on.
   * </pre>
   *
   * <code>repeated string aliases = 2 [deprecated = true];</code>
   */
  @Deprecated int getAliasesCount();
  /**
   * <pre>
   * DEPRECATED: This field is no longer supported. Instead of using aliases,
   * please specify multiple [google.api.Endpoint][google.api.Endpoint] for each of the intended
   * aliases.
   * Additional names that this endpoint will be hosted on.
   * </pre>
   *
   * <code>repeated string aliases = 2 [deprecated = true];</code>
   */
  @Deprecated String getAliases(int index);
  /**
   * <pre>
   * DEPRECATED: This field is no longer supported. Instead of using aliases,
   * please specify multiple [google.api.Endpoint][google.api.Endpoint] for each of the intended
   * aliases.
   * Additional names that this endpoint will be hosted on.
   * </pre>
   *
   * <code>repeated string aliases = 2 [deprecated = true];</code>
   */
  @Deprecated com.google.protobuf.ByteString
      getAliasesBytes(int index);

  /**
   * <pre>
   * The list of features enabled on this endpoint.
   * </pre>
   *
   * <code>repeated string features = 4;</code>
   */
  java.util.List<String>
      getFeaturesList();
  /**
   * <pre>
   * The list of features enabled on this endpoint.
   * </pre>
   *
   * <code>repeated string features = 4;</code>
   */
  int getFeaturesCount();
  /**
   * <pre>
   * The list of features enabled on this endpoint.
   * </pre>
   *
   * <code>repeated string features = 4;</code>
   */
  String getFeatures(int index);
  /**
   * <pre>
   * The list of features enabled on this endpoint.
   * </pre>
   *
   * <code>repeated string features = 4;</code>
   */
  com.google.protobuf.ByteString
      getFeaturesBytes(int index);

  /**
   * <pre>
   * The specification of an Internet routable address of API frontend that will
   * handle requests to this [API
   * Endpoint](https://cloud.google.com/apis/design/glossary). It should be
   * either a valid IPv4 address or a fully-qualified domain name. For example,
   * "8.8.8.8" or "myservice.appspot.com".
   * </pre>
   *
   * <code>string target = 101;</code>
   */
  String getTarget();
  /**
   * <pre>
   * The specification of an Internet routable address of API frontend that will
   * handle requests to this [API
   * Endpoint](https://cloud.google.com/apis/design/glossary). It should be
   * either a valid IPv4 address or a fully-qualified domain name. For example,
   * "8.8.8.8" or "myservice.appspot.com".
   * </pre>
   *
   * <code>string target = 101;</code>
   */
  com.google.protobuf.ByteString
      getTargetBytes();

  /**
   * <pre>
   * Allowing
   * [CORS](https://en.wikipedia.org/wiki/Cross-origin_resource_sharing), aka
   * cross-domain traffic, would allow the backends served from this endpoint to
   * receive and respond to HTTP OPTIONS requests. The response will be used by
   * the browser to determine whether the subsequent cross-origin request is
   * allowed to proceed.
   * </pre>
   *
   * <code>bool allow_cors = 5;</code>
   */
  boolean getAllowCors();
}