/**
 * 
 */
package kr.or.yonsai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.or.yonsai.domain.BoardVO;

/**
 * @author YONSAI
 *
 */
public interface BoardMapper {

	@Select("SELECT * FROM tbl_board WHERE bno > 0")
	public List<BoardVO> getList();

}
