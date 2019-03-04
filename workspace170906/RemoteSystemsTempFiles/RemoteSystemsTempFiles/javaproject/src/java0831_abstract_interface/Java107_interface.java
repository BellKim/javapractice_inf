package java0831_abstract_interface;

/* 
 * -(private) +(public) *(protected)
 * class와 interface를 이용하여 성적처리
 * 클래스명 : User
 *  -name:String
 *  +User()
 *  +User(name:String)
 *  +toString():String
 *  
 *  인터페이스명 : Score
 *  +sol:int  (초기값:20)
 *  +getScore():int
 *  
 *  인터페이스명 : Print
 *  +toPaint():String
 *  
 *  클래스명 :UserTest에 위에서 정의한 클래스,인터페이스 상속받음
 *  [출력화면]
 *  이름 : 홍길동
 *  점수 : 60점
 */
interface Score{
	public int sol = 20; // static final
	public int getScore();
} // end Score

interface Print{
	public String toPaint();
}// end Print

class User extends Object{
	private String name;
	
	public User() {
	}
	
	public User(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() { //toString()은 object를 상속
		return "이름 :" + name;
	}
}// end User

class UserTest extends User implements Score, Print{
	int s;
	
	UserTest(String name, int s){
		super(name);
		this.s = s;
	}
	
	@Override
	public String toPaint() {
		return toString() + "\n점수:" + getScore();
	}
	
	@Override
	public int getScore() {
		return s*20;
	}
	
}// end UserTest

public class Java107_interface {

	public static void main(String[] args) {
		UserTest ut = new UserTest("홍길동",3);
		System.out.println(ut.toPaint());
		

	}//end main( )

}//end class