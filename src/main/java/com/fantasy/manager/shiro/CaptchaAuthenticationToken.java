package com.fantasy.manager.shiro;

import org.apache.shiro.authc.UsernamePasswordToken;

/**
 * @作者 hwangfantasy
 * @创建时间: 2017/6/2 <br/>
 * @方法描述: CaptchaAuthenticationToken. <br/>
 */

public class CaptchaAuthenticationToken extends UsernamePasswordToken {
    private String captcha;

    public CaptchaAuthenticationToken(){}

    public CaptchaAuthenticationToken(String username, String password,
                                      boolean rememberMe, String host, String captcha) {
        super(username, password, rememberMe, host);
        this.captcha = captcha;
    }

    public void setCaptcha(String captcha){
        this.captcha= captcha;
    }

    public String getCaptcha(){
        return this.captcha;
    }
}
