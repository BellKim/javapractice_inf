package java0821_basic;

public class Java016_operator {

	public static void main(String[] args) {


		System.out.println("java");
		System.out.println("jsp");
		System.out.print("hello");
		System.out.print("oracle");
		System.out.printf("%s", "myball");
		
		System.out.print("hello\n");
		System.out.print("oracle\t helllooo");
		
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
		
		
		System.out.printf("%s\n", "mybatis");
		System.out.printf("%d\n", 50);
		System.out.printf("%f\n", 4.5);
		System.out.printf("%c %b %d\n", 'a',true,10);
		
		//소수점 첫번째 까지 출력을 한다. (반올림) 
		System.out.printf("%.0f\n",4.69);
		
		//5는 총 자릿수(소수점포함) .1 은 소수점 자릿수
		System.out.printf("%5.1f\n", 4.56);
		System.out.printf("%5.1f\n", 34.56);
		System.out.printf("%5.1f\n", 124.56);
		System.out.printf("%5.1f\n", 5124.56);
		System.out.printf("\n");
		
		System.out.printf("%5.2f\n", 4.56);
		System.out.printf("%5.2f\n", 4.5);
		System.out.printf("%5.2f\n", 24.567);
		System.out.printf("%5.2f\n", 24.5); //자리수가 남으면 0으로 체워버린다. 
		
		System.out.printf("%-5.2f\n", 24.567); // -값을 주면 왼쪽으로 정렬이된다.
		
		
		//홍길동님의 평균은 95.0 이므로 A 학점입니다.
		System.out.printf("%s님의 평균은 %.1f 이므로 %C 학점입니다. ","홍길동",95.0, 'A');
		
		//3+2=5
		System.out.printf("%d+%d=%d\n",3 ,2 ,3+2);
		
			
		//당신의 색깔은 "파랑" 입니다.
		
		System.out.printf("당신의 색깔은 \"%s\" 입니다.\n", "파랑");
		System.out.printf("안녕 \thello\n");
		
				
		


	}//end of main()

}//end of class()
