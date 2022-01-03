package inherit.quiz;

public class MainClass {

	public static void main(String[] args) {
		
	/*
	
       - 학생(Student), 선생(Teacher), 종업원(Employee)
        클래스를 생성하려고 합니다.
        
       - 세 클래스는 공통적으로 이름과 나이를 가지고 있습니다.
       
       - 세 클래스는 공통적으로 info() 메서드를 가지고 있습니다.
       (리턴 타입: String, 이름: XXX, 나이: XXX )
       
       - 학생은 학번(studentId)을 가지고 있고,
        선생은 담당 과목(subject)를 가지고 있고,
        종업원은 부서 (departments)를 가지고 있습니다.
        
       - 부모 클래스의 이름은 Person으로 하겠습니다.
        Person 클래스 생성 후 각각의 자식 클래스 생성 하시고
        MainClass에서 정보를 출력해 보세요.
       */	
	 
		
		Student s1 = new Student();
		s1.name = "김동현";
		s1.age = 29;
		s1.studentId = "인하2011";
		System.out.println(s1.info());
		
		System.out.println("--------------------");
		
		Teacher t1 = new Teacher();
		t1.name = "정은혜";
		t1.age = 29;
		t1.subject = "음악";
		System.out.println(t1.info());
		
		System.out.println("----------------------");
		
		Employee e1 = new Employee();
		e1.name = "정호성";
		e1.age = 29;
		e1.department = "작가부";
		System.out.println(e1.info());
		
		
		

	}

}

















