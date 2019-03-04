package Java0824_statement;

public class Java048_array2d {

	public static void main(String[] args) {
		//3행 2열
		
		int[][] num = new int[][] {{1,2},{3,4},{5,6}};
		
		
		for(int i=0; i<num.length;i++) {//행의 길이
			for(int j=0; j<num[i].length; j++) {//열의길이
			System.out.printf("%4d",num[i][j]);
			}
		System.out.println("");
		}
		
		
		

	}

}
