package java0829_class;
/*
 * 오버로딩(overloading)
 * 1. 하나의 클래스에 같은 이름의 매서드를 여러가 정의 하는 것을 오버로딩이라한다. 
 * 2. 오버로딩의 조건
 * 		1>매서드의 이름이 같이야 한다. 
 * 		2>매개변수의 갯수 또는 데이터 타입이 달라야한다.
 * 		3> 매개변수는 같고 리턴타입이 ㄱ다른 경우는 오버로딩이 성립되지 않는다.
 * 			(즉, 리턴타입은 오버로딩을 구현하는데 아무런 영향을 주지 않는다.)
 * 
 * 오버로딩과 오버라이딩의 차이??
 * 
 * 
 * 
 */
class Calculator{
//	void sum(int x, int y) {
//		System.out.println(x+y);
//	}
//	void plus(int x, int y, int z) {
//		System.out.println(x+y+z);
//	}
//	
//	void add(double x, double y) {
//		System.out.println(x+y);
//	}
//본래는 다 다른 기능을 하는 함수이지만 sum, add, plus 전부 동일한 이름으로 처리가 가능하다. 
//정의: 비슷한기능을 하는 것들은 하나의 함수 명으로 처리하자.(변수의 자료형이 전부 달라도 상관이없다.)

	void addValue(int x, int y) {//3
		System.out.println(x+y);//4
	}//5
	void addValue(int x, int y, int z) {//7
		System.out.println(x+y+z);//8
	}//9
	
	void addValue(double x, double y) { //11
		System.out.println(x+y);//12
	}//13

	
}// end Calculator

public class Java079_overloading {

	public static void main(String[] args) {
		Calculator cal = new Calculator();	//1
		cal.addValue(4,8);		//2
		cal.addValue(2,7,5);	//6
		cal.addValue(1.0,2.0);	//10
		

	}	//end main()	//14

}	//end class
