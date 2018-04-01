package com.blog.handler.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.http.HttpServletRequest;

/**
 * Create by PengLiang on 2018/4/1 0001.
 * <p>
 * 这是一个全局的异常类
 * <p>
 * 在SpringBoot中如果出现异常默认会被影视到/error上，
 * 在实际开发中对用户来说并不够友好，我们通常需要去实现我们自己的异常提示。
 *
 * @ControllerAdvice 是Spring3.2提供的，标记为全局异常类
 * @ExceptionHandler 在什么异常情况下触发
 */
@ControllerAdvice
@EnableWebMvc
public class GlobalExceptionHandler {
    public static final String DEFAULT_ERROR_VIEW = "error/error";

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }
}
