package co.kr.boot.board.vo;

import co.kr.boot.paging.PagingVo;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardVo extends PagingVo {
    String id;
    String content;
}
