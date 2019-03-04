package java0905_api;
/*
 * 정규식 (Regular Expression)
 * 1. 정규식이란 텍스트 데이터중에서 원하는 조건(패턴)과 일치하는 문자열을 
 * 		찾아내기 위해서 사용하는것으로 미리 정의된기호와 문자를 이용해서 
 * 		작성한 문자열을 말한다.
 *  
 */

public class java124_RegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sn = "java korea";
		String sg = " ";
		String st = "java     korea";
		
		for(int i=0; i<sn.length(); i++) {
			if(sn.charAt(i)=='a' || sn.charAt(i)=='r')
				sg+='_';
			else
				sg+=sn.charAt(i);
		}
		System.out.println(sg);
		
		System.out.println("regular expression 을 이용한 문자변경");
		System.out.println(sn.replaceAll("[ar]","_"));//[ar] a이거나r 인것을 _ 로바꿔라
		//[] 대괄호는 or 을 의미한다. 
		//sn 변수에 저장된 문자열에서 a이거나 r 이면 "_"로 변경한다. 
		System.out.println(sn.replaceAll("[ar]", "_"));
		
		//sn변수에 저장된 문자열에서 a이거나 r이 포함되면 true, 아니면 false를 리턴한다. 
		System.out.println(sn.matches(".*[ar].*"));//논리값 출력 (true) .*(ar 로시작하는지) [ar] .* (ar로 끝나는지)
		
		
		//{2,3} 2개부터 3개까지의 공백을 "@"으로 변경한다.
		System.out.println(st.replaceAll("\\s{2,3}", "@")); 	
		// "\s" 는 공백을 의미한다. 그런데 " " 안에 역슬레쉬\ 를 사용해야 하니까 \를 한번 더 써줘서 문자로 사용할 수 있도록 \\ 를 써준다. 
		
		
		
	}//end main
	

}
