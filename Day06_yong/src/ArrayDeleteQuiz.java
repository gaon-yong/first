import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			String[] kakao = {"무지", "네오", "어피치", "라이언", "제이지"};
			
			System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
			System.out.println("삭제할 친구를 입력하세요: ");
			String name = sc.next();
			
			/*
			 1. 삭제할 친구를 입력받아서 삭제를 진행하세요.
			 
			 2. 입력받은 이름이 없다면 없다고 얘기해 주세요.
			 */
			int i;
			outer:for(i=0; i<kakao.length; i++) {
				if(name.equals(kakao[i])) {
					System.out.println("탐색에 성공하였습니다.");
					System.out.println("인덱스: " + i +"번");
					break;
				}
				if(i == kakao.length-1) {
					System.out.println("입력받은 이름이 없습니다.");
					continue outer;
				}
			}
			for(i=i+1; i<kakao.length-1; i++) {
				kakao[i] = kakao[i+1];
			}
			String temp[] = new String [kakao.length-1];
			for(int j=0; j<temp.length; j++) {
				temp[j] = kakao[j];
			}
			
			kakao = temp;
			temp = null;
			
			
			System.out.println(Arrays.toString(kakao));	
			
			
			
			sc.close();
			
	
	
		}

	}





















