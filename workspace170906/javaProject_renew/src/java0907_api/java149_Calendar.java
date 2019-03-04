package java0907_api;

import java.util.Calendar;

/*
 * 2016년 2월 마지막일과 요일을 구하는 프로그램을 구현하세요
 * 
 * [출력결과]
 * 2016 - 2 - 29

 */

public class java149_Calendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 1,1);
		


		int week = cal.get(Calendar.DAY_OF_WEEK);
		String week_res=" ";
		
		switch(week){
		case 0:
			week_res = "일";
			break;
		case 1:
			week_res = "월";
			break;
		case 2:
			week_res = "화";
			break;
		case 3:
			week_res = "수";
			break;
		case 4:
			week_res = "목";
			break;
		case 5:
			week_res = "금";
			break;
		case 6:
			week_res = "토";
			break;
		}
		
		
		System.out.printf("%d-%d-%d %s\n", 
				cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH)+1,
				cal.get(Calendar.DATE),week_res);
		
		


		
		System.out.println("2월의 마지막일 : "+cal.getActualMaximum(Calendar.DATE));
		
		
		

	}

}
