package Java0825_method;
/*
 * [출력결과]
 * 20은 양수이다. 
 * 0은 0입니다. 
 * -20은 음수입니다.
 * 
 */

public class Java061_method {

	public static void main(String[] args) {
		process(20);
		process(0);
		process(-20);
		
		

	}//end main
	public static void process(int num) {
		//data변수의 값이 0보다 크면 "양수", 0이면 "0",
		//0보다 작으면 "음수"로 
		//출력하는 프로그램을 구현하세요.
		
		if(num>0) {
			System.out.printf("양수 \n");
		}else if(num==0){
			System.out.printf("0\n");
		}else if(num<0){
			System.out.printf("음수\n");
			
		}
	}//end process;
	
	
	
	
	

}
