package generic.basic;

public class Box<T> {//제네릭 클래스로 선언.
	//무엇이 들어올지 모를때는 <> 안에 아무거나 대문다로 쓰면 된다
	
	private T t;
	
	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
	
	
	
	
	
	
}
	