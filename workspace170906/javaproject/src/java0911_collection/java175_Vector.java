package java0911_collection;

import java.util.Vector;

public class java175_Vector {

	public static void main(String[] args) {
		
		Vector v= new Vector();		//노란줄 - 문법은틀리지않았지만 옛날문법사용.
		//integer -> Object : up-casting 이 발생 .
		
		
		//객체만 전달할수있으므로 
		v.add(new Integer(10));	//0
		v.add(new Integer(20));	//1
		v.add(new Integer(30));	//2
		v.add(new Integer(40));	//2
		
		for(int i=0; i<v.size(); i++) {
			//다운캐스팅
			//Object->Integer : down-casting
			Integer it = (Integer)v.get(i);
			System.out.println(it);
			
			
			
		}
		
		
		


	}//end main()

}	//end class
