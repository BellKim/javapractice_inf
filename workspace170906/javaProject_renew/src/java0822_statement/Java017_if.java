package java0822_statement;
/*
 * 	제어문(control statement) : 문장의 흐름을 제어해주는 기능이다. 
 * 	1. 종류
 * 		조건문 : if-else, switch~case
 * 		반복문 : for, while, do~while
 * 		기   타 : break, continue, label(?)
 * 		
 * 		if(조건식){
 * 			수행할 문장;//조건식이 참일때 수행.
 * 		}else{
 * 			수행할 문장;//조건식이 거짓일때 수행.
 * 		}
 * 
 */

public class Java017_if {

	public static void main(String[] args) {
		int num = 7;
		if(num%2 == 0){
		System.out.printf("%d는 %s 입니다. \n", num,"짝수");
		}else {
		System.out.printf("%d는 %s 입니다. \n", num,"홀수");
		}
		
		

	}//end of main()

}	//end of class()
