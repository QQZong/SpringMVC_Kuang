package com.qin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/to")
    public String test(Model model){
        String s = "你好。注解开发的SpringMVC";
        model.addAttribute("msg",s);
        return "test";
    }

    /*RestFul风格传参*/
    @RequestMapping("/to/{a}/{b}")
    public String testRestFul(@PathVariable int a, @PathVariable int b, Model model){
        String s = "你好。注解开发的SpringMVC";
        int result = a+b;
        model.addAttribute("msg",s+" "+result);
        return "test";
    }
}
