package io.grpc.ext.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import io.grpc.ext.annotation.meta.TypeQualifier;
import io.grpc.ext.annotation.meta.TypeQualifierValidator;
import io.grpc.ext.annotation.meta.When;

/**
 * The annotated element must not be null.
 * <p>
 * Annotated fields must not be null after construction has completed.
 * <p>
 * When this annotation is applied to a method it applies to the method return value.
 */
@Documented
@TypeQualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Nonnull {
    When when() default When.ALWAYS;

    class Checker implements TypeQualifierValidator<Nonnull> {

        public When forConstantValue(Nonnull qualifierArgument, Object value) {
            if (value == null)
                return When.NEVER;
            return When.ALWAYS;
        }
    }
}
