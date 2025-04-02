package co.kr.boot.board.mapper;

import co.kr.boot.board.vo.BoardVo;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import java.util.List;

@Mapper("boardMapper")
public interface BoardMapper {

    List<BoardVo> list();
}
