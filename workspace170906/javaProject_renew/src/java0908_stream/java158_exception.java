package java0908_stream;

class UserException extends Exception{
	public UserException(String message) {
		super(message);
	}//userexception
}

public class java158_exception {
		public static void main(String[] args) {
			int num = 5;
			process(num);
			System.out.println("korea");
			

		}//end main()
		
		public static void process(int data) {
			try {
				if(data<10) 
				//예외를 발생시킬예정
				throw new UserException("10 이상만 입력하세요");			
				System.out.println(data);
				
			} catch(UserException ex) {
				System.out.println(ex.toString());
			}
		}//end process

}
