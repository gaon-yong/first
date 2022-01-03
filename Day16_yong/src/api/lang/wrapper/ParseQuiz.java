package api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력해주세요: ");
		String ssn = sc.next();
		//920307-1234567
		
		int year = Integer.parseInt(ssn.substring(0, 2));
		int month = Integer.parseInt(ssn.substring(2, 4));
		int day = Integer.parseInt(ssn.substring(4, 6));
		char c = ssn.charAt(7);
		
		String gender;
		if(c== '1' || c== '3') {
			gender = "남자";
		} else {
			gender = "여자";
		}
		
		int birthYear;
		if(c == '1' || c == '2') {
			birthYear = year + 1900;
		} else {
			birthYear = year + 2000;
		}
		
		int age = 2021 - birthYear;
		
		System.out.printf("%d년 %d월 %d일 %d세 %s\n"
				, birthYear, month, day, age, gender);
		

	}

}
