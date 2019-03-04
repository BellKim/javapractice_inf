package Java0825_method;
/*
 * method(메소드)정의
 * 1. 값을 계산하기 위해서 사용되는 기능이다.
 * 2. 객체의 동작을 처리학 위한 기능이다.
 * 
 * method 구조형태 : 메소드 선언부 + 메소드 구현부
 * 
 * 	리턴데이터타입 메소드형(데이터타입 매개변수) -- 메소드 선언부
 * 	{
 * 		--메소드 구현부
 * 			메소드가 처리해야할 로직구현;
 * 		return 값;
 * 	}
 * 		형태1. 리턴값이 없고 매개변수도 없다.(void)
 * 		void add(){
 * 		int x=10;
 * 		int y=20;
 * 		System.out.println(x+y);
 * 		return; //기본적으로 메소드에는 리턴값 이 있어야하지만 리턴 해주는 값이 있으면 안된다. 
 * 		}
 * 		
 * 
 * 		add();	//메소드 호출.
 * 		
 * 		
 * 		형태2. 리턴값은 없지만 매개변수는 있다.
 * 		void plus(int x, int y){
 * 			System.out.prinln(x+y);
 * 		}
 * 		
 * 		plus(12, 13);
 * 		System.out.println(plus(20,30)); //불가능.(X)
 * 	
 * 		형태3. 리턴값은 있으나 매개변수가 없다. 
 * 		double avg(){
 * 			int total=15;
 * 			return total/3.0;
 * 		}
 * 
 * 		double res = avg();
 * 		System.out.println(avg()); //가능(ㅇ)
 * 
 * 		형태4. 리턴값이 있고 인자값도 있을때
 * 		double avg(int x, int y){
 * 			return(x+y)/2.0;
 * 		}
 * 
 * 		double res=avg(10,20); //호출
 * 		System.out.println(avg(10,20)); (ㅇ) 
 * 
 * 
 */
public class Java052_method {
//	프로그램을 실행하면 JVM(자바가상머신)에서 main 스레드가 
//	main()메소드를 호출한다. 
//	다른메소드를 호출하려면 main 메소드에서 불러와야한다.
	
	
	//main() 메소드 정의
	public static void main(String[] args) {
		System.out.println("main start");
		 makeTest();//makeTest 메소드를 호출한다. 
		System.out.println("main end");

	}//end main()
	
	//makeTest()메소드 정의. 
	public static void makeTest() {
		System.out.println("make test run");
	}//end makeTest( )
	
	

} //end class








