package ex0328.shop;

import java.util.Random;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("ShoppingMall Open");
		ShoppingMall mall = new ShoppingMall();
		
		Random r = new Random();
		
		for(int i = 0; i < 10; i++) {
			int age = r.nextInt(55) + 1;
			System.out.print(age + "살 : ");
			
			try {
				mall.enter(age);
			} catch(AgeCheckException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("ShoppingMall Closed");
		System.out.println("예외 개수 : " + AgeCheckException.count + "명");
	}
}
