package com.liang.peng.blog.controller;

import com.liang.peng.blog.beans.BlogUserBeans;
import com.liang.peng.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangpeng
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login/{name}/{password}")
    public BlogUserBeans login(@PathVariable(name = "name") String userName, @PathVariable(name = "password") String password) {

        return  userService.login(userName,password);
    }

}
