package java0908_stream;

public class java157_exception {

	public static void main(String[] args) {
		int num = 5;
		process(num);
		System.out.println("korea");
		

	}//end main()
	
	public static void process(int data) {
		try {
		if(data<10) 
			//예외를 발생시킬예정
			throw new ArithmeticException("10 이상만 입력하세요");
		System.out.println(data);
		} catch(ArithmeticException ex) {
			System.out.println(ex.toString());
		}
	}//end process

}//end class
