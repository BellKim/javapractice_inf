package java0907_api.prob;

import javax.print.DocFlavor.CHAR_ARRAY;

/*
 * javac Prob002_String.java
 * java Prob001_String JAva Test
 */
/*1 프로그램 실행할때  "JAva Test" 문자열을 args배열에서 값을 받아 출력결과에 같이
 *  나오도록 프로그램을 구현하시오.
 *  java Prob002_String JAva Test   //값을 넣을것. (컴파일전에 마우스 오른쪽 - run as - run configuration - arguments텝에 - program arguments 으로 넣어주기. 
 *   * 
 * 2 출력결과
 *   source : JAva Test 
 *   convert: jaVA tEST
 *   length: 9
 *   reverse : tseT avAJ
 */

public class Prob002_String {

	public static void main(String[] args) {
		String test1 = "JAva1Test";
		StringBuffer sb = new StringBuffer(test1);
//		System.out.println(sb);
		System.out.println((test1.toLowerCase()));
//		System.out.println(sb.reverse());
//		System.out.println(sb.length());
	
		System.out.println(sb+"\n");
//		System.out.println(String.valueOf(sb).split(" "));
		
		String[] arr1 = String.valueOf(sb.reverse()).split(" ");
		for(int i=0; i<arr1.length; i++) {
		System.out.print(arr1[i]+ " ");
		}
		
		
//		System.out.println(arr1.length);
		
		
		
		
		
		
		
		
		
		
		
	}
		
}// end class

