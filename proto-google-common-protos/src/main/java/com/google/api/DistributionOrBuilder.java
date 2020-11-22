// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/distribution.proto

package com.google.api;

public interface DistributionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.Distribution)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of values in the population. Must be non-negative. This value
   * must equal the sum of the values in `bucket_counts` if a histogram is
   * provided.
   * </pre>
   *
   * <code>int64 count = 1;</code>
   */
  long getCount();

  /**
   * <pre>
   * The arithmetic mean of the values in the population. If `count` is zero
   * then this field must be zero.
   * </pre>
   *
   * <code>double mean = 2;</code>
   */
  double getMean();

  /**
   * <pre>
   * The sum of squared deviations from the mean of the values in the
   * population. For values x_i this is:
   *     Sum[i=1..n]((x_i - mean)^2)
   * Knuth, "The Art of Computer Programming", Vol. 2, page 323, 3rd edition
   * describes Welford's method for accumulating this sum in one pass.
   * If `count` is zero then this field must be zero.
   * </pre>
   *
   * <code>double sum_of_squared_deviation = 3;</code>
   */
  double getSumOfSquaredDeviation();

  /**
   * <pre>
   * If specified, contains the range of the population values. The field
   * must not be present if the `count` is zero.
   * </pre>
   *
   * <code>.google.api.Distribution.Range range = 4;</code>
   */
  boolean hasRange();
  /**
   * <pre>
   * If specified, contains the range of the population values. The field
   * must not be present if the `count` is zero.
   * </pre>
   *
   * <code>.google.api.Distribution.Range range = 4;</code>
   */
  Distribution.Range getRange();
  /**
   * <pre>
   * If specified, contains the range of the population values. The field
   * must not be present if the `count` is zero.
   * </pre>
   *
   * <code>.google.api.Distribution.Range range = 4;</code>
   */
  Distribution.RangeOrBuilder getRangeOrBuilder();

  /**
   * <pre>
   * Defines the histogram bucket boundaries. If the distribution does not
   * contain a histogram, then omit this field.
   * </pre>
   *
   * <code>.google.api.Distribution.BucketOptions bucket_options = 6;</code>
   */
  boolean hasBucketOptions();
  /**
   * <pre>
   * Defines the histogram bucket boundaries. If the distribution does not
   * contain a histogram, then omit this field.
   * </pre>
   *
   * <code>.google.api.Distribution.BucketOptions bucket_options = 6;</code>
   */
  Distribution.BucketOptions getBucketOptions();
  /**
   * <pre>
   * Defines the histogram bucket boundaries. If the distribution does not
   * contain a histogram, then omit this field.
   * </pre>
   *
   * <code>.google.api.Distribution.BucketOptions bucket_options = 6;</code>
   */
  Distribution.BucketOptionsOrBuilder getBucketOptionsOrBuilder();

  /**
   * <pre>
   * The number of values in each bucket of the histogram, as described in
   * `bucket_options`. If the distribution does not have a histogram, then omit
   * this field. If there is a histogram, then the sum of the values in
   * `bucket_counts` must equal the value in the `count` field of the
   * distribution.
   * If present, `bucket_counts` should contain N values, where N is the number
   * of buckets specified in `bucket_options`. If you supply fewer than N
   * values, the remaining values are assumed to be 0.
   * The order of the values in `bucket_counts` follows the bucket numbering
   * schemes described for the three bucket types. The first value must be the
   * count for the underflow bucket (number 0). The next N-2 values are the
   * counts for the finite buckets (number 1 through N-2). The N'th value in
   * `bucket_counts` is the count for the overflow bucket (number N-1).
   * </pre>
   *
   * <code>repeated int64 bucket_counts = 7;</code>
   */
  java.util.List<Long> getBucketCountsList();
  /**
   * <pre>
   * The number of values in each bucket of the histogram, as described in
   * `bucket_options`. If the distribution does not have a histogram, then omit
   * this field. If there is a histogram, then the sum of the values in
   * `bucket_counts` must equal the value in the `count` field of the
   * distribution.
   * If present, `bucket_counts` should contain N values, where N is the number
   * of buckets specified in `bucket_options`. If you supply fewer than N
   * values, the remaining values are assumed to be 0.
   * The order of the values in `bucket_counts` follows the bucket numbering
   * schemes described for the three bucket types. The first value must be the
   * count for the underflow bucket (number 0). The next N-2 values are the
   * counts for the finite buckets (number 1 through N-2). The N'th value in
   * `bucket_counts` is the count for the overflow bucket (number N-1).
   * </pre>
   *
   * <code>repeated int64 bucket_counts = 7;</code>
   */
  int getBucketCountsCount();
  /**
   * <pre>
   * The number of values in each bucket of the histogram, as described in
   * `bucket_options`. If the distribution does not have a histogram, then omit
   * this field. If there is a histogram, then the sum of the values in
   * `bucket_counts` must equal the value in the `count` field of the
   * distribution.
   * If present, `bucket_counts` should contain N values, where N is the number
   * of buckets specified in `bucket_options`. If you supply fewer than N
   * values, the remaining values are assumed to be 0.
   * The order of the values in `bucket_counts` follows the bucket numbering
   * schemes described for the three bucket types. The first value must be the
   * count for the underflow bucket (number 0). The next N-2 values are the
   * counts for the finite buckets (number 1 through N-2). The N'th value in
   * `bucket_counts` is the count for the overflow bucket (number N-1).
   * </pre>
   *
   * <code>repeated int64 bucket_counts = 7;</code>
   */
  long getBucketCounts(int index);

  /**
   * <pre>
   * Must be in increasing order of `value` field.
   * </pre>
   *
   * <code>repeated .google.api.Distribution.Exemplar exemplars = 10;</code>
   */
  java.util.List<Distribution.Exemplar>
      getExemplarsList();
  /**
   * <pre>
   * Must be in increasing order of `value` field.
   * </pre>
   *
   * <code>repeated .google.api.Distribution.Exemplar exemplars = 10;</code>
   */
  Distribution.Exemplar getExemplars(int index);
  /**
   * <pre>
   * Must be in increasing order of `value` field.
   * </pre>
   *
   * <code>repeated .google.api.Distribution.Exemplar exemplars = 10;</code>
   */
  int getExemplarsCount();
  /**
   * <pre>
   * Must be in increasing order of `value` field.
   * </pre>
   *
   * <code>repeated .google.api.Distribution.Exemplar exemplars = 10;</code>
   */
  java.util.List<? extends Distribution.ExemplarOrBuilder>
      getExemplarsOrBuilderList();
  /**
   * <pre>
   * Must be in increasing order of `value` field.
   * </pre>
   *
   * <code>repeated .google.api.Distribution.Exemplar exemplars = 10;</code>
   */
  Distribution.ExemplarOrBuilder getExemplarsOrBuilder(
      int index);
}