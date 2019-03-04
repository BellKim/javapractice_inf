package java0911_stream;

import java.io.File;

public class java169_Stream {

	public static void main(String[] args) {
		File file = new File("src/java0911_stream/temp");
		if(!file.isDirectory())		//폴더가없으면
			//temp폴더를 생성. 
			file.mkdirs();			//폴더를 만들어라
		
		System.out.println(file.isDirectory());		//컴파일 해서 안나오면 F5를 눌러보자. 보일것이다.
		
		file = new File("src/java0911_stream/sample.txt");
		System.out.println("exists() : "+file.exists());
		
		file = new File("src/java0911_stream");	//string 방법으로 가져오기 .
		String[] list=file.list();	//list는 string  배열로 리턴을 준다.
		for(String sn : list)
			System.out.println("sn : " +sn);
		
		System.out.println("====================================");
		
		File[] listFile = file.listFiles();//배열방법으로 가져오기
		for(File fe : listFile)
			System.out.println(fe.getName());
		
		System.out.println("====================================");
		
		file = new File("src/java0911_stream/source.txt");
		
		if(file.exists()) {//있다면,
			file.delete();//파일을 식제하라
			System.out.println("파일이 삭제됨.");
		}else {
			System.out.println("파일없음. ");
			
		}
		
		
		
	}//end main()

}//end class
