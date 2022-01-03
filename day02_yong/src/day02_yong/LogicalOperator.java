package day02_yong;

public class LogicalOperator {

	public static void main(String[] args) {
		
		//비교(관계) 연산자(<, <=, >=, ==, !=)
		//좌항과 우항의 크기를 비교하여 결과값으로
		//항상 논리형 타입의 값을 도출합니다.
		//<(초과), <=(이상) 이런 개념, ==(같다), !=(같지 않다)
		
		int x = 10, y = 20;
		
		System.out.println(x > y);
		System.out.println(x != y);
		
        System.out.println("----------------");		
	
		/*
		 # 논리 연산자 (&, &&, |,||)
		 -좌항과 우항의 논리값을 연산하여 하나의 논리값을 도출합니다.
		 1. &, &&: 양쪽 항의 논리값이 모두 true일 경우에만 true가 도출됩니다.
		 ex) 졸업을 할 때 성적과 취업이라고 할 때 취업만 한 경우에는 졸업x
		 
		 2. |, ||: 양쪽 항의 논리값 중 한 쪽만 true여도 true를 도출합니다.
		 ex) 졸업을 할 때 성적 또는 취업이라고 할 때 취업만 한 경우에는 졸업o
		 
		 &&, || -> 단축 평가 연산(short circuit operation)
		 - 좌항의 연산 결과가 전체 연산 결과에 영향을 미칠 경우
		 우항의 연산을 진행하지 않습니다.
		 */

		System.out.println(x >10 && (y / 0 == 10));
		System.out.println(x > 10 || y < 30);
		// x는 10이기에 false 지만 y는 30보다 작기 때문에 결과값은 true

		
		//논리 반전 연산자 (!: 단항)
		//단순히 논리값을 반전시킬 때 사용합니다.
		//true -> false, false -> true
		
		int z = 10;
		System.out.println(!(z == 10));
		// (z == 10) 앞에 ! 붙으면 not 이 붙는거랑 같아서 not true가 된다.
		// ! 은 논리 값 앞에만 쓰여서 비교 앞에서 쓰일려면 !(a <= c) 이렇게 써야 한다.
		
		
	}

}
