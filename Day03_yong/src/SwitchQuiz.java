import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
		
		
		/*
		 - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		  다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
		  연산 결과를 출력해 주시면 됩니다. (switch문 사용)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1를 입력해주세요: ");
		int num1 = sc.nextInt();
		
		System.out.println("연산을 선택해주세요 [+,-,*,/]: ");
	    String operator = sc.next();
	    
	    System.out.println("정수2를 입력해주세요: ");
	    int num2 = sc.nextInt();
	    
	    System.out.println("-------------------------------");
	    
	    switch(operator) {
	    
	    case "+":
	    	//int result = num1 + num2
	    	System.out.println(num1 + num2);
	    	break;
	    case "-":
	    	
	    	System.out.println(num1 - num2);
	    	break;
	    case "*":
	    	//("%d * %d = %d\n, num1, num2, num1*num2):
	    	System.out.println(num1 * num2);
	    	break;
	    case "/":
	    	System.out.println(num1 / num2);
	    	break;
	    	
	    default: 
	    	System.out.println("사칙연산 기호를 입력해 주세요");
	    	System.out.println("[+, -, *, /]");
	    	
	    	
	    }
	    
	    sc.close();
	    
	    	
	   
	    
		
		
		
		


	}

}
