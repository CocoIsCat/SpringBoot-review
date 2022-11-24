package com.example.loginlogout.controller.login.controller;

import com.example.loginlogout.dto.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.loginlogout.service.login.Login;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    private final Login login;

    @Autowired
    public LoginController(Login login) {
        this.login = login;
    }

    @PostMapping("/login")
    public String login(HttpSession session, Member member) {
        login.login(member, session);
        System.out.println(String.valueOf(session.getAttribute("email")));
        return "index";
    }
}
