package java0822_statement;
/*
 * 다중 if-else
 * 	if(조건식1){
 * 		수행할 문장1;
 * 	}else if(조건식2){
 * 		수행할 문장2;
 * 	}else if(조건식3){
 * 		수행할 문장3;
 * 	}else if(조건식4){
 * 		수행할 문장4;
 * 	}else{
 * 		수행할 문장;
 * 	}
 * 
 * 
 * 	
 */
public class Java020_if {

	public static void main(String[] args) {
		
		char code='B';
		
		if(code == 'A') {
			System.out.println("1");
		}else if(code =='B'){
			System.out.println("2");
		}else if(code =='C'){
			System.out.println("3");
		}else {
			System.out.println("4");
		}
		System.out.println("각각 체크");
		
		
	} //end of main()

}//end of class()









