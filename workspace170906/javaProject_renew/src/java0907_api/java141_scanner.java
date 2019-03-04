package java0907_api;

import java.util.Scanner;

/*
 * 단입력 : 5
 * 5 * 1 = 5
 * --------------
 * 5 * 9 = 45
 * 
 * 계속하시겠습니까? (종료 n 계속 : 아무키) a
 * 단입력 : 3
 * 3 * 1 = 3
 * --------------
 * 3 * 9 = 27
 * 
 * 계속하시겠습니까? (종료 n 계속 : 아무키)  n
 * 
 *  종료
 */

public class java141_scanner {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	int j=1;
	while(true) {
		System.out.print("단입력 하세요 : ");
		int dan = sc.nextInt();
		for(int i=0; i<=9; i++) {
			System.out.printf("%d * %d = %d \n",dan,i,dan*i);
		}
		
		System.out.print("계속 진행하시것습니까?(종료 : N, 계속 : 아무키나)");
		String check = sc.next();
		
		if(check.equals("N")|| check.equals("n")) {
			break;
		}else {
			System.out.println("계속진행!");
			
		}
		
		
		
	}
	
	


	}

}
