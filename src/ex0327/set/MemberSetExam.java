package ex0327.set;

import java.util.HashSet;
import java.util.Set;

public class MemberSetExam {
	private Set<Member> set = new HashSet<>(); // 교재 516p
	
	/**
	 * Set의 중복 체크
	 * : 먼저 hashCode() method를 호출해서 다르면 다른 객체로 인식,
	 * 	 만약 hashCode()가 같으면 equals() method를 호출해서 true이면 같은 객체,
	 * 														 false이면 다른 객체로 인식.
	 * */
	public MemberSetExam() {

		set.add(new Member("Haejun Kim", 10, "Seoul"));
		System.out.println("\n-------------------------");
		set.add(new Member("Minho Kim", 20, "Kangwon"));
		System.out.println("\n-------------------------");
		set.add(new Member("Minho Kim", 20, "Incheon"));
		
		System.out.println("저장된 객체의 개수 : " + set.size());
	}
	
	public static void main(String[] args) {
		new MemberSetExam();
	}
}
