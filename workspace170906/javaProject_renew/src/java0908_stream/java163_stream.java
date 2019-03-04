package java0908_stream;


import java.util.InputMismatchException;
import java.util.Scanner;

public class java163_stream {
	public static void main(String[] args) {
		
		System.out.println("데이터입력");
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
			try {
			System.out.print("x: ");
			x =sc.nextInt();//입력받음.
			System.out.print("y : ");
			y =sc.nextInt();//입력받음.
			System.out.printf("%d + %d = %d\n",x, y, x+y);
			}catch(InputMismatchException ex ) {
				System.out.println(ex.toString());
			}finally {
				sc.close();
			}
		
		sc.close();


	}//end main
}//end class

/*java 162번에서 사용된 코드를 지워나가면서 163번 처럼 적용되는지를 꼭 살펴봐야만한다.*/

