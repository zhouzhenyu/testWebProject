package com.zzy.controller;

import com.zzy.domain.Customer;
import com.zzy.service.impl.LoginServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * description : 登录控制器
 *
 * @author : zhouzhenyu
 * @date : 2020/5/8 9:47
 **/
@Controller
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginServiceImpl loginService;

    @RequestMapping
    @ResponseBody
    public String login(String username,String password){
        if ("aaaa".equals(username) && "bbbb".equals(password)) {
            System.out.println("登录成功");
        }
        return "登录成功";
//        return "{'sdf':'asgas'}";
    }

    @RequestMapping("/query")
    public String query(String username, String password, Model model){
        List<Customer> list = loginService.query(username,password);
        model.addAttribute("m",list);
        return "page";
    }



}
