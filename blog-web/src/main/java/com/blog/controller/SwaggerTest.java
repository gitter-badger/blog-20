package com.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by PengLiang on 2018/4/11 0011.
 */
@RestController
public class SwaggerTest {


    @GetMapping("/getName")
    public String getName(String name){
        return "你好："+name;
    }
}
