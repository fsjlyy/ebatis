package com.ymm.ebatis.core.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 章多亮
 * @since 2020/1/2 16:37
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Metric {
    String name() default "";

    String fieldName() default "";

    MetricType type();

    String format() default "";
}