package java0911_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*렌덤 엑세스 파일
 * 
 * 
 */
public class java167_stream {

	public static void main(String[] args) {
		File file = new File("src/java0911_stream/score.txt");
		RandomAccessFile raf = null;
		
		
		
		try {
//			"r" : 읽기(read) 만 가능하다.
//			"rw" : 읽기(read) 쓰기(write) 가 가능하다.
			raf = new RandomAccessFile(file, "r");//r 이면 읽기전용으로/ rw 읽기,쓰기
//			현재 커서가 있는 위치
			//raf.getFilePointer() 입력후 캐치만 작성하겠다는 문구를 추가할것.
			System.out.println(raf.getFilePointer());//0  커서위치
			System.out.println((char) raf.read());//1	0번째 문자열 출력
			System.out.println(raf.getFilePointer());//1 커서위치 1
			System.out.println((char) raf.read());//2 i
			System.out.println(raf.readLine());	//한줄 통째로 읽어오기 .
			///////////줄 바뀜//////////////////////////////////
			
			String line = raf.readLine();	//한 라인 읽기.
			System.out.printf("%S %d \n", line, line.length());// 한 라인출력, 한라인 길이 출력.
			
			
			System.out.println(raf.getFilePointer());//30
			/*
			kim:56/78/12		13+1+1(줄 맨앞으로(1) + 줄바꾸기(1)
			hong:46/100/97		28+1+1	(줄바꿔서 30) (park 젤앞에 커서위치가됨)				
			park:96/56/88	
			*/
			
			raf.seek(4);	//4를 찾고 한줄 쭉 읽음. 
			System.out.println(raf.readLine());	// 56/78/12 출력
			
			//지정된 수 만큼 byte을 건너뛴다. 
			//현재 포이넡가 있는 위치를 기준으로 건너뛴다. 
			raf.skipBytes(2);
//			raf.skipBytes(-6);//음수는 무시한다. 무조건 양수만된다.(뒤로백하는것이없다.)
			System.out.println(raf.readLine());//  ng:46/100/97
			
			
					
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
				
		
		
		


	}//end main()

}//end class 
