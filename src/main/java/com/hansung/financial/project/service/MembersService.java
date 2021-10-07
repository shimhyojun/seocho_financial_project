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

    public Member addMember(Member member) {
        int id = mapper.addMember(member);
        member.setId(id);
        return member;
    }

    public Member getMember(int id) {
        return mapper.getMember(id);
    }

    public int deleteMember(int id) {
        return mapper.deleteMember(id);
    }

    public int updateMember(Member member) { return mapper.updateMember(member);}
}
