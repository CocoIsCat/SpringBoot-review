package com.example.registermybatis.controller.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/goSignUp")
    public String signup() {
        return "signup";
    }
}
