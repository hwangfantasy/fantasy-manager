package com.fantasy.manager.shiro;

import org.apache.shiro.session.SessionException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.LogoutFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @作者 hwangfantasy
 * @创建时间: 2017/7/3 <br/>
 * @方法描述: SystemLogoutFilter. <br/>
 */

public class SystemLogoutFilter extends LogoutFilter {
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        // todo 执行退出系统前需要清空的数据
        Subject subject = getSubject(request, response);
        String redirectUrl = getRedirectUrl(request, response, subject);
        try {
            subject.logout();
        } catch (SessionException ise) {
            ise.printStackTrace();
        }
        issueRedirect(request, response, redirectUrl);
        // 返回false表示不执行后续的过滤器，直接返回跳转到登录页面
        return false;
    }
}

