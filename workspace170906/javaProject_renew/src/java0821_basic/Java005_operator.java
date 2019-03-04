package java0821_basic;
/*
 * 연산자(operatior)
 * 	:어떠한 기능을 수행하는 기호( + , - , *, /, %, >, <, == 같다 , != 다르다)
 * 
 * 피연산자(operand)
 * 	:연산자의 작업 대상 (변수, 상수, 리터널, 수식)
 * 		연산자의 종류
 * 		1. 산술연산자 : +, -, *, / 
 * 		2. 비교연산자 : <, >, >=, <=, ==, !=
 * 		3. 논리연산자 : &&(and), ||(or), !(not)
 * 		4. 삼항연산자 (조건연산자) : 조건식 ? 참:거짓
 * 		5. 대입연산자 : =, +=, *=, /=
 * 		6. 단항연산자 : ++(1씩증가), --(1씩 감소) 
 */

public class Java005_operator {

	public static void main(String[] args) {
		int kor = 10;
		int eng = 20;
		
		
		//int=int+int
		int result = kor + eng;
		System.out.println(result); //30
		
		double avg = 4.5; 
		//식에서 사용한 값의 데이터 타입이 다르면 큰 데이터 타입으로 결과를 리턴한다. 
		//double=int+double;
		double result2=kor+avg; //int:4 double 8 이므로 double 형으로 출력됨  10+4.5  =14.5
		System.out.println("result2 : "+result2);
		
		//중요
		short a=3; 
		short b=4;
		//	short c=a+b;//틀림.int 형으로 된다. 

		
		int c=a+b;
		System.out.println(c);
		
		/*	int=byte+short
		 * 	int=char+short
		 * 	int=byte+int
		 * 	int=byte+byte 
		 */
		
		//short = (short)(byte+short)
		
		char data = 'a';
		System.out.println((char)(data-32));
		
		
			
		
		
		
		
		
		


	}//end of main()

}//end of class()












