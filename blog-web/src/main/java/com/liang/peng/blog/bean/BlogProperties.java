package com.liang.peng.blog.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author liangpeng
 */
@Component
public class BlogProperties {

    @Value("${com.liang.peng.blog.name}")
    private String name;
    @Value("${com.liang.peng.blog.content}")
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
