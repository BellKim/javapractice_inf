package java0920_network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class java230_ClientSocket {

	public static void main(String[] args) {
		
		try {
			//3 서버주소, 포트번호
			Socket socket = new Socket("127.0.0.1", 7777);
			//4 입출력스트림 연결
			//서버와 클라이언트 서로 상호간의 입출력 스트림 이용하기위해 input output 연결한다.
			InputStream is = socket.getInputStream();
			OutputStream os= socket.getOutputStream(); 
			//
			OutputStreamWriter ow = new OutputStreamWriter(os);
			
			//5. 서버에 정보를 보냄. outputstream으로 write한다.
			ow.write("클라이엍느 정보 보냄.");
			ow.close();
		
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}//end main

}//end class
