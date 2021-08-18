package com.text.demo.mapper;

import com.text.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper

public interface UserMapper {
    List<User> findAll();
}
