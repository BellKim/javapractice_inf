package java0913_collection;
/*
 * stack(스택)
 * 1.LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼낸다. 
 * 2. 수식계산, 수식괄호검사, under/redo, 뒤로/앞으로
 * 
 */

import java.util.LinkedList;

public class java192_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nStack = new LinkedList<String>();
		//추가
		nStack.add(new String("java"));
		nStack.add(new String("jsp"));
		nStack.add(new String("spring"));
		System.out.println("size : "+nStack.size());
		while(!nStack.isEmpty()) {
			System.out.println(nStack.pop());
//			System.out.println(nStack.pop());
		System.out.println("size : "+nStack.size());
		
		}//
		
		

	}//end main

}//end class
