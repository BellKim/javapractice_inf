package Java0828_class;
/*
 * 생성자(constructor)
 * 1. 맴버변수를 초기화 하기위한 목적으로 사용한다.(한번만 호출)
 * 2. 클래스명과 같다.
 * 3. 클래스는 한개 이상의 생성자는 갖는다.
 * 4. 생성자는 리턴타입이 없다.
 * 5. 클래스에 생성자가 정의되어 있지 않으면 JVM에서 기본 생성자를 제공한다. 
 * 6. 기본생성자는 클래스의 접근제어자를 그대로 사용한다. (클레스 이름 앞에 public )
 * 
 */

class HandPhone{
	//맴버변수
	String name;
	String number;
	
	
	//자바가상머신(JVM)에서 제공하는 기본생성자.
	//클래스에 1개이상의 생성자가 정의되어 있으면 JVM에서 기본 생성자를 제공하지 않는다.
	//매소드
	HandPhone(){}  //자바가상머신(JVM)에서 제공하는 기본생성자의 형태. 앞에 void 를 써주면 매소드로 인식하므로 조심할것 .(리턴타입이없기때문에)
	
	HandPhone(String n, String b){
		name = n;
		number = b;
	}
	
	
	
	
	
	void prn() {
		System.out.printf("%s %s \n", name, number);
	}
	
}//end class


public class Java070_constructor {

	public static void main(String[] args) {
		HandPhone ph = new HandPhone();	//생성자.
		ph.name = "홍길동전";
		ph.number = "010-4564-0445";
		ph.prn();
		
		HandPhone ne = new HandPhone("이영희", "010-1234-1233");
		ne.prn();
	}//end main()

}














