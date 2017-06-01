package com.fantasy.manager.common;

import org.apache.commons.lang3.StringUtils;

/**
 * @作者 hwangfantasy
 * @创建时间: 2017/5/27 <br/>
 * @方法描述: Assert. <br/>
 */

public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new CustomException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new CustomException(message);
        }
    }
}
