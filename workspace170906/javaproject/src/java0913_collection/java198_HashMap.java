package java0913_collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap
 * 	1. Map인터페이스를 구현한 클래스이다.
 * 	2. 정렬을 제공하는 클래스이다. 
 */
public class java198_HashMap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tree = new TreeMap<Integer,String>();
		
		tree.put(10, "java");
		tree.put(30, "jsp");
		tree.put(20, "spring");
		
		System.out.println(tree.get(10));
		
		
		
		System.out.println("//////////Iterator/////////////");
		Set<Integer> set = tree.keySet();
		Iterator<Integer> ite = set.iterator();
		
		while(ite.hasNext()) {
			Integer key = ite.next();
			System.out.println();
			
			System.out.printf("%d : %s \n",key, tree.get(key));
		}
		
		
		


	}

}
