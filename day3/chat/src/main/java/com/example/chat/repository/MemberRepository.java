package com.example.chat.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class MemberRepository {

    ArrayList<String> member = new ArrayList<>();

    public boolean save(String nickName) {
        if (!member.contains(nickName)) {
            member.add(nickName);
            return true;
        } else {
            return false;
        }
    }
}
