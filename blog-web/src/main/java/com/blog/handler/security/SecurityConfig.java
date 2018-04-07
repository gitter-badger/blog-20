/*
package com.blog.handler.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import javax.sql.DataSource;

*/
/**
 * Create by PengLiang on 2018/4/2 0002.
 *//*

*/
/*@Configuration
@EnableWebSecurity*//*

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    */
/**
     * 配置security的filter链
     *
     * @param web
     * @throws Exception
     *//*

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    */
/**
     * 配置如何通过拦截器保护请求
     *
     * @param http
     * @throws Exception
     *//*

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
    }

    */
/**
     * 配置user-detail服务
     *
     * @param auth
     * @throws Exception
     *//*

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    */
/*    auth.
                //表示在内存中存储
                        inMemoryAuthentication()
                //写入一个用户名和密码，roles是authorities的简写,roles默认前缀ROLE
                .withUser("user").password("123456").roles("USER").and()
                .withUser("admin").password("admin").roles("USER", "ADMIN");*//*

        */
/**
         * 一般上面这种方式使用与调试或固定用户的情景，
         * 在实际开发中一般，会将用户保存到数据库中
         *//*

        //获取用户名密码及是否启用信息
        String userSQL = "SELECT user_name as username,password,true FROM blog_user where user_name=?";
        String authortiesSQL = "SELECT user_name as username,'ROLE_USER' FROM blog_user where user_name=?";
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery(userSQL)
                .authoritiesByUsernameQuery(authortiesSQL)
                .passwordEncoder(new StandardPasswordEncoder("53cr3t"));
    }
}
*/
