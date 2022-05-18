package com.tongjiaqian.controller;

import com.tongjiaqian.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserControl {
    @Autowired
    private Book book1;
    @GetMapping("/{id}")
    public String user(@PathVariable Integer id){
        System.out.println(book1);
        System.out.println("id==>"+id);
        return "SpringBoot QuickStart";
    }
}
