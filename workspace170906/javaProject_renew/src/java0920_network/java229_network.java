package java0920_network;

import java.net.MalformedURLException;
import java.net.URL;

public class java229_network {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://navercast.naver.com/magazine_index.nhn");
			System.out.printf("getHost() : %s\n ",url.getHost()); //navercast.naver.com
			System.out.printf("getHost() : %s\n ",url.getPort()); //-1
			System.out.printf("getProtocol() : %s\n ",url.getProtocol()); //http
			System.out.printf("getPath() : %s\n ",url.getPath()); //   /magazine_index.nhn  -> path는 폴더라고 생각하면 된다.
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		

		

	}

}
