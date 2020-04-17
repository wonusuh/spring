/**
 * 
 */
package kr.or.yonsai.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.or.yonsai.domain.BoardVO;
import kr.or.yonsai.domain.Criteria;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

/**
 * @author YONSAI
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;

//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(board -> log.info(board));
//	}
//
//	@Test
//	public void testInsert() {
//		BoardVO board = new BoardVO();
//		board.setTitle("new title");
//		board.setContent("new contnent");
//		board.setWriter("newbie");
//		mapper.insert(board);
//		log.info(board);
//	}
//
//	@Test
//	public void testInsertSelectKey() {
//		BoardVO board = new BoardVO();
//		board.setTitle("new title select key");
//		board.setContent("new content select key");
//		board.setWriter("newbie");
//		mapper.insertSelectKey(board);
//		log.info(board);
//	}
//
//	@Test
//	public void testRead() {
////		존재하는 게시물 번호로 테스트
//		BoardVO board = mapper.read(5);
//		log.info(board);
//	}

//	@Test
//	public void testDelete() {
//		log.info("DELETE COUNT : " + mapper.delete(18));
//	}

//	@Test
//	public void testUpdate() {
//		BoardVO board = new BoardVO();
////		실행 전 존재하는 번호인지 확인할 것
//		board.setBno(14);
//		board.setTitle("modified title");
//		board.setContent("modified content");
//		board.setWriter("midified author");
//		int count = mapper.update(board);
//		log.info("UPDATE COUNT : " + count);
//	}

	@Test
	public void testPagig() {
		Criteria cri = new Criteria();
		// 10개씩 3페이지
		cri.setPageNum(3);
		cri.setAmount(5);
		cri.updateOffsetNum();
		List<BoardVO> list = mapper.getListWithPaging(cri);
		list.forEach(board -> log.info(board.getBno()));
	}

}
