package java0913_collection;

import java.util.LinkedList;

/*
 * Queue( 큐)
 * 
 * 1. FIFO(First In First Out) : 젱리 먼저 저장한 요소를 제일 먼저 꺼내온다. 
 * 
 * 2. 용도 : 최근사용문서, 인쇄작업대기목록, 버퍼
 * 
 */
public class java193_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nQueue = new LinkedList<String>();
		//추가
		nQueue.offer(new String("java"));
		nQueue.offer(new String("jsp"));
		nQueue.offer(new String("spring"));
		
		System.out.println("size :"+nQueue.size()); //3
		
		while(!nQueue.isEmpty())
			System.out.println(nQueue.poll());
		
		System.out.println("size :"+nQueue.poll());//0
		
		

	}

}
