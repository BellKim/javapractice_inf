package java0914_thread;

class User2 implements Runnable{
	public User2() {
		
	}//인자값이없는 생성자 만듬
	
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.printf("%s i = %d \n",
					Thread.currentThread().getName(),i);// 현재수행중인 스레드를 여기서 불러오려면 getName() 만으론 부족하다.	
		}
	}//end run
	
	
}//end class

public class java207_thread {

	public static void main(String[] args) {
		User2 u= new User2();
		
		Thread th = new Thread(u);	//새로운 스레드 생성. 
		th.start();

	}//end main

}//end class

/*
 * wait에서 준비로 빠져나오기위해서는 
 * object.notift()
 * object.notifyAll()이 호출되어야 한다.
 * 
 */
