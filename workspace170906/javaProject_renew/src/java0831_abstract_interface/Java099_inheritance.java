package java0831_abstract_interface;

/*
 * [출력결과]
 * 1000량의 물을 뿌린다
 * 8인승 차량입니다.
 */

class Car {
	int speed;
	String color;

	void setSpeed(int speed) {
		this.speed = speed;
	}
}// end class Car/////////////////////////

class FireEngine extends Car {
	private long water;

	public void setWater(long water) {
		this.water = water;
	}

	void waterSpread() {
		System.out.println(water + "량의 물을 뿌린다.");
	}
}// end class FireEngine////////////////////

class OwnerEngine extends Car {
	private int seat;
	
	public void setSeat(int seat) {
		this.seat = seat;
	}

	void information() {
		System.out.println(seat + "인승 차량입니다.");
	}
}// end class OwnerEngine////////////////////

public class Java099_inheritance {

	public static void main(String[] args) {
		// 여기를 구현하세요.////////////////////
		FireEngine fe = new FireEngine();
		fe.setWater(1000);
		fe.waterSpread();
		OwnerEngine oe = new OwnerEngine();
		oe.setSeat(8);
		oe.information();
		
		
		
		
// 4개의 접근자가 어디까지 접근되는지 접근범위를 알아야한다. prevate, 등등.. 		
		

	}//end main( )

}//end class
