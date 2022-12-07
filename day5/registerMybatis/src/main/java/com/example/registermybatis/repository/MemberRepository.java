package com.example.registermybatis.repository;

import com.example.registermybatis.dto.Member;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository {
    int save(Member member);
    int select(Member member);
}
