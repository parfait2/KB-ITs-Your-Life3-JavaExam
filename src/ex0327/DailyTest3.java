package ex0327;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}

public class DailyTest3 {
	public static void main(String[] args) {
		
		D d1 = new D();
		
		A a1 = (A)d1;
		B b1 = (B)d1;
//		C c1 = (C)d1; // error
		B b2 = new D();	
	}
}