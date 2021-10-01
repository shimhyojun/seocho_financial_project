package com.hansung.financial.project.repository;

import com.hansung.financial.project.entity.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MembersMapper {
    List<Member> getMembers();
}
