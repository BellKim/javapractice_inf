package java0907_api;
/*
 * 1. 기본 자료형을 클래스로 정의해놓은 것을 Wrapper라고 한다. 
 * 	char		->	Character
 * 	byte 		->	Byte
 * 	short		->	Short
 * 	int			->	Integer
 * 	long		->	Long
 * 	float		-> 	Float
 * 	double		->	Double
 * 	boolean		->	Boolean
 * 
 * 2. 메모리에 자장된 값을 다른 자료형으로 
 * 		변환해주는 메소드를 제공하기 위해서 Wrapper클래스를 제공한다.
 * 
 * 3. auto boxing과 auto unboxing은 jdk5.0 에서 추가된 기능이다. 
 * 		auto boxing => 스텍 -> 힙영역에 복사.
 * 		auto unboxing => 힙 -> 스택영역에 복사.
 *
 *
 */
public class java142_Wrapper {

	public static void main(String[] args) {
//		문자열을 int 로 바꾸기위해서
		String data = "1234";
		
		//String -> Integer
		Integer it = new Integer(data);
		
		//Integer -> int
		int num = it.intValue();
		System.out.println("num = " + num);

		//Interger -> double
		double pro = it.doubleValue();
		System.out.println("pro = " + pro);
		
		//Interger -> long
		long nn = it.longValue();
		System.out.println("nn = " + nn);
		
		//String -> Float
		Float ft = new Float(data);
		
		//Float -> int
		int fx = ft.intValue();
		System.out.println("fx = " + fx);
		
		//Float -> double
		double de = ft.doubleValue();
		System.out.println("de = " + de);
		
		//String -> int
		int num1 = Integer.parseInt(data);
		System.out.println("num1 = " + num1);
		
		//String -> double
		double num2 = Double.parseDouble(data);
		System.out.println("num2 = " + num2);
		
		int x = 10; // stack
		Integer ig = new Integer(x); //heap
		Integer ie = x; // auto boxing(stack-> heap)
		
		//int k = ie.intValue(); // heap -> stack
		int y = ie; //auto unboxing(heap -> stack)
		System.out.println("y= " +y);
		
		//api java.lang.package 에 number클레스 들어가서 볼것. 
		
		//   http://includestdio.tistory.com/1 참조. 
		

	}

}






