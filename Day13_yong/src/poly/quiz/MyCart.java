package poly.quiz;

public class MyCart {
	
	private int money;
	private Product[] cart = new Product[1];//상품을 저장할 배열.
	private int i =0;//cart안에 있는 상품의 개수를 알려주는 변수.
	
	//객체 생성 시 money를 받아서 초기화.
	public MyCart(int money) {
		this.money = money;
	}
	
	/*
    - public void buy(모든 상품을 전달할 수 있는 매개변수)
    
    - 가진 돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족"
     출력후 메서드 강제 종료.
    - 가진 돈이 충분하면 물건의 가격을 money에서 빼고 
      add(상품)메서드 호출.
    */
	public void buy(Product p){
		if(this.money < p.price) {
			System.out.println("금액 부족!");
			return;
		}
		
		this.money -= p.price;
		add(p);
		
	}//void buy의 끝
	
	
	/*
    - private void add(모든 상품을 받을 수 있도록 선언)
    
    - 매개변수로 전달된 상품을 장바구니에 담는다.
     상품이 추가될 때 마다 i의 값을 하나씩 올린다.
     
    - 만약 i의 값이 장바구니의 크기보다 같거나 크다면
     기존의 장바구니보다 크기가 * 2 큰 배열을 생성.
     기존의 장바구니의 값을 새로운 배열에 복사.
     새로운 장바구니의 주소값을 기존의 장바구니와 바꿉니다.
     
    
    - info() 호출.
    */
	private void add(Product p) {
		if(this.i >= cart.length) {//배열에 자리가 없어요.
			//새로운 장바구니를 만들자.
			Product[] temp = new Product[cart.length*2];
			//기존 배열에들어있는 상품을 새로운 배열에 옮기자.
			for(int n=0; n<cart.length; n++) {
				temp[n] = cart[n];
			}
			cart = temp;
			temp = null;
		}
		
		cart[i] = p;//물건을 배열에 추가
		i++;//개수 증가.
		
		info();
		
	}//void add 끝

	/*
    - public void info()
    
    - 장바구니 안에 담긴 물건의 목록(name)을 출력합니다.
    - 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력.
    - 남은 금액 출력.
    
    - MyCart 선언이 완료되었다면 MainClass에서 buy메서드 호출.
    */
	
	public void info() {
		System.out.println("------------------------------------");
		System.out.println("****현재 장바구니 정보******");
		
		int total = 0;//총 상품의 합계를 담아줄 변수.
		
		for(int idx=0; idx < this.i; idx++){
			System.out.println(cart[idx].name + " ");
			total += cart[idx].price;//그냥 for문
			
		
//		for(Product p: cart) {
//			if(p == null) break;
//			System.out.println(p.name + " ");
//			total += p.price; //이 식들도 맞은것 향상 for문
		}
		System.out.println();
		
		System.out.printf("총 물건의 가격: %d원\n", total );
		System.out.printf("남은 금액: %d", this.money);
	}
	
	
	
	
	
	
	
}

















