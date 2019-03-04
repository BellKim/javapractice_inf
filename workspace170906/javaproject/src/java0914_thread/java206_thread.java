package java0914_thread;
/*
 * 프로세스 : 메모리에서 실행중인 프로그램이다.
 * 스레드(thread) : 프로세스에서 독립적으로 실행되는 단위이다.
 * 게임프로그램 -음악,채팅,게임
 * 
 * 자바에서 스레드 생성을 위해 제공해주는 2가지 방법
 * 1. java.lang.Thead클래스
 * 2. java.lang.Runnable인터페이스
 * 
 * 스케줄링
 *  : 스레드가 생성되어 실행될 때 필요한 시스템의 여러 자원을 해당
 *  스레드에게 할당하는 작업
 *  
 * 선점형 스케줄링
 *  : 하나의 스레드가 cpu을 할당받아 실행하고 있을 때 우선순위가
 *   높은 다른 스레드가 cpu를 강제로 빼앗가 사용할 수 있는 스케줄링 기법이다.
 */

class User extends Thread{
	public User() {
		
	}
	@Override
	public void run() {
		//thread 로 실행시킬 문장들은 run() 메소드에서 구현한다.
		for(int i=0; i<=5; i++) {
			System.out.printf("%s i = %d \n",getName(),i);
		}
	}//end run
	
}//end main()

public class java206_thread {

	public static void main(String[] args) {
		User u = new User();
//		u.run();//run을 스레드로 돌리기위해서는 start메소드가 필요하다 이건 스레드로 돌아가는것이아님.
		u.start();	//이 스레드가 돌아갈수있도록 다양한 작업을 하고, 대기상태에 있다가 차례가 돌아오면 스레드가 돌아간다. 
		//run이라는 메소드를 "스래드"로 실행하기위해선 start(); 로 함수를 콜한다.
		//실행-> main스레드 -> main()
		
		for(int j=0; j<=5; j++) {
			System.out.printf("%s j = %d \n",Thread.currentThread().getName(),j);
		}
		//currentThread() : Returns a reference to the currently executing thread object.(return static)	
		//excute=실행하다.
		//getName() : java.lang.class //  Returns the name of the entity (return String)
		
		System.out.println("main thread end ");

		
	}

}
















