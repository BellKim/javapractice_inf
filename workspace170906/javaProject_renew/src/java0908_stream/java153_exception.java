package java0908_stream;

public class java153_exception {

	public static void main(String[] args) {
		String data1 = "12";
		String data2 = "0";// 1. ab      2. 0
		
		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			int res = x/y;		//분모가 0일경우에도 예외가 있다. 
			System.out.println(res);
		}catch(NumberFormatException ex) {		//문자를 입력했을떄
			System.out.println("숫자를 입력하세요!");
		}catch(ArithmeticException ex) {		//분모가 0일때 나는 오류
			System.out.println("분모는 0보다 큰 수를 입력하세요");
		}catch(Exception ex) {	//나머지 예외 장치들은 얘가 받아서 해당 구문을 사용하도록 한다. 그러나, 다중캐치를 사용할때 주의해야한다. 
			System.out.println(ex.toString());	//바로 예외클레스 (Exception ex) 를 위쪽 상단에 두면 exception 예외처리를 처리할 수가 없다.
		}
		System.out.println("Program end");
											//결론적으로 exception 에도 상위 익셉션 하위익셉션이있는데 상위익셉션일수록 하위에 배치시켜서 try catch를 구성해야한다.
	}//end main()

}//end class


/*
 * 						Exception							//최상위
 * 					
 *	 					RuntimeEception						//그다음순위
 * 
 * 		NumberFormatException		ArtimaticException		//최하위
*/