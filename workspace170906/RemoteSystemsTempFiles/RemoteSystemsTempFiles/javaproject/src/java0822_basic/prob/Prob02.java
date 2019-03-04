package java0822_basic.prob;

/*
 * data 변수의 값이 대문자이면 'A' , 소문자이면 'a' 를 출력하는 프로그램을 구현하세요 .
 * [실행결과]
 * a
 * 
 */

public class Prob02 {

	public static void main(String[] args) {
		char data = 'b';
		int result = (int)data;
		
		System.out.println("data = "+result);
		
//		char res = 65=<result && result=<90 ? 'A': 'a'; 내가쓴틀린것
		
		/*
		 * 'A'>= data <='Z' (수학)
		 * data >= && data <='Z' (프로그램)
		 * 
		 */
		
		
		char res=data>='A' && data<='Z' ? 'A' : 'a';
		System.out.println("data = "+res);
		
		
		

	} //end of main()
	

}//end of class()

