package com.liang.peng.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liangpeng
 */
@RequestMapping("/test1")
@Controller
public class Test1Controller {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
