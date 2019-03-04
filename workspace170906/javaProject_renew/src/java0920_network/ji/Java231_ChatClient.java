package java0920_network;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Java231_ChatClient implements Runnable, ActionListener {
	String userName;
	String host;
	int port;
	private JFrame frm;
	private JPanel pan;
	private JTextArea taOutput;
	private JLabel lbName;
	private JTextField tfInput;
	private DataInputStream dataIn;
	private DataOutputStream dataOut;
	Thread th;

	public Java231_ChatClient() {

	} // end Java231_ChatClient()

	public Java231_ChatClient(String host, int port) {
		System.out.print("사용자 이름을 입력하세요 : ");
		Scanner sc = null;
		sc = new Scanner(System.in);
		userName = sc.nextLine();
		// 만약 userName을 입력 안할시 guest로 준다
		if (userName.equals("")) {
			userName = "guest";
		}

		this.host = host;
		this.port = port;
		initComponent();
	} // end Java231_ChatClient(String host, int port)

	private void initComponent() {
		frm = new JFrame("채팅 프로그램 [ " + host + ":" + port + "]");
		taOutput = new JTextArea();
		// 편집 못하게 막기!!
		taOutput.setEditable(false);

		tfInput = new JTextField(10);
		pan = new JPanel();
		lbName = new JLabel("입력 : ");

		pan.setLayout(new BorderLayout());
		pan.add(lbName, BorderLayout.WEST);
		pan.add(tfInput, BorderLayout.CENTER);

		JScrollPane scroll = new JScrollPane(taOutput);

		frm.add(BorderLayout.CENTER, scroll);
		frm.add(BorderLayout.SOUTH, pan);

		tfInput.addActionListener(this);

		frm.setSize(400, 400);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frm.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				stop();
			}
		});

	} // end initComponent()

	private void stop() {
		if (th != null) {
			th.isInterrupted();
			th = null;
			try {
				dataOut.close();
			} catch (IOException e) {
			}
		}
		frm.setVisible(false);
		frm.dispose();
		System.exit(0);
	} // end stop()

	private void initStart() {
		Socket socket = null;
		if (th == null) {
			try {
				socket = new Socket(host, port);

				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				dataIn = new DataInputStream(new BufferedInputStream(is));
				dataOut = new DataOutputStream(new BufferedOutputStream(os));

			} catch (IOException e) {

				e.printStackTrace();
				try {
					socket.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			} 
			th = new Thread(this);
			th.start();
		}
	} // end initStart()

	public static void main(String[] args) {
		Java231_ChatClient client = new Java231_ChatClient("127.0.0.1", 7777);

		client.initStart();
	} // end main()

	@Override
	public void run() {
		System.out.println("메세지 수신 대기중\n");
		while (!Thread.interrupted()) {
			try {
				String line = dataIn.readUTF();
				taOutput.append(line + "\r\n");
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	} // end run()

	@Override
	public void actionPerformed(ActionEvent event) {
		try {
			// Object obj == event.getSource();
			// obj.getText();
			// 한개의 컴포넌트만 연결되어 있어서 이렇게 쓸수 있다.! 바로 가져올수 있다!
			dataOut.writeUTF(userName + ":" + event.getActionCommand());
			dataOut.flush();
			tfInput.setText("");
			tfInput.requestFocus();
		} catch (IOException e) {
			handleIOException(e);
		}
	} // end actionPerformed()

	private void handleIOException(IOException e) {
		if (th != null) {
			tfInput.setVisible(false);
			frm.validate();
			if (th != Thread.currentThread()) {
				th.interrupt();
				th = null;
				try {
					dataOut.close();
				} catch (IOException e1) {
				}
			}
		}
	} // end handleIOException()
} // end class
