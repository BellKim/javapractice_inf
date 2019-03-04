package java0904_api;

public class java117_String {

	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");
		
		System.out.println("문자열의 길이 : " + str.length());//문자열의 갯수 리턴
		System.out.println("대문자 : " + str.toUpperCase());//대문자로 리턴.
		System.out.println("소문자 : " + str.toLowerCase());//소문자리턴
		System.out.println("문자 : " + str.charAt(1));//
		System.out.println("인덱스 : " + str.indexOf('a'));
		System.out.println("인덱스 : str.indexOf(97) : " + str.indexOf(97));
		System.out.println("범위 : " + str.substring(5));//5인덱스부터 맨끝까지
		System.out.println("범위 : " + str.substring(2, 8));//2인덱스부터 8인덱스 "미만"까지
		
		String[] arr=str.split(",");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d]=%s\n",i,arr[i]);
			
		}//
		System.out.println("hello test!@@@@@@@@@");
		System.out.println(String.valueOf(str));
		System.out.println("hello test!@@@@@@@@@");
			
			int x=10;
			int y=20;
			System.out.printf("%d + %d = %d \n", x, y, x+y);
			
			
			//리턴타입이 String이다.
//			String sn = new String();//본래방법
//			String s1 = String.valueOf(x);//본래방법
			
			
			String s1=String.valueOf(x);
			String s2=String.valueOf(y);
			
			System.out.printf("%s + %s = %s \n", s1, s2, s1+s2);//문자열 연결의 의미라서 1020으로 나온다. 
			
			char[] data = {'1','2','3'};
			String s3 = String.valueOf(data);
			System.out.println("s3 = " + s3);
			
			
			
			
		
		
		
		
		
		
		
		

	}//end of main()

}//end class
