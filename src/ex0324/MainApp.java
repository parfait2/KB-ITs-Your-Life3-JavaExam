package ex0324;

import java.util.List;

public class MainApp {
	public static void main(String[] args) {
		
		/* SpiderMan 3명, Student 2명 관리하기 */
//		Person [] pArr = new Person[5]; // Person object를 생성한 것이 아니라 Person type을 사용.
		
		Service service = new Service();
		// 모든 list에 저장된 정보를 출력해보자.
//		EndView.printList(list);
		
		List<Person> list = service.selectAll();
		EndView.printList(list);
		
		List<Person> list2 = service.sortByAge();
		EndView.printList(list2);
		
//		boolean res = service.deleteByName("Minho");
//		System.out.println(res);
		
		Person p = service.SelectByName("Minho");

		
	}
}