package java0908_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class java161_stream {

	public static void main(String[] args) {
		System.out.println("데이터입력");
		//바이트스트림
		InputStream is = System.in;
		//바이트스트림과 문자스트림 연결
		InputStreamReader ir = new InputStreamReader(is); 
		//(is) 를 해주므로서 연결이됨.
		//문자스트림
		BufferedReader br = new BufferedReader(ir);

		try {
		String line = br.readLine();
		
		System.out.println(line);
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//연결 종료
				br.close();
				ir.close();
				is.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
				

	}//end main()

}//end class
