package java0822_statement;
/*
 * 각 월의 마지막일
 * 1 3 5 7 8 10 12 =>31
 * 4 6 9 11 => 30
 * 2 =>28
 * 
 * [출력결과]
 * 4월의 마지막 일은 30일 입니다.
 * 
 */
public class Java023_if {

	public static void main(String[] args) {
		int month = 4;
		int lastDay = -1;
//		///////////////////////
//		if(month<=7) {
//			if(month%2==0) {//2 4 6 은 작은달
//				if(month==2) {//2월만 28일이고 나머지 다 30일
//					System.out.println("28일");
//				}else {
//					System.out.println("30일");
//				}
//				
//			}else {//1 3 5 7 월 큰달
//				System.out.println("31일");
//				
//			}
//			
//		}else if(month>7) {
//			if(month%2==1) {//
//					System.out.println("30일");
//				}
//			}else {//
//				System.out.println("31일");
//				
//			}
//		///////////////////////
		
		if(month==1 || month==3 || month==5 || month==7 
				|| month==8 || month==10 || month==12 ){
			lastDay=31;
		}else if(month==4 || month==6 || month==9 || month==11){
			lastDay=30;
		}else if(month==2) {
			lastDay=28;
		}
		
		
		
		System.out.printf("%d월의 마지막 일은 %d 입니다.\n",month, lastDay);
		
		
		



	}//end of main()

}//end of class()
