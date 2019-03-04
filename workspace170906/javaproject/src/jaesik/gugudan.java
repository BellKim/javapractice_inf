package jaesik;

public class gugudan {

	public static void main(String[] args) {
		
		int i,j,k;
		
		for(i=1; i<=9; i++) {
			for(j=1; j<=3; j++) {
				for(k=3*j-2; k<=3*j; k++) {
					 System.out.printf("%d x %d = %2d  ", i, k, i*k);
				}
				System.out.println("\n");
			}
			System.out.println("\n");
		}
		

	}//end main

}//end class


