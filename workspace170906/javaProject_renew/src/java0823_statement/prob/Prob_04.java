package java0823_statement.prob;

/*  
 * 1 10=2x+3y의 해를 구하시오.
 *   x와y의 범위 : 0<=x<=10,  0<=y<=10
 *   
 * 2 출력결과
 *  x=2, y=2
 *  x=5, y=0
 */
public class Prob_04 {

	public static void main(String[] args) {
		
		int x, y, flow;
		
		
		for(x=0; x<=10; x++) {
			for(y=0; y<=10; y++) {
				flow=(2*x)+(3*y);
				
				if(flow==10) {
					System.out.printf("x = %3d  ",x);
					System.out.printf("y = %3d\n",y);
				}

			}
		}
		
		

	}// end main()

}// end class
