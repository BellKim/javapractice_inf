package java0914_inner;

class OuterLocal{
	private int x;
	static int y;
	final private int z = 10;
	
	//메소드정의
	public void call(int a) {	//2
		final int b=20;		//3
		int c = 30;		//4
//		a=200;
		class InnerLocal{
			void prn() {	//7
				x=5;//8
				
				y=150;
				
				//outer클래스의 매소드에 정의된 매개변수, 지역변수를 
				//지역내부클래스에서 새로운값을 할당할 수가 없다. 
//				a=30;//오류
				c=40;
			
				System.out.println("x = " + x);		//9
				System.out.println("y = " + y);		//static에서도 y호출해서 불러올 수 있음.
				System.out.println("z = " + z);
				System.out.println("a = " + a);
				System.out.println("b = " + b);
				System.out.println("c = " + c);
				
			}//end prn()		//10
		}//end innerLocal	//
		

		InnerLocal inner = new InnerLocal();	//5
		inner.prn();		//6
	}//en call()
	
}//end outerLocal

		

public class java204_inner {

	public static void main(String[] args) {
		OuterLocal outer = new OuterLocal();	
		outer.call(100);
		
		
		
		

	}//end amin()

}//end class
