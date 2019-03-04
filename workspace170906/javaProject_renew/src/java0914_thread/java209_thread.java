package java0914_thread;

class PriorityTest extends Thread{
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.printf("%s priority = %d i = %d \n",
					getName(),getPriority(),i);// 현재수행중인 스레드를 여기서 불러오려면 getName() 만으론 부족하다.	
		}
	}
	
}//class end

public class java209_thread {
	public static void main(String[] args) {
		
		PriorityTest t1 = new PriorityTest();
		t1.setName("user1");
		t1.start();
		
		PriorityTest t2 = new PriorityTest();
		//스레드의 우선순위는 1~10까지 지정할 수 있다.
		//스레드의 기본값은 5이다. 
		t2.setPriority(Thread.MAX_PRIORITY);	//
		t2.start();
		
		
		
		PriorityTest t3 = new PriorityTest();
		t3.setPriority(8);
		t3.start();
		
	}//end main()

}//end class
