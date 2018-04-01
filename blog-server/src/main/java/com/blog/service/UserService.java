package com.blog.service;

import com.blog.beans.BlogUserBeans;

import java.util.List;

/**
 * @author pengliang
 */
public interface UserService {

    BlogUserBeans login(String userName, String password);


    List<BlogUserBeans> findUserInfoAll();
}
