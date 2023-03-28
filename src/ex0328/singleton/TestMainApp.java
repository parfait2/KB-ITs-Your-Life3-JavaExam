package ex0328.singleton;

class Test {
	// -> singleton pattern으로 만들면 세 개의 주소값이 모두 같다.
	private static Test instance = new Test();
	
	// 외부에서 직접 객체 생성을 하지 못하도록 한다.
	private Test() {}
	/**
	 * 현재 객체 내에서 자신을 생성해서 리턴해주는 메소드를 제공
	 * */
	public static Test getInstance() {
//		Test instance = new Test();
		return instance;
	}
}
public class TestMainApp {	
	public static void main(String[] args) {
//		new Test();
		Test t1 = Test.getInstance(); // [Console] ex0328.singleton.Test@6f2b958e
		Test t2 = Test.getInstance(); // [Console] ex0328.singleton.Test@5e91993f
		Test t3 = Test.getInstance(); // [Console] ex0328.singleton.Test@1c4af82c
		
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);
	}
}
