package java0823_statement;
/*
 * 3의 배수만 제외하고 출력하는 프로그램.
 * 1
 * 2
 * 4
 * 5
 * 7
 * 8
 * 10
 * 
 */
public class Java034_for {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				i++;
			}
			System.out.printf("%d \n",i);
		}//end of for
		
		System.out.printf("================\n");
		
		for(int i=1; i<=10; i++) {
			if(i%3!=0) {
				System.out.printf("%d \n",i);
			}
		}//end of for
		
		System.out.printf("================\n");
		
		for(int i=1; i<=10; i++) {
			if(i%3==0) {
				//for(조건식; 조건식; 증감식){ }
				//반복문에서 continue를 실행하면 조건식으로 이동한다.
				//for문에서 continue를 실행하면 증감식으로 이동한다.
				continue;			
			}
			System.out.printf("%d \n",i);
		}//end of for

	}//end of main()

}//end of class()
