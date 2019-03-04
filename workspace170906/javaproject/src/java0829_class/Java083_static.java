package java0829_class;
/*
 * [프로그램 실행과정]
 * 1. 소스코드 작성 Java083_static.java
 * 2. 컴파일(클래스파일생성) : javac Java083_static.java
 * 3. 실행(클래스 파일실행) java Java083_static
 * 4. 클래스파일 로딩 (확장자가 .class 인것) - 메모리로 읽어온다. 즉 ,class StaticEx 클레스는 메모리생성하기전에 만들어진다. 
 * 		(static 으로 선언된 자원은 JVM method 영역에 생성된다.)
 * 5. main() 메소드 실행 - main 스레드에서 main()메소드를 호출한ㄷㅏ.
 * 6. 객체생성(new)
 * 7. 맴버변수, 메소드 호출
 * 8. main() 메소드 종료 - 프로그램 종료.
 * 중요:::: 4번, 5번
 * 
 * 메인에서 같은변수로 선언이 되어도  4번 때문에 클레스내에 같은 변수가 있으면 그 변수의 값으로 입력이됨. 
 * 
 * 
 * [JVM의 메모리 구조]
 * 1. stack area : 메서드의 작업공간. 메서드가 호출되면 
 * 		메서드 수행에 필요한 메모리 공간을 할당받고 메서드가 종료되면
 * 		사용하던 메모리를 반환한다.
 * 2. heap area : 객체(인스턴스)가 생성되는 공간. new 키워드에 
 * 		의해서 생성되는 배열과 객체는 모두 여기에 생성된다.
 * 3. method area : 클래스 정보와 클래스 변수(static) 가 저장되는곳. 
 * 
 * 	static
 * 1. 같은 데이터 타입으로 생성된 객체는 서로 공유한다.
 * 2. 클래스가 로딩되는 시점에 메모리에 저장된다. 
 * 3. static 키워드가 선언된 메소드에서는 this, super 키워드를 사용할 수 없다. 
 * 	(static카워드가 선언된 메소드가 위 실행과정 4번에서 생성되기 때문에 즉, 
 * 	new보다 빠르다.)
 */

class StaticEx {
	int x = 5;
	static int y = 10; //static 선언의 차이 알아볼것. 
	
	public StaticEx() {
		
	}
	
	public void prn() {
		System.out.printf("%2d %2d \n", x, y);
		
	}

}

public class Java083_static {

	public static void main(String[] args) {
		StaticEx se = new StaticEx();
		System.out.printf("se.x=%d se.y=%d\n", se.x, se.y);
		
		StaticEx ss = new StaticEx();
		System.out.printf("ss.x=%d ss.y=%d\n", ss.x, ss.y);
		
		se.x = 20;
		se.y = 30;
		System.out.printf("se.x=%d se.y=%d\n", se.x, se.y);
		System.out.printf("ss.x=%d ss.y=%d\n", ss.x, ss.y);
		
		System.out.println("StaticEx.y=" + StaticEx.y);
		//여기에 스태틱이 선언되어서 이다. 
		
		
	}//end of main()

}//end class
