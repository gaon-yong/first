package exception.quiz;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc = null;
		
		try {
			acc = new Account(1000);
			acc.deposit(200);
			acc.withdraw(500);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println("계좌 잔액: " + acc.getBalance());
		
		
		

	}

}
