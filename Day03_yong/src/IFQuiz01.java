import java.util.Scanner;

public class IFQuiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력해주세요: ");
		int height = sc.nextInt();
		System.out.print("나이를 입력해주세요: ");
		int age = sc.nextInt();
		
		
		if(height >= 140 && age >= 8 ) {
			System.out.println("놀이기구에 탑숭할 수 있습니다.");
			
		} else {
			System.out.println("놀이기구에 탑습할 수 없습니다.");
		}
		
		System.out.println("오늘 하루 즐거운 시간 되세요~");
		
		sc.close();
	

	}

}
