package Java0824_statement;

/*
 * 홍길동 90 85 40
 * 깁동이 100 35 75
 * 
 * [출력결과]
 * 홍길동 90 85 40 215 71.7
 * 갑동이 100 35 75 210 70.0
 *  
 */

public class Java049_array2d {

	public static void main(String[] args) {
		String[] name=new String[] {"홍길동", "갑동이"};
		int[][] jumsu=new int[][] {{90,85,40},
									{100,35,75}};
		int sum=0;
									
			for(int i=0; i<name.length; i++) {
				System.out.printf("%s",name[i]);
				
				for(int j=0; j<jumsu[i].length; j++) {
					 sum=sum+jumsu[i][j];
					System.out.printf("%3d ", jumsu[i][j]);
					
				}
				System.out.printf("%d %.1f ", sum, (float)sum/3);
				
				
				System.out.println("");
				sum=0;
				
				
			}
									
									

	}//end of main

}//end class


