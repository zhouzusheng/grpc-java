// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/quota.proto

package com.google.api;

public interface MetricRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.MetricRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  String getSelector();
  /**
   * <pre>
   * Selects the methods to which this rule applies.
   * Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  com.google.protobuf.ByteString
      getSelectorBytes();

  /**
   * <pre>
   * Metrics to update when the selected methods are called, and the associated
   * cost applied to each metric.
   * The key of the map is the metric name, and the values are the amount
   * increased for the metric against which the quota limits are defined.
   * The value must not be negative.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
   */
  int getMetricCostsCount();
  /**
   * <pre>
   * Metrics to update when the selected methods are called, and the associated
   * cost applied to each metric.
   * The key of the map is the metric name, and the values are the amount
   * increased for the metric against which the quota limits are defined.
   * The value must not be negative.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
   */
  boolean containsMetricCosts(
      String key);
  /**
   * Use {@link #getMetricCostsMap()} instead.
   */
  @Deprecated
  java.util.Map<String, Long>
  getMetricCosts();
  /**
   * <pre>
   * Metrics to update when the selected methods are called, and the associated
   * cost applied to each metric.
   * The key of the map is the metric name, and the values are the amount
   * increased for the metric against which the quota limits are defined.
   * The value must not be negative.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
   */
  java.util.Map<String, Long>
  getMetricCostsMap();
  /**
   * <pre>
   * Metrics to update when the selected methods are called, and the associated
   * cost applied to each metric.
   * The key of the map is the metric name, and the values are the amount
   * increased for the metric against which the quota limits are defined.
   * The value must not be negative.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
   */

  long getMetricCostsOrDefault(
      String key,
      long defaultValue);
  /**
   * <pre>
   * Metrics to update when the selected methods are called, and the associated
   * cost applied to each metric.
   * The key of the map is the metric name, and the values are the amount
   * increased for the metric against which the quota limits are defined.
   * The value must not be negative.
   * </pre>
   *
   * <code>map&lt;string, int64&gt; metric_costs = 2;</code>
   */

  long getMetricCostsOrThrow(
      String key);
}