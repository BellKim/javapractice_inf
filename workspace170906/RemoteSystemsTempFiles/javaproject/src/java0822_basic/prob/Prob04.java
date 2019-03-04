package java0822_basic.prob;
	/*
	 * 사과를 담는데 필요한 바구니의 수를 구하는 코드이다.
	 * 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 
	 * 13개의 바구니가 필요하다.
	 * [실행결과]
	 * 필요한 바구니의수 : 13;
	 *  
	 */


public class Prob04 {

	public static void main(String[] args) {
		int apple = 123;
		int basket_lim = 10;
		
		int res = apple%basket_lim==0 ? apple/basket_lim : (apple/basket_lim)+1 ;
		
		System.out.printf("필요한 바구니의 수 : %d\n", res);
		
		
		

	} //end of main()

}//end of class()


