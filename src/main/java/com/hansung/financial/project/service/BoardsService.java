package com.hansung.financial.project.service;

import com.hansung.financial.project.entity.Board;
import com.hansung.financial.project.repository.BoardsMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardsService {
    BoardsMapper mapper;

    public BoardsService(BoardsMapper mapper) {
        this.mapper = mapper;
    }

    public List<Board> getBoards() {
        return mapper.getBoards();
    }

    public Board addBoard (Board board) {
        int id = mapper.addBoard(board);
        board.setId(id);
        return board;
    }

    public Board getBoard(int id) {
        return mapper.getBoard(id);
    }

    public int deleteBoard(int id) {
        return mapper.deleteBoard(id);
    }

    public int updateBoard(Board board) { return mapper.updateBoard(board);}
}
