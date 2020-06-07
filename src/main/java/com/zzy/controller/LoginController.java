package com.zzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description : 登录控制器
 *
 * @author : zhouzhenyu
 * @date : 2020/5/8 9:47
 **/
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping
    @ResponseBody
    public String login(String username,String password){
        if ("aaaa".equals(username) && "bbbb".equals(password)) {
            System.out.println("登录成功");
        }
        return "登录成功";
//        return "{'sdf':'asgas'}";
    }

}
