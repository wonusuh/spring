package kr.or.yonsai.mapper;

import java.util.List;
import kr.or.yonsai.domain.BoardVO;
import kr.or.yonsai.domain.Criteria;

public interface BoardMapper {
	public List<BoardVO> getList();

	public List<BoardVO> getListWithPaging(Criteria cri);

	public void insert(BoardVO board);

	public void insertSelectKey(BoardVO board);

	public BoardVO read(int bno);

	public int delete(int bno);

	public int update(BoardVO board);

	public int getTotalCount(Criteria cri);
}
