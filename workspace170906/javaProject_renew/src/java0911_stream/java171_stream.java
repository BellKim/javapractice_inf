package java0911_stream;

import java.io.File;
import java.io.IOException;

public class java171_stream {

	public static void main(String[] args) {
		File file = new File("src/java0911_stream/prob.txt");
		
		if(!file.exists()) {
			
			try {
				file.createNewFile();//객체의 자원을 호출할떄 이런식으로 생성
				System.out.println("파일생성 ");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			System.out.println("파일 존재함 ");
		}

	}

}
