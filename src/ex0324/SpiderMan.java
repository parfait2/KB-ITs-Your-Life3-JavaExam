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
	
	
	
	
}
