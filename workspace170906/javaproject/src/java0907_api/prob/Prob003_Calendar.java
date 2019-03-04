package java0907_api.prob;

import java.util.Calendar;


/*
 * 
 * [출력결과]
 * <4시부터 12시 미만일때>
 * 지금은 5시 35분b입니다.
 * Good Morning
 * 
 * <12시부터 18시 미만일때>
 * 지금은 16시 49분입니다.
 * Good Afternoon
 * 
 * <18시부터 22시 미만일때>
 * 지금은 20시 30분입니다.
 * Good Evening
 * 
 *  <그외 일때>
 *  Good Night
 *  
 */


public class Prob003_Calendar {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();//api에 이 문장이 그대로 올라와있다 찾아서 읽어보기
		
		
		int year = cal.get(Calendar.YEAR);//month 는 1월일때 0으로 리턴한다.
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		
		cal.set(year, month, date);  //, 12, 12, 12); //수동으로 시간을 셋팅하고 싶을때는 파라미터 마지막 3개의 주석을 해제해주면 됩니다. 
		
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);	//24시간
		int minute = cal.get(Calendar.MINUTE);	//분
		int second = cal.get(Calendar.SECOND);	//초
		
//		System.out.printf("%d - %d - %d \n",year, month, date);
		System.out.printf("%d - %d - %d  %d : %d : %d \n",year, month, date, hour, minute, second);
		
		
		
		if(hour>=4 && hour<=12) {
			System.out.println(" Good morning");
		}else if(hour>=12 && hour<=18) {
			System.out.println(" Good evening");
		}else {
			System.out.println("good NIGHT@!!@!@!@!@!@!@!@");
			
		}
			
	}//end main()
}//end class
