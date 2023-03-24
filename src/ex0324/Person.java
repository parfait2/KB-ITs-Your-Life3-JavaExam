package ex0324;

/*
 * abstract class는 생성 불가, 상속만 가능.
 * */
public abstract class Person /* extends Object */ {
	// Information Hiding(정보 은닉) : 외부에서 사용자 마음대로 조회/변경하는 것을 막는다.
	private String name;
	private int age;
	
	public Person() {} // default constructor
	// 만약 default constructor를 만들지 않으면 상속에 제약이 생긴다.
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		// field initialization
		
		this(name); // parameter를 하나 받는 생성자를 호출한다.
		// this.name = name; // 한 생성자 안에서 두 번 호출할 수 없다.
		this.age = age;
		
		// name = name; // 지역 변수가 우선 순위가 높다. 따라서 parameter의 name = parameter의 name 
	}
	
	/*
	 * setXxx() rule	
	 * : 수정을 위해 사용.
	 * 
	 * modifier - public
	 * return type - void
	 * method name - set + field name의 첫 글자를 대문자로 쓴다.
	 * parameter - 필수
	 * */
	
	/*
	 * getXxx() rule	
	 * : 조회를 위해 사용.
	 * 
	 * modifier - public
	 * return type - 필수
	 * method name - get + field name의 첫 글자를 대문자로 쓴다.
	 * parameter - 없음.
	 * */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return getName()+ " | " + getAge();
	}
	
	/*
	 * Overriding : 부모에 정의된 메소드를 자식 클래스에서 새롭게 재정의
	 * 
	 * <rule>
	 * 제한자만 다를 수 있고, 접근제한자는 부모보다 같거나 커야 한다.
	 * public > protected > 생략(default) > private
	 * return type, method name, parameter는 모두 같다.
	 * 단, 기능은 다르게 작성한다.
	 * */
	
	public void eat() {
		System.out.println("Person의 eat() 호출...");
	}
	
	public void walk() {
		System.out.println("Person의 walk() 호출...");
	}
	
	// abstract method declaration - 선언문만 있고 body(기능)은 없다.
	// abstract method를 가지고 있는 class는 반드시 abstract라고 선언되어야 한다.
	public abstract void sleep();
}
