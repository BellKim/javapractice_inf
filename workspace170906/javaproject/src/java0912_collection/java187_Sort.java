package java0912_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

class Ascending implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		System.out.println((o1+" / "+o2 +" "+o1.compareTo(o2)));
		//출력과정
		return o1.compareTo(o2);
	}
}

class Descending implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		System.out.println((o1+" / "+o2 +" "+o1.compareTo(o2)));
		//출력과정
		return o2.compareTo(o1);
	}
}

public class java187_Sort {

	public static void main(String[] args) {
		Integer[] arr = new Integer [] {1,3,5,2,4};
		//오름차순
//		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(arr));
//		aList.sort(new Ascending());
//		System.out.println(aList);
	////////////////////////////////////////////////////////////////////////
		
		//내림차순
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(arr));
		aList.sort(new Descending());
		System.out.println(aList);
		
    /////////////////////////////////////////////////////////////////////////
		
		System.out.println(".1////////////////////////////////");
		Collections.sort(aList);
		System.out.println(aList);
		
		System.out.println("2.////////////////////////////////");
		Collections.sort(aList, new Descending());
		System.out.println(aList);
		
		
		System.out.println(".3////////////////////////////////");
		ListIterator<Integer> ite = aList.listIterator();
		while(ite.hasNext())
			System.out.println(ite.next());
		
		System.out.println(".4///////////////////////////////");
		while(ite.hasPrevious())
			System.out.println(ite.previous());
		
		
		

	}//end main

}//end class
