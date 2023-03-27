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
		service = new QABoardImpl();
		board = new QABoard(1, "title1", "writer1", "content1", true);	
		this.test(service, board);
		
		System.out.println("\n*****FreeBoard TEST*****");
		service = new FreeBoardImpl();
		board = new FreeBoard(10, "title1", "writer1", "content1");
		this.test(service, board);
		
		System.out.println("\n*****UploadBoard TEST*****");
		service = new UploadBoardImpl();
		board = new UploadBoard(2, "title1", "writer1", "content1", "file name1");
		this.test(service, board);
		
		/// 익명 구현 클래스 ///
		
		
	} // end of constructor
	
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
		System.out.println("=============추가된 method 호출=============");
		service.replyInsert();
		
		BoardService.selectBySubject(); // static method
	}
}
