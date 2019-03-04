package java0920_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class java230_Server_network {

	public static void main(String[] args) {
		
		
		try {
			//1포트번호를 지정해서 서버생성. 서버주소: 7777
			ServerSocket server = new ServerSocket(7777);
			
			//상태확인을위해서 출력해본다.
			System.out.println("대기 :");
			//2 클라이언트로 요청이 들어올대까지 대기한다. 
			Socket socket = server.accept();
			System.out.println(socket);
			
			//4 입출력스트림 연결
			//서버와 클라이언트 서로 상호간의 입출력 스트림 이용하기위해 input output 연결한다.
			InputStream is = socket.getInputStream();
			OutputStream os= socket.getOutputStream(); 
			
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			
			//5클라이엍느에서 보낸 메시지 읽음. 
			System.out.println(br.readLine());
			socket.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}//end main

}//end class
