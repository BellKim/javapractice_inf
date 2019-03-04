package java0920_network;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class java227_network {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.daum.net");
			URLConnection conn = url.openConnection();
			Scanner sc = null;
			sc = new Scanner(conn.getInputStream());
			while(sc.hasNextLine()) 
				System.out.println(sc.nextLine());		//이것들이 일련의 순서이다. 
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*결과값은 소스 그대로 출력이 되는데 소스는 브라우저 자체에 
		 * 내장된 랜더링엔진이라는 것을 통해서 이미지가 보이도록 처리를 해준다.
		 * 
		 */

		
		
	}//end main

}//end class
