/**
 * 
 */
package kr.or.yonsai.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Select;

import kr.or.yonsai.domain.BoardVO;
import kr.or.yonsai.domain.Criteria;

/**
 * @author YONSAI
 *
 */
public interface BoardMapper {

//	@Select("SELECT * FROM tbl_board WHERE bno > 0")
	public List<BoardVO> getList();

	public List<BoardVO> getListWithPaging(Criteria cri);

	public void insert(BoardVO board);

	public void insertSelectKey(BoardVO board);

	public BoardVO read(int bno);

	public int delete(int bno);

	public int update(BoardVO board);

}
