package com.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author liangpeng
 */
@ApiModel(value = "对象",description = "用户对象")
public class User {
    @ApiModelProperty(value="用户名",name="userName",dataType = "string",example="xxx")
    private String userName;
    @ApiModelProperty(value="密码",name="password",dataType = "string",required=true,example="xxx")
    private String password;
    @ApiModelProperty(value="身份证",name="numId",hidden = true)
    private String numId;
    private int phone;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
