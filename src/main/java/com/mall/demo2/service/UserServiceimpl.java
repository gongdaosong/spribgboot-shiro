package com.mall.demo2.service;

import com.mall.demo2.mapper.UserMapper;
import com.mall.demo2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 龚道松
 * @Date 2019/6/25 21:45
 * @Wersion 1.0
 **/
@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
