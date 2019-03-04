package java0823_statement;
/*
 * i=1
 * i=2
 * i=3
 * .... 
 * i=5
 * sum=15
 */

public class Java031_for {

	public static void main(String[] args) {
		int sum = 0;	//누적을 저장할 변수
		int i;
		for(i=1;; i++) {//생략 대신에 0==0 혹은 true 로 두기도 한다. 
			sum=sum+i;
			System.out.printf("i = %d \n", i);
		
			if(sum>=15) {
				break;
			}
		}
		System.out.printf("sum = %d \n", sum);

		
	}

}
