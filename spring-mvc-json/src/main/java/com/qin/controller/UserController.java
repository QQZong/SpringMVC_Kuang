package com.qin.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qin.pojo.User;
import com.qin.utils.JsonUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController
public class UserController {
    @GetMapping("/j")
    /*不会走视图解析器，直接返回一个字符串*/
    //@ResponseBody
    public String json_1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("老秦",21,"男");
        String value = mapper.writeValueAsString(user);
        return value;
    }

    @GetMapping("/jj")
    /*不会走视图解析器，直接返回一个字符串*/
    //@ResponseBody
    public String json_2() throws JsonProcessingException {
        List<User> users = new ArrayList<>();
        User user = new User("老秦",21,"男");
        User user1 = new User("老秦",21,"男");
        User user2 = new User("老秦",21,"男");
        User user3 = new User("老秦",21,"男");
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return JsonUtils.getJson(users);
    }
    @GetMapping("/jjj")
    /*不会走视图解析器，直接返回一个字符串*/
    //@ResponseBody
    public String json_3() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getJson(date);
    }
    @GetMapping("/j4")
    /*不会走视图解析器，直接返回一个字符串*/
    //@ResponseBody
    public String json_4() throws JsonProcessingException {
        List<User> userList = new ArrayList<>();
        User user = new User("老秦",21,"男");
        User user1 = new User("老秦",22,"男");
        User user2 = new User("老秦",23,"男");
        User user3 = new User("老秦",24,"男");
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        return JSON.toJSONString(userList);
    }
}
