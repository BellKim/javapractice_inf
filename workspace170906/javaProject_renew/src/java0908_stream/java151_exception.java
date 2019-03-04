package java0908_stream;

public class java151_exception {
	//document 에서   java.lang 에서 exception 검색
	//runtime exception 

	public static void main(String[] args) {
		int[] num = new int[] {10,20,30};
		
//		System.out.println(num[7]);//시스템에서 존재하지 않는 배열을 사용하려 하니까 사용 못하도록 했는데 그것을 java.lang.ArrayIndexOutOfBoundsException: 7 이라고 나와있다. 
		
		try {
		
		System.out.println(num[7]);
		}catch(java.lang.ArrayIndexOutOfBoundsException ex) {	//컴파일 단계에서 오류가 안뜬다. 실행단계에서 뜨는 오류가 exception 인데 오류가떠서 catch영역을 찾아가서
			System.out.println("배열에 존재하지 않는 인덱스입나다. ");	//정상적으로 처리될 구문을 집어넣음
		}finally {		
			System.out.println("program_end");
		}
		
		/////////////////////////////////////////////////////////////////////////////////////////
		try {
			System.out.println(num[1]);
		}catch(java.lang.ArrayIndexOutOfBoundsException ex) {	//exception 안생김. 
			System.out.println("배열에 존재하지 않는 인덱스입나다. ");	//catch 구문 패스. 
		}finally {		
			System.out.println("program_end");
		}
		
		

	}//end main()

}//end class
