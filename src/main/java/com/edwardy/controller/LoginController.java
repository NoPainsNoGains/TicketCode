package com.edwardy.controller;

import com.edwardy.TicketApplication;
import com.edwardy.po.User;
import com.edwardy.service.LoginService;
import com.edwardy.service.service.impl.LoginServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yuminghua on 2/12/18.
 */

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@Controller
public class LoginController {
    public static void main(String[] args) {
        SpringApplication.run(LoginController.class, args);
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login(){
        LoginService loginService = new LoginServiceImpl();
        User user = loginService.LoginService("YMH","1234");
        System.out.println("UserName"+user.getName()+"  PassWord:"+user.getTelPhone());
        return "ymh";
    }
}
