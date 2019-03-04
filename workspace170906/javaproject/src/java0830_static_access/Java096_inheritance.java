
package java0830_static_access;
/*
 * 오버라이딩(overriding)
 * 1 조상클래스의 메소드를 자손클래스에서 재정의(메소드 구현부)하는 기능이다.
 * 2 메소드의 선언부는 그대로 사용한다.(리턴데이터타입, 메소드명, 매개변수)
 *   단, 접근제어자는 같거나 크면된다.
 *   private < default < protected < public
 * 3 오버라이딩은 상속을 받은 후 할 수 있다.
 * 
 *  super
 *  1. 자손클래스에서 조상클래스를 호출할 때 사용한다.
 *  2. super.멤버변수
 *     super.메소드 ( )
 *     super( ) => 생성자
 *    
 *  단일클래스                    상속관계의 자손클래스
 *   overloading  vs  overriding
 *   this         vs  super   
 */

class First1{
	int a = 10;
//	System.out.println("a = "+a);
	
	public void prn() {
		System.out.println("a = "+a);
	}
	
}//end First

class Second2 extends First1{
	int b = 20;//3
	

	//상속을 받은 후 오버라이딩을 할 수 있다. 
	
	public void prn() {
		System.out.println("b = "+b);
	}
	
	public void call() {
		super.prn();	//a호출
		this.prn();		//b호출
		
	}
	
	public static void display() {
		System.out.println("display");
	}
	
//	public static void call() {
//		display();
//	}
	
	
	
}//end Second



public class Java096_inheritance {

	public static void main(String[] args) {//1
		Second2 sd = new Second2();//2
		//Second2.call();
//		sd.prn();
		sd.call(); //a, b, 둘다나온다. super을 통해서 first 를 불러오기때문에 ..
		

	}//end main()

}//end class
