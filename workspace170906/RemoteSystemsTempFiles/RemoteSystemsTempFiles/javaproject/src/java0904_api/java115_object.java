package java0904_api;

class StringTest{
	private char[] arr;//1
	public StringTest() {//2
		
	}
	
	public StringTest(char[] arr) {//3
		this.arr = arr;
	}
	
	public int length() {//4 배열의크기를 리턴해주는 함수.
		return arr.length;
	}//end length
	
	public char charAt(int index) {//5
		return arr[index];
	}
	
}//end StringTest

public class java115_object {

	public static void main(String[] args) {
		StringTest st = new StringTest(new char[] {'j','a','v','a'});
		System.out.println(st.length()); //4           		배열의 크기 = 문자열의 길이
		System.out.println(st.charAt(2)); //v 
		
		

	}//end main()

}//end class
