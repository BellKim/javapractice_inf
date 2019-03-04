package java0823_statement;
/*
 * i=1 num=1
 * i=2 num=3
 * i=3 num=6
 * i=4 num=10
 * i=5 num=15
 * 
 */

public class Java030_for {
	

	public static void main(String[] args) {
		int sum = 0;	//누적을 저장할 변수
		int i;
		for(i=1;; i++) {//생략 대신에 0==0 혹은 true 로 두기도 한다. 
			sum=sum+i;
			
			System.out.printf("i = %d sum = %d \n", i, sum); //분석
			if(sum>=15) {
				break;
			}
//			System.out.printf("i = %d sum = %d \n", i, sum); //분석
		}
//		System.out.printf("i = %d sum = %d \n", i, sum); //분석
		
		
		


	}

}
