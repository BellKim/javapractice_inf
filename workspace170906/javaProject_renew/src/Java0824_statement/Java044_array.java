package Java0824_statement;
/*
 * [출력결과]
 * 짝수 : 42
 * 홀수 : 3
 */

public class Java044_array {

	public static void main(String[] args) {
		int[] num = new int[] {22, 3, 8, 12};
		int even=0; //짝수
		int odd=0;	//홀수
		
		for(int i=0; i<num.length; i++) {
			if(num[i]%2==0) {	//even짝수
				even+=num[i];
				//System.out.printf("%2d",num[i]);
			}else if(num[i]%2==1) {	//odd홀수
				//System.out.printf("%2d",num[i]);
				odd+=num[i];
			}
		}
		System.out.printf("even = %2d\n",even);
		System.out.printf(" odd = %2d",odd);
	}

}
