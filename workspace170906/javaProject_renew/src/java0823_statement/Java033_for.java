package java0823_statement;
/*
 * 1부터 10까지 짝수, 홀수누적을 계산하는 프로그램을 구현하세요.
 * [출력결과]
 * 짝수누적:30;
 * 홀수누적 25;
 */

public class Java033_for {

	public static void main(String[] args) {
		int odd=0;//홀수누적
		int even=0;//짝수누적
		
		for(int i=0; i<=10; i++) {
			if(i%2==1) {//홀수
				odd+=i;
			}else if(i%2==0){//짝수
				even+=i;
			}else {
				System.out.print("뭔가잘못됬다");
			}
			
			
		}
		System.out.printf("짝수누적 : %d \n홀수누적 : %d", even,odd);
	}//end of main()

}//end of class()

