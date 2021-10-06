package com.hansung.financial.project.controller;

import com.hansung.financial.project.entity.Member;
import com.hansung.financial.project.service.MembersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/members/{id}")
    public Member getMembers(@PathVariable(value = "id") int id) {
        return membersService.getMember(id);
    }

    @PostMapping("/members")
    public ResponseEntity<Member> addMember(@RequestBody Member member) {
        Member insertedMember = membersService.addMember(member);
        return ResponseEntity.status(HttpStatus.CREATED).body(insertedMember);
    }

    @DeleteMapping("/members/{id}")
    public void removeMember(@PathVariable(value = "id") int id) {
        membersService.deleteMember(id);
    }

    @PutMapping("/members/{id}")
    public Member updateMembers(@PathVariable(value = "id") int id, @RequestBody Member member) {

        return membersService.getMember(id);
    }

}
