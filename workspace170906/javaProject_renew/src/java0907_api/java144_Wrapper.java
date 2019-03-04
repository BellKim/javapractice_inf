package java0907_api;

public class java144_Wrapper {

	public static void main(String[] args) {
		char data = 'a';
		
		//대문자
		System.out.println(Character.toUpperCase(data));
		
		//소문자ㅏ
		System.out.println(Character.toLowerCase(data));
		
		//대문자 검색
		System.out.println(Character.isUpperCase(data));
		
		//소문자검색
		System.out.println(Character.isLowerCase(data));
		
		//숫자 검색
		System.out.println(Character.isDigit(data));
		
		//알파벳 검색
		System.out.println(Character.isAlphabetic(data));
				
		
				
	}//end main

}//end class
