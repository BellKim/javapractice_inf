package java0912_collection;
/*
 * Vector 와  ArrayList
 * 		1. Vactor은 동기화 처리가 되어있고 ArrayList는 비동기화 처리된다.
 * 		2. Vactor와 ArrayList는 메모리에 요소를 처리할 때 배열의 구조를 따른다.
 * 		3. Vactor와 ArrayList의 클래스는 처리방법이 비슷하다.
 * 		4. Vactor와 ArrayList으로 요소의 삽입, 삭제를 처리하는 것은 좋은 방법이 아니다. 
 * 
 */

import java.util.ArrayList;


public class java182_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		aList.add(new Integer(10));	//0
		aList.add(new Integer(20));	//1
		aList.add(new Integer(30));	//2
		aList.add(new Integer(40));	//3
		
		for(int i=0; i<aList.size(); i++) {
			System.out.printf("[%d] = %d\n",i,aList.get(i));
		}

	}//end main()

}//end class
