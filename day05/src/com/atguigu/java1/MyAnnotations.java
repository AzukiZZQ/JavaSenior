package com.atguigu.java1;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 *
 * @author shkstart
 * @create 2019 下午 2:41
 */
@Inherited//继承性
@Retention(RetentionPolicy.RUNTIME)//生命周期
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})//定义的注解用于描述什么
public @interface MyAnnotations {
    MyAnnotation[] value();
}
