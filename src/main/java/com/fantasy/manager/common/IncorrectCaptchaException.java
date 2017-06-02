package com.fantasy.manager.common;

import org.apache.shiro.authc.AuthenticationException;

/**
 * @作者 yunfeiyang
 * @创建时间: 2017/6/2 <br/>
 * @方法描述: IncorrectCaptchaException. <br/>
 */

public class IncorrectCaptchaException extends AuthenticationException {

    public IncorrectCaptchaException() {
        super();
    }

    public IncorrectCaptchaException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectCaptchaException(String message) {
        super(message);
    }

    public IncorrectCaptchaException(Throwable cause) {
        super(cause);
    }
}
