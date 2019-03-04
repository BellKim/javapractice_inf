package java0822_basic.prob;
/*
 * 평년, 윤년을 구하는 프로그램을 구현하시오.
 * 1. 윤년의 조건
 * 	1)년도를 4로 나눈 나머지가 0이고,  100로 나눈 나머지가 0이 아니다. 
 * 	2)년도를 400로 나눈 나머지가 0이다.
 * 
 * 2. [출력결과]
 * 	2012년도는 윤년입니다.
 * 	2013년도는 평년입니다.
 */

public class Prob06 {
	public static void main(String[] args) {
		int year = 2012;
		int year1 = 2013;
		String leapYear = " ";
		
		
		
		String res  = ((year%4) == 0 && (year%100) != 0 ) || year%400==0 ?  "윤년" : "평년" ;
		String res1  = ((year1%4) == 0 && (year1%100) != 0 ) || year1%400==0 ?  "윤년" : "평년" ;
		
		
		System.out.printf("연도 : "+year + " 결과 : "+res + "\n");
		System.out.printf("연도 : "+year1 + " 결과 : "+res1 + "\n");
		
		System.out.printf("%d 년도는 %s 입니다. \n",year, res );
		System.out.printf("%d 년도는 %s 입니다. ",year1, res1 );
		
		
		

	}

}
