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
    private String pw;
    private int pNumber;
    private String email;
    private String created_at;

    public Member(int id, String name, String pw, int pNumber, String email, String created_at) {
        this.id = id;
        this.name = name;
        this.pw = pw;
        this.pNumber = pNumber;
        this.email = email;
        this.created_at = created_at;
    }
}
