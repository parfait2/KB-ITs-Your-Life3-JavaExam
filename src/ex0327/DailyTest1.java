package ex0327;

class Parent {
	public Parent() {
		System.out.print("A");
	}
	public Parent(int K) {
		System.out.print("B");
	}
}

class Child extends Parent {
	public Child() {
		System.out.print("C");
	}
	public Child(int K) {
		System.out.print("D");
	}
}

public class DailyTest1 {
	public static void main(String[] args) {
		new Child(30); // [Console] AD
	}
}