package ex0327;

class Parent2 {
	void show() {
		System.out.print("a");
	}
	
	void show(int k) {
		System.out.print("k");
	}
}

class Child2 extends Parent2 {
	void show() {
		System.out.print("b");
	}
}

public class DailyTest2 {
	public static void main(String[] args) {
		Parent2 a = new Parent2();
		a.show();
		
		Child2 b = new Child2();
		b.show(5);
		
		Parent2 c = new Child2();
		c.show();
		
		// [Console] akb
	}
}