import java.util.Scanner;

public class ArrayInserQuiz {

	public static void main(String[] args) {
			
			
		/*
		 1. String �迭�� �����ϼ���. (foods)
		 ũ��� �˳��ϰ� 50��
		 
		 2. ����ڿ��� ���� �̸��� �Է¹޾Ƽ� �迭�� �������ּ���.
		 ����ڰ� ���� �Է�â�� '��ҷ�'��� �ۼ��ϸ� 
		 �Է��� ������ �ּ���.
		 
		 3. �Է��� ����Ǹ� ����ڰ� �Է��� ������ 
		 ���η� ����� �ּ���.
		 
		 4.*** �߰� ����***
		 �Է��� �޾Ҵµ� �̹� �迭�� �����ϴ� �����̶�� 
		 '�̹� �����ϴ� �����Դϴ�' �� ����ϰ� 
		 �ٽ� ���ο� ������ �Է¹��� �� �ֵ��� �ڵ带 ������ ������.
		 */
		String[] foods = new String[50];
		Scanner sc = new Scanner(System.in);
		int i;
		for( i=0; i<foods.length; i++) {
			System.out.print("���� �̸��� �Է����ּ���: ");
			String name = sc.next();
			
			
			if(name.equals("��ҷ�")){ 
				System.out.println("�Է��� �����մϴ�.");
			break;
			}
			int j;
			for(j=0; j<foods.length; j++) {
				if(name.equals(foods[j])) {
					System.out.println("�̹� �����ϴ� �����Դϴ�.");
					continue;
				}
			}
			
//			if(j != foods.length) {
//				System.out.println("�̹� �����ϴ� �����Դϴ�.");
//				i--;
//				continue;
//			}
				foods[i] = name;
		}	
		
	   System.out.println("-----------------------------");
	   System.out.print("���� �԰���� ���ĵ�: ");
	   for(String f : foods) {
		   if(f == null) break;
		   System.out.println(f + " ");
	   }
	   
		
		sc.close();
		
		
		
		
		
	}

}

























