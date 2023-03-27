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
}
