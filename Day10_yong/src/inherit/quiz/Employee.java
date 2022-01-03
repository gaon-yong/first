package inherit.quiz;

public class Employee extends Person{

	String department;

	@Override
	String info() {
		
		return super.info() + ", 부서: " + department;
		
	}
	
	
}
