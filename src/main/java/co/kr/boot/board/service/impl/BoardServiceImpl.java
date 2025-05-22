package co.kr.boot.board.service.impl;

import co.kr.boot.board.mapper.BoardMapper;
import co.kr.boot.board.service.BoardService;
import co.kr.boot.board.vo.BoardVo;
import co.kr.boot.paging.PagingVo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

    @Resource(name = "boardMapper")
    private BoardMapper boardMapper;

    @Override
    public PagingVo list(BoardVo boardVo, PagingVo pagingVo) {
        int cnt = boardMapper.cnt();
        List<BoardVo> result = boardMapper.list(boardVo, pagingVo);
        pagingVo.createPaging(cnt, result);
    return pagingVo;
    }
}
