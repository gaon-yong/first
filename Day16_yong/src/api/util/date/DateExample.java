package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	
	public static void main(String[] args) {
		
	
	 /*
	  Date 클래스는 운영체제로부터 현재 시간을 
	  날짜 표현 형식으로 포장하는 클래스입니다.
	 */
	
	Date date = new Date();
	System.out.println(date);
	
	//날짜를 원하는 형식의 서식 문자를 이용하여 출력을 도와주는 클래스
	SimpleDateFormat sdf;
	
	sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");//HH ->17시를 표현
	String dayInfo = sdf.format(date);
	System.out.println(dayInfo);
	
	sdf = new SimpleDateFormat("yy-MM-dd a hh:mm:ss");//a <- am/pm /hh <- 1~13
	dayInfo = sdf.format(date);
	System.out.println(dayInfo);
	
	sdf = new SimpleDateFormat("오늘 E요일입니다. 오늘은 1년 중 D날 입니다");
	System.out.println(sdf.format(date));		
	
	
	
	
	}	
	
}




























