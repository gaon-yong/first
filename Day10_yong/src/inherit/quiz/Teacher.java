package inherit.quiz;

public class Teacher extends Person{
	
	String subject;

	@Override
	String info() {
		
		
		return super.info() + ", 담당 과목: " + subject;
	}
	
	
}
