
public class Bread {

	String name;
	int price;
	String ingredient;
	
	Bread(){}//생성자가 존재한다면 기본생성자가 자동으로 만들어지지 않아 
			// 기본 생성자를 하나 만들어 주는게 좋다.
		
	
	
	Bread(String bName, int bPrice, String bIngredient){
		name = bName;
		price = bPrice;
		ingredient = bIngredient;
		
	}
	
	
	void showInfo() {
		System.out.println("******빵의 정보*****");
		System.out.println("빵 이름: " + name);
		System.out.println("빵 가격: " + price + "원");
		System.out.println("주 재료: " + ingredient);
		
	}
	
	
	
	
	
	
	
	
	
}
