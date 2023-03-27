package ex0327.interfaceEx.board;

import java.util.List;

/**
 * 모든 게시물에서 공통으로 사용하게 될 method 정의(규격서)
 * */
public interface BoardService {
	/**
	 * 등록하기
	 * @return : 0이면 등록 실패, 1 이상이면 등록 성공
	 * */
	int insert(Board board);
	
	/**
	 * 수정하기(글 번호에 해당하는 제목과 내용을 수정한다.)
	 * */
	boolean update(Board board/* int bno, String subject, String content */); // 만약 규격서가 없다면 변수를 세 개를 사용하는 경우도 발생.
	
	/**
	 * 글 번호에 해당하는 게시물 조회하기(글 번호는 중복되지 않는다.)
	 * */
	Board selectByBno(int bno);
	
	/**
	 * 전체 게시물 조회하기
	 * */
	List<Board> selectAll();
	
	/**
	 * Java 1.8 version에 추가된 문법
	 * : interface 안에 있는 method에 static or default method를 만들 수 있고
	 * 	 static or default가 선언되면 body가 있는 method가 된다.
	 * 	 이유 - 유지 보수를 할 때 특정 구현 객체에만 사용해야 하는 method가 있을 때
	 * 			interface를 추가하면 필요한 없는 이미 구현된 모든 구현 객체들이 재정의해야 하는 번거로움이 있다.
	 * 			그래서 이미 구현된 상태에서 특정 구현 객체만 필요한 method가 있다면 static or default를 만들고
	 * 			필요한 구현 클래스에서만 재정의하도록 하는 것.
	 * 			또한, 모든 구현 객체들이 공통으로 사용하는 기능이 정해져 있다면 static or default로 만들어서 재정의 없이 사용한다.
	 * 
	 * 1) static method
	 * 	  : 구현 객체 없이 바로 [interface 이름].[method 이름] 호출 가능
	 * 2) default method
	 * 	  : 반드시 구현 객체가 있어야 호출 가능
	 * */
	
	/**
	 * 답변 기능 method 추가
	 * */
	default int replyInsert() {
		System.out.println("BoardService의 replyInsert call...");
		return 0;
	}
	
	static Board selectBySubject() {
		System.out.println("BoardService의 selectBySubject call...");
		return null;
	}
	
} // end of interface
