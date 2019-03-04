package java0913_collection;
/*
 * HashMap
 * 	1. Map인터페이스를 구현한 클래스이다. 
 * 	2. HahsTable은 동기화 되어있고, HashMap은 비동기화 처리된다.
 * 	3. HashTable과 HashMap은 다른 기능들은 거의 같다. 
 * 
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class java197_HashMap {

	public static void main(String[] args) {
		HashMap<Integer, Number> map = new HashMap<Integer, Number>();
		
		map.put(1, new Integer(10));
		map.put(2, new Double(4.5));
		map.put(3, new Float(2.3f));
		
		System.out.println(map.get(2));
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> ite = set.iterator();
		while(ite.hasNext()) {
			Integer key = ite.next();
			
			System.out.printf("%d %s \n",key, map.get(key));
		}
		
		

	}//end main()

}//end class
