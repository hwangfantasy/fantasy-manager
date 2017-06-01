package com.fantasy.manager.annotation;

import java.lang.annotation.*;

/**
 * @作者 hwangfantasy
 * @创建时间: 2017/5/31 <br/>
 * @方法描述: SysLog. <br/>
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OperationLog {
    String value() default "";
}
