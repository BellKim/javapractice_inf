package java0908_stream;

public class java152_exception {

	public static void main(String[] args) {
//		StringBuffer sb = null;
//		
//		sb.reverse();//변수선언해두고 리버스할 자원이없다 그래서 exception 이 생긴것이다. 
		/////////////////////////////////////////////////////////////////////////
		
		StringBuffer sb = null;
		try {
		sb.reverse();//변수선언해두고 리버스할 자원이없다 그래서 exception 이 생긴것이다.
		}catch (NullPointerException ex) {	//catch 는 다중케치 사용가능하다. 
			sb = new StringBuffer("java");
			System.out.println(sb.reverse());
		}
		
		System.out.println("program end");
		
		
		
		
		

	}//end main()

}//end class
