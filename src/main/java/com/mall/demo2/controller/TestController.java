package com.mall.demo2.controller;

import com.mall.demo2.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @Author 龚道松
 * @Date 2019/6/26 7:32
 * @Wersion 1.0
 **/

@Controller
public class TestController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/unauthorized")
    public String unauthorized() {
        return "unauthorized";
    }

    @RequestMapping("/edit")
    @ResponseBody
    public String edit() {
        return "edit success";
    }


    @RequestMapping("/logout")
    public String logour() {
        Subject subject = SecurityUtils.getSubject();
        if(subject !=null) {
            subject.logout();
        }
        return "login";
    }

    @RequestMapping("/admin")
    @ResponseBody
    public String admin() {
        return "admin success";
    }

    // 登录处理的接口
    @RequestMapping("/loginUser")
    public String loginUser(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            HttpSession session) {

        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        // shiro认证逻辑
        Subject subject = SecurityUtils.getSubject();
        // 认证逻辑可能会异常
        try {
            subject.login(token);
            User user = (User) subject.getPrincipal();
            session.setAttribute("user",user);
            return "index";
        } catch (Exception e) {
            return "login";
        }
    }
}
