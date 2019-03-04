package java0913_collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/*		Hashtable
 * 	1. Map 인터페이스를 구현해놓은 클래스.
 * 	2. Map 인터페이스를 구현해놓은 클래스들은 key, value쌍으로 저장한다.
 * 	3. valuse을 구분해주는것은 key으모르key 는 중복을 허용하지 않는다.
 * 
 * 	
 */
public class java196_Hashtable {

	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		
		table.put(10,  "java");
		table.put(20,  "jsp");
		table.put(30,  "spring");		//table.put( 키  , 맵); 
		
		System.out.println(table.get(20));//jsp		//키를 이용해서 맵에 저장되어있는 요소를 가지고온다.
		
		System.out.println("===============Enumeration==================");
		
		Enumeration<Integer> enu = table.keys();
		
		while(enu.hasMoreElements()) {
			Integer key = enu.nextElement();
			System.out.printf("%d : %s \n", key, table.get(key)); 	
		}
		
		
		//반복자이용/////////////////////////////////////////
		System.out.println("////////Iterator/////////////");
		
		Set<Integer> set = table.keySet();
		Iterator<Integer> ite = set.iterator();
		while(ite.hasNext()) {
			Integer key = ite.next();
			System.out.printf("%d : %s \n",key, table.get(key));
		}
		
		
		

	}//end main

}//end class







