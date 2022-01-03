package api.io.rw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		
		/*
		 - 문자 기반으로 읽어들이는 클래스는 FileReader 입니다.
		 - 2바이트 단위로 읽기 때문에 문자를 읽어들이기 적합합니다.
		 */
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:\\Users\\yong\\Desktop\\java_web_yong\\file\\meron.txt");
		
			char[] arr = new char[100];
			
			int result = fr.read(arr); //문자를 하나씩 읽어들임.
			System.out.println("문자의 개수: " + result);
			for(char c : arr) {
				System.out.print(c);
				if(c == 0) break;
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}




























