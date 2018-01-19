package com.liang.peng.blog.service;

import com.liang.peng.blog.beans.BlogUserBeans;

/**
 * @author pengliang
 */
public interface UserService {

    BlogUserBeans login(String userName, String password);

}
