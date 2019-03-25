package com.itheima.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("FirstController方法执行了...");
        ModelAndView mv = new ModelAndView();
        //物理视图
//        mv.setViewName("/WEB-INF/pages/success.jsp");
        //逻辑视图
        mv.setViewName("success");
        return mv;
    }
}
