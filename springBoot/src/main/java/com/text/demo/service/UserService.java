package com.text.demo.service;

import com.text.demo.entity.User;
import com.text.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> findAll(){
        return userMapper.findAll();

    }
}
