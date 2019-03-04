package java0911_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class java173_stream {

	public static void main(String[] args) {
		File file1 = new File("src/java0911_stream/song.txt");
		File file2 = new File("src/java0911_stream/score.txt");
		
		SequenceInputStream ss = null;
		FileInputStream fn1 = null;
		FileInputStream fn2 = null;
		
		try {
			fn1 = new FileInputStream(file1);
			fn2 = new FileInputStream(file2);
			//두개의 입력스트림을 연결해서 하나의 스트림처럼 읽어온다. 
			ss = new SequenceInputStream(fn1, fn2);//1 읽고 2읽어온다. 반복문을 통해서 읽는다. 
			
			int data;
			while((data = ss.read()) != -1) {
				System.out.println((char) data);
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				ss.close();
				fn1.close();
				fn2.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}//end main()

}//end class
