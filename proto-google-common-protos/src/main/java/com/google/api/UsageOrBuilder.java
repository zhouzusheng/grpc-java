// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/usage.proto

package com.google.api;

public interface UsageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Usage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Requirements that must be satisfied before a consumer project can use the
   * service. Each requirement is of the form &lt;service.name&gt;/&lt;requirement-id&gt;;
   * for example 'serviceusage.googleapis.com/billing-enabled'.
   * </pre>
   *
   * <code>repeated string requirements = 1;</code>
   */
  java.util.List<String>
      getRequirementsList();
  /**
   * <pre>
   * Requirements that must be satisfied before a consumer project can use the
   * service. Each requirement is of the form &lt;service.name&gt;/&lt;requirement-id&gt;;
   * for example 'serviceusage.googleapis.com/billing-enabled'.
   * </pre>
   *
   * <code>repeated string requirements = 1;</code>
   */
  int getRequirementsCount();
  /**
   * <pre>
   * Requirements that must be satisfied before a consumer project can use the
   * service. Each requirement is of the form &lt;service.name&gt;/&lt;requirement-id&gt;;
   * for example 'serviceusage.googleapis.com/billing-enabled'.
   * </pre>
   *
   * <code>repeated string requirements = 1;</code>
   */
  String getRequirements(int index);
  /**
   * <pre>
   * Requirements that must be satisfied before a consumer project can use the
   * service. Each requirement is of the form &lt;service.name&gt;/&lt;requirement-id&gt;;
   * for example 'serviceusage.googleapis.com/billing-enabled'.
   * </pre>
   *
   * <code>repeated string requirements = 1;</code>
   */
  com.google.protobuf.ByteString
      getRequirementsBytes(int index);

  /**
   * <pre>
   * A list of usage rules that apply to individual API methods.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.UsageRule rules = 6;</code>
   */
  java.util.List<UsageRule>
      getRulesList();
  /**
   * <pre>
   * A list of usage rules that apply to individual API methods.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.UsageRule rules = 6;</code>
   */
  UsageRule getRules(int index);
  /**
   * <pre>
   * A list of usage rules that apply to individual API methods.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.UsageRule rules = 6;</code>
   */
  int getRulesCount();
  /**
   * <pre>
   * A list of usage rules that apply to individual API methods.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.UsageRule rules = 6;</code>
   */
  java.util.List<? extends UsageRuleOrBuilder>
      getRulesOrBuilderList();
  /**
   * <pre>
   * A list of usage rules that apply to individual API methods.
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * </pre>
   *
   * <code>repeated .google.api.UsageRule rules = 6;</code>
   */
  UsageRuleOrBuilder getRulesOrBuilder(
      int index);

  /**
   * <pre>
   * The full resource name of a channel used for sending notifications to the
   * service producer.
   * Google Service Management currently only supports
   * [Google Cloud Pub/Sub](https://cloud.google.com/pubsub) as a notification
   * channel. To use Google Cloud Pub/Sub as the channel, this must be the name
   * of a Cloud Pub/Sub topic that uses the Cloud Pub/Sub topic name format
   * documented in https://cloud.google.com/pubsub/docs/overview.
   * </pre>
   *
   * <code>string producer_notification_channel = 7;</code>
   */
  String getProducerNotificationChannel();
  /**
   * <pre>
   * The full resource name of a channel used for sending notifications to the
   * service producer.
   * Google Service Management currently only supports
   * [Google Cloud Pub/Sub](https://cloud.google.com/pubsub) as a notification
   * channel. To use Google Cloud Pub/Sub as the channel, this must be the name
   * of a Cloud Pub/Sub topic that uses the Cloud Pub/Sub topic name format
   * documented in https://cloud.google.com/pubsub/docs/overview.
   * </pre>
   *
   * <code>string producer_notification_channel = 7;</code>
   */
  com.google.protobuf.ByteString
      getProducerNotificationChannelBytes();
}
