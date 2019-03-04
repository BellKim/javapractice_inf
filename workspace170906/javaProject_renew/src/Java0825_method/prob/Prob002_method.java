
package Java0825_method.prob;

/*
 *  int[] num=new int[]{2,3,5,};
 	num.length; //배열의 크기
 
 	String st="java";
 	st.length( ); //문자열 길이
 */

/* 
 *  [출력결과]
 * 	 35276은 숫자입니다.
 * 	 2_8a은 문자입니다.
 */
public class Prob002_method{
	public static void main(String[] args) {
		System.out.print("35276은 ");
		prnDisplay(numCheck("35276"));
		String data = "35276";
		System.out.print("2_8a은 ");
		prnDisplay(numCheck("2_8a"));
	}// end main()



	public static boolean numCheck(String data) { // 35276
		// data값이 숫자면 true 아니면 false을 반환하는 로직 구현
		// char num=data.charAt(0); //charAt() = 지정한 인덱스에서 문자를 반환합니다. 문자를 반환해서 문자가 나오면 false로 출력. 
		 //if(num>='0' && num<='9')
		char num;
		int ok=0, no=0; 
		
		for(int i=0; i<data.length();i++) {  //System.out.println(data.length());//문자길이 판별(5)
			num=data.charAt(i);
			if(num>='0' && num<='9') {	//받아온 문자열과 0~9의 숫자가 일치하면 업카운트되고, 
				ok+=1;
			}else {
				no+=1;
			}
		}
		
		if(ok==data.length()) {	//ok 에서 업카운트된 숫자와 문자열의 총길이를 비교하여 일치하면 true 로 출력해보낸다.
			return true;
		}else {					//물론 일치하지 않으면 false 다.
			return false;	
		}
		
	}// end numCheck()

	public static void prnDisplay(boolean chk) {
		// chk값이 true이면 "숫자입니다."
		// chk값이 false이면 "문자입니다." 로 출력하는 로직구현
		
		if(chk==true) {
			System.out.println("숫자군요?");
		}else {
			System.out.println("문자군요!");
		}
		
	}// end prnDisplay()
	
	

}// end class











