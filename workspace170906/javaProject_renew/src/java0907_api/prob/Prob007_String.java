package java0907_api.prob;
//144
/*
 * [출력결과]
 *  영어 소문자 갯수:3
 *  영어 대문자 갯수:3
 *  숫자 갯수:2
 */

public class Prob007_String {

	public static void main(String[] args) {
		String data = "ke4RdTA5";

		display(process(data));
	}// end main()

	public static char[] process(String data) {
		//string to char 
		//use split, save char array;
		char res1 = data.charAt(0);//의미없다
		char[] res_array = data.toCharArray();
		return res_array;
	}// end process()

	public static void display(char[] arr) {
		int lowcase=0;
		int uppercase=0;
		int numbercase=0;
		
		for(int i=0; i<arr.length; i++){
				
				System.out.print(arr[i]);
			if(Character.isLowerCase(arr[i])==true) {
				//소문자 카운트
				lowcase+=1;
			}else if(Character.isUpperCase(arr[i])==true) {
				//대문자 카운트
				uppercase+=1;
			}else if(Character.isDigit(arr[i])==true) {
				//숫자 카운트
				numbercase+=1;
			}else {
				System.out.println("error 발생");
			}
		}
		System.out.println(" ");
		System.out.printf(
				" *  영어 소문자 갯수:%d\r\n" + 
				" *  영어 대문자 갯수:%d\r\n" + 
				" *  숫자 갯수:%d",lowcase, uppercase,numbercase);
		
	}// end display()

}// end class
