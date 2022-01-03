import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		//for 문일때는 continue가 있으면 증감식을 무시하고 바로(해당 회차 기회 없음)
		//while 문일때는 다시 반복(해당 회차에 한번 더 기회)
		for(int i=1; i<=10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println("\n반복문 종료!");
		
		System.out.println("\n--------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		while(true) {
			System.out.println("> ");
			int answer = sc.nextInt();
			
			if(answer == 1) break;
			else if(answer == 0) {
				System.out.println("다른 정수를 입력해 주세요.");
				continue;
			}
			System.out.println("입력한 정수와의 나눗셈 결과: " + (100/answer));
			
		}
		
		sc.close();
		
		
		
		
		
	}

}
