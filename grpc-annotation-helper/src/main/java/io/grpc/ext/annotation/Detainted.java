package io.grpc.ext.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import io.grpc.ext.annotation.meta.TypeQualifierNickname;
import io.grpc.ext.annotation.meta.When;

@Documented
@TypeQualifierNickname
@Untainted(when = When.ALWAYS)
@Retention(RetentionPolicy.RUNTIME)
public @interface Detainted {

}
