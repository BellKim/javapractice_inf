package java0911_stream;
/*
 * song.txt에 문자열을 작성하는 코드이다. 
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class java168_stream {

	public static void main(String[] args) {
		File file = new File("src/java0911_stream/song.txt");
		RandomAccessFile raf = null;
		String stn = 
				new String("\r\nMaron 5 - Daylight, Sunday Morning \r\n");

		
		
		try {
			raf = new RandomAccessFile(file, "rw");
			//song.txt 파일의 총 길이를 리턴한다. 
			long size=raf.length();//이 길이값을 이용해서 커서를이동시켜보자.
			raf.seek(size);	//파일의 끝으로 포인터를 이동.
			raf.writeBytes(stn);	//
			
			
		} catch (FileNotFoundException e) {
			
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally {//raf.close(); 를 쳐주고 try catch 를 추가한다.
			
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
				
		
		
		

	}// end main

}//end class
