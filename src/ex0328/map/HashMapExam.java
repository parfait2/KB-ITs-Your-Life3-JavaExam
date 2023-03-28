package ex0328.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExam {
//	Map<Integer, String> map = new HashMap<>();
	Map<Integer, String> map = new TreeMap<>(); // key를 정렬
	
	public HashMapExam() {
		map.put(10, "임플란티드 키드");
		map.put(50, "김영남");
		map.put(30, "최준");
		map.put(40, "방재호");
		map.put(20, "이호창");
		map.put(10, "차진석");
		map.put(50, "김수민");
		
		System.out.println(map);
		
		map.remove(10);
		System.out.println("제거 후");
		System.out.println("개수 : " + map.size());
		System.out.println(map);
		
		System.out.println("\n조회하기");
		Set<Integer> ketSet = map.keySet();
		Iterator<Integer> it = ketSet.iterator();
		
		while(it.hasNext()) {
			int key = it.next();
			String value = map.get(key);
			System.out.println(key + " = " + value);
		}
		
		System.out.println("\n개선된 for 변경");
		for(Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + " = " + value);
		}
		
		System.out.println("\nMap.Entry<Integer, String>");
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		Iterator<Map.Entry<Integer, String>> iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<Integer, String> entry = iter.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		new HashMapExam();
	}
}
