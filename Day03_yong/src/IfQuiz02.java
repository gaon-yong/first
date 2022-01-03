import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		
		/*
		 - 정수를 2개 입력 받아서, 두 정수 중 어느 수가 더 큰지
		 혹은 같은지를 판별하시면 됩니다.
		 Ex)
		 입력받은 수: 4, 7->  7이 큰 수입니다
		 입력받은 수: 5, 5 -> 같은 수 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 a를 입력해 주세요.");
		int a = sc.nextInt();
				
		System.out.println("정수 b를 입력해 주세요.");
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println(a + "이(가) 큰 수 입니다");
		} else if (a < b) {
			System.out.println(b + "이(가) 큰 수 입니다");
		} else {
			System.out.println("같은 수 입니다.");
		}
			
			sc.close();
		

	}

}
