package com.fantasy.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @作者 yunfeiyang
 * @创建时间: 2017/6/2 <br/>
 * @方法描述: LoginController. <br/>
 */
@Controller
public class LoginController extends AbstractController {

    @RequestMapping(value = {"/","/login"})
    public String login(){
        return "login";
    }
}
