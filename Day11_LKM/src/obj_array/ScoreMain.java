package obj_array;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		/*
		 - Score 객체를 담을 수 있는 배열을 선언하세요.
		  배열의 크기는 넉넉하게 100개로 하겠습니다.
		  
		 - 반복문을 이용해서 사용자에게 이름, 국어, 영어, 수학점수를
		 입력받은 후, 입력받은 점수를 토대로 Score 객체를 생성하세요.
		 총점과 평균은 여러분들이 직접 구해서 넣으셔야 합니다.
		 (직접 넣으시든, 메서드를 하나 만들어서 계산하시든 마음대로~)
		 객체 생성 후, 미리 만들어 놓은 배열에 객체를 추가해 주세요.
		 이름 입력란에 '그만' 이라고 입력하면 반복문을 종료시켜 주세요.
		 
		 - 반복문이 종료되었다면, 배열 내부에 있는 객체들을 순회하면서
		  scoreInfo()를 모두 불러주세요. (반복문)
		  주의!) 입력이 중간에 그만두어진다면, 배열의 나머지 인덱스는
		  모두 null로 가득 차 있습니다. (null.scoreInfo() -> 에러)
		 */
		
		Scanner sc = new Scanner(System.in);
		Score[] person = new Score[100];
		
		
		int a = 0;
		for(int i=0; i<person.length; i++) {
			System.out.println("***학생 점수 입력 프로그램***");
			System.out.println("'그만'을 입력하시면 종료도비니다.");
			
			System.out.println("이름을 입력해주세요: ");
			String name = sc.next();
			if(name.equals("그만")) {
				
				System.out.println("입력을 종료합니다.");
				break;
			}
			
				System.out.println("국어를 입력해주세요: ");
				int kor = sc.nextInt();
				
				System.out.println("수학을 입력해주세요: ");
				int math = sc.nextInt();
				
				System.out.println("영어를 입력해주세요: ");
				int eng = sc.nextInt();
				
				int total = kor + math + eng;
				double avg = total/3.0;
				
		
			person[i] = new Score (name, kor, math, eng, total, avg);
			System.out.println("***정보입력완료***");
		}//입력 반복문
		
		for(int i=0; i<a; i++) {
			if(person == null)break;
			person[i].scoreInfo();
			System.out.println("------------------------------------");
			
		}
		
		
		sc.close();

	}

}
















