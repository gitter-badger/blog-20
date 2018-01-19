package com.liang.peng.blog.mapper;

import com.liang.peng.blog.beans.BlogUserBeans;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liangpeng
 */
@Mapper
public interface UserMapper {

    BlogUserBeans login(BlogUserBeans blogUser);

}
