package java0905_api;

import java.util.StringTokenizer;

public class java132_StringTokenizer {

	public static void main(String[] args) {
		//StringTokenizer (문자열, 구분자)
		//문자열의 구분자가 공백일때는 2번째 인자값은 생략 할 수 있다. 
		
		StringTokenizer st = new StringTokenizer("java, jsp",",");//두번째 인자값(구분자 ",")을 명시해야한다.
		System.out.println("토큰갯수 : "+ st.countTokens());
		
		/*
		for(int i=0; i<st.countTokens(); i++) {
			System.out.println(st.nextToken());	//nextToken을 하면 java를 가지고오면서 메모리를 삭제함. 
		 */
		
		
		//메모리에 저장된 토큰이 있으면 true 없으면 false 를 리턴한다. 
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		
		
		
				
		
		
		
		
		

	}

}










