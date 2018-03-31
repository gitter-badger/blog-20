package com.blog.mapper;

import com.blog.beans.BlogUserBeans;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liangpeng
 */
@Mapper
public interface UserMapper {

    /**
     * 用户登录
     * @param blogUser
     * @return
     */
    BlogUserBeans login(BlogUserBeans blogUser);

}
