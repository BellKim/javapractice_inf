package java0904_api.prob;
/*
 * 1. 문자열(String)을 입력 받아, 해당 문자열을 
 *    문자 순서를 뒤집어서 char[]로 반환하는 메소드를 만들고,
 *    char[]을 입력 받아 출력하는 메소드를 만드시오. 
 * 2. 출력결과
 *    dlroW olleH
 *    !gnimmargorP avaJ
 */
public class Prob002_String {

	public static void main(String[] args) {
		char[] array1 = reverse("Hello World");
		printCharArray(array1);

		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
		
		

		
	}// end main()

	public static char[] reverse(String str) {
		//여기를 구현하세요.
		char[] data = new char[str.length()];
		char change;
		for(int i=0; i<str.length(); i++) {
			data[i] = str.charAt(str.length()-1-i);

		}
		return data;
		//배열을 재배치하는데 charAT()을 이용해서 길이의 숫자를 입력하면 해당 문자를 출력해주는함수를 이용하는데
		//그 숫자를 순차적으로 출력하는데있어서 str.length() 함수를 적절히 이용해서 뒤에서부터 앞쪽으로 순차적으로 배열숫자를 줄여줌. 
	
		//짠쏘스
		
		
		
		///////////////////////////////////////수업소스
//		char[] data = new char[str.length()];
//		for(int i=0; i<data.length; i++) {
//			data[i]=str.charAt(str.length()-1-i);
//		}
//		
//		return data;//배열리턴
		//////////////////////////////////////////
	}//end reverse()

	public static void printCharArray(char[] array) {
		System.out.println(array); 
	}//end printCharArray()

}





