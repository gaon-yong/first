package thread.ex04_yield;

public class TestB implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("B스레드가 실해중!");
		
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}

}
























