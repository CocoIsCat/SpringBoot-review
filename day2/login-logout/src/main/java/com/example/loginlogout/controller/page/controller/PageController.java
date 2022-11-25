package com.example.loginlogout.controller.page.controller;

import com.example.loginlogout.service.login.Login;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    private final Login login;

    @Autowired
    public PageController(Login login) {
        this.login = login;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/goSignUp")
    public String goSignup() {
        return "signup";
    }

    @GetMapping("/goLogin")
    public String goLogin() {
        return "login";
    }

    @GetMapping("/members")
    public String goMembers(HttpSession session) {
        if(login.checkLogin(session)) {
            return "index";
        }
        else
            return "login";
    }
}
