package co.kr.boot.board.service;

import co.kr.boot.board.vo.BoardVo;
import co.kr.boot.paging.PagingVo;

import java.util.List;

public interface BoardService {

    PagingVo list(BoardVo boardVo, PagingVo pagingVo);
}
