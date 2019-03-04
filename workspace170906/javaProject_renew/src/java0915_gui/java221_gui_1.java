package java0915_gui;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class MessageTest extends JFrame{
	JButton btn;
	public MessageTest() {
		btn = new JButton("Click");
		add(btn, BorderLayout.CENTER);
		
		
		
		setSize(300,400);	//윈도우창 가로 300 세로 400 픽셀단위로 설정가능.
		setVisible(true);	//d윈도우 창을 화면에 표시 창이 보이게 하려면 True 가 필요하다.
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//위의 주석과 같은 효과를 가진다
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				exit();
			}
		});
	}// end messageTest()
		
		public void exit() {
			//알림창을 띄우기위해서 
//			JOptionPane.showMessageDialog(this, "정말종료하시겠습니까");
			int chk = JOptionPane.showConfirmDialog(this, "정말로 종료하시겠습니까?"," 종료",JOptionPane.YES_NO_CANCEL_OPTION);
			if(chk==JOptionPane.YES_OPTION)
				System.exit(0);
		}
		

}//end messageTest


public class java221_gui_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MessageTest();
	}//end main

}//end class
