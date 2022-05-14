package com.tongjiaqian.controller;

import com.tongjiaqian.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    //最基本
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        String str = "{'基本':'操作'}";
        return str;
    }
    //实体类的集合Json
    @RequestMapping("/pojoListJson")
    @ResponseBody
    public String pojoListJson(@RequestBody List<User> user){
        System.out.println(user);
        String str = "{'任务':'集合实体json'}";
        return str;
    }
    //实体类单个Json
    @RequestMapping("/pojoJson")
    @ResponseBody
    public String pojoJson(@RequestBody User user){
        System.out.println(user);
        String str = "{'任务':'单个实体json'}";
        return str;
    }
    //Json集合
    @RequestMapping("/arrayJson")
    @ResponseBody
    public String arrayJson(@RequestBody List<String> user){
        System.out.println(user);
        String str = "{'任务':'单个实体json'}";
        return str;
    }
    //日期形式
    @RequestMapping("/date")
    @ResponseBody
    public String date(Date date,@DateTimeFormat(pattern = "yyyy-mm-dd")Date date1){
        System.out.println("date==>"+date);
        System.out.println("date1==>"+date1);
        String str = "{'任务':'测试日期'}";
        return str;
    }
    //实体类测试
    @RequestMapping("/pojo")
    @ResponseBody
    public User pojo(){
        User user = new User();
        user.setName("yz");
        user.setAge(18);
        return user;
    }
    //集合实体类测试
    @RequestMapping("/pojoList")
    @ResponseBody
    public List<User> pojoList(){
        List<User> userList = new ArrayList<User>();
        User user = new User();
        user.setName("yz");
        user.setAge(18);
        User user1 = new User();
        user1.setName("cyf");
        user1.setAge(19);
        userList.add(user);
        userList.add(user1);
        return userList;
    }


}
