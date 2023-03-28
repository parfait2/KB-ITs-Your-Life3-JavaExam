package ex0328.shop;

/**
 * 나이가 18보다 작으면 발생할 예외 클래스
 * */
public class AgeCheckException extends Exception { // is a relation
	static int count;
	
	public AgeCheckException() {
		count++;
	}
	public AgeCheckException(String message) {
		super(message);
		count++;
	}
}
