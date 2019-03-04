package Java0825_method;

public class Java064_method {

	public static void main(String[] args) {
		char[] data=new char[] {'a','b','c'};
		System.out.println(data);	//abc
		System.out.printf("%s\n",data); //[C@7d4991ad //주소값이나온다.
		System.out.println("data = "+ data);	//data = [C@7d4991ad 	변수값을 같이 명시하면 이런형태로 나온다.
		
		int[] num=new int[] {1,2,3};
		System.out.println(num);		// [I@28d93b30
		
		String[] str=new String[] {"a", "b","c"};
		System.out.println(str); 		// [Ljava.lang.String;@1b6d3586
		
		


	}//end main()

}//end class
