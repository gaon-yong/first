package api.lang.math;

public class MathQuiz {

	static int page(int i) {
		return (int)Math.ceil( i/ 10.0);
	}
	
	
	
	
	public static void main(String[] args) {
		
		/*
		 - 1부터 10까지 전달되면 1이 반환되고
		 11~ 20이 전달되면 2가 반환되고
		 21~30이 전달되면 3이 반환되는
		 page 메서드를 선언해 보세요. (static)
		 */
		
		System.out.println(page(34));
		
		
		
		
		
		
		

	}

}
