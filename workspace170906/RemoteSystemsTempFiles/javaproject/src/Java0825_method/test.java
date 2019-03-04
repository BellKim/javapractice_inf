package Java0825_method.prob;

/*
 * [출력결과]
 * 내림 차순 결과
    31
	22
	16
	11
	10
	9
    오름 차순 결과
	9
	10
	11
	16
	22
	31
 */

public class imsi{//Prob007_method {
	

	public static void main(String[] args) {
		int[] arr = {10, 22, 9, 16, 11, 31};
		int temp = 0;
	    
		int[] result1 = sort(arr, "desc");
		int[] result2 = sort(arr, "asc");
	
		
	}//end main( )

	private static int[] sort(int[] array, String orderby) {
		// 구현하시오.
		
		String desc1 = new String("desc");
		String asc1 = new String("asc");
		
		 if(orderby == desc1) {
			 return array;
		 }else if(orderby == asc1) {
			 return array;
		 }
		 else {
			 return array;
		 }

		
	}//end sort( )
}//end class