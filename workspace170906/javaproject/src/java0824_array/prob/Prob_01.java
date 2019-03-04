package java0824_array.prob;

/*
 * num배열에서 최대값을 출력하는 프로그램을 구현하시오.
 * [출력결과]
 * 최대값:95
 */

public class Prob_01 {
	public static void main(String[] args) {

		int[] num = { 94, 85, 95, 88, 90 };
		int max=0, min=100;
		for(int i=0; i<num.length; i++) {
			if(num[i]>max) {
				max=num[i];
				System.out.printf("max 값 변경 : %d \n", max);
			}
			if(num[i]<min) {
				min=num[i];
				System.out.printf("min 값 변경 : %d \n", min);
			}
		}
		System.out.printf("max : %d \nmin : %d", max, min);
		
		//여기를 구현하세요.

	}// end main()

	
}// end class
