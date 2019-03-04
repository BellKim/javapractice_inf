package java0911_collection;
/*
 * 	선형리스트(Linear List)
 * 1. 순서리스트(Ordered List)
 * 2. 자료들 간에 순서를 갖는 리스트
 * 3. 선형리스트에서 원소를 나열한 순서는 원소들의 순서가 된다.
 * 
 * 연결리스트는 요소들간을 각자 저장하고 주소값으로 연결하는 방식으로 진행하며 인덱스값을 별도로 줄 수 있다. 
 *  배열 생성해서 만듬.
 *  
 *  
 */


class UserList{
	 int sale[] = new int [3];
	int point = 0; 
	
	public void add(int data) {
//		sale[point++] = data; //값증가
//		if(sale.length == point)
//			sale=new int[sale.length*2];
		int[] arr;
		sale[point++] = data; //값증가
		if(sale.length == point) {
		arr=new int[sale.length*2];
		System.arraycopy(sale, 0, arr, 0, sale.length);
		sale = arr;
		}
	}
	
	public int get(int index) {
		return sale[index];
	}
	public int size() {
		return point;
	}
	
	public void remove(int index) {
		for(int i=index+1; i<point; i++) {
			sale[i] = sale[i+1];
		}
		point--;
	}//java_180과 연관된 클레스이다.
	
	
}// end class

	





public class java176_Vector {

	
	public static void main(String[] args) {
	/*	
		sale[0] = 10;
		sale[1] = 20;
		sale[2] = 30;
	*/
		UserList uList = new UserList();
		uList.add(10);
		uList.add(20);
		uList.add(30);
		uList.add(40);//배열의 갯수와 맞지않아서 오류생김.
		for(int i=0; i < uList.size(); i++)
			System.out.println(uList.get(i));
		
	}//end main()
	


}//end class
