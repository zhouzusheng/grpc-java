// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/service.proto

package com.google.api;

public interface ServiceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Service)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The semantic version of the service configuration. The config version
   * affects the interpretation of the service configuration. For example,
   * certain features are enabled by default for certain config versions.
   * The latest config version is `3`.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value config_version = 20;</code>
   */
  boolean hasConfigVersion();
  /**
   * <pre>
   * The semantic version of the service configuration. The config version
   * affects the interpretation of the service configuration. For example,
   * certain features are enabled by default for certain config versions.
   * The latest config version is `3`.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value config_version = 20;</code>
   */
  com.google.protobuf.UInt32Value getConfigVersion();
  /**
   * <pre>
   * The semantic version of the service configuration. The config version
   * affects the interpretation of the service configuration. For example,
   * certain features are enabled by default for certain config versions.
   * The latest config version is `3`.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value config_version = 20;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getConfigVersionOrBuilder();

  /**
   * <pre>
   * The service name, which is a DNS-like logical identifier for the
   * service, such as `calendar.googleapis.com`. The service name
   * typically goes through DNS verification to make sure the owner
   * of the service also owns the DNS name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  String getName();
  /**
   * <pre>
   * The service name, which is a DNS-like logical identifier for the
   * service, such as `calendar.googleapis.com`. The service name
   * typically goes through DNS verification to make sure the owner
   * of the service also owns the DNS name.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A unique ID for a specific instance of this message, typically assigned
   * by the client for tracking purpose. If empty, the server may choose to
   * generate one instead. Must be no longer than 60 characters.
   * </pre>
   *
   * <code>string id = 33;</code>
   */
  String getId();
  /**
   * <pre>
   * A unique ID for a specific instance of this message, typically assigned
   * by the client for tracking purpose. If empty, the server may choose to
   * generate one instead. Must be no longer than 60 characters.
   * </pre>
   *
   * <code>string id = 33;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The product title for this service.
   * </pre>
   *
   * <code>string title = 2;</code>
   */
  String getTitle();
  /**
   * <pre>
   * The product title for this service.
   * </pre>
   *
   * <code>string title = 2;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * The Google project that owns this service.
   * </pre>
   *
   * <code>string producer_project_id = 22;</code>
   */
  String getProducerProjectId();
  /**
   * <pre>
   * The Google project that owns this service.
   * </pre>
   *
   * <code>string producer_project_id = 22;</code>
   */
  com.google.protobuf.ByteString
      getProducerProjectIdBytes();

  /**
   * <pre>
   * A list of API interfaces exported by this service. Only the `name` field
   * of the [google.protobuf.Api][google.protobuf.Api] needs to be provided by the configuration
   * author, as the remaining fields will be derived from the IDL during the
   * normalization process. It is an error to specify an API interface here
   * which cannot be resolved against the associated IDL files.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3;</code>
   */
  java.util.List<com.google.protobuf.Api> 
      getApisList();
  /**
   * <pre>
   * A list of API interfaces exported by this service. Only the `name` field
   * of the [google.protobuf.Api][google.protobuf.Api] needs to be provided by the configuration
   * author, as the remaining fields will be derived from the IDL during the
   * normalization process. It is an error to specify an API interface here
   * which cannot be resolved against the associated IDL files.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3;</code>
   */
  com.google.protobuf.Api getApis(int index);
  /**
   * <pre>
   * A list of API interfaces exported by this service. Only the `name` field
   * of the [google.protobuf.Api][google.protobuf.Api] needs to be provided by the configuration
   * author, as the remaining fields will be derived from the IDL during the
   * normalization process. It is an error to specify an API interface here
   * which cannot be resolved against the associated IDL files.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3;</code>
   */
  int getApisCount();
  /**
   * <pre>
   * A list of API interfaces exported by this service. Only the `name` field
   * of the [google.protobuf.Api][google.protobuf.Api] needs to be provided by the configuration
   * author, as the remaining fields will be derived from the IDL during the
   * normalization process. It is an error to specify an API interface here
   * which cannot be resolved against the associated IDL files.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3;</code>
   */
  java.util.List<? extends com.google.protobuf.ApiOrBuilder> 
      getApisOrBuilderList();
  /**
   * <pre>
   * A list of API interfaces exported by this service. Only the `name` field
   * of the [google.protobuf.Api][google.protobuf.Api] needs to be provided by the configuration
   * author, as the remaining fields will be derived from the IDL during the
   * normalization process. It is an error to specify an API interface here
   * which cannot be resolved against the associated IDL files.
   * </pre>
   *
   * <code>repeated .google.protobuf.Api apis = 3;</code>
   */
  com.google.protobuf.ApiOrBuilder getApisOrBuilder(
      int index);

  /**
   * <pre>
   * A list of all proto message types included in this API service.
   * Types referenced directly or indirectly by the `apis` are
   * automatically included.  Messages which are not referenced but
   * shall be included, such as types used by the `google.protobuf.Any` type,
   * should be listed here by name. Example:
   *     types:
   *     - name: google.protobuf.Int32
   * </pre>
   *
   * <code>repeated .google.protobuf.Type types = 4;</code>
   */
  java.util.List<com.google.protobuf.Type> 
      getTypesList();
  /**
   * <pre>
   * A list of all proto message types included in this API service.
   * Types referenced directly or indirectly by the `apis` are
   * automatically included.  Messages which are not referenced but
   * shall be included, such as types used by the `google.protobuf.Any` type,
   * should be listed here by name. Example:
   *     types:
   *     - name: google.protobuf.Int32
   * </pre>
   *
   * <code>repeated .google.protobuf.Type types = 4;</code>
   */
  com.google.protobuf.Type getTypes(int index);
  /**
   * <pre>
   * A list of all proto message types included in this API service.
   * Types referenced directly or indirectly by the `apis` are
   * automatically included.  Messages which are not referenced but
   * shall be included, such as types used by the `google.protobuf.Any` type,
   * should be listed here by name. Example:
   *     types:
   *     - name: google.protobuf.Int32
   * </pre>
   *
   * <code>repeated .google.protobuf.Type types = 4;</code>
   */
  int getTypesCount();
  /**
   * <pre>
   * A list of all proto message types included in this API service.
   * Types referenced directly or indirectly by the `apis` are
   * automatically included.  Messages which are not referenced but
   * shall be included, such as types used by the `google.protobuf.Any` type,
   * should be listed here by name. Example:
   *     types:
   *     - name: google.protobuf.Int32
   * </pre>
   *
   * <code>repeated .google.protobuf.Type types = 4;</code>
   */
  java.util.List<? extends com.google.protobuf.TypeOrBuilder> 
      getTypesOrBuilderList();
  /**
   * <pre>
   * A list of all proto message types included in this API service.
   * Types referenced directly or indirectly by the `apis` are
   * automatically included.  Messages which are not referenced but
   * shall be included, such as types used by the `google.protobuf.Any` type,
   * should be listed here by name. Example:
   *     types:
   *     - name: google.protobuf.Int32
   * </pre>
   *
   * <code>repeated .google.protobuf.Type types = 4;</code>
   */
  com.google.protobuf.TypeOrBuilder getTypesOrBuilder(
      int index);

  /**
   * <pre>
   * A list of all enum types included in this API service.  Enums
   * referenced directly or indirectly by the `apis` are automatically
   * included.  Enums which are not referenced but shall be included
   * should be listed here by name. Example:
   *     enums:
   *     - name: google.someapi.v1.SomeEnum
   * </pre>
   *
   * <code>repeated .google.protobuf.Enum enums = 5;</code>
   */
  java.util.List<com.google.protobuf.Enum> 
      getEnumsList();
  /**
   * <pre>
   * A list of all enum types included in this API service.  Enums
   * referenced directly or indirectly by the `apis` are automatically
   * included.  Enums which are not referenced but shall be included
   * should be listed here by name. Example:
   *     enums:
   *     - name: google.someapi.v1.SomeEnum
   * </pre>
   *
   * <code>repeated .google.protobuf.Enum enums = 5;</code>
   */
  com.google.protobuf.Enum getEnums(int index);
  /**
   * <pre>
   * A list of all enum types included in this API service.  Enums
   * referenced directly or indirectly by the `apis` are automatically
   * included.  Enums which are not referenced but shall be included
   * should be listed here by name. Example:
   *     enums:
   *     - name: google.someapi.v1.SomeEnum
   * </pre>
   *
   * <code>repeated .google.protobuf.Enum enums = 5;</code>
   */
  int getEnumsCount();
  /**
   * <pre>
   * A list of all enum types included in this API service.  Enums
   * referenced directly or indirectly by the `apis` are automatically
   * included.  Enums which are not referenced but shall be included
   * should be listed here by name. Example:
   *     enums:
   *     - name: google.someapi.v1.SomeEnum
   * </pre>
   *
   * <code>repeated .google.protobuf.Enum enums = 5;</code>
   */
  java.util.List<? extends com.google.protobuf.EnumOrBuilder> 
      getEnumsOrBuilderList();
  /**
   * <pre>
   * A list of all enum types included in this API service.  Enums
   * referenced directly or indirectly by the `apis` are automatically
   * included.  Enums which are not referenced but shall be included
   * should be listed here by name. Example:
   *     enums:
   *     - name: google.someapi.v1.SomeEnum
   * </pre>
   *
   * <code>repeated .google.protobuf.Enum enums = 5;</code>
   */
  com.google.protobuf.EnumOrBuilder getEnumsOrBuilder(
      int index);

  /**
   * <pre>
   * Additional API documentation.
   * </pre>
   *
   * <code>.google.api.Documentation documentation = 6;</code>
   */
  boolean hasDocumentation();
  /**
   * <pre>
   * Additional API documentation.
   * </pre>
   *
   * <code>.google.api.Documentation documentation = 6;</code>
   */
  Documentation getDocumentation();
  /**
   * <pre>
   * Additional API documentation.
   * </pre>
   *
   * <code>.google.api.Documentation documentation = 6;</code>
   */
  DocumentationOrBuilder getDocumentationOrBuilder();

  /**
   * <pre>
   * API backend configuration.
   * </pre>
   *
   * <code>.google.api.Backend backend = 8;</code>
   */
  boolean hasBackend();
  /**
   * <pre>
   * API backend configuration.
   * </pre>
   *
   * <code>.google.api.Backend backend = 8;</code>
   */
  Backend getBackend();
  /**
   * <pre>
   * API backend configuration.
   * </pre>
   *
   * <code>.google.api.Backend backend = 8;</code>
   */
  BackendOrBuilder getBackendOrBuilder();

  /**
   * <pre>
   * HTTP configuration.
   * </pre>
   *
   * <code>.google.api.Http http = 9;</code>
   */
  boolean hasHttp();
  /**
   * <pre>
   * HTTP configuration.
   * </pre>
   *
   * <code>.google.api.Http http = 9;</code>
   */
  Http getHttp();
  /**
   * <pre>
   * HTTP configuration.
   * </pre>
   *
   * <code>.google.api.Http http = 9;</code>
   */
  HttpOrBuilder getHttpOrBuilder();

  /**
   * <pre>
   * Quota configuration.
   * </pre>
   *
   * <code>.google.api.Quota quota = 10;</code>
   */
  boolean hasQuota();
  /**
   * <pre>
   * Quota configuration.
   * </pre>
   *
   * <code>.google.api.Quota quota = 10;</code>
   */
  Quota getQuota();
  /**
   * <pre>
   * Quota configuration.
   * </pre>
   *
   * <code>.google.api.Quota quota = 10;</code>
   */
  QuotaOrBuilder getQuotaOrBuilder();

  /**
   * <pre>
   * Auth configuration.
   * </pre>
   *
   * <code>.google.api.Authentication authentication = 11;</code>
   */
  boolean hasAuthentication();
  /**
   * <pre>
   * Auth configuration.
   * </pre>
   *
   * <code>.google.api.Authentication authentication = 11;</code>
   */
  Authentication getAuthentication();
  /**
   * <pre>
   * Auth configuration.
   * </pre>
   *
   * <code>.google.api.Authentication authentication = 11;</code>
   */
  AuthenticationOrBuilder getAuthenticationOrBuilder();

  /**
   * <pre>
   * Context configuration.
   * </pre>
   *
   * <code>.google.api.Context context = 12;</code>
   */
  boolean hasContext();
  /**
   * <pre>
   * Context configuration.
   * </pre>
   *
   * <code>.google.api.Context context = 12;</code>
   */
  Context getContext();
  /**
   * <pre>
   * Context configuration.
   * </pre>
   *
   * <code>.google.api.Context context = 12;</code>
   */
  ContextOrBuilder getContextOrBuilder();

  /**
   * <pre>
   * Configuration controlling usage of this service.
   * </pre>
   *
   * <code>.google.api.Usage usage = 15;</code>
   */
  boolean hasUsage();
  /**
   * <pre>
   * Configuration controlling usage of this service.
   * </pre>
   *
   * <code>.google.api.Usage usage = 15;</code>
   */
  Usage getUsage();
  /**
   * <pre>
   * Configuration controlling usage of this service.
   * </pre>
   *
   * <code>.google.api.Usage usage = 15;</code>
   */
  UsageOrBuilder getUsageOrBuilder();

  /**
   * <pre>
   * Configuration for network endpoints.  If this is empty, then an endpoint
   * with the same name as the service is automatically generated to service all
   * defined APIs.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18;</code>
   */
  java.util.List<Endpoint>
      getEndpointsList();
  /**
   * <pre>
   * Configuration for network endpoints.  If this is empty, then an endpoint
   * with the same name as the service is automatically generated to service all
   * defined APIs.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18;</code>
   */
  Endpoint getEndpoints(int index);
  /**
   * <pre>
   * Configuration for network endpoints.  If this is empty, then an endpoint
   * with the same name as the service is automatically generated to service all
   * defined APIs.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18;</code>
   */
  int getEndpointsCount();
  /**
   * <pre>
   * Configuration for network endpoints.  If this is empty, then an endpoint
   * with the same name as the service is automatically generated to service all
   * defined APIs.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18;</code>
   */
  java.util.List<? extends EndpointOrBuilder>
      getEndpointsOrBuilderList();
  /**
   * <pre>
   * Configuration for network endpoints.  If this is empty, then an endpoint
   * with the same name as the service is automatically generated to service all
   * defined APIs.
   * </pre>
   *
   * <code>repeated .google.api.Endpoint endpoints = 18;</code>
   */
  EndpointOrBuilder getEndpointsOrBuilder(
      int index);

  /**
   * <pre>
   * Configuration for the service control plane.
   * </pre>
   *
   * <code>.google.api.Control control = 21;</code>
   */
  boolean hasControl();
  /**
   * <pre>
   * Configuration for the service control plane.
   * </pre>
   *
   * <code>.google.api.Control control = 21;</code>
   */
  Control getControl();
  /**
   * <pre>
   * Configuration for the service control plane.
   * </pre>
   *
   * <code>.google.api.Control control = 21;</code>
   */
  ControlOrBuilder getControlOrBuilder();

  /**
   * <pre>
   * Defines the logs used by this service.
   * </pre>
   *
   * <code>repeated .google.api.LogDescriptor logs = 23;</code>
   */
  java.util.List<LogDescriptor>
      getLogsList();
  /**
   * <pre>
   * Defines the logs used by this service.
   * </pre>
   *
   * <code>repeated .google.api.LogDescriptor logs = 23;</code>
   */
  LogDescriptor getLogs(int index);
  /**
   * <pre>
   * Defines the logs used by this service.
   * </pre>
   *
   * <code>repeated .google.api.LogDescriptor logs = 23;</code>
   */
  int getLogsCount();
  /**
   * <pre>
   * Defines the logs used by this service.
   * </pre>
   *
   * <code>repeated .google.api.LogDescriptor logs = 23;</code>
   */
  java.util.List<? extends LogDescriptorOrBuilder>
      getLogsOrBuilderList();
  /**
   * <pre>
   * Defines the logs used by this service.
   * </pre>
   *
   * <code>repeated .google.api.LogDescriptor logs = 23;</code>
   */
  LogDescriptorOrBuilder getLogsOrBuilder(
      int index);

  /**
   * <pre>
   * Defines the metrics used by this service.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metrics = 24;</code>
   */
  java.util.List<MetricDescriptor>
      getMetricsList();
  /**
   * <pre>
   * Defines the metrics used by this service.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metrics = 24;</code>
   */
  MetricDescriptor getMetrics(int index);
  /**
   * <pre>
   * Defines the metrics used by this service.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metrics = 24;</code>
   */
  int getMetricsCount();
  /**
   * <pre>
   * Defines the metrics used by this service.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metrics = 24;</code>
   */
  java.util.List<? extends MetricDescriptorOrBuilder>
      getMetricsOrBuilderList();
  /**
   * <pre>
   * Defines the metrics used by this service.
   * </pre>
   *
   * <code>repeated .google.api.MetricDescriptor metrics = 24;</code>
   */
  MetricDescriptorOrBuilder getMetricsOrBuilder(
      int index);

  /**
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25;</code>
   */
  java.util.List<MonitoredResourceDescriptor>
      getMonitoredResourcesList();
  /**
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25;</code>
   */
  MonitoredResourceDescriptor getMonitoredResources(int index);
  /**
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25;</code>
   */
  int getMonitoredResourcesCount();
  /**
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25;</code>
   */
  java.util.List<? extends MonitoredResourceDescriptorOrBuilder>
      getMonitoredResourcesOrBuilderList();
  /**
   * <pre>
   * Defines the monitored resources used by this service. This is required
   * by the [Service.monitoring][google.api.Service.monitoring] and [Service.logging][google.api.Service.logging] configurations.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor monitored_resources = 25;</code>
   */
  MonitoredResourceDescriptorOrBuilder getMonitoredResourcesOrBuilder(
      int index);

  /**
   * <pre>
   * Billing configuration.
   * </pre>
   *
   * <code>.google.api.Billing billing = 26;</code>
   */
  boolean hasBilling();
  /**
   * <pre>
   * Billing configuration.
   * </pre>
   *
   * <code>.google.api.Billing billing = 26;</code>
   */
  Billing getBilling();
  /**
   * <pre>
   * Billing configuration.
   * </pre>
   *
   * <code>.google.api.Billing billing = 26;</code>
   */
  BillingOrBuilder getBillingOrBuilder();

  /**
   * <pre>
   * Logging configuration.
   * </pre>
   *
   * <code>.google.api.Logging logging = 27;</code>
   */
  boolean hasLogging();
  /**
   * <pre>
   * Logging configuration.
   * </pre>
   *
   * <code>.google.api.Logging logging = 27;</code>
   */
  Logging getLogging();
  /**
   * <pre>
   * Logging configuration.
   * </pre>
   *
   * <code>.google.api.Logging logging = 27;</code>
   */
  LoggingOrBuilder getLoggingOrBuilder();

  /**
   * <pre>
   * Monitoring configuration.
   * </pre>
   *
   * <code>.google.api.Monitoring monitoring = 28;</code>
   */
  boolean hasMonitoring();
  /**
   * <pre>
   * Monitoring configuration.
   * </pre>
   *
   * <code>.google.api.Monitoring monitoring = 28;</code>
   */
  Monitoring getMonitoring();
  /**
   * <pre>
   * Monitoring configuration.
   * </pre>
   *
   * <code>.google.api.Monitoring monitoring = 28;</code>
   */
  MonitoringOrBuilder getMonitoringOrBuilder();

  /**
   * <pre>
   * System parameter configuration.
   * </pre>
   *
   * <code>.google.api.SystemParameters system_parameters = 29;</code>
   */
  boolean hasSystemParameters();
  /**
   * <pre>
   * System parameter configuration.
   * </pre>
   *
   * <code>.google.api.SystemParameters system_parameters = 29;</code>
   */
  SystemParameters getSystemParameters();
  /**
   * <pre>
   * System parameter configuration.
   * </pre>
   *
   * <code>.google.api.SystemParameters system_parameters = 29;</code>
   */
  SystemParametersOrBuilder getSystemParametersOrBuilder();

  /**
   * <pre>
   * Output only. The source information for this configuration if available.
   * </pre>
   *
   * <code>.google.api.SourceInfo source_info = 37;</code>
   */
  boolean hasSourceInfo();
  /**
   * <pre>
   * Output only. The source information for this configuration if available.
   * </pre>
   *
   * <code>.google.api.SourceInfo source_info = 37;</code>
   */
  SourceInfo getSourceInfo();
  /**
   * <pre>
   * Output only. The source information for this configuration if available.
   * </pre>
   *
   * <code>.google.api.SourceInfo source_info = 37;</code>
   */
  SourceInfoOrBuilder getSourceInfoOrBuilder();
}