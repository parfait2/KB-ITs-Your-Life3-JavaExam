package ex0327.set;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class LottoTest extends TreeSet<Integer> {
	public LottoTest() {
		// 1 ~ 45 사이의 난수를 발생해서 Set에 숫자 6개를 저장한다.
		Random r = new Random();
		
		while(super.size() < 6) {
//			r.nextInt(45); // 0 ~ 44
			int no = r.nextInt(45) + 1; // 1 ~ 45
			super.add(no);
		}
		
		// 출력
		System.out.println("저장된 번호 : " + this);
		
		Iterator<Integer> it = this.descendingIterator();
		while(it.hasNext()) System.out.print(it.next() + ", ");
	}
	public static void main(String[] args) {
		new LottoTest();
	}
	
}
