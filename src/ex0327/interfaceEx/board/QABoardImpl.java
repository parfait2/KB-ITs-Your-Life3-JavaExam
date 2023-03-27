package ex0327.interfaceEx.board;

import java.util.ArrayList;
import java.util.List;

/**
 * QA에 관련된 Business Logic(주요 기능)
 * */
public class QABoardImpl implements BoardService {
	
	@Override
	public int insert(Board board) {
		System.out.println("QABoardServiceImpl의 insert call...");
		
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("QABoardServiceImpl의 update call...");
		
		return false;
	}

	@Override
	public Board selectByBno(int bno) {
		System.out.println("QABoardServiceImpl의 selectByBno call...");

		return new Board(bno, "찾은 제목", "찾은 작성자", "찾은 내용");
	}

	@Override
	public List<Board> selectAll() {
		System.out.println("QABoardServiceImpl의 selectAll call...");
		List<Board> list = new ArrayList<>();
		list.add(new QABoard(1, "title1", "writer1", "content1", true));
		list.add(new QABoard(2, "title2", "writer2", "content2", false));

		return list;
	}
}
