import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			String[] kakao = {"����", "�׿�", "����ġ", "���̾�", "������"};
			
			System.out.println("���� ����� ģ����: " + Arrays.toString(kakao));
			System.out.println("������ ģ���� �Է��ϼ���: ");
			String name = sc.next();
			
			/*
			 1. ������ ģ���� �Է¹޾Ƽ� ������ �����ϼ���.
			 
			 2. �Է¹��� �̸��� ���ٸ� ���ٰ� ����� �ּ���.
			 */
			int i;
			outer:for(i=0; i<kakao.length; i++) {
				if(name.equals(kakao[i])) {
					System.out.println("Ž���� �����Ͽ����ϴ�.");
					System.out.println("�ε���: " + i +"��");
					break;
				}
				if(i == kakao.length-1) {
					System.out.println("�Է¹��� �̸��� �����ϴ�.");
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





















