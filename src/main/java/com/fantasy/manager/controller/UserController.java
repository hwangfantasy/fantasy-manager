package com.fantasy.manager.controller;

import com.fantasy.manager.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @作者 yunfeiyang
 * @创建时间: 2017/5/27 <br/>
 * @方法描述: UserController. <br/>
 */
@Controller
@RequestMapping("/user")
public class UserController extends AbstractController {
    @Autowired
    private SysUserService userService;

    @RequestMapping(value = "/findUser/{id}")
    @ResponseBody
    public String findUserName(@PathVariable Integer id){
        return userService.findSysUserById(id).getUsername();
    }

    @RequestMapping("/createUser")
    @ResponseBody
    public String createUser(@RequestParam String username,@RequestParam String password){
        if(userService.createUser(username, password))
            return "user create success";
        return "user create failure";
    }
}
