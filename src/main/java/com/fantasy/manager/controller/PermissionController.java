package com.fantasy.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @作者 hwangfantasy
 * @创建时间: 2017/6/30 <br/>
 * @方法描述: PermisionController. <br/>
 */
@Controller
@RequestMapping("/permission")
public class PermissionController extends AbstractController {
    @RequestMapping(value = "/showPermissionsPage")
    public String showPermissionsPage(){
        return "permissions";
    }
}
