package com.blog.service.impl;

import com.blog.beans.BlogUserBeans;
import com.blog.mapper.UserMapper;
import com.blog.service.UserService;
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
        blogUser.setPassword(password);
        return userMapper.login(blogUser);
    }

    @Override
    public int insertBlogUserMaster(BlogUserBeans blogUserBeans) {
        return 0;
    }
}
