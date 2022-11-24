package com.example.loginlogout.service.signup;

import com.example.loginlogout.dto.Member;
import com.example.loginlogout.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUp {

    private final MemberRepository memberRepository;

    @Autowired
    public SignUp(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member join(Member member) {
        memberRepository.save(member);
        return member;
    }

}
