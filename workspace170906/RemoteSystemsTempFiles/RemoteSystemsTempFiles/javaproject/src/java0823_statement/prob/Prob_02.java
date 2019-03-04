package java0823_statement.prob;
/*
 * 
 * 2001부터 2012년사이에서 윤년을 구하시오 
 * [출력결과]
    2004
    2008
    2012
 */
/*
* 평년, 윤년을 구하는 프로그램을 구현하시오.
* 1. 윤년의 조건
* 	1)년도를 4로 나눈 나머지가 0이고,  100로 나눈 나머지가 0이 아니다. 
* 	2)년도를 400로 나눈 나머지가 0이다.
* 
* 2. [출력결과]
*/

public class Prob_02 {

	public static void main(String[] args) {
		
		for(int i = 2001; i<=2012; i++) {
			if(i%4==0 || i%100==0 && i%400==0) {
				System.out.printf("%d년은 윤년입니다. \n", i);
			}
			//System.out.printf("%d그냥츌력 \n ", i);
			
		}
	}//end main()

}//end class













