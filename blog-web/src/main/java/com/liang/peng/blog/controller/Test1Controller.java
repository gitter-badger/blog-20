package com.liang.peng.blog.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author liangpeng
 */
@RequestMapping("/test1")
@Controller
public class Test1Controller {

    @RequestMapping("/index")
    public String index(String txt, Model model, HttpServletRequest request,HttpSession session){
        model.addAttribute("txt","访问成功："+txt);
        request.setAttribute("txt2","HttpServletRequest");
        request.getSession().setAttribute("txt4","HttpServletRequest,session");
        session.setAttribute("txt3","HttpSession");
        return "index";
    }
}
