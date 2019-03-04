package java0905_api;
/*
 * java.lang.String : 불변
 * java.lang.StringBuffer : 불변, 비동기화
 * java.lang.StringBuilder : 가변, 동기화
 * 
 * 
 */

public class java129_Stringbuffer {

	public static void main(String[] args) {
		String sg = new String("java test");
		String ss = sg.replace("java", "jsp");
		System.out.println("ss : "+ss);
		System.out.println("sg : "+sg);
		System.out.println("************************************************************");
		StringBuffer sb = new StringBuffer("spring test");
		//0부터 6미만 사이의 문자열을 "framework"로 변경하라.
		sb.replace(0,6,"framework");
		
		System.out.println("sb : " + sb);
		


	}//end main()

}//end class
