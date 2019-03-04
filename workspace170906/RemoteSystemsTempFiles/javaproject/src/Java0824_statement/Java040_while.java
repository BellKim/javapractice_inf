package Java0824_statement;
/*
 * do{
 * 		수행할문장;
 * 	}while(조건식);	//두와일에 조건식다음에 ; 을 생략할 수 없다.
 */

public class Java040_while {

	public static void main(String[] args) {
		char chk='y';
		
		do {
			System.out.println("주문하시겠습니까 (Y/N)");
			
		}while(chk=='z');


	}//end of main()

}//end of class
