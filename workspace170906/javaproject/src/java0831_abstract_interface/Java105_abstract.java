package java0831_abstract_interface;
/*
 * 
 * 			class		interface
 * 맴버변수		o			상수
 * 메소드		선언부+구현부	선언부(추상메소드)
 * 생성자			o			x
 * 초기화블록		o 			x
 * 내부클래스 		o			o
 * 
 * extends : 클래스에 클래스를 상속, (단일상속), 인터페이스에 인터페이스 상속(다중상속)
 * 
 * implements	: 클래스에 인터페이스 상속(다중상속)
 * 
 * 인터페이스(interface)
 * 1. 추상메소드와 상수를 가지고 있는 형태이다.
 * 2. 클래스 작성에 도움을 줄 목적으로 제공이 되는 표준명세서이다. 
 * 3. implements : 클래스에 인터페이스를 상속할 때 사용되는 키워드이다. 
 * 4. 인터페이스는 접근제어자로 public 만 제공한다. 
 * 5. 인터페이스의 추상메소드에 abstract 키워드를 명시하지 않아도 된다. 
 * 		자바가상머신에서 자동으로 처리하기 때문에.... 
 * 
 */

import java.io.Serializable;

interface CarRun{
	int carCount = 5;	// int carCount; 라고하면 오류가뜬다. 
						//public static final 에서 처리
	
//	public CarRun() {	}	//인터페이스는 생성자를 가질수없다. 
	
//	static {Ststem.out.println("dd");} // 불가능. 
	
	//인터페이스 메소드는 모두 추상메소드여야한다. 
	void prn();
//	void display() { } //구현부를 가질수없다.
	class Sun{}//내부클래스
	

}//end CarRun
class TruckRun implements CarRun,Serializable{
	@Override
	public void prn() {
		System.out.println();
	}
}//end truckrun


public class Java105_abstract {

	public static void main(String[] args) {
		System.out.println(CarRun.carCount);
		
		TruckRun tr = new TruckRun();
		tr.prn();

	}//end main

}//end class
