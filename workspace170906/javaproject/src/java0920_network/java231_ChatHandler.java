package java0920_network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Enumeration;
import java.util.Vector;

public class java231_ChatHandler implements Runnable{
	//얘 자체가 스레드로 돌도록 해야한다.
	
	private DataInputStream dataIn;
	private DataOutputStream dataOut;
	private Thread th;
	private static Vector handlers = new Vector();
/*
 * 메시지입력 - 서버로 전송
 * a가 보낸 메시지를 받았는지 ack 를 전송해줘야한다.
 * 현재 접속되어있는 클라이언트 정보를 저장	
 */
	Socket socket;
	public java231_ChatHandler() {
	
	}//end java231_ChatHandler()
	
	public java231_ChatHandler(Socket socket) {
		this.socket=socket;
	}//end java231_ChatHandler()
	
	synchronized public void initStart() {
		
		if(th == null) {
			
			try {
				
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				dataIn = new DataInputStream(new BufferedInputStream(is));
				dataOut = new DataOutputStream(new BufferedOutputStream(os));
				th = new Thread(this);
				th.start();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}//end initstart//////////////////////////////////////
	
	

	@Override
	public void run() {
		handlers.addElement(this);
		while(!Thread.interrupted()) {
			try {
				
				String message = dataIn.readUTF();
				broadcast(message);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
				
		
	}//end run()///////////////////////////////////////////////
	
	
	
	synchronized public void broadcast(String message) {
		Enumeration enu = handlers.elements();
		while(enu.hasMoreElements()) {
			java231_ChatHandler handler = (java231_ChatHandler)enu.nextElement();
			try {
				handler.dataOut.writeUTF(message);
				handler.dataOut.flush();
				
			} catch (IOException e) {
				handler.stop();
				
			}
			
		}
		
	}//broadcast()//////////////// 
	
	synchronized private void stop() {	//클라이언트쪽에서 누가 접속할지 모르니까 동기화해야함.
		//공유하고있는메소드에 동기화시켜줘야한다.		
		if(th!=null) {//클라이언트 정보 제거목적
			if(th!=Thread.currentThread()) {
				th.interrupt();
				th=null;
				try {
					dataOut.close();
				} catch (IOException e) {
//					e.printStackTrace();
				}
			}
		}

	}//end stop()
	
	
	
}//end class













