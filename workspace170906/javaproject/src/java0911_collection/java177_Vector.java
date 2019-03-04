package java0911_collection;

import java.util.Vector;
/*
 * 배열 : length 키워드
 * 문자열 : length()메소드
 * 컬렉션 : size()메소드
 * 
 */
/*
 * 컬렉션 클래스를 선언하고 생성할때 제너릭을 선언한다.
 * 제너릭(generic) : 컬렉션 클래스에 저장된 객체를 가져올때
 * 다운캐스팅하는 작업을 생략할 수 있도록 제공해주는 기능이다.
 */

public class java177_Vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		v.add(new String("Java"));
		v.add(new String("jsp"));
		v.add(new String("spring"));
		
		
		System.out.println("///////////////일반 반복문 ///////////////");
		for(int i=0; i<v.size(); i++) {
			String data=v.get(i);
			System.out.println(data);	
		}
		
		
		System.out.println("///////////////개션된 루프 ///////////////");
		//개선된루프문 배열과 컬렉션에서 사용된다.
		//for(데이터타입변수 : 배열 or 컬렉션){  }
		for(String st : v )
			System.out.println(st);
		
		
		
		Vector<Number> vt = new Vector<Number>();//Number 가 들어간이유가 무엇일까. 
		//Integer->Number->Object (up-casting)
		vt.add(new Integer(10));
		//Double->Number->Object (up-casting)
		vt.add(new Double(10.4));
		//Float ->Number->Object (up-casting)
		vt.addElement(new Float(4.8F));
		
		for(Number ne:vt) {
			if(ne instanceof Integer) {
				Integer it = (Integer)ne;
				System.out.println(it);
			}else if(ne instanceof Double) {
				Double de = (double)ne;
				System.out.println(de);
			}else if(ne instanceof Float) {
				Float ft = (Float)ne;
				System.out.println(ft);
			}
		}

	}//end main()

}//end class
