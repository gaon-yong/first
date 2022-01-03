package poly.car;

public class MainClass {

	public static void main(String[] args) {
		
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Car s3 = new Sonata();
		
		Car b1 = new Benz();
		Benz b2 = new Benz();
		Benz b3 = new Benz();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Car t3 = new Tesla();
		Tesla t4 = new Tesla();
		
//		s1.run();s2.run();이렇게 쭈욱 10개를 부르거나
		
//		Sonata[] sonatas = {s1,s2,s3};
//		for(Sonata s : sonatas) {
//			s.run();
//		} 소나타, 벤츠, 테슬라를 이렇게 반복문 돌리거나
		
		Car[] cars = {s1,s2,s3,b1,b2,b3,t1,t2,t3,t4};
		//하위타입인 Benz, Tesla, Sonata가 Car 로 자동 형타입 변환 
		for(Car c : cars) {
			c.run();
		}
		
		System.out.println("--------------------------");
		
		Driver kim = new Driver();
		kim.drive(t3);
		kim.drive(b2);
		kim.drive(s1);
		
//		Car c = kim.buyCar("테슬라");
//		c.run();
//		Tesla t5 = (Tesla) c;
//		t5.enterMembership();
		Tesla t5 = (Tesla) kim.buyCar("테슬라");
		t5.run();
		t5.enterMembership();
		
		System.out.println("---------------------");
		
		s1.frontLeft = new Ntire();
		s1.frontRight = new Ntire();
		s1.rearLeft = new Htire();
		s1.rearRight = new Htire();
		
		CarShop shop = new CarShop();
		shop.carPrice(s1);
		shop.carPrice(new Benz());
		shop.carPrice(kim.buyCar("테슬라"));
		
		
		
	}

}













