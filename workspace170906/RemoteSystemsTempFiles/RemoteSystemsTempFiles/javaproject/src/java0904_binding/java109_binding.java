package java0904_binding;


/*
 * 1. 데이터타입 ": byte, short, int, long, float, double, boolean, char
 * 2. 참조데이터타입 : array, class, interface
 * 
 * 인자전달방식
 * 1. call by value - 값복사 - 기본데이터타입
 * 		void add(int a, int b){ } 
 * 		add(10,20);
 * 
 * 2. call by reference - 주소복사 - 참조데이터타입
 * 		void process(int[] arr){ }
 * 		process(new int [](1,2,3));
 * 
 * 형변환(casting) - 기본데이터타입
 * 1. 묵시적형변환 : 작 -> 큰
 * 2. 명시적형변환 : 큰 -> 작
 * 
 * 		int num = 3;
 * 		double data = num; //묵시적형변환
 * 		short val = (short)num; // 명시적형변환
 * 
 * 객체변환형 - 참조데이터타입 
 * 	1. 상속관계일때 형변환이 가능하다 (is a ) 
 * 	2. 업캐스팅 발생된 후 다운캐스팅을 할 수 있다. 
 *  
 *  
 *  ========================================
 *  업캐스팅(up-casting) : 부모객체로 자식객체를 참조 하도록 형변환 하는 기술
 *  다운캐스팅 (down-casting) : 업캐스팅을 다시 원상복귀 해주는 형변환하는 기술
 *  
 *  다형성(polymorphism) 
 *  1. 사전적 의미는 '여러가지 형태를 가질 수 있는 능력 ' 을 의미한다. 
 *  2. 자바에서는 한 타입의 참조변수로 여러타입의 객체를 참조하는 기술이다. 
 *  	예를들면, 조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 할 수 있다는 것이다. 
 *  
 *   바인딩(binding) : 매소드 호출을 실제 매소드의 몸체와 연결하는 기술이다. 
 *   1. 정적 바인딩(static binding ) : 컴파일단계에서 어떤 클래스의 어떤 매소드가 호출되는지 연결하는 기술
 *   2. 동적 바인딩(dynamic binding) : 실행단계에서 어떤 클래스의 어떤 매소드가 호출되는지 연결하는 기술.
 *   
 *   
 */
	
	class Parent{
		void process() {
			System.out.println("parent");
		}
	}//end Parent
	
	class Child extends Parent{
		void call() {
			System.out.println("Child");
		}
		
		void process() {
			System.out.println("child Process");
		}
	}//end Child
	
	class Sun extends Parent{
		void prn() {
			System.out.println("Sun");		
		}
	}//end sun
	
	class Outer{
		void prn() {
			System.out.println("Outer");
		}
	}//end outer
	
public class java109_binding {
	
	public static void main(String[] args) {
		Parent p = new Parent();
		Outer t = new Outer();
		//독립적인 참조데이터 타입(객체)는 형변환이 안된다. 
		//p=t;
		
		Child c = new Child();
		//업캐스팅(up-casting) : 부모객체로 자식객체를 참조하도록 형변환하는 기술
		p =c;
		System.out.println("1111111111111111111");
		p.process();
		System.out.println("222222222222");
//		p.call();//오류
//		System.out.println("33333333333333333");
///////////////////////////////////////////같은말///////////////////////////
		Parent pt = new Child(); //객체생성 + 업캐스팅.
		//Child cn = pt;//작은걸 큰거로 바꾸려고하니 안됨)
		Child cn = (Child)pt;//원상복구
		cn.process();
		cn.call();
//////////////////////////////////////////////////////////////////////////		
		Parent pe = new Sun();
		pe.process();
		
		
		
		
	}//end main

}//end class


//부모객체를 가지고 자식에게 넘기는것 업캐스팅
//반대개념 다운캐스팅
























