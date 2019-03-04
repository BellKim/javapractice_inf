package java0905_api;

public class java125_RegEx {

	public static void main(String[] args) {
		
		String sn = "asd3fd";
		String sm = "ccca56";
		String sg = "ab3433";
		String st = "a123456cc";
		
		System.out.println(sm.matches(".*[a-zA-Z_*$].*"));
		System.out.println(sm.matches(".{3}[a-zA-Z_*$].*")); //앞 문자열3개가 나올때까지 a-zA-Z가 나오는가 &*$ 해당기호 바로 앞 문자가 0번이상 반복. 		
		// .* 모두, 임의의 문자 {2~3} 
		//	.{2}[a-zA-Z_*$].*		// 2개가2번 반복됨.  [이문자들이 표함되어있는가] 
		
		//3이면 0부터
		System.out.println(sn.matches(".*[0-9].*"));//문자열 전체에서 숫자가 있는가
		System.out.println(sn.matches(".*\\d.*"));//	\\d = [0-9]
		//    /d 를 써야하는데 / 는 특수기호이다. 큰따옴표 안에서는 특수기호는 두번써줘야한다. 
	
		
		System.out.println(sg.matches("2.*")); //2로 시작하는것
		
		System.out.println(sg.matches("2.*5")); //2로 시작하는것 5로 끝나는것, .* 2와 5사이에 뭐가있던 상관없음.
		System.out.println(sg.matches("2.+5")); //2로 시작하는것 + 는 임의의문자 1개이상(앞문자가 하나이상임.(제일 끝 문자열이 5인가))
		
		System.out.println(sg.matches("[ab].{5}")); //ab로 시작하고 임의의 문자열의 길이 5개
							//5개가 012345 인가 갯수가 5개가 아니라????????
		System.out.println(sg.matches("[ab].{1,5}cc"));//a또는b로시작하고 임의이ㅡ문자가 1~5개, cc 로 끝남. 
		
		
		
		
		
		

	}//end main

}//end class
