	package java0830_static_access;
	
	//40라인만 보기!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
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

	class First{
		int a = 10;
//		System.out.println("a = "+a);
		
		public void prn() {
			System.out.println("a = "+a);
		}
		
	}//end First

	class Second extends First{
		int b = 20;
		
		//상속을 받은 후 오버라이딩을 할 수 있다. 
		@Override	//오버라이드(오류안나는 변수의 오타를 표시해준다.)
		public void prn() {
			System.out.println("b = "+b);
		}
		
		public static void call() { //스테틱추가시 메모리를 먼저 추가하는데 아래 내용의 super과 this 가 없기때문에 오류가뜸. 
			super.prn();
			this.prn();
			
		}
	}//end Second



	public class Java096_1_inheritance {

		public static void main(String[] args) {
			Second sd = new Second();
//			sd.prn();
			sd.call(); //a, b, 둘다나온다. super을 통해서 first 를 불러오기때문에 ..
			

		}//end main()

	}//end class
