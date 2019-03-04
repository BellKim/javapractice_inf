package Java0828_class;
/*
 * [도서관리]
 * 제목				대출여부
 * 칼의노래			대출중
 * 어두운상점의거리		대출가능
 */

/*
 * [객체모델링과정]
 * 객체의 특징 : 책제목, 대출여부
 * 객체의 기능 : 대출여부를 처리한다. 
 * 
 */

class Book {
	String title;
	boolean state; // 대출가능, 대출불가를 T,F로 구분.

	String process() {// state값 구분필터링
		if (state) {
			return "대출가능";
		} else {
			return "대출중";
		}

	}// end process

}// end class Book

public class Java066_class {

	public static void main(String[] args) {
		Book bk = new Book();
		bk.title = "칼의노래";
		bk.state = false;

		Book bs = new Book();
		bs.title = "어두운상점";
		bs.state = true;
		System.out.printf("%s, %s \n ", bk.title, bk.process());
		System.out.printf("%s, %s \n ", bs.title, bs.process());

	}// end main

}//end class
