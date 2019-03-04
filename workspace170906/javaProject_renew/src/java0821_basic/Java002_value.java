package java0821_basic;

//주석 : 프로그램에 대한 부가적인 설명. 
//한 문장에 대한 주석처리가 가능하다. 
//여러라인에는 /**/ 를 사용한다.
/* 일반적이게 여러줄의 주석처리를 할 경우 .*/
/** document 에 대한 주석처리 (자바문서애대한 주석처리) */
// 자동정렬 : ctrl + shift + F


public class Java002_value {

	public static void main(String[] args) {// program start 
		System.out.println(3); //세미콜론 ;        //콜론 : 
		System.out.println(3);	// 서로 다른  프린트문은 서로다른 메모리에 저장이 된다. 
		
		int num=10;//메모리확보, 메모리관리이름 생성, 메모리에 저장될 값 저장.
		System.out.println(num); //메모리에서 데이터 호출
		System.out.println(num);
		
		

	}	//end main()

}	//end class 
