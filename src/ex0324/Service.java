package ex0324;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service  {
	List<Person> list = new ArrayList<>(); // Constructs an empty list with an initial capacity of ten.

	/**
	 * add sample data
	 * */
	public Service() {
		// 객체 생성 후 list에 추가
		list.add(new SpiderMan("Haejun", 31, true));
		list.add(new SpiderMan("Joon", 42, false));
		list.add(new SpiderMan("Minho", 24, true));
		list.add(new Student("Kim", 14, 100));
		list.add(new Student("Park", 60, 500));
		list.add(new Student("Choi", 37, 300));
	}
	
	/**
	 * 등록순으로 전체 조회
	 * */
	public List<Person> selectAll() {
		return list;
	}
	
	
	/**
	 * 등록하기
	 * */
	public void insert(Person person) {
		// DB에서의 등록은 보통 int type을 return한다. e.g. 2행이 추가되었습니다.
		
	}
	
	/**
	 * parameter로 전달된 name에 해당하는 Person의 정보 조회하기(단, name은 중복 안 됨.)
	 * @return : null이면 없다.
	 * */
//	public Person SelectByName(String name) {
//		return null;
//	}
	
	public Person SelectByName(String name) {
		for(Person p : list) {
			if(p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}
	
	
	/**
	 * parameter로 전달된 name에 해당하는 정보 삭제하기
	 * @return : true면 삭제 성공, false면 삭제 실패
	 * */
//	public boolean deleteByName(String name) {
//		boolean isDeleted = false;
//		
//		for(Person p : list) {
//			if(list.get(0).equals(p.getName())) {
//				list.remove(0);
//				isDeleted = true;
//			}
//		}
//		return isDeleted;
//	}

	public boolean deleteByName(String name) {
		Person p = this.SelectByName(name);
		boolean result = list.remove(p);
		
		return result;
	}

	/**
	 * 나이를 기준으로 정렬해서 조회하기
	 * */
	public List<Person> sortByAge() {
		// 정렬해서 담을 객체가 필요하다.
		ArrayList<Person> sortedList = (ArrayList<Person>) list;
		sortedList = (ArrayList<Person>)sortedList.clone();

		Collections.sort(sortedList);
		return sortedList;
	}
}
