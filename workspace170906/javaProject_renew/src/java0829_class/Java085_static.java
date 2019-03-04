package java0829_class;
/*
 * static이 선언된 메소드에서는 비-static자원(맴버변수, 매소드)ㅇ을 호출할 수 없다.
 */

public class Java085_static {

	public static void main(String[] args) {
		display();
		//process();//오류 스테틱이 선언되어있는 메소드에서는 void 를 불러오지 못한다.
		
		//객체생성 후에 불러온다. 
		Java085_static js = new Java085_static();
		js.process();//메모리에 생성된 시점이 다르기때문에 불러올 수 없다. (Java084의 static 참조)
		
		
		

	}//end main()
	
	public static void display() {
		System.out.println("display");
		
	}
	
	public void process() {
		System.out.println("display_ process");
	}
	

}
