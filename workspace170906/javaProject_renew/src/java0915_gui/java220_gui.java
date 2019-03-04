package java0915_gui;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

class EventTest extends JFrame implements ActionListener{//implements ActionListener{
	JRadioButton topBtn, midBtn, botBtn;
	JTextArea ta;
	
	public EventTest() {
		topBtn = new JRadioButton("상", true);
		midBtn = new JRadioButton("중");
		botBtn = new JRadioButton("하");
		ta = new JTextArea(10,10);
		
		
		//라디오버튼을 그룹으로 묶어준다.
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(topBtn);
		bg.add(midBtn);
		bg.add(botBtn);
		
		JPanel p1 = new JPanel();
		p1.add(topBtn);
		p1.add(midBtn);
		p1.add(botBtn);
		
		add(BorderLayout.NORTH, p1);
		add(BorderLayout.CENTER, ta);
		
		topBtn.addActionListener(this);
		midBtn.addActionListener(this);
		botBtn.addActionListener(this);
		
		
		setSize(300,400);	//윈도우창 가로 300 세로 400 픽셀단위로 설정가능.
		setVisible(true);	//d윈도우 창을 화면에 표시 창이 보이게 하려면 True 가 필요하다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//위의 주석과 같은 효과를 가진다
	}//end EventTest()

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==topBtn)
			ta.setText("top");
		else if(obj==midBtn)
				ta.setText("mid");
		else if(obj==botBtn)
				ta.setText("bot");
		
	}
	
	
	

	
}// end EventTest

public class java220_gui {

	public static void main(String[] args) {
		new EventTest();
		

	}

}
