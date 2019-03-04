package Java0824_statement;
/* 변수란 하나의 값을 저장하기위한 공간.
 * 배열
 * 1. 같은 데이터 타입의 여러 변수를 하나의 묶음으로 다루는 것이다.
 * 2. 많은 양의 값(데이터)를 다룰때 유용하다.
 * 3. 배열의 값element(엘리먼트)는 서로 연속이다.
 * 3. 각 배열의 요소는 서로 연속적이다.  
 * 
 * 
 */

public class Java041_array {

	public static void main(String[] args) {
//		int ko=99;
//		int en=80;
//		int jp=40;  //배열로 표현하고자 한다면?
		
		//배열선언
		int[] jumsu; //int jumsu[]; 도 가능한 표현이다.
		
		//new 키워드를 이용해서 배열을 생성한다. 
		//배열의 크기는 3개이다. 
		//각 요소마다 인덱스가 0부터 생성된다. 
		
		jumsu=new int[3];
		
		for(int i=0; i<jumsu.length; i++) {
			System.out.printf("jumsu[%d]=%d\n",i,jumsu[i]);
			
		}
		
		

	}

}
