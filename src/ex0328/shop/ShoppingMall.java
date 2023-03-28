package ex0328.shop;

public class ShoppingMall {

	public void enter(int age) throws AgeCheckException {
		if(age < 18) {
			throw new AgeCheckException("애들은 가라\n");
		}
		System.out.println("입장하신 것을 환영합니다.\n");
	}
}
