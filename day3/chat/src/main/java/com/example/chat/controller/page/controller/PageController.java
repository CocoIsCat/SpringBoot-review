package com.example.chat.controller.page.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.chat.service.LoginService;
import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    private final LoginService loginservice;

    @Autowired
    public PageController(LoginService loginservice) {
        this.loginservice = loginservice;
    }


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/goMain")
    public String goMain(String nickName, HttpSession session) {
        if (loginservice.login(nickName, session)) {
            return "main";
        }
        else
            return "index";
    }
}
