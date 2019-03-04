package java0824_array;
/*
 * data배열에서 대문자의 갯수를 출력하는 프로그램을 구현하세요.
 * 
 * [출력결과]
 * 대문자갯수 : 2
 */

public class Java046_array {

	public static void main(String[] args) {
		
		char[] data = new char[] {'a','b','F','R','a'};
		int cnt = 0;
		
		for(int i=0; i<data.length; i++) {				
			if( data[i] >= 65 && data[i] <= 90) {
				cnt+=1;
			}
		}
		System.out.printf("대문자의 갯수는 : %d\n\n", cnt);
		
		System.out.printf("data.length길이  %d\n\n", data.length);
		/*
		 * data.length 의 길이를 찍어보면 5가나온다. 하지만 배열은 0부터 시작이된다.
		 * 그러므로 5문의 갯수를 맞춰주지 않으면 오류가 생성된다. for문의 부등호를 작성할때 i=0 i<=5 를 해주면 
		 * 배열의 갯수가 6개가 된다. 즉 i=5일때는 없는 배열을 호출하는것이므로 오류가 뜬다. 
		 * (현재 존재하는 배열은 0 1 2 3 4 이다.)
		 * 
		 */
		
		
		
		


	}

}
