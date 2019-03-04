package java0831_abstract_interface;
/*
1. 변수 : 상수
	int num = 20;
	num=30;
	
	final int DATA();    X
	final int DATA=5;  O
	DATA = 15;   		X
	
	2. 메소드 : 오브라이딩을 할 수 없다. 
		final void prn(){ };
		
		
		
	3. 클래스 : 상속을 할 수 없다. 
	final class Test{ }
	
	
*/

class FinalTest{
	final int CODE = 1; 
	
	void display(){
		//final 이 선언되어잇는 변수는 ㄱ새로운 값을 할당할 수 없다. 
		//CODE = 10;
		}
	final void process() {
		System.out.println( "process");
		
	}
}//end FinalTst//

class UserFinal extends FinalTest{
	@Override
	void call() {
		System.out.println("userCall");
	}
//	void process() {
//		
//	}	//당현히 안된다. 
	
}// end UserFinal

final class Base{
	
	
}//end base
//class  Expand extends Base{ //오류발생. The type Expand cannot subclass the final class Base
//	
//}

public class Java108_fanal {

	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
		

	}//end main()
	

}//end class


