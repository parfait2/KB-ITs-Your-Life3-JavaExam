package ex0324;

public class SpiderMan extends Person { // 'SpiderMan is a Person' relationship is established.
	// boolean의 setter, getter 규칙
	/*
	// case 1 - variable name : spider (추천) //
	private boolean spider; 

	public boolean isSpider() { // return type이 boolean일 때 isXxx로 생성됨.
		return spider;
	}

	public void setSpider(boolean spider) {
		this.spider = spider;
	}
	*/
	
	/*
	// case 2 - variable name : isSpider //
	private boolean isSpider;

	public boolean isSpider() {
		return isSpider;
	}

	public void setSpider(boolean isSpider) {
		this.isSpider = isSpider;
	}
	*/
	
	private boolean spider;
	
	public SpiderMan() {}
	public SpiderMan(String name, int age, boolean spider) {
//		this.setName(name);
//		super.setAge(age);
		
		super(name, age); // 첫 번째 줄에 작성해야 한다.
		this.spider = spider;
	}
	
	public boolean isSpider() {
		return spider;
	}

	public void setSpider(boolean spider) {
		this.spider = spider;
	}
	
	// 부모의 메소드 재정의
	@Override
	public String toString() {
		return super.toString() + " | " + spider;
	}
	
	// 자식만이 갖는 메소드
	public void jump() {
		System.out.println("SpiderMan만 가지고 있는 jump() call...");
	}
	
	@Override
	public void walk() {
		// 부모 쪽에 있는 walk()를 호출하고 싶다.
		super.walk();
		System.out.println("SpiderMan의 walk() call...");
		
		/*
		 * [Console]
		 * Person의 walk() 호출...
		 * SpiderMan의 walk() call...
		 * */
	}
	
	@Override
	public void sleep() {
		System.out.println("SpiderMan sleep call...");
	}
}
