package java0822_statement;
/*
 * 키워드(예약어) : 프로그램에서 어떤 의미를 부여해서 정의해놓은 단어
 * return : 현재 수행중인 메소드(main) 을 완전히 빠져나올때 사용되는 키워드이다. 
 * 
 */


public class Java022_if {

	public static void main(String[] args) {
		
		char check = 'n';
		//check변수의값이 'n'이면 main() 메소드를 완전히 종료하고, 아니면 main()메소드를 수행하겠다. 
		if(check=='n') {
			System.out.println("main 메소드 종료");
			return; //main()메소드를 종료한다.
		}
		
		System.out.println(check);
		System.out.println("program end");
		
		


	}//end of main()

}//end of class()
