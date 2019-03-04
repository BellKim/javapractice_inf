package java0914_inner;


abstract class InnerAnonymous{
	abstract void prn();
}	//end innerAnnomimous

class Test extends InnerAnonymous{
	@Override
	void prn() {
		System.out.println(10);
	}
}//end test

class OuterAnonymous{//익명클레스 이용하는부분.
	private int x;
	
	public void call() { //익명클레스 이용하는부분.
		/*InnerAnonymous tt = new InnerAnonymous() {
			@Override
			void prn() {
				x=5;
				System.out.println(x);
			}
		};
		
		tt.prn();*/
		
		new InnerAnonymous() {
			@Override
			void prn() {//prn() 의 형태를 이벤트 처리할때 많이 사용한다.(안드로이드내에서)
				x=5;
				System.out.println(x);
			}
		}.prn();
		
		
		
	}//end call()
	
}//end OuterAnonymous



	
public class java205_inner {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.prn();		//일반적방법
		
		Test t2 = new Test();
		t2.prn();		//일반적방법

		

	}//end main()

}//end class
