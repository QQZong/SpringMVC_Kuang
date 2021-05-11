package com.qin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/t")
    public String hello(String name,String pwd){
        String message = "";
        if (name!=null){
            if ("admin".equals(name)){
                message = "OK";
            }else {
                message = "ERROR";
            }
        }
        if (pwd!=null){
            if ("1234".equals(pwd)){
                message = "RIGHT";
            }else {
                message = "ERROR";
            }
        }
        return message;
    }
}
