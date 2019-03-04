package java0829_class;
/*
 * class 클래스명{
 * 	맴버변수
 * 	static{}
 * 	생성자(){}
 * 	매소드(){}
 * 	내부클래스
 * 
 */
class OrderStatic{
	static {
		System.out.println("static");
	}
	public OrderStatic() {
		System.out.println("constructor");
	}
	
	public void prn() {
		System.out.println("prn");
	}
}//end OrderStatic;


public class Java084_static {

	public static void main(String[] args) {
		OrderStatic os = new OrderStatic();
		os.prn();
		
		
		
		
		

	}// end main()

}//end class
