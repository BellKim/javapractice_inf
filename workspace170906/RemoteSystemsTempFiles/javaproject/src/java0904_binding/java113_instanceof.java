package java0904_binding;
/*
 *instanceof : 객체를 배교하기 위한 비교연산자이다. 
 *	a instanceof A
 * 			: a객체가 A 타입이면 true, 
 *
 *
 */

class ExamA{
	
}//end examA//////////////

class ExamB extends ExamA{
	
}//end ExamB//////////////

class ExamC extends ExamB{
	
}//end ExamC //////////////






public class java113_instanceof {

	public static void main(String[] args) {
		//객체 instanceof 비교 데이터타입과 같거나 조상 데이터타입.
		
		ExamB bb = new ExamB();
		System.out.println(bb instanceof ExamA);//true
		
		ExamA aa = new ExamA();
		System.out.println(aa instanceof ExamB);//false
		
		ExamA ea = new ExamB();
		System.out.println(ea instanceof ExamA);//true
		System.out.println(ea instanceof ExamB);//true
		System.out.println(ea instanceof ExamC);//false
		
		
		/*
		 * ExamA ea = new ExamB();
		 * exama 에  찾는 함수가 있는지 검사 .
		 * 있으면 exam b 에도 있는지 검사하고 있으면 B를 출력. 
		 * 
		 * 
		 */
		
		
		
		
		
		
		

	}//end main()

}//end class
