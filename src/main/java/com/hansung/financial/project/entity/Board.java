package com.hansung.financial.project.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@Alias("board")
@NoArgsConstructor
public class Board {
    private int id;
    private String user_id;
    private String title;
    private String contents;
    private String view_cnt;
    private String created_at;

    public Board(int id, String user_id, String title, String contents, String view_cnt, String created_at) {
        this.id = id;
        this.user_id = user_id;
        this.title = title;
        this.contents = contents;
        this.view_cnt = view_cnt;
        this.created_at = created_at;
    }
}
