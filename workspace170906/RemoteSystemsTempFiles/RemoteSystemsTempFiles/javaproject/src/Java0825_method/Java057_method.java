package Java0825_method;
/*
 * 자바에서 제공하는 데이터타입(data type)
 * 1. 기본데이터타입 : byte, short, int, long,
 * 					float, short, char,boolean
 * 2. 참조데이터타입 : 배열, 클래스,인터페이스
 * 
 * [인자(매개변수) 전달방식]
 * 1. call by value : 값복사
 * 
 * 2. call by reference : 인자값을 전달할때 기본 데이터 타입을 넘겨주는형식. 
 * 
 */

public class Java057_method {

	public static void main(String[] args) {
		int a=10, b=20;
		callByValue(a,b);
		System.out.printf("a=%d, b=%d\n",a,b);
		
		System.out.printf("//////////////\n");
		int[] arr=new int[] {2,5};
		callByReference(arr);
		System.out.printf("arr0 =%d, arr1=%d",arr[0],arr[1]);
	}
	
	
	public static void callByValue(int x, int y) {
		int temp = x; 
		x=y; 
		y=temp;
		System.out.printf("X=%d, y=%d\n",x,y);
		
	}//end claaByValue
	
	public static void callByReference(int[] data) {
		int temp=data[0];
		data[0] = data[1];
		data[1] = temp;
		System.out.printf("data[0]=%d, data[1]=%d\n",data[0],data[1]);
		
	}//end callByReference( )
}
