package java0907_api;
/*
 * 윤년과 평년의 여부를 구하는함수이다. 
 * 
 * 윤년이면 1이출력되며 true 
 * 윤년아니면0 false 
 * api를 찾아서 한버더볼껏것ㅈ
 * 
 */
import java.util.GregorianCalendar;

public class java150_GregorianCalendar {

	public static void main(String[] args) {
		
		int year = 2016; 
		GregorianCalendar gre = new GregorianCalendar();
		//윤년이면 true, 평년이면 false
		if(gre.isLeapYear(year)) {
			System.out.println(year + "년도는윤년입니다. ");
		}else {
			System.out.println(year + "평년입니다. ");
		}
	

	}//end main()

}//end class
