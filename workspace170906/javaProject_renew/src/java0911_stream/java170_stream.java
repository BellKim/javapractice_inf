package java0911_stream;

import java.io.File;

public class java170_stream {

	public static void main(String[] args) {
		File file = new File("src/java0911_stream");
		
		File[] fileList=  file.listFiles();
		System.out.println("파일리스트 출력!!!!");
		for(File fe : fileList) {
			if(fe.isFile())
				System.out.println(fe);
		}
		
		System.out.println("디렉토리 리스트 출력. ");
		for(File fe : fileList) {
			if(fe.isDirectory())
				System.out.println(fe);
		}
		
		

	}//end main.\()

}//end class
