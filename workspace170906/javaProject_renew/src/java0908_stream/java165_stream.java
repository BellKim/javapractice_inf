package java0908_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class java165_stream {

	public static void main(String[] args) {
		File file = new File("sample.txt");//현재 위치를 기준으로 해서 파일이 없으면 파일을 생성해준다. (프로젝트 루트폴더에 생성된다. )
		System.out.println(file.exists());//존재여부
		System.out.println(file.isFile());//추상파일명인 asmple.txt가 통상의 파일인지 아닌지를 체크한다.
		System.out.println(file.length());//길이
		System.out.println(file.canRead());//읽을수 있는지 여부
		
		
		FileWriter fw = null;
		try {
			//true : append, false : update 기능으로 처리(기본:false)
			//FileWriter-첫번째 : 해당파일명으로 파일을 생성한다.
			fw = new FileWriter(file, true);//두번째 인자값은 false디폴트이며, 덮어쓰기 기능이다. 
			//buffer
			fw.write("java\r\n");// \r\n은 줄바꿈, 처음으로
			//대상파일에 buffer 내용을 보내고 buffer를 clear 한다.
			fw.flush();
			
			fw.write("jsp\r\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//flush + 연결종료까지. 이 try 문이 없으면 flush 안됨 . 
				fw.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

	}//end main()

}//end class
