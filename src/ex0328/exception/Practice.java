package ex0328.exception;

class ExceptionClass extends Exception {
	int count;
	
	ExceptionClass() {
		super("애들은 가라");
		count++;
	}
}
///////////////////////////////////////////////////////////
class Shoppingmall {
	Shoppingmall() {}

	public void check(int age) throws ExceptionClass {
		try {
			if(age < 18) {
				throw new ExceptionClass();
			} else {
				System.out.println("입장하신 것을 환영합니다.");
			}
		} finally {
			
		}
	}
}

public class Practice {
	public static void main(String[] args) throws ExceptionClass {
		int n = 0;
				
		while(n < 10) {
			try {
				n++;
				int a = (int) (Math.random()*55)+1;
				System.out.println("고객의 나이 : " + a);
				
				Shoppingmall shoppingmall = new Shoppingmall();
				shoppingmall.check(a);
			} catch(Exception e) {
				
			}
		}
		System.out.println();
	}
}
