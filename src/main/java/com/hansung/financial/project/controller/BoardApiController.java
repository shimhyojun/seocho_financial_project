package com.hansung.financial.project.controller;

import com.hansung.financial.project.entity.Board;
import com.hansung.financial.project.service.BoardsService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardApiController {
    BoardsService boardsService;

    public BoardApiController(BoardsService boardsService) {
        this.boardsService = boardsService;
    }

    @GetMapping("/boards")
    public List<Board> getBoards() { return boardsService.getBoards(); }

    @GetMapping("/boards/{id}")
    public Board getBoards(@PathVariable(value = "id") int id) {
        return boardsService.getBoard(id);
    }

    @PostMapping("/boards")
    public Board addBoard(@RequestBody Board board) {
        Board insertedBoard = boardsService.addBoard(board);
        return insertedBoard;
    }

    @DeleteMapping("/boards/{id}")
    public void removeBoard(@PathVariable(value = "id") int id) {
        boardsService.deleteBoard(id);
    }

    @PutMapping("/boards/{id}")
    public int updateBoards(@PathVariable(value = "id") int id, @RequestBody Board board) {
        board.setId(id);
        return boardsService.updateBoard(board);
    }

}
