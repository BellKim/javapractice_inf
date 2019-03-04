package java0822_statement;
/*
 * 1. data 변수에 저장된 값이 영문자 대문자이면 "대문자입니다", 소문자이면 "소문자입니다" 출력하기.
 * 그외는 "기타입니다" 로 출력하는프로그램 만들기.
 * 
 * 2. [출력결과]
 * 	data='D' => 대문자입니다. 
 * 	data='d' => 소문자입니다.
 * 	data='1' => 기타입니다.
 * 
 */

public class Java021_if {

	public static void main(String[] args) {
		
			char data = 'A';
			
			if(data<=90 && data>=65) {
				System.out.println("대무자입니다.");
			}else if(data<=122 && data>=61) {
				System.out.println("소문자입니다.");
			}else {
				System.out.println("기타입니다.");
			}
			
			
			
			if(data>='A' && data<='Z') {
				System.out.println("대문자입니다.");
			}else if(data>='a' && data<='z') {
				System.out.println("소문자입니다.");
			}else {
				System.out.println("기타입니다.");
			}
		

	}

}
