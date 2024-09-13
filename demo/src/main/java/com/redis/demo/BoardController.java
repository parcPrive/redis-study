package com.redis.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("boards")
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping()
    public List<Board> getBoards(
        @RequestParam(name = "page",defaultValue = "1") int page, @RequestParam(name ="size" ,defaultValue = "10") int size
    ) {
        System.out.println("asdasd");
        return boardService.getBoards(page, size);
    }
}
