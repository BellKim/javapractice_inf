package java0823_statement;
/*
 * 3행 4열
 * 	1 2  3  4 
 *  5 6  7  8
 *  9 10 11 12
 */

public class Java035_for {

	public static void main(String[] args) {
		
		for(int k=1; k<=12; k++) {
			System.out.printf("%4d ",k);
			if(k%4==0) {
				System.out.printf("\n");
			}
		}
		
		System.out.printf("\n");
		
		int cnt = 1;
		for(int i=1; i<=3; i++) {
			for(int j=1;j<=4;j++) {
				System.out.printf("%4d ",cnt);
				cnt+=1;
				//cnt++; //로 해도된다.
			}
			System.out.printf("\n");
		}
		
		
		

	}//end of main()

}//end of class
