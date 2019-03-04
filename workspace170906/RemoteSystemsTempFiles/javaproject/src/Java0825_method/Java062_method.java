package Java0825_method;
/*
 * [출력결과]
 * 입사총점 : 815점
 * 입사결과 : 합격입니다.
 */

public class Java062_method {
	public static int total(int toeic, int tot) {
		//두 매개변수의 합계를 계산하여 리턴한다.
		int result = toeic + tot;		
		return result;
	}//end total
	
	public static String rs(int tot) {
		//총점이 800이상이면 합격, 미만이면 불합격
		if(tot>=800) {
			return "합격";
		}else {
			return "붑룹룹루부부부불합격";
		}
		//return null;
	}//end rs();	

	public static void main(String[] args) {
		int toeic = 750, it = 65;
		System.out.println("입사총점 : "+total(toeic, it)+"점");
		System.out.println("입사결과 : "+rs(total(toeic, it))+"입니다.");

	}

}
