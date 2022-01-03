
public class AccountMain {

	public static void main(String[] args) {
		
		Account myAcc = new Account("홍길동", 1234, 3600);
		
		myAcc.deposit(800);
		myAcc.withdraw(500, 1234);
		int bal = myAcc.getbalane();
		System.out.println(myAcc.name + "님의 계좌 잔액은 " + bal + "입니다.");
		
		

	}

}





