package Java0824_statement;
/*
 *  1  2  3  4  5 
 *  6  7  8  9 10
 * 11 12 13 14 15 
 * 16 17 18 19 20
 * 
 * 
 * [출력결과]
 *  1  2  *  4  5 
 *  6  7  8  * 10
 * 11  * 13 14  * 
 * 16 17  * 19 20
 */

public class Java050_array2d {

	public static void main(String[] args) {
		int [][] num= new int[4][5];
		
		int cnt = 1; 
		
		for(int row = 0; row<num.length; row++) {
			for(int col=0; col<num[row].length; col++) {
				num[row][col]=cnt++;
				
			}
		}
		
		////////////////////////////////////////////////////////
		for(int row = 0; row<num.length; row++) {
			for(int col=0; col<num[row].length; col++) {
				
				if(num[row][col]%3==0){
					System.out.printf("%4c",'*');
				}else {
					System.out.printf("%4d", num[row][col]);
				}
			}
			System.out.println("");
		}


	}

}
