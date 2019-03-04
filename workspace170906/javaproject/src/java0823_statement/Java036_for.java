package java0823_statement;

public class Java036_for {

	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("%4d",j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		int cnt = 1;
		
		for(int i=1; i<=4; i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf("%4d", cnt);
				cnt++;
			}
			cnt=1;
			System.out.println();
		}
		
		

	}

}
