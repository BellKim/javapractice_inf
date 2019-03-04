package java0904_api;

/*
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
		String data[] = str.split(",");
		if(data[1].charAt(7)=='1' ||data[1].charAt(7) =='3'  )
			System.out.printf("%s 님은 %c 입니다.", data[0],'남');
		else if(data[1].charAt(7)=='2' ||data[1].charAt(7) =='4')
			System.out.printf("%s 님은 %c 입니다.", data[0],'여');
		else
			System.out.println("잘못입력하셧습니다. ");

	}// end display()

}// end class
