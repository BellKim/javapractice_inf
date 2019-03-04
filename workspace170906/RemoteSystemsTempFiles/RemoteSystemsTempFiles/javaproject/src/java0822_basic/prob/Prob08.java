package java0822_basic.prob;

/*
 * 1. jumsu 변수에 저장된 값에 따라 상, 중, 하 를 출력하는 프로그램을 작성하시오. 
 *    jumsu 변수의 값이 80 이상이면 "상", 
 *    			80미만 65 이상이면"중", 
 *    				 65 미만이면 "하" 로 출력하시오.
 *    [출력결과]
 *    상
 *    
 *    식1 ? 참1 : 거짓1
 *    식1 ? (식2 ? 참2 : 거짓2)
 *    식1 ? 참1 : (식2 ? 참2 : 거짓2)
 *    식1 ? (식2 ? 참2: 거짓2) : (식3 ? 참3: 거짓3)
 *    
 */

public class Prob08 {

	public static void main(String[] args) {
		int jumsu = 90;
		
		char res = jumsu>=65 ? (jumsu >=80 ? '상' : '중') : '하';
		
		//char res = jumsu>=80 ? "상" : ( jumsu<80 && jumsu>=65 ? "중" : "하" );
		
		
		
		System.out.println(res);
		System.out.printf("출력결과는 %s 입니다. ", res);
		
		
		

	}

}
