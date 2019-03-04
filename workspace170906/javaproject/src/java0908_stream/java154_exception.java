package java0908_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class java154_exception {

	public static void main(String[] args) {
		File file  = new File("sample.txt");
		FileReader fr = null;
		
		try {
			//FileNotFundException 은 checked exception 이다.
			//반드시 try~catch~finally(예외처리)를 한다. 
			
			fr = new FileReader(file);
			
			System.out.println(fr.read());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}

}


/*
 * 						Exception							//최상위
 * 					
 *	 					RuntimeEception						//그다음순위
 * 
 * 		NumberFormatException		ArtimaticException		//최하위
*/