package com.blog.handler.security;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Create by PengLiang on 2018/4/2 0002.
 * spring security密码转换器
 */
public class BlogPasswordEncoder implements PasswordEncoder{
    @Override
    public String encode(CharSequence rawPassword) {
        return null;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return false;
    }
}
