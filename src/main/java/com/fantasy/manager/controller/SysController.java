package com.fantasy.manager.controller;

import com.fantasy.manager.common.IncorrectCaptchaException;
import com.fantasy.manager.service.LogService;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @作者 hwangfantasy
 * @创建时间: 2017/5/27 <br/>
 * @方法描述: SysController. <br/>
 */
@Controller
public class SysController extends AbstractController {

    @Autowired
    private LogService logService;

    @RequestMapping(value = {"/index","/"})
    public String index(){
        return "index";
    }

    @RequestMapping(value = {"/404"})
    public String show404Page(){
        return "404";
    }

    @RequestMapping(value = {"/500"})
    public String show500Page(){
        return "500";
    }

    @RequestMapping(value = "/showMainPage")
    public String showMainPage(){
        return "main";
    }

    @RequestMapping(value = "/showLogsPage")
    public String showLogsPage(Model model){
        model.addAttribute("logs",logService.findAllSysLogs());
        return "logs";
    }

    @RequestMapping(value = {"/login"})
    public String login(HttpServletRequest req, Model model) {
        Exception exception = (Exception) req.getAttribute("shiroLoginFailure");
        String exceptionClassName = exception == null ? null : exception.getClass().getName();
        String error = null;
        if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if (IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
            error = "用户名/密码错误";
        } else if (IncorrectCaptchaException.class.getName().equals(exceptionClassName)) {
            error = "验证码错误";
        }else if (exceptionClassName != null) {
            error = "其他错误：" + exceptionClassName+","+exception.getMessage();
        }
        model.addAttribute("error", error);
        return "login";
    }
}
