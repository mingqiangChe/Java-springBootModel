package com.text.demo.controller;


import com.text.demo.entity.User;
import com.text.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/abc")
    public Animal getName(){
        return new Animal("dog",12);
    }
    @RequestMapping("/abcd")
    public List<User> getUser(){
        return userService.findAll();
    }
}

