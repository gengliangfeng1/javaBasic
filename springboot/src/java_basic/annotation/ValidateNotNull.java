package java_basic.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 定义注解可以应用的目标为字段
@Target(ElementType.FIELD)
// 注解在运行时保留，可通过反射获取
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateNotNull {
    String message() default "该字段不能为空";
}