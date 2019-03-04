package Java0825_method.prob;

/*
 * <<프로그램 실행결과 >>
 * 2 or 5의 배수가 아닌 갯수 : 7
 * 2 or 5의 배수가 아닌 합계 : 107
 */
public class Prob005_method {
	public static void main(String[] args) {
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		result(data);
	}// end main()
	
	public static void result(int[] data){
		// 여기에 2 or 5배수가 아닌 갯수와합계를 구하는 코드를 작성하세요.
		//의도하신 부분이 2또는5인지 2와 5인지에 따라서 답이 달라집니다. 
		// or( || ) 연산자를 사용하는가 and( && ) 를 사용하는건지요..? 일단 출력결과에 맞춰서 && 연산자 사용. 
		int cnt = 0; // 2또는 5의 배수가 아닌 요소 갯수 총합
		int sum = 0; // 2 또는 5의 배수가 아닌 요소들의 합계
		
		for(int i=0; i<data.length; i++) {
			if(data[i]%2 != 0 && data[i]%5 != 0) {
				cnt+=1;
				sum+=data[i];
				//System.out.println("데이터 출력 : "+data[i]);
			}
		}
		System.out.println(" 2 or 5의 배수가 아닌 갯수 : " + cnt);
		System.out.println(" 2 or 5 배수가 아닌 합계 : " + sum);
		
				
	}//end result()
	
}// end class

