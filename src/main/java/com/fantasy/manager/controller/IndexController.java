package com.fantasy.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @作者 hwangfantasy
 * @创建时间: 2017/5/27 <br/>
 * @方法描述: IndexController. <br/>
 */
@Controller
public class IndexController extends AbstractController {
    @RequestMapping(value = {"/index","/"})
    public String index(){
        return "index";
    }

}
