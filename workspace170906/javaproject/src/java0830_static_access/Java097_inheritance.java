package java0830_static_access;
/*
 * PetOver을 상속받은 main()메소드를 참조하여 DogOver, BirdOver클래스를
 * 아래와 같이 출력이 되도록  구현하시오.
 *  
 * [출력결과]
 * 슈퍼클래스 move() : 애완동물이 움직입니다.
 * 서브클래스 move() : 새가 날아갑니다.
 */

class PetOver {
	int age; // 애완동물 개월수

	public void move() {
		System.out.println("수퍼클래스 move():애완동물이 움직입니다.");
	}
}// end PetOver

class DogOver{
	
}

class BirdOver{
	
}



/////////////////////////////////////////////////////////////////////////////
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
////////////////////////////////////////////////////////////////////////////

public class Java097_inheritance {

	public static void main(String[] args) {
		//문제를 풀때 아래 주석을 해제하세요.
		DogOver dog=new DogOver(); 
		BirdOver bird=new BirdOver(); 
		dog.move(); 
		bird.move();
	}//end main( )

}//end class
