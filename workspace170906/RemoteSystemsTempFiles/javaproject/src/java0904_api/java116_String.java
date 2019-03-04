package java0904_api;
/*
 * 문자열 관련 클래스
 * 
 * java.lang.String			//문자열을 처리해주기 위한 클래스 .
 * java.lang.StringBuffer
 * java.lang.StringBuilder
 * java.util.StringTokenizer
 * 
 * 
 * 
 * 
 */
public class java116_String {

	public static void main(String[] args) {
		String sn = "java";	
		//1. heap영역에 기본데이터처럼 문자열값이 저장되있는지를 찾는다.(주소)
		//2. 없으면 메모리생성해서 저장한다. 
		
		String sg = "java";
		//1.  heap영역에 기본데이터처럼 문자열값이 저장되있는지를 찾는다(주소)
		//2. 찾아보니까 같은 문자열이 있다. 있는거를 그대로 쓰고자 같은 주소값을 갖는다.
		
		String st = new String("java");
		//1.  heap영역에 기본데이터처럼 문자열값이 저장되있는지를 찾지않고
		//new 는 무조건 메모리를 새롭게 생성을 한다. 
		String ss = new String("java");
		
		
		//주소비교                           값비교인지 주소비교인지 알아보야한다.
		System.out.printf("sn==sg: %b \n", sn==sg);//true
		System.out.printf("sn==ss: %b \n", st==ss);//false
		//비교를 하는것은 주소값을 비교하고자 하는것이지 문자열을 비교하는것이 아니다. 
		
		//equals() : 메모리에 저장된 문자열 비교 
		System.out.printf("sn==sg: %b \n", sn.equals(sg));//
		System.out.printf("sn==sg: %b \n", st.equals(ss));//
		
		//toString() : 메모리에 저장된 문자열 리턴. 
		System.out.println(sn.toString()); //메모리에 저장된 문자열의 값 리턴. 
		System.out.println(sn);
		

	}

}













