package java0918_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

class TabTest extends JFrame implements Runnable{
	JTabbedPane tabPane;
	JLabel timeLbl;
	
	public TabTest() {
		tabPane = new JTabbedPane();
		
		JPanel jp1 = new JPanel();
		jp1.setBackground(new Color(255,0,0));
		jp1.add(new JLabel("red Page 입니다."));
		//red:탭명, jp1: 탭을 선택했을때 화면에 보여줄 컴포넌트
		tabPane.addTab("red",jp1);
		
		JPanel jp2 = new JPanel();
		jp2.setBackground(new Color(0,255,0));
		jp2.add(new JLabel("GREEN Page 입니다."));
		//red:탭명, jp1: 탭을 선택했을때 화면에 보여줄 컴포넌트
		tabPane.addTab("GREEN",jp2);
		
		JPanel jp3 = new JPanel();
		jp3.setBackground(new Color(0,0,255));
		jp3.add(new JLabel("BLUE Page 입니다."));
		//BLUE:탭명, jp3: 탭을 선택했을때 화면에 보여줄 컴포넌트
		tabPane.addTab("BLUE",jp3);
		
		timeLbl = new JLabel(process());
		JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p.add(timeLbl);
		
		//초기화면에서 보여질 태블 지정한다.
		tabPane.setSelectedIndex(2);
		
		add(BorderLayout.CENTER, tabPane);
		add(BorderLayout.SOUTH, p);
		
	
		setSize(300,400);	//윈도우창 가로 300 세로 400 픽셀단위로 설정가능.
		setLocation(400,200);	//윈도우창이 열리는 위치
		setVisible(true);	//d윈도우 창을 화면에 표시 창이 보이게 하려면 True 가 필요하다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//위의 주석과 같은 효과를 가진다
	}//end TabTest()
	
	private String process() {
		long date = System.currentTimeMillis();
		String pattern = "yyyy-MM-dd hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}//end process();

	@Override
	public void run() {
		//반복문으로 1초에 한번씯돌아가게
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			timeLbl.setText(process());
		}
		
	}//end run
	
	
}//end TabTest
public class java226_gui {

	public static void main(String[] args) {
		Thread th = new Thread(new TabTest());
		th.start();
//		new TabTest();

	}//end main

}//end class
