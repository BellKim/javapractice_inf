package java0914_thread.prob;

import java.util.Stack;

class VendingMachine1 {
	Stack store = new Stack();

	public synchronized String getDrink() {
		while (store.isEmpty()) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return store.pop().toString();
	}// end getDrink

	public synchronized void putDrink(String drink) {
		this.notify();
		store.push(drink);

	}// end putDrink


}// end VendingMachine

class Producer1 implements Runnable {
	private VendingMachine1 vm;

	public Producer1(VendingMachine1 vm) {
		this.vm = vm;
	}

	@Override
	public void run() {
		for (int i = 0; i < 11; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + vm.getDrink() + "꺼내먹음");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

class Consumer1 implements Runnable {
	private VendingMachine1 vm;

	public Consumer1(VendingMachine1 vm) {
		this.vm = vm;
	}
		
		@Override
		public void run(){
			for (int i = 0; i < 11; i++) {
				System.out.println(Thread.currentThread().getName()+":"+vm.getDrink()+"꺼내먹음");
				try {
					Thread.sleep(300);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}//for
			
		}//run
	

}// end Consumer


public class Prob01 {

	public static void main(String[] args) {
		VendingMachine1 vm = new VendingMachine1();
		Producer1 p = new Producer1(vm);
		Consumer1 c = new Consumer1(vm);
		Thread t1 = new Thread(p, "생산자");
		Thread t2 = new Thread(c, "소비자");

		t1.start();
		t2.start();

	}// end main()

}// end class
