package com.example.chat.service;

import com.example.chat.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class LoginService {

    private final MemberRepository memberRepository;

    @Autowired
    public LoginService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public boolean login(String nickName, HttpSession session) {
        if(memberRepository.save(nickName)) {
            session.setAttribute("nickName", nickName);
            return true;
        }
        else
            return false;
    }
}
