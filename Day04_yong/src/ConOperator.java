
public class ConOperator {

	public static void main(String[] args) {
		
		/*
		 # 3항 연산자
		 - 피 연산자(연산을 당한는 값)가 3개인 연산자를 말합니다.
		 - (조건식 ? 좌항 : 우항)
		 - 조건식을 비교하여 true가 도출되었을 시에는 좌항이,
		 false가 도출되었을 시에는 우항의 식이 도출됩니다.
		 */
		
		int x = 10, y = 20;
		
		String result = (x > y ? "x는 y보다 큽니다." : "x는 y보다 작습니다.");
		System.out.println(result);
		
		//난수를 발생시키는 메서드 Math.random();
		//0.0이상 1.0미만의 실수 난수값을 반환합니다.
		
//		double rn= Math.random();
//		System.out.println(rn);
		
		//1~10까지 정수 난수를 발생시키고 싶어요~
		int rn = (int) ((Math.random()*10) + 1);
		System.out.println(rn);
		
		//10~100까지 정수 난수 발생
		int rn2 = (int) ((Math.random()*91) + 10);
		
		//34~ 176까지 정수 난수 발생(177-34=143)
		int rn3 = (int) ((Math.random()*177) + 143);
		
		//27~232까지의 정수 난수.(233-27=206)
		int rn4 = (int) ((Math.random()*206) + 27);
		
	}

}