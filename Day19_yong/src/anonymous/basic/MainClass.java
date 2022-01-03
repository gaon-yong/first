package anonymous.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Car s1 =new Sonata();
		s1.run();
		
		Car s2 = new Sonata();
		s2.run();
		
//		Garage g = new Garage();
		
		Car tesla = new Car() {
			//익명 클래스!! 여기서만 한번 사용하려고 클래스 틀을 만들기에는 자주 사용할 것이 아니어서
			@Override
			public void run() {
				System.out.println("테슬라가 달립니다");
			}
			
		};
		
		tesla.run();
		
		new Car() {
			@Override
			public void run() {
				System.out.println("포르쉐는 달립니다~");
			}
		}.run();

		
		
		
		
		
		
		
		
	}

}















