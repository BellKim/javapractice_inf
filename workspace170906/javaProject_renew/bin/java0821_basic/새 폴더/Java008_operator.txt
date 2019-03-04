package java0821_basic;

public class Java008_operator {

	public static void main(String[] args) {
		int x=3;
		//증가연산자 : 변수의 값을 1 증가시킨다. 
		++x; //x=x+1 보다 연산속도가 빠르다고한다.
		System.out.println("x = "+x);
		
		int y=5;
		//감소연산자
		--y;
		System.out.println("y="+y);
		
		//리터널 에서는 증가, 감소 연산자를 사용할 수 없다. 
		//System.out.println(++10);
		
		//keyword(예약어) : 프로그램에서 어떤 의미를 부여해서 정의해놓은 단어.
		
		// final 예약어가 선언된 변수를 "상수"라 한다. 
		final int DATA=5;
		
		//상수에는 증가연산자, 감소연산자를 사용할 수 없다. 
		//DATA ++;
		
		
		
		

	} //end of main();

}	//end of class();
