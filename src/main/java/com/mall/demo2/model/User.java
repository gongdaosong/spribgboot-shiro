package com.mall.demo2.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author 龚道松
 * @Date 2019/6/25 21:25
 * @Wersion 1.0
 **/
public class User {

    private Integer uid;
    private String username;
    private String password;
    private Set<Role> roles = new HashSet<Role>();

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
