package com.liang.peng.blog.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangpeng
 */
@RequestMapping("user")
@RestController
public class UserController {

    @RequestMapping("/login/{name}/{password}")
    public String login(@PathVariable(name = "name") String userName, @PathVariable(name = "password") String password) {
        return "success,{userName:" + userName + ",password:" + password + "}";
    }

}
