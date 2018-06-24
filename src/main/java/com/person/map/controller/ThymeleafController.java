package com.person.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.person.map.bean.Author;

@Controller
@RequestMapping
public class ThymeleafController {
	
    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView();
        // 设置跳转的视图 默认映射到 src/main/resources/templates/{viewName}.html
        view.setViewName("index");
        // 设置属性
        view.addObject("title", "我的第一个WEB页面");
        view.addObject("desc", "欢迎进入Luis-web 系统");
        Author author = new Author();
        author.setAge(24);
        author.setEmail("1085143002@qq.com");
        author.setName("Luis");
        view.addObject("author", author);
        
        
        
        return view;
    }

}
