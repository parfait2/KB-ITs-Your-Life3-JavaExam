package ex0324;

public class MainApp {
	public static void main(String[] args) {
		// 객체 생성
		Person p = new Person("Minho", 20);
		
		// print(Object obj) or println(Object obj) -> obj.toString을 호출한다.
		System.out.println("p = " + p); // p = ex0324.Person@6f2b958e
		System.out.println("p.toString()" + p.toString()); // p.toString()ex0324.Person@6f2b958e
	
		System.out.println("--------------------");
		p = new SpiderMan(); // OK -> polymorphism is established
		
	}
}
