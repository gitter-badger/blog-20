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
    @Value("${com.liang.peng.blog.num}")
    private String randomNum;
    @Value("${com.liang.peng.blog.uuid}")
    private String uuid;
    @Value("${com.liang.peng.blog.desc}")
    private String desc;
    @Value("${com.liang.peng.blog.randomstr}")
    private String randomStr;

    public String getRandomStr() {
        return randomStr;
    }

    public void setRandomStr(String randomStr) {
        this.randomStr = randomStr;
    }

    public String getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(String randomNum) {
        this.randomNum = randomNum;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

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
