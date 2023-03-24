package ex0324;

import java.util.List;

public class MainApp {
	public static void main(String[] args) {
		
		/* SpiderMan 3명, Student 2명 관리하기 */
//		Person [] pArr = new Person[5]; // Person object를 생성한 것이 아니라 Person type을 사용.
		
		Service service = new Service();
		List<Person> list;
			
		// 모든 list에 저장된 정보를 출력해보자.
//		EndView.printList(list); // 저장된 순서대로 출력
		
		list = service.selectAll();
		EndView.printList(list);
		
		list = service.sortByAge(); // 나이 기준 정렬
		EndView.printList(list);
		
//		boolean res = service.deleteByName("Kim");
//		System.out.println(res);
		
		service.insert(new Student("Yerin", 24, 10));
		service.insert(new SpiderMan("Park", 7, false));
		list = service.sortByAge();
		EndView.printList(list);
		
		System.out.println("\n-----2. 이름으로 찾기-----");
		Person p = service.SelectByName("Kim");
		if(p == null) EndView.printMessage("정보가 없습니다.");
		else EndView.printPerson(p);
		
		System.out.println("\n-----3. 삭제하기-----");
		if(service.deleteByName("Park")) {
			EndView.printMessage("삭제 성공했습니다.");
		} else {
			EndView.printMessage("삭제 실패했습니다.");
		}
		list = service.selectAll();
		EndView.printList(list);
	}
}