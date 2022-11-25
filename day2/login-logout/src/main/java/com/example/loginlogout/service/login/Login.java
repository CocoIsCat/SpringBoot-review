package com.example.loginlogout.service.login;

import com.example.loginlogout.dto.Member;
import com.example.loginlogout.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class Login {

    private final MemberRepository memberRepository;

    @Autowired
    public Login(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public boolean login(Member member, HttpSession session) {
        if (memberRepository.findId(member.getEmail()).get().getPassword().equals(member.getPassword())) {
            addSession(session, member);
            return true;
        }
        else
            return false;
    }

    public void addSession(HttpSession session, Member member) {
        session.setAttribute("email", member.getEmail());
    }

    public boolean checkLogin(HttpSession session) {
        if (session.getAttribute("email") != null)
            return true;
        else
            return false;
    }
}
