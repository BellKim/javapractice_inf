package java0911_collection;
//설명만 하고 넘어감.
import java.util.Vector;

public class java179_Vector {

	public static void main(String[] args) {
		// Vector생성자에 인자값이 없으면 용량의 기본값은 10이다.
		Vector<String> v = new Vector<String>();
		v.addElement(new String("java"));

		// Vector생성자 인자값이 하나이면 최초 생성될 용량의 값이다.
		// 용량의 증가는 기존의 2배이다.
		v = new Vector<String>(2);
		v.addElement(new String("seoul"));//addelement 별로 쓸일이없다고함.
		v.addElement(new String("busan"));
		v.addElement(new String("inchon"));

		// Vector생성자의 첫번째 인자값은 최초로 생성되는 용량의 값이고
		// 두번째 인자값은 증가되는 값이다.
		v = new Vector<String>(2, 1);
		v.addElement(new String("홍길동"));
		v.addElement(new String("영순이"));
		v.addElement(new String("갑돌이"));	

		// capacity( ) : 벡터의 용량(요소를 저장할 수 있는 메모리의 크기)
		System.out.println("용량:" + v.capacity());
		// size( ) : 벡터의 저장된 요소 갯수
		System.out.println("크기:" + v.size());

	}//end main( )

}//end class
