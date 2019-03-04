package java0904_api;
/*
 * API(Application Programming Interface)
 * 	1. 운영체제와 응용프로그램 사이의 통신에 사용되는 언어나 메시지 형식을 말하낟. 
 * 	2. 자바개발 환경에서 제공되는 거대한 패키지이다. 
 *  3. 자바언어는 작고 단순한 대신 많은 기능들을 제공하는 라이브러리를 API로 제공하고있다. 
 *  
 *  Object
 *  	1. 클래스 중에서 최상의 클래스이다.
 *  	2. Object을 제외한 모든 클래스들은 Object을 상속받고 있다.
 *  	3. java.lang패키지에서 제공하는 클래스이다. 
 * 
 */

public class java114_object {

	public static void main(String[] args) {
		Object obj = new Object();
		//java.lang.Object@15db9742
		System.out.println(obj.toString()); //시스템에서 설계되어있음. 객체만 호출해도 시스템이 이렇게 설계되어있음.
		
		System.out.println(obj);	// 객체만 호출해도 시스템이 이렇게 설계되어있음.
		
		int x=5;
		int y=5;
		//값비교 ( 기본데이터)
		System.out.printf("%d %d %b \n",x, y, x==y);
		
		
		Object ojt = new Object();
		//==주소비교(참조데이터)
		System.out.printf("obj==ojt : %b \n", obj==ojt);
		
		//equals() : 주소비교 - 객체비교만 가능하다. 
		System.out.printf("obj.equals(ojt) : %b \n",obj.equals(ojt));
		
		//class java.lang.Object
		System.out.println(obj.getClass());
		
		//java.lang.Object
		System.out.println(obj.getClass().getName());
		
		
		//여기서 어떤것이 리턴되는것까지 알아야한다. 
		
		
	
	}//end main()

	
}//end class
