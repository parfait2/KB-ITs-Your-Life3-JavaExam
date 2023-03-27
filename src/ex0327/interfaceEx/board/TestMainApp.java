package ex0327.interfaceEx.board;

import java.util.List;

public class TestMainApp {
	BoardService service; // null -> field를 이용한 polymorphism
	Board board;
	
	public static void main(String[] args) {
		new TestMainApp();
		
		// method가 static이므로 field에 선언된 service와 board를 사용할 수 없다.
	}
	
	public TestMainApp() {
		// test method 호출
		System.out.println("*****QABoard TEST*****");
		service = new QABoardServiceImpl();
		board = new QABoard(1, "title", "writer", "content", false);
		this.test(service, board);
	}
	
	/**
	 * 인수로 전달된 BoardService를 이용해서 각 method(XxxService)를 호출해보자.
	 * */
	public void test(BoardService service, Board board) { // QA, Free, Upload 가능
		service.insert(board);
		service.update(board);
		
		Board searchedBoard = service.selectByBno(1);
		System.out.println("searchedBoard = " + searchedBoard);
		
		List<Board> list = service.selectAll();
		System.out.println("검색된 레코드 : " + list.size());
		for(Board b : list) System.out.println(b);
		System.out.println("==========================");
	}
}
