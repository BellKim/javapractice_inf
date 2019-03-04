package java0904_api.prob;

/*
 * 1 매개변수로 받은 문자열에서 각 단어의 첫 번째만
     리턴하는 makeInitial 메서드를 구현하시오. 
 * 2 출력결과
 *   JDBC
 *   JSP
 *   EJB
 */
public class Prob003_String {	
			
		public static void main(String[] args) {
			System.out.println(makeInitial("Java Data Base Conectivity"));
			System.out.println(makeInitial("Java Server Pages"));
			System.out.println(makeInitial("Enterprise Java Beans"));
			//testarea
			String test1 = "Java Server Pages";
			String test2 = " ";
			for(int i=0; i<test1.length(); i++) {
//			System.out.println(test1.charAt(i-1));
				if(i==0||test1.charAt(i-1) == ' ') {

					
					

					test2 += test1.charAt(i);
				}else {
					
				}
			}
			
			
			
			
			
			
			//testarea over
		}//end main()

		private static String makeInitial(String fullName) {
			//fullName의 매개변수에서 각 단어의 첫글자만
			//반환하는 프로그램을 구현하시오.
			
			//charAt 함수를 이용해서 for문을 돌리고 해당 배열 숫자의 글짜가 대문자이면, 새로운 배열에 저장하고,
			//대문자가 아니면 else 로 그냥 넘겨줌. 
			//저장한 배열을 return 해준다. 
			

			String rename=" ";
			for(int i=0; i<fullName.length(); i++) {
//				if(fullName.charAt(i) > 'A' && fullName.charAt(i) < 'Z') {
				if(i==0||fullName.charAt(i-1) == ' ') {					
//i=0일떄 charAt에서는(0-1) 이되서 오류가뜨는데 둘중에 하나만 충족되니까  통과.
//1차적으로 i==0 이라는 조건이 없으면 바로다음문장에서 (charAt 구문)에서 오류가 나기때문에 i==0 이라는 조건이 무조건적으로 있어줘야 한다. 
					rename += fullName.charAt(i);
				}else {
					
				}
			}
			return rename;

			
			/*수업중 해설. 
			String data = " "; 
			
			for(int i=0; i<fullName.length(); i++) {
				if(i==0 || fullName.charAt(i-1)== ' ')
					data+=fullName.charAt(i);
			}
			return data;
			
			*/
		}//end makeInitial()

}//end class














