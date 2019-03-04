package java0904_api;
/*
 * [출력결과 ]
 * aerok
 * korea
 * 
 */



public class java119_String {

	public static void main(String[] args) {
//		String sn = "korea";
//		char[] data = display(sn);//배열로 반환.
//		System.out.println(data);	//aerok
//		System.out.println(sn);		//korea

		String sn = "korea";
		char[] data = display(sn);//배열로 반환.
		
		System.out.println(data);
		
		

	}//end main()
	
//	public static char[] display(String sn1) {//내가짬
//
//			char[] ary1 =sn1.toCharArray();
//			for(int i=0; i<ary1.length; i++) {//for문안에서 문자반전 
//				//0~4 까지.
//				char change;
//				
//				change = ary1[i];	//5=change		
//				ary1[ary1.length-1-i]=ary1[i];
//				ary1[ary1.length-1-i]= change;
//			
//			}	
//			return ary1;
//	}			
	

//	public static char[] display(String alpa) {
//			char[] arr = new char [alpa.length()];
//			/*
//			arr[0] = alpa.charAt(4);
//			arr[1] = alpa.charAt(3);
//			arr[2] = alpa.charAt(2);
//			arr[3] = alpa.charAt(1);
//			arr[4] = alpa.charAt(0);*/
//			
////			arr[0] = alpa.charAt(alpa.length()-1-0);//4
////			arr[1] = alpa.charAt(alpa.length()-1-1);//3
////			arr[2] = alpa.charAt(alpa.length()-1-2);//2
////			arr[3] = alpa.charAt(alpa.length()-1-3);//1
////			arr[4] = alpa.charAt(alpa.length()-1-4);//0
//			
//			for(int i=0; i<arr.length; i++) {
//				arr[i] = alpa.charAt(alpa.length()-1-i);//0
//			}
//			
//			
//		return arr;
//}
	
			
public static char[] display(String alpa) {
	char[] arr = new char [alpa.length()];	
//			arr[4] = alpa.charAt(0);
//			arr[3] = alpa.charAt(1);
//			arr[2] = alpa.charAt(2);
//			arr[1] = alpa.charAt(3);
//			arr[0] = alpa.charAt(4);
			
			arr[4] = alpa.charAt(0);
			arr[3] = alpa.charAt(1);
			arr[2] = alpa.charAt(2);
			arr[1] = alpa.charAt(3);
			arr[0] = alpa.charAt(4);
			
			for(int i=arr.length-1; i>=0; i--) {
				arr[i] = alpa.charAt(arr.length-1-i);	
				
			}
			
			return arr;

}//end display
	
	
	

}//end class








