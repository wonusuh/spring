/**
 * 
 */
package kr.or.yonsai.service;

import java.util.List;

import kr.or.yonsai.domain.BoardVO;

/**
 * @author YONSAI
 *
 */
public interface BoardService {
	public void register(BoardVO board);

	public BoardVO get(int bno);

	public boolean modify(BoardVO board);

	public boolean remove(int bno);

	public List<BoardVO> getList();
}
