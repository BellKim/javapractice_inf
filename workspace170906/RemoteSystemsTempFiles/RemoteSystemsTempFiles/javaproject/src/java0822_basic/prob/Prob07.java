package java0822_basic.prob;
/*
 * ko, en, jp 평균을 통해서 60점 이상이면 "합격" , 60점 미만이면 "불합격" 을 출력하는 프로그램을 구하세요.
 * 
 * [출력결과]
 * 1)합격일때
 * 평균 65.0점, 합격입니다. 
 * 
 * 2) 불합격
 * 평균 34.5점, 불합격입니다.
 */

public class Prob07 {

	public static void main(String[] args) {
		int ko = 90;
		int en = 45; 
		int jp = 60; 
		int hap = ko + en + jp;
		double avr = hap/3.0; //더블형태니까 정수값이 아닌 실수값으로 해줘야한다. 
		
		
		
		String res = avr>=60 ? "합격" : "불합격";
		
		System.out.printf("평균 %.1f점, %s 입니다. \n", avr, res);
		System.out.printf("평균 "+avr+ "점,  "+ res+"입니다.");
		
		/*
		 * printf("출력방식", 값1, 값2 ..... )
		 * 출력기호
		 * %d : 정수 
		 * %f : 실수
		 * %c : 문자
		 * %s : 문자열
		 * %b : 논리
		 * %% : %
		 * \ : 키보드에서 지원하는 문자를 표기할때.
		 */
		
	}

}
