package com.blog.controller;

import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create by PengLiang on 2018/4/9 0009.
 */
@RestController
@RequestMapping("/cloud")
public class SpringCloudTestController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserInfoAll")
    public List<String> getUserInfoAll() {
        return userService.getUserInfoAll();
    }
}
