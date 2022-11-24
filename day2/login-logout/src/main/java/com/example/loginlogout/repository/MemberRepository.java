package com.example.loginlogout.repository;

import com.example.loginlogout.dto.Member;

import java.util.ArrayList;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);

    Optional<Member> findId(String email);
}
