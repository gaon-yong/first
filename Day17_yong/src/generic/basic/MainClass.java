package generic.basic;

public class MainClass {

	public static void main(String[] args) {

		//제네릭을 사용하면, 객체로 생성할 대 사용할 타입을 지정할 수 있고,
		//다양한 값을 저장할 수 있도록 생성할 수 있습니다.
		
		Box<String> box = new Box<>();// 자바7 이후로 생성자 타입은 생략 가능.
		box.setT("홍길동");
		String name = box.getT();
		
		//제네릭에는 기본 데이터 타입을 지정할 수 없습니다. 객체 타입만
//		Box<int> intBox = new Box<int>(); (x)
		Box<Integer> intbox = new Box<Integer>();
		intbox.setT(2);
		int num = intbox.getT();
		
		Box<Person> pBox = new Box<>();
		pBox.setT(new Person());
		pBox.getT();
		
		
		System.out.println(name);
		System.out.println(num);
		System.out.println(pBox);
		
		
		
		
		
		
		
		
		
		
	}

}






