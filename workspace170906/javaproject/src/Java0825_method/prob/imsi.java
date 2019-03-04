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
		System.out.println("내림 차순 결과");
		for (int i = 0; i <= result1.length-1; i++) {
			System.out.println(result1[i]);
		}
		System.out.println("오름 차순 결과");
		for (int i = 0; i <= result2.length-1; i++) {
			System.out.println(result2[i]);
		}
		
	}//end main( )

	private static int[] sort(int[] array, String orderby) {
		// 구현하시오.
		int temp = 0;
		 for (int i = 0; i < array.length - 1; i++)
		    {
		        for (int j = 0; j < array.length - 1 - i; j++)
		        {
		            if (array[j] < array[j + 1])
		            {
		            	temp        = array[j];
		            	array[j]     = array[j + 1];
		            	array[j + 1] = temp;
		            }
		        }
		    }
		
		
//		 if(orderby == desc1) {
//			 return array;
//		 }else if(orderby == asc1) {
//			 return array;
//		 }
//		 else {
//			 return array;
//		 }
		
		if(orderby.equals("desc")) {
			return array;
			
		}else if(orderby.equals("asc")){
			
			int temp1=0;
			for(int i=0; i<array.length; i++) {
				for(int j=0; j<array.length; j++ ) {
					temp1 = array[array.length-1-j]; 
					array[array.length-1-j]=array[j];
					array[j]=temp1;
				}
			}
			
			return array;
		}
		else {
			int[] arrorARR = {4,4,4,4,4};
			return arrorARR;			
		}
		
		 


		
		
		
	}//end sort( )
}//end class