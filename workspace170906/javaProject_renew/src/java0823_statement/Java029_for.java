package java0823_statement;

public class Java029_for {

	public static void main(String[] args) {
		int sum = 0;	//누적을 저장할 변수
		int i;
		for(i=1;; i++) {//생략 대신에 0==0 혹은 true 로 두기도 한다. 
			sum=sum+i;
			if(sum>=15) {
				break;
			}
			
			
		}
		System.out.printf("i = %d sum = %d \n", i, sum);
		

	}

}
