package Java0824_statement;
/*
 * num 배열에 저장된 요소의 함계를 구하는 프로그램을 구현하세요.
 * 
 * [출력결과]
 * 합계 : 45;
 */

public class Java043_array {

	public static void main(String[] args) {
		
		int[] num = new int[] {22, 3, 8, 12};
		int sum=0;
		
//		sum=sum+num[0];	//22=0+22;
//		sum=sum+num[1];	//25=22+3;
//		sum=sum+num[2];	//33=25+8;
//		sum=sum+num[3];	//45=32+12;
		
		for(int i=0; i<num.length; i++) {
			sum+=num[i];
			System.out.printf("%d \n",sum);
		}
		
		

	}//end main()
	
}//end class
