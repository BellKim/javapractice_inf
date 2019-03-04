package java0914_thread;
/*
 * 동기화(synchronized)
 * 
 * 계좌번호 => 공유자원
 * A지점, B지점, C지점 => 스레드
 * 
 * 동기화 : 하나의 스레드가 공유자원을 사용하고 있으면 다른 스레드가 접근하는
 *  것을 막아주는 기능이다.
 * 
 * 동기화 목적 : 데이터의 일관성 유지를 위해서이다.
 * 동기화 키워드 : synchronized
 * 
 * 동기화 설정방법
 * 1) 메소드에 lock을 걸고자 할때
 *    synchronized void test( ) { }
 * 2) 특정한 객체에 lock을 걸고자 할때
 *     void test(){
 *       synchronized(객체의 참조변수){ }
 *     }
 * 
 *   wait(), notify(), notifyAll()메소드 동기화가
 *   설정되여 있는 영역에서만 호출 할 수 있다. 별표 밑줄쫙 
 */

class Washroom{
	synchronized void openDoor(String name) {
		System.out.println(name+"님이 입장합니다.");
		for(int i=0; i<5000; i++) {
			
			
			if(i%10000 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
	
					e.printStackTrace();
				}
				System.out.println(name+"님이 업무를 보는중.");//이 시간이 되면 업무를 보고 있는중이라고 메시지를 보냄.
			}
			
		}//end for//
		System.out.println(name+"님이 퇴장하셧습니다....!");
	}//end open Door()
}//end Washroom///////////////////////////////////////////

class FamilyThread extends Thread{		//스레드 상속받음.-> run 메소드 모버라이드 해줘야한다.
	private Washroom wr;
	private String who;
	
	public FamilyThread() {
		
	}
	
	public FamilyThread(Washroom wr, String who) {
		this.wr = wr;
		this.who = who;
		
	}
	
	@Override
	public void run() {
		wr.openDoor(who);
	}
	
	
}//end FamilyThread ////////////////////////////////////////




public class java210_thread {

	public static void main(String[] args) {
		Washroom wr = new Washroom();
		
		FamilyThread father = new FamilyThread(wr, "father");
		FamilyThread mother = new FamilyThread(wr, "mother");
		FamilyThread sister = new FamilyThread(wr, "sister");
		FamilyThread borther = new FamilyThread(wr, "brother"); //워시룸 공용으로 사용중. 
		
		
		father.start();
		mother.start();
		sister.start();
		borther.start();//비동기화시 4명이 모두 입장해버린다. 
						//	synchronized void openDoor(String name) 다음과 같이 추가 해주면 동기화가 된다. (synchronized키워드 추가)
						//데이터 일관성을 유지하기 위해서 

	}//end main

}//end class
