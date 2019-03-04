package Java0828_class.Prob;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

class Circle {
	int radius; // 원의 반지름을 저장하는 멤버 변수
	String name; // 원의 이름을 저장하는 멤버 변수
	public Circle() { }

	public Circle(int radius, String name) {
		
		this.radius = radius;
		this.name = name;
	}

	public double getArea() { // 멤버 메소드
		
		return 3.14 * radius * radius;
	}
	
	public void prn() {//9
//		System.out.printf("%s %s  \n", radius, name);//10
//		System.out.println("radius = "+ radius);
		System.out.println(name +"의 면적 = "+ (radius*radius*3.14));
		
	}//11
	
	
}// end class////////////////////////

public class Prob01_class {

	public static void main(String[] args) {
		//여기를 구현하세요.////////////////////	
		Circle cipi = new Circle(2, "자바피자");
		cipi.prn();
//		System.out.println(ci.name +"의 면적 : "+ci.getArea() );
		
		Circle cido = new Circle(4,"자바도넛");
		cido.prn();
		
		
		
		

	}//end main()

}//end class
