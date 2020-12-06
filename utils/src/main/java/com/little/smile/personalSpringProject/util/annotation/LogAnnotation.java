/*
 * this is little boy's personal project,right received by yj6326076@hotmail.com from 2020 to 2020
 */

package com.little.smile.personalSpringProject.util.annotation;

import com.little.smile.personalSpringProject.util.base.LogRepository;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

/**
 * LogAnnotation
 *
 * @author yj6326076
 * @since 2020-12-07
 */
@Inherited
@Target(value = {ElementType.METHOD})
public @interface LogAnnotation {
    String value() default "";
    Class repository() default String.class;
}
