package java0831_abstract_interface;

import java.io.Serializable;

interface SampleA{
	void prn();
	
}

interface SampleB extends SampleA, Serializable{
	void call();
}


class Animal{
	void play() {
		System.out.println("animall");
	}
	
}
	
	
//extends implements
class Life extends Animal implements SampleB{
	@Override
	public void prn() {
		System.out.println("prn");
	}

	@Override
	public void call() {
		System.out.println("call");
		
	}
	
}



public class Java106_interface {

	public static void main(String[] args) {
		Life ee = new Life();
		ee.call();
		ee.prn();
		ee.play();
	}

}

