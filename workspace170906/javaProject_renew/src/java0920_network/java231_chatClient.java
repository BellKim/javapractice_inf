package java0920_network;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class java231_chatClient implements Runnable, ActionListener{
	String userName;
	String host;
	int port;
	private JFrame frm;
	private JPanel pan;
	private JTextArea taOutput;
	private JLabel lbName;
	
	private JTextField tfInput;			//액션리스너 사용할변수.
	private DataInputStream dataIn;
	private DataOutputStream dataOut;
	Thread th;
	
	public java231_chatClient() {
		
	}
	
	public java231_chatClient(String host, int port) {
		System.out.println("사용자 이름을 입력하세요 : ");
		Scanner sc = null;
		sc = new Scanner(System.in);
		userName = sc.nextLine();
		if(userName.equals(""))
			userName="guest";
		
		this.host=host;
		this.port=port;
		initComponent();
		
		
	}//end  java231_chatClient
	
	private void initComponent() {
		frm = new JFrame("채팅프로그램 {"+host+":"+port+"}");
		taOutput = new JTextArea();
		taOutput.setEditable(false);//편집 불가능하도록 하기
		
		tfInput = new JTextField(10);
		pan=new JPanel();
		lbName = new JLabel("입력 : ");
		
		
		JScrollPane scroll = new JScrollPane(taOutput);//스크롤추가
		
		frm.add(BorderLayout.CENTER, scroll);
		frm.add(BorderLayout.SOUTH, pan);
		
		pan.setLayout(new BorderLayout()); 
		pan.add(lbName, BorderLayout.WEST);
		pan.add(tfInput, BorderLayout.CENTER);
		
		
		//액션리스너
		tfInput.addActionListener(this);
		
		
		
		
		frm.setSize(400, 400);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frm.addWindowListener(new WindowAdapter() {//windowclosing 하고 컨트롤 스페이스
		
			@Override
			public void windowClosing(WindowEvent e) {
				stop();
				
			}

		});
		frm.setVisible(false);
		frm.dispose();
		System.exit(0);//시스템 종료시 위의 두라인을 같이 해주어야 더 안정적이라나 뭐라나

	}//end initComponent()////////////////////////////////////////////디자인영역
	//메인스레드 + 정의한스레드 총 2개의 스레드가돌아간다. 

	private void stop() {
		if(th!=null) {
			th.interrupt();
			th=null;
			
			try {
				dataOut.close();
			} catch (IOException e) {
			//e.printStackTrace();
			}
		}
	}//end stop////////////////////////////////////////////
	
	
	private void initStart() {
		if(th == null) {
			Socket socket = null;
			try {
				socket = new Socket(host, port);
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				dataIn = new DataInputStream(new BufferedInputStream(is));
				dataOut = new DataOutputStream(new BufferedOutputStream(os));
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			} 
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
			
				
	
			th = new Thread(this);////////////////////////////////
			th.start();//쓰래드 실행.
			
		}//end if
		
		
	}//end initStart()
	

	public static void main(String[] args) {
//		java231_chatClient client = new java231_chatClient("127.0.0.1",7777);
		java231_chatClient client = new java231_chatClient("192.168.10.9",7777);
		
		client.initStart();

	}//end main()

	@Override
	public void run() {
		
		System.out.println("메시지 수신 대기중 \n");
		while(!Thread.interrupted()) {
			
			try {
				String line = dataIn.readUTF();
				taOutput.append(line+"\r\n");//받아오는구현.
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
			
		}
		
		
		
	}//end run()///////////////////////////////

	@Override
	public void actionPerformed(ActionEvent event) {//by actionListener 
		try {//writeUTF때문에 뜨는거다.
			dataOut.writeUTF(userName+":"+event.getActionCommand());//getActionCommand 에 대해서 자세히 알아보기
			//버퍼에만 저장되는데 서버에 전달해줘야한다.
			dataOut.flush();
			tfInput.setText("");
			tfInput.requestFocus();
			
		} catch (IOException e) {					//
			// TODO Auto-generated catch block
//			e.printStackTrace();
			handleIOException(e);
		}
		
	}//end actionPerformed();
	
	private void handleIOException(IOException e) {
		if(th!=null) {//스레드가 다 돌아가면
			tfInput.setVisible(false);
			frm.validate();
			if(th!=Thread.currentThread()) {
				th.interrupt();	//th = textarea
				th=null;
				
				try {
					dataOut.close();
				} catch (IOException e1) {
//					e1.printStackTrace();
				}
				
			}//if
		}//if
	}// end handleIOException();

}//end class
