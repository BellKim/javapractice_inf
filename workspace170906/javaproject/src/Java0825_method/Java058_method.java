package Java0825_method;
/*
 * [출력결과]
 * e의 대문자는 E 입니다.
 */

public class Java058_method {

	public static void main(String[] args) {
		char data='e';
		char code=process(data);
		System.out.printf("%c의 대문자는 %c 입니다.\n", data, code);


	}// end main()
	
	public static char process(char data) {
		//명시적형변환 이용
		return (char)(data-32);
	}//end process()

}// end class
