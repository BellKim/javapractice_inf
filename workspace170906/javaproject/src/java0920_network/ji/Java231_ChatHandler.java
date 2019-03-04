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

public class Java231_ChatHandler implements Runnable {
	Socket socket;
	private DataInputStream dataIn;
	private DataOutputStream dataOut;
	private Thread th;
	// 현재 서버에 접속되어 있는 클라이언트의 정보를 저장 Vector는 동기화 되어 있다
	private static Vector handlers = new Vector();

	public Java231_ChatHandler() {

	} // end Java231_ChatHandler()

	public Java231_ChatHandler(Socket socket) {
		this.socket = socket;
	} // end Java231_ChatHandler(Socket socket)

	// 공유자원이기 때문에 동기화를 걸어나야 한다.!
	synchronized public void initStart() {
		if (th == null) {
			try {
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				dataIn = new DataInputStream(new BufferedInputStream(is));
				dataOut = new DataOutputStream(new BufferedOutputStream(os));
				th = new Thread(this);
				th.start();
			} catch (IOException e) {

			}
		}
	} // end initStart()

	@Override
	public void run() {
		handlers.addElement(this);
		while(!Thread.interrupted()) {
			try {
				String message = dataIn.readUTF();
				broadcast(message);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // end run()
	
	synchronized public void broadcast(String message) {
		Enumeration enu = handlers.elements();
		while(enu.hasMoreElements()) {
			Java231_ChatHandler handler = (Java231_ChatHandler)enu.nextElement();
			try {
				handler.dataOut.writeUTF(message);
				handler.dataOut.flush();
			} catch (IOException e) {
				handler.stop();
			}
		}
		
	}//end broadcast()//////////////////////

	synchronized public void stop() {
		if(th != null) {
			//th가 현재 객체가 아니면 
			if(th != Thread.currentThread()) {
				th.interrupt();
				th = null;
				try {
					dataOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}// end stop()///////////////
} // end class
