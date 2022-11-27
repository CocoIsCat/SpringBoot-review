package com.example.chat.repository;

import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@Repository
public class ChatRepository {
    ArrayList<ArrayList<String>> storage = new ArrayList<>();

    public void save(String ch, HttpSession session) {
        ArrayList<String> chat = new ArrayList<>();

        String nickName = String.valueOf(session.getAttribute("nickName"));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        chat.add(nickName);
        chat.add(ch);
        chat.add(dtf.format(now));

        storage.add(chat);
    }

    public ArrayList<ArrayList<String>> msg() {
        return storage;
    }
}
