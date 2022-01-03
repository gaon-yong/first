package final_.constant;

public class Earth {
	
	static final double RADIUS = 6400;//static은 모든 객체가 공유할 수 있는 공유값
	//상수는 	대문자로 쓰는게 관례			//final은 불변 그래서 static final은 상수
	static final double SURFACE_AREA;//camel case가 힘들어서 _로 
	
	
	static { //<-정점 초기화자
		SURFACE_AREA = RADIUS *RADIUS * Math.PI *4;
	}
	
	
}
