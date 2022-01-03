
public class MethodQuiz02 {

	static int calcDivior(int i) {
		int count = 0; 
		System.out.print("약수:" );
		for(int j=1; j<=i; j++) {
			if(i % j == 0) {
				System.out.print(j + " ");
				count++;
				
			}
		}
		System.out.println();
		return count;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		/* 1. calcDivisor()메서드를 선언하세요
		 * 2. 이 메서드는 정수 하나를 전달받아서 해당 정수의 
		 * 모든 약수를 가로로 출력하고 약수의 개수를 리턴하는
		 * 메서드입니다. ( 가로로 출력은 메서드 내부에서 진행)
		 * 3. 메서드 선언을 완료하시고, main에서 
		 * 72의 약수의 개수와 10의 약수의 개수를 출력해보세요.
		 * 
		 */
		
		System.out.println("72의 약수의 개수: " + calcDivior(72));
		System.out.println("10의 약수의 개숙: " + calcDivior(10));
		

	}

}











