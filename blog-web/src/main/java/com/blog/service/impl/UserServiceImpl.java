/*
package com.blog.service.impl;

import com.blog.beans.BlogUserBeans;
import com.blog.mapper.UserMapper;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.List;

*/
/**
 * @author liangpeng
 *//*

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public BlogUserBeans login(String userName, String password) {
        BlogUserBeans blogUser = new BlogUserBeans();
        blogUser.setUserName(userName);
        blogUser.setPassword(password);
        return userMapper.login(blogUser);
    }

    */
/**
     * reids测试
     * @return
     *//*

    @Cacheable(value = "userList")
    @Override
    public List<BlogUserBeans> findUserInfoAll() {
        System.out.println("进入findUserInfoAll");
        return userMapper.findUserInfo();
    }


}
*/
