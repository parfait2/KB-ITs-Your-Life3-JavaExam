package ex0327.interfaceEx.board;

import java.util.ArrayList;
import java.util.List;

public class UploadBoardServiceImpl implements BoardService {

	public UploadBoardServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insert(Board board) {
		System.out.println("UploadBoardServiceImpl의 insert call...");
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("UploadBoardServiceImpl의 update call...");
		return false;
	}

	@Override
	public Board selectByBno(int bno) {
		System.out.println("UploadBoardServiceImpl의 selectByBno call...");
		return new Board(bno, "찾은 제목", "찾은 작성자", "찾은 내용");
	}

	@Override
	public List<Board> selectAll() {
		List<Board> list = new ArrayList<>();
		list.add(new UploadBoard(100, "title1", "writer1", "content1", "file name1"));
		list.add(new UploadBoard(200, "title2", "writer2", "content2", "file name2"));
		list.add(new UploadBoard(300, "title3", "writer3", "content3", "file name3"));
		list.add(new UploadBoard(400, "title4", "writer4", "content4", "file name4"));

		System.out.println("UploadBoardServiceImpl의 selectAll call...");
		return null;
	}

}
