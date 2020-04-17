package kr.or.yonsai.service;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import kr.or.yonsai.domain.BoardVO;
import kr.or.yonsai.domain.Criteria;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	@Setter(onMethod_ = { @Autowired })
	private BoardService service;

	@Test
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	}

	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("new title2");
		board.setContent("new content2");
		board.setWriter("newbie2");
		service.register(board);
		log.info("created post number : " + board.getBno());
	}

	@Test
	public void testGetList() {
//		service.getList().forEach(board -> log.info(board));
		service.getList(new Criteria(2, 10)).forEach(board -> log.info(board));
	}

	@Test
	public void testGet() {
		log.info(service.get(1));
	}

	@Test
	public void testDelete() {
//		게시물 번호의 존재여부를 확인하고 테스트 할 것
		log.info("REMOVE RESULT : " + service.remove(25));
	}

	@Test
	public void testUpdate() {
		BoardVO board = service.get(1);
		if (board == null) {
			return;
		}
		board.setTitle("제목 수정합니다.");
		log.info("MODIFY RESULT : " + service.modify(board));
	}
}
