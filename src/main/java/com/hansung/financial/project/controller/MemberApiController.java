package com.hansung.financial.project.controller;

import com.hansung.financial.project.entity.Member;
import com.hansung.financial.project.service.MembersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberApiController {
    MembersService membersService;

    public MemberApiController(MembersService membersService) {
        this.membersService = membersService;
    }

    @GetMapping("/members")
    public List<Member> getMembers() {
        return membersService.getMembers();
    }
}
