package java0904_api.prob;

/* 
 * arr매개변수에서 '-'은 공백으로 , '/'은 ':'으로 변경한후
	리턴하는 프로그램을 구현하시오
 * [출력결과]
 * basic:java  web:jsp  framework:spring
 */
public class Prob004_String {

	public static void main(String[] args) {

		String data = "basic/java_web/jsp_framework/spring";
		System.out.println(process(data.toCharArray())); //convert sting to char array  
		
		
	}// end main()

	static String process(char[] arr) {
		// arr매개변수에서 '_'은 공백으로 , '/'은 ':'으로 변경한후
		// 리턴하는 프로그램을 구현하시오.
		
		
/*		내가짠코드
		String res=" ";
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='_') {
				res+=' ';
			}else if(arr[i]=='/') {
				res+=':';
			}else {
				res+=arr[i];
			}
			
		}//end for
		System.out.println();
		
		return res;
	*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//////////////////////////////////////////
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='-')
				arr[i]=' ';
			else if(arr[i]=='/')
				arr[i]=':';
		}
		
		//////////////////////////////////////////
		return String.valueOf(arr);
	}// end process()

}// end class



















