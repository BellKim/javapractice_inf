package java0914_thread;
/*
 * 스레드 생성주기 (Life Cycle)
 * start() - 실행준비상태 (Runnable) - run() - TERMINATED - 대기상태(WAITING, NOT RUNNABLE)
 */

class LifeCycle extends Thread{
	public LifeCycle() {
		
	}
	
	@Override
	public void run() {
		System.out.println(getState());	// ( RUNNABLE )
		for(int i=0; i<=5; i++) {
			System.out.printf("%s i = %d \n",getName(),i);
			
			try {//상태를 지켜보기위해서 딜레이줌.
				Thread.sleep(1000);//일시정지상태 1000 = 1초를 의미. 
						//sleep(); return void
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//1초동안 대기한다.
		}
		
	}//end run
}//end LifeCycle

public class java208_thread {

	public static void main(String[] args) {
		LifeCycle cc = new LifeCycle();
		System.out.println("1"+cc.getState()); //스레드의 상태값을 출력한다. ( NEW 라고 뜬다.)
		
		cc.start();//main스레드와 내가 생성한 스레드 두개가 실행이된다..
		
		
		System.out.println("2"+cc.getState());//Runnable
		try {
			/* 지정된 시간동안 스레드가 실행되도록 한다.
			 * 지정된 시간이 지나가나 종료가되면 join()을 호출한다.
			 * 스레드로 다시 돌아와 실행을 계속 수행한다.	*/
			cc.join();		//메인스레드가 끝날때까지 잠시 기다렸다가 메인스레드가 다 끝나면 메인스레드 가 실행함
							//순차적으로 진행하고 싶을때 사용한다. 스레드는 기본 실행루틴과 다르게 별도로 실행되기때문에 제어를 하기위해서 스레드가 kill될때까지 기다린다. 
			
//							join() : Waits for this thread to die.
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		System.out.println("3"+cc.getState());//TERMINATED
		
		System.out.println("main end ");

	}//end main()

}//end class





