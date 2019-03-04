package java0908_stream;

import java.util.Scanner;

/*
 * [순번 이름 평균 ] 입력
 * 
 * 순번 : 10
 * 이름 : 홍길동
 * 평균 : 9.5
 * 
 */
public class java164_stream {

	public static void main(String[] args) {
		System.out.println("[순번 이름 평균 ] 입력");
		Scanner sc = new Scanner(System.in);
		System.out.printf("순번 : %d \n", sc.nextInt());
		System.out.printf("이름 : %s \n", sc.next());
		System.out.printf("평균 : %.1f\n", sc.nextDouble());
		
		
		
		

	}//end main
}//end class
