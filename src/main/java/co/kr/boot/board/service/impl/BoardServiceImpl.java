package co.kr.boot.board.service.impl;

import co.kr.boot.board.mapper.BoardMapper;
import co.kr.boot.board.service.BoardService;
import co.kr.boot.board.vo.BoardVo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

    @Resource(name = "boardMapper")
    private BoardMapper boardMapper;

    @Override
    public List<BoardVo> list() {
        return boardMapper.list();
    }
}
