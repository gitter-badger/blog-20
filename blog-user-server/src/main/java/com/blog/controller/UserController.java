package com.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by PengLiang on 2018/4/9 0009.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getUserInfoAll")
    public List<String> getUserInfoAll() {
        return new ArrayList<String>() {{
            add("张三");
            add("李四");
            add("王五");
            add("赵六");
        }};
    }
}
