package day02_yong;

public class CastingExample1 {

	public static void main(String[] args) {
		
		/* 
		 - 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
		 자바 가상 머신(JVM)이 자동으로 타입을 올려서 변환해 줍니다.
		 (promotion, UpCasting)
		 */
		byte b = 10;
		int i = b; // byte가 int로 묵시적 변환
		System.out.println(i);
		
		
		char c = 'A';
		int j = c; // 묵시적 변환이 발생(char 보다 int 크기가 더 큼)
		System.out.println(j);
		System.out.println("A의 문자 번호: " + j);
		
		int k = 500;
		double d = k; //int에서 double로 묵시적 변환(promotion)
		System.out.println(d);
		

	}

}
