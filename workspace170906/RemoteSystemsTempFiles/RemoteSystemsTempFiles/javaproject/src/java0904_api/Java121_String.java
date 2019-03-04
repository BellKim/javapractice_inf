

package java0904_api;

/*
 * [출력결과]
 *  java jsp spring
 */
public class Java121_String {
	public static void main(String[] args) {
		String stn = new String("java_jsp_spring");
		System.out.println(process(stn.toCharArray()));

	}// end main( )

	public static char[] process(char arr[]) {
		// '_'를 ' '으로 변환후 리턴하는 프로그램을 구현하세요.
		for(int i=0; i<arr.length; i++) {
//		System.out.println(arr[i]);
			char change = '_';
			if(arr[i]== change ) {
				arr[i]=' ';
			}else {
				
			}
		
		}

		return arr;
	}// end process( )

}// end class
