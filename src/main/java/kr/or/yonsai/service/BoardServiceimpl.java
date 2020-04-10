package kr.or.yonsai.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.or.yonsai.domain.BoardVO;
import kr.or.yonsai.mapper.BoardMapper;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceimpl implements BoardService {
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;

	@Override
	public void register(BoardVO board) {
		log.info("register.........." + board);
		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVO get(int bno) {
		log.info("get.........." + bno);
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		return false;
	}

	@Override
	public boolean remove(int bno) {
		return false;
	}

	@Override
	public List<BoardVO> getList() {
		log.info("getList..........");
		return mapper.getList();
	}
}
