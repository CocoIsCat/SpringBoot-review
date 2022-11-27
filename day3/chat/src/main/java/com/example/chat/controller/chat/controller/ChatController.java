package com.example.chat.controller.chat.controller;

import com.example.chat.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@RestController
public class ChatController {

    private final ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/chat/sendMsg")
    public void sendMsg(String msg, HttpSession session) {
        System.out.println(msg);
        chatService.save(msg,session);
    }
    @GetMapping("/chat/getMsg")
    public ArrayList<ArrayList<String>> msg() {
        return chatService.msg();
    }
}
