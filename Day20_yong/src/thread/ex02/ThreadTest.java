package thread.ex02;

public class ThreadTest extends Thread{

	//스레드의 기능을 전부 상속받아서 사용할 수 있다.
	//Runnable 인터페이스를 구현했을 때는
	//스레드 클래스에 정의된 static 메서드만 사용이 가능.
	
	
	@Override
	public void run() {
		System.out.println(getName());
		System.out.println("스레드 시작!");
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
}

























