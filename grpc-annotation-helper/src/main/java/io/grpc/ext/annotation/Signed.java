package io.grpc.ext.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import io.grpc.ext.annotation.meta.TypeQualifierNickname;
import io.grpc.ext.annotation.meta.When;

/**
 * Used to annotate a value of unknown sign.
 */
@Documented
@TypeQualifierNickname
@Nonnegative(when = When.UNKNOWN)
@Retention(RetentionPolicy.RUNTIME)
public @interface Signed {

}
