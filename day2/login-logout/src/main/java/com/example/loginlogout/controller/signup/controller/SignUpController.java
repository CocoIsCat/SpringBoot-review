package com.example.loginlogout.controller.signup.controller;

import com.example.loginlogout.dto.Member;
import com.example.loginlogout.service.signup.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {


    private final SignUp signUp;

    @Autowired
    public SignUpController(SignUp signUp) {
        this.signUp = signUp;
    }

    @PostMapping("/signup")
    public String signup(Member member) {
        signUp.join(member);
        return "index";
    }
}
