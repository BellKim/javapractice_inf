package java0914_inner;

//inner클래스는 실사용이 없다. 프로젝트떄 사용하지말것.

class OuterStatic{
	private int x;
	static private int y;//
	
	static void call() {
		y=9;
		System.out.println(y);
	}
	
	static class InnerStatic{
		int z;
		void prn() {
			//비 static 외부 자원을 static 내부클래스에서
			//참조할 수 없다.
			//x = 40;
			
			y=20;//y 변수는 static 이 선언디어있어서 선언이가능하다.
			z=30;
			
			System.out.printf("%d %d\n", y, z);
			
			
			
			
		}//end prn()
		
	}//inner static
	
}//end outerstatic



public class java203_inner {

	public static void main(String[] args) {
		
		OuterStatic.call();
		
		OuterStatic.InnerStatic inner = new OuterStatic.InnerStatic();
		
		inner.prn();
	}//end main()

}//end class








