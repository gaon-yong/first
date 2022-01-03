package inter.basic2;

public class Samsung implements Printer {

	String name = "Samsung";
	
	@Override
	public void turnOn() {
		System.out.println(this.name);
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void tounOff() {
		System.out.println(this.name);
		System.out.println("전원을 끕니다.");
	}

	@Override
	public void print(String document) {
		
		System.out.println(this.name);
		System.out.println("문서내용: " + document);
	}

	@Override
	public void colorPring(String document, String color) {
		System.out.println(this.name);
		System.out.println("색상: " + color);
		System.out.println("문서내용: " + document);	
	}

	@Override
	public int copy(int n) {
		for(int i=1; i<=n; i++) {
			System.out.println(i + "장 복사 완료");
		}
		return n;
	}

}
