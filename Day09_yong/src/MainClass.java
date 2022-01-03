
public class MainClass {

	
	
	
	
	public static void main(String[] args) {
		/*
		 - 객체를 생성하지 않았을 때의 예시를 보고
		 빵 객체를 생성할 수 있는 클래스(설계도)를 작성해 보세요.
		 클래스 이름은 Bread로 통일하겠습니다.
		 
		 - MainClass에서 똑같이 피자빵, 초케이크의 정보롤 
		 호출해 보세요

		 */
		
		Bread pizza = new Bread("피자빵", 500, "밀가루");
		pizza.showInfo();
		
		Bread cho = new Bread("초코케이크", 1500, "초콜릿");
		cho.showInfo();
		
		

	}

}
