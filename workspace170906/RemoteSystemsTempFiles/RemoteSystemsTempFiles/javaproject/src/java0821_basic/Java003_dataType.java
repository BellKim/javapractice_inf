package java0821_basic;

/*
 * 리터널(literal) : 그 자체의 값 (1, 2, 3.... , 'a', 'b', 'c',.....  ,'true', false')
 * 변수(variable) : 하나의 값을 저장하기 위한 메모리 공간
 * 데이터 타입(data type) : 값의 종류와 메모리 크기를 결정
 * 자바에서 제공해주는 데이터 타입
 * 1. 기본 데이터 타입(primitive data type)
 * 	byte(1), short(2), int(4), long(8) => 정수
 * 	float(4), double(8) =>정수
 *  char(2) => 문자.
 *  boolean(1)=>논리
 *  
 *  
 * 2. 창조 데이터 타입(reference data type)
 * 	배열(array), 클레스(class), 인터페이스(interface)
 * 	
 * 	시스템에서 인식하는 데이터 타입 크기.
 * 	byte < short, char < int < long < float < double
 * 
 * 
 * 
 * 	float data = 3.5; ==> 틀림. float data = 3.5f; 해줘야 맞음. 
 * 	double data = 3.5; ==> 틀림. double data = 3.5d; 해줘야 맞음.
 * 
 * 
 */
public class Java003_dataType {

	public static void main(String[] args) {
		//int : 정수값을 저장할 수 있는 4바이트의 메모리를 생성한다.
		//data: 메모리를 관리한다.
		//3을 메모리에 저장한다.
		int data = 3; 
		
		//데이터 변수에 10으로 수정한다. 
		data = 10;
		
		System.out.println(data);
		
		int num; //변수선언
		num = 20; //메모리에 값 할당(저장)
		
		//num 변수에 저장된 값을 호출하여 출력한다. 
		System.out.println(num);
		
		//num 문자열을 그대로 콘솔창에 출력한다. 
		System.out.println("mum");
		
		

	}

}
