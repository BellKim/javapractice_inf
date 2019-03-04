package java0823_statement.prob;

/*
1+1+2+1+2+3+1+2+3+4+1+2+3+4+5=??

1
12
123
1234
12345 각각 다더하기


[출력결과]
sum=35
*/
public class Prob_03 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.printf("%d",j);
				sum+=j;
			}
			System.out.println();
		}
		System.out.printf("sum = %d\n",sum);
		
		
	}// end main()

}// end class
