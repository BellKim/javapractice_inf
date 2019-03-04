package java0905_api;

public class java125_RegEx {

	public static void main(String[] args) {
		
		String sn = "1321654";
		String sg = "2aab5";
		String st = "ab12cc";
		
		System.out.println(sn.matches(".*[a-zA-Z_*$].*"));
		System.out.println(sn.matches(".{2}[a-zA-Z_*$].*"));
		
		// .* 모두, 임의의 문자 {2~3} 
		//	.{2}[a-zA-Z_*$].*		//임의의문자 2개가 [이문자들이 표함되어있는가] 
		
		
		System.out.println(sn.matches(".*[0-9].*"));
		System.out.println(sn.matches(".*\\d.*"));
		
		System.out.println(sg.matches("2.*")); //2로 시작하는것
		
		System.out.println(sg.matches("2.*5")); //2로 시작하는것 5로 끝나는것, .* 2와 5사이에 뭐가있던 상관없음.
		System.out.println(sg.matches("2.+5")); //2로 시작하는것 + 는 임의의문자 1개이상
		
		System.out.println(sg.matches("[ab].{5}")); //ab로 시작하고 임의의 문자열의 길이 5개
		
		System.out.println(sg.matches("[ab].{1,5}cc"));//a또는b로시작하고 임의이ㅡ문자가 1~5개, cc 로 끝남. 
		
		
		
		
		
		

	}//end main

}//end class
