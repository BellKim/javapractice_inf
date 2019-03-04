package java0920_network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Java231_ChatServer {

	public static void main(String[] args) {
		try {
			ServerSocket sever = new ServerSocket(7777);
			// 계속 대기상태!!
			while (true) {
				Socket client = sever.accept();
				// 접속한 클라이언트 IP출력!
				System.out.println("clinet가 " + client.getInetAddress().getHostAddress() + "로 접속");
				
				Java231_ChatHandler handler = new Java231_ChatHandler(client);
				handler.initStart();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // end main()

} // end class
