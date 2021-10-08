package com.hansung.financial.project.repository;

import com.hansung.financial.project.entity.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardsMapper {
    List<Board> getBoards();

    int addBoard(Board board);

    Board getBoard(int id);

    int deleteBoard(int id);

    int updateBoard(Board board);

}
