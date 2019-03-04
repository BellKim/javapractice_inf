package java0905_api;

public class java131_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
//System.out.println(sb);
// 케릭터 배열로 리턴해주는 것이 있는가를 찾아야한다. 스트링버퍼에 리턴타입이 char형으로 이루어진것을 찾아보자.
//없으니까 string버퍼를 이용해서 바로할순없고, 다른방법을 이용해야한다.
//stringbuffer->string
//		String sn = sb.toString();
//		//String->char[]
//		char[] data = sn.toCharArray();
//		display(data);

		display(sb.toString().toCharArray());

		
	}// end main()

	public static void display(char[] data) {
		for (char cn : data)
			System.out.println(cn);
	}// end display

}// end class
