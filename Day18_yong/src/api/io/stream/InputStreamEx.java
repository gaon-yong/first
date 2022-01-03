package api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {
		
		/*
		 1. 파일을 읽어들이는 데 사용하는 클래스	FileInputStream 입니다.
		 2. 생성자의 매개값으로 읽어들일 파일의 전체 경로를 적습니다.
		 3. InPutStream 객체는 생성자에 throws가 있기 때문에
		 try - catch 안에서 사용합니다.
		 */
		
		FileInputStream fis = null;// fis.close;를 해야 하기 때문에 선언을 해놓고 마지막에 finally 
		
		try {// 자바에서 \ 는 탈출코드 그래서 \\ 표현한것이고 / 하나만 써도 된다.
			 fis = new FileInputStream("C:\\Users\\yong\\Desktop\\java_web_yong\\file\\test.txt");
			
//			while(true) {
//				int data = fis.read();// 1바이트 단위로 데이터를 읽어들임. read가 숫자형(int)
//				System.out.print((char)data);//숫자형을 문자형으로 변환 출력
//				if(data == -1) break; //read() 메서드가 더 이상 읽을 값이 없다면 -1을 반환.
//			
//			}
			
			byte[] arr= new byte[100];
			int result = fis.read(arr); //100바이트단위로 읽어들임. <- 배열의 크기만큼
			System.out.println("읽어들인 데이터 길이: " + result);
			System.out.println(Arrays.toString(arr));
			
			int i = 0;
			while(arr[i] !=0) {
				System.out.print((char)arr[i]);
				i++;
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally{
			try {
				// 스트림을 더 이상 사용하지 않을 경우
				// 시스템 자원을 반납하는 코드를 꼭 작성합니다.
				// 반납 안하면 메모리를 많이 먹는다.
				fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}



















