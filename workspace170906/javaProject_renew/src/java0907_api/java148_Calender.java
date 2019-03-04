package java0907_api;

import java.util.Calendar;

public class java148_Calender {

	public static void main(String[] args) {
		//java.util.calender api 참조
		//Calendar rightNow = Calendar.getInstance();//api에 이 문장이 그대로 올라와있다 찾아서 읽어보기
		Calendar cal = Calendar.getInstance();//api에 이 문장이 그대로 올라와있다 찾아서 읽어보기
		int year = cal.get(Calendar.YEAR);
		//month 는 1월일때 0으로 리턴한다. 
		//int month = cal.getMaximum(Calendar.MONTH)+1;//0월부터 시작하기때문에 +1해줌.(시스템에서 제공해주는API이라서 수정이 불가능하고, 컴퓨터는 기본적으로 0부터 숫자를 카운트 해서일지도?) 월의 최대숫자출력 cal.getmaximum
		
		int month = cal.get(Calendar.MONTH)+1;
		
		int date = cal.get(Calendar.DATE);
		
//		int hour = cal.get(Calendar.HOUR);	//12시간
		int hour = cal.get(Calendar.HOUR_OF_DAY);	//24시간
		int minute = cal.get(Calendar.MINUTE);	//분
		int second = cal.get(Calendar.SECOND);	//초
		
		
		System.out.printf("%d - %d - %d \n",year, month, date);
		
		System.out.printf("%d - %d - %d  %d : %d : %d \n",year, month, date, hour, minute, second);
		
		
		
//		9월달의 마지막일을 리턴하고자 할떄 
		System.out.println("9월의 마지막달 : "+cal.getActualMaximum(Calendar.DATE));
		
		//오늘요일 리턴. 일요일이 1 화요일이 2 ..... 토요일 7
		System.out.println("오늘요일 리턴(일요일 -> 1) : "+cal.get(Calendar.DAY_OF_WEEK));
		
		cal.add(Calendar.DATE,-5);
		System.out.println(cal.get(Calendar.DATE));
		
		//2017-3-1
		cal.set(2017, 2, 1);
		System.out.printf("%d-%d-%d\n", 
				cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH)+1,
				cal.get(Calendar.DATE));
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}// end main

}//end class
