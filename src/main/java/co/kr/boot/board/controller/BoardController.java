package co.kr.boot.board.controller;

import co.kr.boot.board.service.BoardService;
import co.kr.boot.board.vo.BoardVo;
import co.kr.boot.paging.PagingVo;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BoardController {

    @Resource(name="boardService")
    private BoardService boardService;

    @RequestMapping("/board")
    public String board() {
        return "board";
    }

    @GetMapping("/board/list")
    public ResponseEntity<PagingVo> list(BoardVo boardVo, @Param("paging") PagingVo pagingVo) {;
        PagingVo result = boardService.list(boardVo, pagingVo);
        return ResponseEntity.ok(result);
    }
}
