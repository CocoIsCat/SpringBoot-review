package com.example.registermybatis.mapper;

import com.example.registermybatis.dto.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MybatisLoginMapper {

    int insert(Member member);

    Member select(Member member);
}
