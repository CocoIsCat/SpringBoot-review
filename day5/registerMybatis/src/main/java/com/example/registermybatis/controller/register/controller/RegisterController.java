package com.example.registermybatis.controller.register.controller;

import com.example.registermybatis.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @PostMapping("/signup")
    public String signUp(Member member) {

        System.out.println(member.toString());
        return "index";
    }
}
