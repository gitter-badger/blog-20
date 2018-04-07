/*
package com.blog.controller;

import com.blog.bean.BlogProperties;
import com.blog.bean.User;
import com.blog.beans.BlogUserBeans;
import com.blog.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

*/
/**
 * @author liangpeng
 *//*

@RequestMapping("/user")
@RestController
@Api(description = "用户信息操作")
//@ApiIgnore
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BlogProperties blogProperties;

    @ApiOperation(value = "用户登陆")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String")
    })
    @RequestMapping(value = "/login/{name}/{password}", method = {RequestMethod.GET, RequestMethod.POST})
    public BlogUserBeans login(@PathVariable(name = "name") String userName, @PathVariable(name = "password") String password) {

        return userService.login(userName, password);
    }

    @ApiOperation(value = "SpringBoot属性文件测试")
    @RequestMapping(value = "/getProperties", method = {RequestMethod.GET, RequestMethod.POST})
    public BlogProperties getProperties() {
        return blogProperties;
    }

    @ApiOperation("获取用户信息.")
    @RequestMapping(value = "/getUserInfo", method = {RequestMethod.GET, RequestMethod.POST})
    @ApiIgnore
    public String getUserInfo(@RequestParam @ApiParam(name = "userName", value = "用户姓名", required = true) String userName) {
        return "{userName:" + userName + "}";
    }


    @ApiOperation("添加用户")
    @ApiParam(required=true,value = "用户对象",name = "user")
    @RequestMapping(value = "/insertUser", method = {RequestMethod.POST})
    public User insertUser( User user) {
        return user;
    }

    @ApiOperation("获取所用用户信息")
    @RequestMapping("/info")
    public List<BlogUserBeans> getUserInfo(){
       return userService.findUserInfoAll();
    }

}
*/
