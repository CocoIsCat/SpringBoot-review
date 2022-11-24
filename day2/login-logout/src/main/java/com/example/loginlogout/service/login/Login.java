package com.example.loginlogout.service.login;

import com.example.loginlogout.dto.Member;
import com.example.loginlogout.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Login {

    private final MemberRepository memberRepository;

    @Autowired
    public Login(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public boolean login(Member member) {
        if (memberRepository.findId(member.getEmail()).get().getPassword().equals(member.getPassword())) {
            return true;
        }
        else
            return false;
    }
}
