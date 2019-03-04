package java0912_collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//Enumeration 은 Vector와 Hashtable 에서만 제공이 되는 인터페이스다.

public class java186_ArrayList {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(new Integer(10));	//0
		v.add(new Integer(20));	//1
		v.add(new Integer(30));	//2
		v.add(new Integer(40));	//3
		
//		for(int i = 0; i<v.size(); i++) 
//			System.out.println(v.get(i));
		
		//열거형 - 5점대 이후로 개선된 루프가 나왔기때문에 이구문은 잘 사용하지않는다. 
		/*
		Enumeration<Integer> enu = v.elements();
		while(enu.hasMoreElements())//가지고올 엘리먼트가있니
			System.out.println(enu.nextElement());
		 */
		
		//반복자
		/*
		Iterator<Integer> ite = v.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
		*/
		
		

	}//end main()

}//end class
