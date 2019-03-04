package jaesik;

import Java0825_method.prob.imsi;

public class pivonachi {

	public static void main(String[] args) {
		int res = 2;
		int res1=0;
		int [] arr = new int [11];
		arr[0] = 1;
		arr[1] = 2;
		System.out.printf("%d, ",arr[0]);
		System.out.printf("%d, ",arr[1]);
		
		for (int i = 2; i <11; i++) {
			res = arr[i-2]+res;
			arr[i]=res;
			System.out.printf("%d, ",res);
		}
		
		for (int j = 0; j < 11; j++) {
			res1+= arr[j];
		}
		System.out.println();
		System.out.printf("결과 : %d",res1);
		
		
		
		
	}// end main

}// end class

/*
 * 1 2 3 5 8 13 21 34 55 89
 *
 * 
 * 
 * 
 * 
 */