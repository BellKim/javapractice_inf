package Java0825_method;
/*
 * 문자열의 길이 :4
 * 2인덱스의 요소값 가져오기 : v
 */
public class Java060_method {

	public static void main(String[] args) {
		char[] data = new char[] { 'j', 'A', 'v', 'a' };
		System.out.println("문자열의 길이 : "+length(data));
		System.out.println("2인덱스의 요소값 가져오기 : "+ charAt(data,2));
		
		

	}// end main()

	public static int length(char[] data) {
		// data배열의 크기를 리턴하는 프로그램을 구현하세요.
		//int result = data.length;
		//return result;
		return data.length;
		
		
	}//end length;
	
	public static char charAt(char[] data, int index) {
		// data배열에서 index 에 해당하는 문자를 리턴하는 프로그램을 구현하세요.
		char result = data[index];
		return result;
	}//end length;
	
	

}
