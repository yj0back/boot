package co.kr.boot.paging;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PagingVo {
    int totalDataCnt;
    int startPage;
    int endPage;
    int totalPage;
    int currentPage;
    int limit = 10;
    int offset;
    int block;
    boolean prev;
    boolean next;
    List<?> data;

    public void createPaging(int totalDataCnt, List<?> data) {
        this.totalDataCnt = totalDataCnt;
        this.currentPage = currentPage;
        this.endPage = (int) Math.ceil(currentPage / 10.0) * 10;
        this.startPage = this.endPage - 9;
        this.totalPage = (int) Math.ceil(totalDataCnt / (double) limit);
        this.prev = this.startPage > 1;
        this.next = this.endPage < totalPage;
        this.offset = (this.currentPage - 1) * limit;
        System.out.println(this.offset);
        this.block = totalDataCnt % limit;

        this.data = data;
    }
}
