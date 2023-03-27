package ex0327.interfaceEx.board;

import java.util.ArrayList;
import java.util.List;

public class FreeBoardServiceImpl implements BoardService {

	public FreeBoardServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insert(Board board) {
		System.out.println("FreeBoardServiceImpl의 insert call...");
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("FreeBoardServiceImpl의 update call...");
		return false;
	}

	@Override
	public Board selectByBno(int bno) {
		System.out.println("FreeBoardServiceImpl의 selectByBno call...");
		return new Board(bno, "찾은 제목", "찾은 작성자", "찾은 내용");
	}

	@Override
	public List<Board> selectAll() {
		List<Board> list = new ArrayList<>();
		list.add(new FreeBoard(10, "title1", "writer1", "content1"));
		list.add(new FreeBoard(20, "title2", "writer2", "content2"));
		list.add(new FreeBoard(30, "title3", "writer3", "content3"));

		System.out.println("FreeBoardServiceImpl의 selectAll call...");
		return null;
	}
}
