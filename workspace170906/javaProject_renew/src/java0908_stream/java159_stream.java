package java0908_stream;

import java.io.IOException;
import java.io.InputStream;
//		http://hyeonstorage.tistory.com/234
public class java159_stream {

	public static void main(String[] args) {
		
		System.out.println("데이터입력");
		
		
		InputStream is = System.in;
		

		
		try {
			//한바이트를 읽어와 유니코드로 리턴한다. 
			int line = is.read();
			System.out.println((char)line);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}//end main()

}//end class
