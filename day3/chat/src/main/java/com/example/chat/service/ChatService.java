package com.example.chat.service;

import com.example.chat.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class ChatService {

    private final ChatRepository chatRepository;

    @Autowired
    public ChatService(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

    public void save(String chat, HttpSession session) {
        chatRepository.save(chat, session);
    }

    public ArrayList<ArrayList<String>> msg() {
        return chatRepository.msg();
    }
}
