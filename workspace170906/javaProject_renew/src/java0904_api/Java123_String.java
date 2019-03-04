package java0904_api;

/*남자는 주민번호 1,3 여자는 주민번호 2,4 이다.
 * [출력결과]
 *  홍길동님은 남성입니다. 
 *  응삼이님은 여성입니다.
 *  잘못입력하셨습니다.
 */
public class Java123_String {

	public static void main(String[] args) {
		String p1 = "홍길동,561203-1597650";
		String p2 = "응삼이,030628-4056892";
		String p3 = "갑동이,900824-8052582";
		display(p1);
		display(p2);
		display(p3);
	}// end main( )

	public static void display(String str) {
		// 여기를 구현하세요.
		String[] res = str.split(",");//이름, 주번 분류.
		if(res[1].charAt(7)=='1' || res[1].charAt(7)=='3') {
			System.out.printf("%s님은 %s 입니다. ",res[0], '남');
		}else if(res[1].charAt(7)=='2' || res[1].charAt(7)=='4') {
			System.out.printf("%s님은 %s 입니다. ",res[0], '여');
		}else {
		System.out.println("잘못입력하셧습니다. ");
		}
		

	}// end display()

}// end class
