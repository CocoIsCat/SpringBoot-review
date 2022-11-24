package com.example.loginlogout.repository;

import com.example.loginlogout.dto.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public class MemoryMemberRepository implements MemberRepository{

    ArrayList<Member> store = new ArrayList<>();

    @Override
    public Member save(Member member) {
        store.add(member);
        return member;
    }

    @Override
    public Optional<Member> findId(String email) {
        for (Member m : store) {
            if (m.getEmail().equals(email)) {
                return Optional.ofNullable(m);
            }
        }
        return Optional.empty();
    }
}
