package com.liang.peng.blog.service.impl;

import com.liang.peng.blog.beans.BlogUserBeans;
import com.liang.peng.blog.mapper.UserMapper;
import com.liang.peng.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liangpeng
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public BlogUserBeans login(String userName, String password) {
        BlogUserBeans blogUser = new BlogUserBeans();
        blogUser.setUserName(userName);
        blogUser.setPwd(password);
        return userMapper.login(blogUser);
    }
}
