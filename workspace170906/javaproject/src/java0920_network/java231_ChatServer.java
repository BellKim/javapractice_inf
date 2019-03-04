package java0920_network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class java231_ChatServer {

	public static void main(String[] args) {
		
		//1포트번호를 지정해서 서버생성. 서버주소: 7777

			try {
				ServerSocket server = new ServerSocket(7777);
				while(true) {
					Socket client = server.accept();
					System.out.println("Client 가 "+client.getInetAddress().getHostAddress()+" 로 접속");
					java231_ChatHandler handler = new java231_ChatHandler(client);
					handler.initStart();
					
					
					
					
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		

	}//end main

}//end class
