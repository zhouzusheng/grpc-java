package io.grpc.ext.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import io.grpc.ext.annotation.meta.TypeQualifier;
import io.grpc.ext.annotation.meta.When;

@Documented
@TypeQualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface PropertyKey {
    When when() default When.ALWAYS;
}
