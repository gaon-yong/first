package modi.member.pac2;

import modi.member.pac1.A;

public class c {

	public c() {
		
		A a = new A();
		a.x = 1;//public
//		a.y = 2;(x)
//	    a.z = 3;(x)
		
		a.method1();
//		a.method2(); default(x)
//		a.method3(); private(x)
		
	}
	
}
