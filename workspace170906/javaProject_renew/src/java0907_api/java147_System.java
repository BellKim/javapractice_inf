package java0907_api;

import java.text.SimpleDateFormat;

public class java147_System {
	public static void main(String[] args) {
		
		//currentitmeMillis() ;: 1970. 1. 1. 부터 
		//초단위로 누적한 값을 밀리세컨드로 리턴한다.
		//하루는 86400chdlek. 1chsms 1000밀리세컨드이다. 
		
		
		long curr = System.currentTimeMillis();
		//system.out.println(curr);
		String pattern = "yyyy-MM-dd HH:mm:ss a EEEE";//대소문자 구분 꼭할것. 대문자와 소문자의 쓰임이 다 다르다. 구분해서 알아둘것. 
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		/*
		 * SimpleDateFormat : 날짜 시간 형식의 패턴을 제공해주는 클래스이다.
		 * MM:월, mm:분
		 * hh:12시간,  HH:시간
		 *  
		 *  //java.text.SimpleDateFormat 참조
		 *  http://docs.oracle.com/javase/8/docs/api/
		 * 
		 */
		
		
		
		String data = sdf.format(curr);
		
		System.out.println(data);
		
		
		
	}

}
