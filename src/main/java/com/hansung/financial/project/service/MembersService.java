package com.hansung.financial.project.service;

import com.hansung.financial.project.entity.Member;
import com.hansung.financial.project.repository.MembersMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembersService {
    MembersMapper mapper;

    public MembersService(MembersMapper mapper) {
        this.mapper = mapper;
    }

    public List<Member> getMembers() {
        return mapper.getMembers();
    }
}
