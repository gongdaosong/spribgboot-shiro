package com.mall.demo2.service;

import com.mall.demo2.model.User;

public interface UserService {
    User findByUsername(String username);
}
