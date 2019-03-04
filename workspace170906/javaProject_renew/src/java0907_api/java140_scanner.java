package java0907_api;

import java.util.Scanner;

public class java140_scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("부서 : ");
		String dept=sc.next();
//		System.out.print("연복 : ");
		int salary=sc.nextInt();
//		System.out.print("평균 : ");
		double avg=sc.nextDouble();
		
//		System.out.printf("%s\n ", dept);
		System.out.printf(" %s %d %.1f \n",dept, salary, avg);
		
		sc.close();
		
		


	}

}
