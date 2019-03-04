package java0824_array.prob;
/*
 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
 * [출력결과]
 *  1   2   3   6			00 01 02 03
 *  4   5   6  15			10 11 12 13
 *  7   8   9  24			20 21 22 23
 * 12  15  18  45			30 31 32 33
 */

public class Prob_02 {

	public static void main(String[] args) {
		int[][] data = new int[4][4];
		int rightsum=0;
		int bottomsum=0;
		int cnt = 1;

		for(int row = 0; row<3; row++) {	//가로로출력 + 값 더해서 저장.
			for(int col=0; col<3; col++) {
				data[row][col]=cnt++;		//1~9까지 저장을 하기위함.
//				System.out.printf("%4d", data[row][col]);
			}//행관련
			
		}//3*3 에 저장. 및 출력
		
		for(int row = 0; row<3; row++) {
			for(int col=0; col<3; col++) {
				data[row][3] += data[row][col]; //저장된값을 각행3열에 순차적으로 더해줌
				data[3][row] += data[col][row];
			}
		}
		
		for(int row = 0; row<3; row++) {	//맨밑의 합과 오른쪽합이 일치하는지 확인
				rightsum += data[row][3];	//서로 동일하다는것이 확인되면 3,3 배열에 값 입력.
				bottomsum += data[3][row];
				if(rightsum==bottomsum) {//가로세로합 맞는지 보고 맞으면 저장. 
					data[3][3]=bottomsum;
				}
		}
		System.out.printf("right : %4d \nbottom : %4d\n\n", rightsum, bottomsum);
		
		
		
		for(int row = 0; row<4; row++) {
			for(int col=0; col<4; col++) {
				System.out.printf("%4d", data[row][col]);
			}
			System.out.println();
		}
0
		
	}// end main()

}// end class
