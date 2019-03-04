package java0905_api;

public class java130_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java Test");
		System.out.print("print: ");
		System.out.println(sb);
		//4인덱스에 ",jsp" 문자열을 삽입한다.
		sb.insert(4,  ",jsp");	//java,jsp Test
		System.out.print("insert: ");
		System.out.println(sb);		//삽입시
		
		//4인덱스부터 8인덱스 미만 사이의 문자열을 삭제한다. 
		sb.delete(4, 8);
		System.out.print("삭제 : ");
		System.out.println(sb);		//삽입시
		
		//0인덱스의 문자를 삭제한다.
		sb.deleteCharAt(0);
		System.out.print("인덱스0 삭제 : ");
		System.out.println(sb);		////ava Test
		
		//문자열을 반대로 변경해서 리턴한다. 
		sb.reverse();
		System.out.print("리버스 : ");
		System.out.println(sb);		//tseT ava
		
		System.out.println("============");
		//스트링타입을 리버스하려면?
		String data = "mybatis orm";
		StringBuffer sf = new StringBuffer(data);
		sf.reverse();
		System.out.println(sf);
		
		
		System.out.println("============");
		//char 형은?
		char[] arr = new char[] {'k','o','r','e','a'};
		StringBuffer se = new StringBuffer(String.valueOf(arr));
		se.reverse();
		System.out.println(se);
		
		System.out.println("//////////////////");
		StringBuffer sa = new StringBuffer()
				;
		System.out.println(sa);
		sa.append(arr);		//append() : 매개변수로 입력된 값을 문자열로 변환하여 StringBuffer 인스턴스가 저장하고 있는 문자열의 뒤에 덧붙인다.
		System.out.println(sa);
		sa.reverse();
		System.out.println(sa);
		System.out.println("//////////////////");
		
		
		//전달하여 리버스 하는방법
		display(String.valueOf(arr));
		
		
	}//end main
	public static void display(String sg) {
		StringBuffer sn = new StringBuffer(sg);
		sn.reverse();
		System.out.println(sn);
		
	}

}//end class
