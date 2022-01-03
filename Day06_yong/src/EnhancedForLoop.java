
public class EnhancedForLoop {

	public static void main(String[] args) {
		
		/*
		 # ���� for��(forEach)
		 -�����(�ε���)�� ��� ���� �迭 ������ ��Ҹ� 
		 ��ü ������ �� �ְ� �� �ִ� �ݺ���.		
		 -����:������ ������� ������ �� ����(��ü�� ���� ������)
		 -���������� ������ �迭 ���� ���¿��� ��� ����
		 ex)
		 for(�迭 ��Ҹ� �޾��� �� �ִ� ���� :�迭������ ){
		  �ݺ� ���ູ...
		 }
		 */
		
		String[] week = {"��" ,"ȭ" , "��" , "��" ,"��", "��", "��"};
//		
//		for(int i=0; i<week.length; i++) {
//			System.out.println(week[i] + "����");
//		}
		
		for(String day : week) {
			System.out.println(day + "����");
		}
		System.out.println("-----------------------------");
		
		/*
		 1. scores��� �̸����� int�迭�� �ϳ� �����ؼ�
		 ���� �����͸� �����ϼ���
		 {96, 88, 74, 63, 100, 55}
		 
		 2. ��� for���� ����Ͽ� ������ ����� ���غ�����.
		 ����(int), ���(double, �Ҽ� ��° �ڸ����� ���)
		 */
		
		int[] scores =  new int[] {96, 88, 74, 63, 100, 55};
		
		int total = 0;
		for (int s : scores) {
			total += s;
			
		}
		
		double avg = (double) total / scores.length;
		
		
		System.out.printf("����: %d��, ���: %.2f��\n" ,total , avg);
		
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
