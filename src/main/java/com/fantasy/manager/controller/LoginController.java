package com.fantasy.manager.controller;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @作者 yunfeiyang
 * @创建时间: 2017/6/2 <br/>
 * @方法描述: LoginController. <br/>
 */
@Controller
public class LoginController extends AbstractController {

    @RequestMapping(value = {"/login"})
    public String showLoginForm(HttpServletRequest req, Model model) {
        String exceptionClassName = (String) req.getAttribute("shiroLoginFailure");
        String error = null;
        if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if (IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if (exceptionClassName != null) {
            error = "其他错误：" + exceptionClassName;
        }
        model.addAttribute("error", error);
        return "login";
    }
}
