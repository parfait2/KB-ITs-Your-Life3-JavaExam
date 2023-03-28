package ex0328.exception;

public class ExceptionExam {
	public void aa(String [] args) {
		System.out.println("aa 메소드 시작...");
		try {
			System.out.println("전달된 값 = " + args[0]);
			// 위에서 예외 발생 시 
			
			int no = Integer.parseInt(args[0]); // int java.lang.Integer.parseInt(String s) throws NumberFormatException
			System.out.println("변환된 값 = " + no);
			
			this.bb(no);
				
			int result = 100 / no;
			System.out.println("나눈 결과 = " + result);
			
			// catch를 작성할 때 반드시 서브클래스부터 작성한다.
		} /*catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("e = " + e); // e.toString() 호출 -> 예외 클래스 : 예외 메세지
		} catch(NumberFormatException e) {
			System.out.println("숫자만 입력하세요 = " + e.getMessage()); // [Console] For input string: "A"
		} catch(ArithmeticException e) {
			System.out.println(e);
		} // -> 모든 예외에 대한 처리를 해야 한다. */
		catch(Exception e) {
			// 개발할 때 예외가 발생하면 예외에 대한 정보를 정확하게 추적할 수 있다.
			// 배포할 때(운영 환경 : production) 반드시 제거해야 한다. secure coding
			e.printStackTrace(); // 예외 메세지를 Stack에 저장하고 Stack에 저장된 메세지를 출력
			System.out.println("예외 발생");
		}
		System.out.println("aa 메소드 끝...");
	}
	
	public void bb(int i) {
		try {
			System.out.println("bb 메소드 시작...");
			if(i > 10) {
				// 강제로 예외를 발생시킨다.
				throw new RuntimeException("10보다 작아야 해요.");
			}
			int re = 200 / i;
			System.out.println("bb()에서 나눈 결과 = " + re);
		} finally {
			System.out.println("bb 메소드 끝..."); // 예외 발생 여부와 관계 없이 무조건
		}
	}
	
	public static void main(String[] args) {
		System.out.println("*****메인 시작합니다.*****");
		ExceptionExam exam = new ExceptionExam();
		exam.aa(args);
		
		System.out.println("*****메인 끝입니다.*****");
	}
}
