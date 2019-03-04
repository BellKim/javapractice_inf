package java0830_static_access;

/*
 * package 패키지명 
 * import 패키지명.클래스;
 * import 패키지명.인터페이스;
 * 
 * class 클래스명{
 * 		맴버변수;
 * 		생성자;
 * 		매소드;
 * }
 * 
 *  자바에서 제공해주는 package
 *  package : 
 *  	1. 비슷한 작업을 수행하는 클래스 및 인터페이스를 묶어줄때 사용한다. 
 *  	2. open API에서 제공하는 클래스 : 클래스 및 인터페이스 중복을 피하기 위해서 사용.
 *			domain : www.khmain.or.kr
 *			기본package명 : kr.or.khmain		//io는 입출력
 *	import : 외부클래스 및 인터페이스 위치를 JVM 에 알려주기 위해서사용. 
 *
 *	제어자(modifier)
 *	1. 클래스, 변수, 메서드의 선언부에 사용되어 부가적인 의미를 부여한다. 
 *	2. 제어자는 크게 접근제어자와 그 외의 제어자로 구분한다. 
 *	3. 하나의 대상에 여러개의 제어자를 조합해서 사용할 수 있으나, 
 *		접근제어자는 단 하나만 사용할 수 있다.
 *		접근제어자 - public, protected, default, private // 현재봐야할것.
 *		그외제어자 - static, final, abstract, synchronized....
 *
 *
 *	접근제어자(access modifier)
 *		: 맴버 또는 클래스에 사용되어, 외부로부터의 접근을 제어한다.
 *			(접근제어자 - public, protected, default, private // 현재봐야할것.)
 *	1. private : 같은 클래스에서만 접근이 가능하다. 
 *	2. default : 같은 패키지에서만 접근이 가능하다. 
 *	3. protected : 같은 패키지내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능하다. 
 *	4. public : 접근제한이 없다. 
 *	
 *	접근제어자 사용!
 *	class : default, public
 *	variable, method, constructor : private, default, protected, public
 * 
 * 
 */
public class Java087_access { 	//default class Java087_access { 의 형태는 접근할수가없다. public 이 되어야한다.
	private int var_private=1;
	int var_default=2; //default
	protected int var_protected=3;
	public int var_public=4;
	



}//end class
