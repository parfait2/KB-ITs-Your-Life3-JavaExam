package ex0324;

import java.util.List;

public class EndView {
	
	/**
	 * 모든 list 정보 출력하기
	 * */
	public static void printList(List<Person> list) {
	// CAUTION : ArrayList<Person> list라고 작성하면 유지보수성이 떨어진다.
	
		System.out.println("***** list 정보 (" + list.size() + "명) *****");
		// list.get(0);
		for(Person p : list) {
			System.out.println(p); // p.toString()이 호출된다.
		}
	}
}
