package ex0324;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {
		
		/* SpiderMan 3명, Student 2명 관리하기 */
//		Person [] pArr = new Person[5]; // Person object를 생성한 것이 아니라 Person type을 사용.
		
		List<Person> list = new ArrayList<>(); // Constructs an empty list with an initial capacity of ten.
		
		// 객체 생성 후 list에 추가
		list.add(new SpiderMan("Haejun", 21, true));
		list.add(new SpiderMan("Choijoon", 22, false));
		list.add(new SpiderMan("Minho", 23, true));
		list.add(new Student("Kim", 24, 100));
		list.add(new Student("Park", 25, 500));
		list.add(new Student("Choi", 26, 300));
		
		EndView endView = new EndView();
		// 모든 list에 저장된 정보를 출력해보자.
		endView.printList(list);

		
	}
}