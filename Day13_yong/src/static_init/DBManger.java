package static_init;

public class DBManger {

	public static String addr;
	public static String uid;
	public static String upw;
	
	static {
		System.out.println("정적 초기화자가 호출됨!");
		addr = "192.168.0.1:8181/XEPDB1";
		uid = "abc1234";
		upw = "aaaa1111!";
	}
	
//	public DBManger() {
//		System.out.println("생성자가 호출됨!");
//		addr = "192.168.0.1:8181/XEPDB1";
//		uid = "abc1234";
//		upw = "aaaa1111!";
//	}
	
	
	
}







