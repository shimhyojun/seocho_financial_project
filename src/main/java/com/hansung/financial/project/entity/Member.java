package com.hansung.financial.project.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@Alias("member")
@NoArgsConstructor
public class Member {
    private int id;
    private String name;
    private String pwd;
    private String phone;
    private String email;
    private String created_at;

    public Member(int id, String name, String pwd, String phone, String email, String created_at) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.phone = phone;
        this.email = email;
        this.created_at = created_at;
    }
}
