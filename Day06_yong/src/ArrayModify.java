import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {
		
		String[] foods = {"����", "����", "����", "�ܹ���"};
		System.out.println(Arrays.toString(foods));
		
		foods[0] = "ġŲ";
		foods[2] = "������";
		System.out.println(Arrays.toString(foods));
		
		//�迭�� �ε��� Ž��
		System.out.println("-----------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ž���� ������ �Է��ϼ���: ");
		String name = sc.next();
		
		boolean flag = false;
		for(int i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("Ž�� �Ϸ�!");
				System.out.println("�ε���: " + i + "��");
				flag = true;
				break;
//				int i;
//				for(int i=0; i<foods.length; i++) {
//					if(name.equals(foods[i])) {
//						System.out.println("Ž�� �Ϸ�!");
//						System.out.println("�ε���: " + i + "��");
//				break;
			}
			
			}
//			if(i == foods.length-1) {
//				System.out.println("���� �����Դϴ�.");
//			}
			if(!flag) {//flag�� not true�� ��. flag == false
				System.out.println("���� �����Դϴ�.");
			} 
			
		sc.close();
				
	
		
		
		
		
		
	}

}






















