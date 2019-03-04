package java0830_static_access;

/*	1. private : 같은 클래스에서만 접근이 가능하다. 
*	2. default : 같은 패키지에서만 접근이 가능하다. 
*	3. protected : 같은 패키지내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능하다. 
*	4. public : 접근제한이 없다.*/

class MeTest{
	private MeTest() {//접근제어자 생성.
		System.out.println("private");
	}
	MeTest(int a){
		System.out.println(a);
	}
}//end class

public class Java089_access {

	public static void main(String[] args) {
		
		//MeTest mt = new MeTest();	//접근제어자앞에 private 가 있기때문에 접근불가능.
		//private 선언되어 있기 때문에 외부클래스에서 호출 할 수 없다. 
		//MeTest mt = new MeTest(10);
		
		
		MeTest te = new MeTest(10);
		
		

	}

}
