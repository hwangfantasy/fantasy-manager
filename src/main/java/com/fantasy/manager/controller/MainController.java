package com.fantasy.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @作者 yunfeiyang
 * @创建时间: 2017/6/30 <br/>
 * @方法描述: MainController. <br/>
 */
@Controller
@RequestMapping("/main")
public class MainController extends AbstractController {
    @RequestMapping(value = "/showMainPage")
    public String showUsersList(){
        return "main";
    }
}
