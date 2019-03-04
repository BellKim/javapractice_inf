package java0830_static_access;
/*
 * 상속(inheritance)
 * 1 기본 클래스를 재사용해서 새로운 클래스를 정의하는 것이다.
 * 2 두 클래스를 조상과 자손으로 관계를 맺어준다.
 * 3 상속을 해주는 클래스 : 부모클래스,수퍼클래스, 기본클래스
 *   상속을 받는 클래스 : 자식클래스, 서브클래스, 유도클래스
 * 4 자손(식)클래스는 조상의 모든 자원을 상속받는다.
 *   (생성자, 초기화블럭 제외 :static{}) 
 * 5 자손의 자원은 부모보다 크거나 같아야 한다. 
 * 6 상속을 할때 사용되는 키워드 : extends(단일상속) 
 * 
 * class A{   }
 * class B extends A{}  => class 자식 extends 부모 { }
 * -A는 B에 상속을 한다.
 * -B는 A이다(상속관계의 클래스를 is a 관계라 한다.)  상속관계인것은? is a 관계인것은?
 * 
 * class 도형{}
 * class 삼각형 extends 도형{ }
 * 삼각형은 도형이다.
 *------------------------------
 * 
 * class Test{}
 * class Sample{
 *   public static void main(String[] args){
 *      Test tt=new Test( );
 *   }
 * }
 * 
 * Sample은 Test를 포함한다.(포함관계-has a)
 */
	

	class Father{//2
		int a=3;//3
		void prn() {//5
			System.out.println("a=" + a);
		}
		
	}//end father
	
	//Child 는 Father 를 상속받는다 .
	class Child extends Father{
		int a=10;//7
		int b=5;//7
		
		
	}//end Child



public class Java092_ {

	public static void main(String[] args) {
		Child cd = new Child();//1
		cd.prn();//4	//extends 했기때문에 Father class에 접근이가능. 
		System.out.printf("cd.a = %d\n", cd.a);//6
		System.out.printf("cd.b = %d\n", cd.b);//8

	}//end main//10

}//end class
