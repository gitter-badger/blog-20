package com.blog.service;

import com.blog.beans.BlogUserBeans;

/**
 * @author pengliang
 */
public interface UserService {

    BlogUserBeans login(String userName, String password);

}
