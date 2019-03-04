package java0907_api;

public class java151_System {

	public static void main(String[] args) {
		
		int[] arr1 = {1,5,2,4};
		int[] arr2 = {6,3,9,7,8};	 
		int[] arr4 = {4,2};
 		int[] arr3 = process(arr1, arr2, arr4);
 		for(int data : arr3)
 			System.out.printf("%3d",data);
		

	}//end main
	
	
	public static int [] process(int[] arr1, int[] arr2, int[] arr4) {
		int[] data = new int[arr1.length + arr2.length + arr4.length];
	/*
		for(int i=0; i<arr1.length; i++) {
			data[i] = arr1[i];
		}
		
		//arr2[0]번째를 data[5]에다가 넣기 시작
		for(int i=0; i<arr2.length; i++) {
			data[i+arr1.length] = arr2[i];
		}
		
		for(int i=0;i<arr4.length;i++) {
			data[i+arr1.length+arr2.length] = arr4[i];
		}
	*/
		System.arraycopy(arr1, 0, data, 0, arr1.length);//
		System.arraycopy(arr2, 0, data, arr1.length, arr2.length);
		// 0부터, 어디다 넣을꺼야 , 몇번재부터 넣을꺼야, 얼마나 넣을꺼야
		System.arraycopy(arr4, 0, data, arr2.length, arr4.length);

		
		return data;
	}//end process()

}//end class
