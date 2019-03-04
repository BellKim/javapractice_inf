package java0907_api;

import java.util.Scanner;
/*
 * 이름, 학점을 입력하는 프로그램을 구현하시오.(입력시 , 도 입력해야한다.)
 * 입력 : 홍길동,80,93
 * 
 * [출력결과]
 * 	이름 : 홍길동
 * 	국어 : 80
 * 	영어 : 93
 * 	평균 : 86.5(double로 계산)
 */
/*
 * 숫자->문자로 변환
 * 
 */



public class java146_Wrapper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/////수업코드/////////////////////////////////////////////
		
		String line = sc.nextLine();
		String[] data = line.split(",");
		
		if(data.length!=3) {
			System.out.println("이름, 국어, 영어로 입력하세요 ");
			return;
		}//결과값 3개입력이상으로 했을때의 경고메시지 출력
		
		System.out.println("이름 : " + data[0]);
		System.out.println("국어 : " + data[1]);
		System.out.println("영어 : " + data[2]);
		
		//string -> double 로 변환
		double avg = 
				(Double.parseDouble(data[1])+
				Double.parseDouble(data[2]))/2;
		System.out.println("평균 : "+avg);
				
		
		
		
		/////수업코드/////////////////////////////////////////////
		
		
		
		/*
				String input1 = sc.nextLine();
		System.out.print("입력 : "+input1+"\n");
		
		System.out.print("입력 : "+input1+"\n");
		String[] res1 = input1.split(",");
		for(int i=0; i<res1.length; i++) {
		System.out.printf("결과"+res1[i]+"\n");
		}
		
		*/
		


	}//end main()

}//end class
