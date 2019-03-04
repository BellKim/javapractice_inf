package java0918_gui;


import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

class ButtonImg extends JFrame{
	JButton save, open;
	JTextField tf;
	
	public ButtonImg() {
		save = new JButton(new ImageIcon("src/java0918_gui/images/save.gif"));
		open = new JButton(new ImageIcon("src/java0918_gui/images/open.gif"));
		tf = new JTextField(10);
		
		//말풍선
		save.setToolTipText("저장");
		open.setToolTipText("열기");
		
		save.setBorder(new EmptyBorder(0, 10, 0, 10));//top,left,botton,right
		tf.setBorder(new TitledBorder("기타"));
		
		
		//font (글꼴, 스타일(0보통,1굵기,2기울기,3굵고기울기),크기);
		Font font = new Font("고딕체", 2, 20);
		tf.setFont(font);
		
		//RGB
		Color color = new Color(255,0,0);
		tf.setForeground(color);
		tf.setBackground(color.green);
		
		
		
		JPanel p = new JPanel();
		p.add(save);
		p.add(open);
		
		
		setLayout(new GridLayout(2, 1));
		add(p);
		add(tf);
		
		
		
		
		setSize(300,400);	//윈도우창 가로 300 세로 400 픽셀단위로 설정가능.
		setLocation(400,200);	//윈도우창이 열리는 위치
		setVisible(true);	//d윈도우 창을 화면에 표시 창이 보이게 하려면 True 가 필요하다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//위의 주석과 같은 효과를 가진다
	}
}

public class java224_gui {

	public static void main(String[] args) {
		new ButtonImg();

	}

}
