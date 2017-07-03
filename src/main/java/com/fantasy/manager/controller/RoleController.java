package com.fantasy.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @作者 yunfeiyang
 * @创建时间: 2017/6/30 <br/>
 * @方法描述: RoleController. <br/>
 */
@Controller
@RequestMapping("/role")
public class RoleController extends AbstractController{

    @RequestMapping(value = "/showRolesPage")
    public String showUsersList(){
        return "roles";
    }
}
