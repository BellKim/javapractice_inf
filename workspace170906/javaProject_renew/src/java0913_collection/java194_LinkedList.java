package java0913_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class java194_LinkedList {

	public static void main(String[] args) {
		
		//treeset?? //자바에서 트리라는 말은 정렬이란 말과 같다.
					//treeset : 정렬하면서 중복값 허용안되게 함. 
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(new Integer(10));
		tree.add(new Integer(20));
		tree.add(new Integer(30));
		tree.add(new Integer(40));
		tree.add(new Integer(20));//  .add 해주면 자동적으로 오름차순으로 정렬해준다. 
		
		System.out.println("오름차순");			//기본 오름차순
		Iterator<Integer> ite = tree.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		System.out.println("내림차순");		//내림차순으로 변경시 .descendingIterator() 사용.
		ite = tree.descendingIterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		


		


	}//end main

}//end class
