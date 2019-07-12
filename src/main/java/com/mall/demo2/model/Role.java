package com.mall.demo2.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author 龚道松
 * @Date 2019/6/25 21:26
 * @Wersion 1.0
 **/
public class Role {

    private Integer rid;
    private String rname;
    private Set<Permission> permissions = new HashSet<Permission>();
    private Set<User> users = new HashSet<User>();

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }
    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }
}
