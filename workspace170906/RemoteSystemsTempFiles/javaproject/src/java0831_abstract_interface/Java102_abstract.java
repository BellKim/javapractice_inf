package java0831_abstract_interface;
/*
 * 클래스 종류 : 클래스, 추상클래스, 인터페이스
 * 매소드 정의 : 메소드 선언부+메소드구현부
 * 		public void prn(){ }
 * 
 * 
 * 추상메소드 : 메소드 구현부가 없는메소드를 추상메소드라고한다.
 * 		abstract public void prn();
 * 
 * 추상클래스 : 추상메소드를 하나라도 가지고 있는 클래스
 * abstract public class Test{ }	//abstract 와 public 의 순서는 바뀌어도 상관이없다. 
 * 
 * 추상클래스 제공 목적 : 추상매소드를 강제적으로 오버라이딩하고 객체생성을 할 수 없도록 하기 위해서 
 */

/*
 * car : 속도, 색상, 움직인다. 속도를 높인다. 멈춘다. work(); 사람을태운다. 짐을 싣는다. 
 * Senda :   extends Car  ( 속도, 색상, 움직인다. 속도를 높인다. 멈춘다.는 car 상위클레스로 뺀다. )
 * Truck :   extends Car 
 */

abstract class CarAbs{//추상메소드가 붙었으니 앞에 abstract 를 붙혀줘야한다.2
	int speed;
	String color;
	
	void upSpeed(int speed) {
		this.speed=speed;
	}
	//void work();//이러면 그냥 메소드지만
	abstract void work(); //이러면 추상 1
}//end CarAbs

//class TruckAbs extends CarAbs{	//4
//	
//}// end TruckAbs  이런식으로 선언하면  오류가 뜬다. 

class TruckAbs extends CarAbs{	//4
	@Override
	void work() {
		System.out.println("트럭에 짐싣고 가고있다. ");
	}

}// end TruckAbs  이런식으로 선언하면  오류가 뜬다. 

class SendaAbs extends CarAbs{	//4
	@Override
	void work() {
		System.out.println("승용차가 사람을 테우고 가고있습니다.");
	}

}//end senda abs  이런식으로 선언하면  오류가 뜬다. 


public class Java102_abstract {

	public static void main(String[] args) {
		//CarAbs ca = new CarAbs();//추상클레스는 객체생성을 할 수 없다. 완벽한 클래스가 아니라서 막아놨기때문에!!! //3
		TruckAbs truck = new TruckAbs();
		SendaAbs senda = new SendaAbs();
		truck.work();
		senda.work();
	}//end main()

}//end class
