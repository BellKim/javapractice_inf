package java0824_array;

public class Java047_array2d {

	public static void main(String[] args) {
		//3행 2열의 2차원배열
		int[][] num=new int[3][2];	//3행 2열의 배열을2차원 생성한다.
		
		num[0][0]=1; //
		num[0][1]=2;
		num[1][0]=3; //
		num[1][1]=4;
		num[2][0]=5; //
		num[2][1]=6;
//		System.out.printf("%4d", num[0][0]);
//		System.out.printf("%4d", num[0][1]);
//		System.out.printf("%4d", num[1][0]);
//		System.out.printf("%4d", num[1][1]);
//		System.out.printf("%4d", num[2][0]);
//		System.out.printf("%4d", num[2][1]);
		
		
		
		
		for(int i=0; i<num.length;i++) {//행의 길이
			for(int j=0; j<num[i].length; j++) {//열의길이
		
					
			System.out.printf("%4d",num[i][j]);
			}
		System.out.println("\n");
		}
//=========================================================================	
		int i;
		for(int j=0; j<=1;j++) {//행의 길이
			for(i=0; i<num.length; i++) {//열의길이
		
					
			System.out.printf("%4d",num[i][j]);
			}
		System.out.println("");
		}
		
		/*
		 * 1 3 5  = 00 01 02
		 * 2 4 6  = 10 11 12
		 */
		
		
		
		
		
		
		

	} //end of main()

}//end class
