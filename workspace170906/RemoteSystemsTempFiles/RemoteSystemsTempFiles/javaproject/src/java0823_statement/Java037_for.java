package java0823_statement;
/*
 * 반복문에서 특정 위치로 이동(continue)을 하거나 빠져나올때(break)
 * 반복문은 label명을 선언하고 호출하면 된다. 
 * 
 */
public class Java037_for {

	public static void main(String[] args) {
		
		move://label선언
		for(int i=1; i<=3; i++) {
			
			for(int j=1; j<=2; j++) {
				System.out.printf("j=%d", j);
				//continue move; //label호출 -> i++ 증감식으로 이동.
				break move;//move 로 선언된 반복문을 빠져나온다.(현재는 i for 문)
			}
			System.out.printf("k=%d  ", i);	
		}
	System.out.println("program end ");


	}

}
