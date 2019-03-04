package java0904_api.prob;



/*
 1 매개변수로 받은 문자열에서 각 단어의 첫 번째 글자만 대문자로 변환하여
     리턴하는 initcap() 메서드를 구현하시오. 
 2 예를 들어 "hello world java" 는 "Hello World Java"로 변환됩니다. 
 3 출력결과
    Hello World Java
    Java Programming
 */
public class Prob001_String {

	public static void main(String[] args) {
//		System.out.println(initcap("hello world java"));
//		System.out.println(initcap("java programming"));
		
		String data = " ";
		String str = "hello world java";
		for(int i=0; i<str.length(); i++) {//str.length=16;

			if(i==0 || str.charAt(i-1)==' ')// 젤 첫글자 대문자 + 해당배열 바로 앞글자 공백이면, 
				
				//charAt(i-1) 는 공백
				data+=(char)(str.charAt(i)-32);//소문자를-> 대문자로 교환
			else//공백이아니면
				data +=str.charAt(i);//그냥 string data 순차저장
		}
		
		
				
		
	
	}// end main()

	private static String initcap(String str) {
		// 매개변수로 받은 문자열에서 각 단어의 첫 번째 글자만 대문자로
		// 변환하여 반환하는 프로그램을 구현하시오.
		String data = " ";
		
		for(int i=0; i<str.length(); i++) {
			if(i==0 || str.charAt(i-1)==' ') 
				//charAt(i-1) 는 공백
				data+=(char)(str.charAt(i)-32);
			else
				data +=str.charAt(i);
		}
		
		
		return data;
		
		
		
		
		
		
		
		
		/* 내가짠부분
		String test = str;
		String[] head1 = str.split(" "); 	//hello		world		java
			
			for(int j=0; j<head1.length;j++) {//0 hello		1 world		2 java
				String[] head2=head1[j].split(""); // 각자
				
				for(int k=0; k<head2.length; k++) {	
				
					if(k == 0)
					head2[0] = head2[0].toUpperCase(); //대문자로 바꿈
					System.out.print(head2[k]);
					test+=head2[k];
					
				}
				System.out.print(" ");
			}
	
		return test;       내가짠부분끝 */
		
	}// end initcap()
}// end class
