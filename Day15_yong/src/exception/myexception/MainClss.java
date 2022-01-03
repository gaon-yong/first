package exception.myexception;

public class MainClss {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.setOperand(20, 0);
		try {
			c.divid();
		} catch (DivideException e) {
			
			e.printStackTrace();
			System.out.println("에러 코드: " + e.getErrcode());
		}
		
		
	}

}
