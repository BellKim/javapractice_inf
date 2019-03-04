package java0912_collection;

import java.util.Vector;

public class java180_Vector {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(new Integer(10));	//0
		v.add(new Integer(20));	//1
		v.add(new Integer(30));	//2
		v.add(new Integer(40));	//3
		
		//특정 인덱스에 있는값들을 제거한다.
		v.remove(1);				
		
		//0인덱스에 40 요소를 삽입한다.		//변수타입이 다르고 메소드명이 같으면 오버로딩된 것이다.
		v.add(0, new Integer(40));	//0인덱스에 40을 넣어주니 배열이 한칸씩 뒤로 밀린다. 
		

		for(int i=0; i<v.size(); i++) {
			System.out.printf("[%d] = %d\n",i,v.get(i));
		}

	}//end main()

}//end class
