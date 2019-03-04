package java0915_gui;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

class MultiData extends JFrame implements ItemListener{
	JRadioButton topBtn, midBtn, botBtn;
	JCheckBox javaChk, jspChk, springChk;
	JComboBox<String> locBox;
	JTextArea ta;
	
	public MultiData() {
		//라디오버튼생성
		topBtn = new JRadioButton("상", true);
		midBtn = new JRadioButton("중");
		botBtn = new JRadioButton("하");
		//라디오버튼을 그룹으로 묶어준다.
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(topBtn);
		bg.add(midBtn);
		bg.add(botBtn);
		
		JPanel p1 = new JPanel();
		p1.add(topBtn);
		p1.add(midBtn);
		p1.add(botBtn);
		
		javaChk = new JCheckBox("java");
		jspChk = new JCheckBox("jsp");
		springChk = new JCheckBox("spring");
		
		JPanel p2 = new JPanel();
		p2.add(javaChk);
		p2.add(jspChk);
		p2.add(springChk);
		
		/*locBox = new JComboBox<String>();
		locBox.addItem("서울");
		locBox.addItem("제주");	
		locBox.addItem("대전");*/
		
		String[] item = new String[] {"서울","제주","대전"};
		locBox = new JComboBox<String>(item);
		
		
		
/*		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
		
		model.addElement("서울");
		model.addElement("제주");
		model.addElement("대전");
		locBox = new JComboBox<String>(model);*/
		
		//여기서 틀잡기
		setLayout(new GridLayout(2, 1));
		JPanel p3 = new JPanel(new GridLayout(3,1));
		p3.add(p1);
		p3.add(p2);
		p3.add(locBox);
		ta = new JTextArea(10,10);
		
		add(p3);//상단붙히기
		add(ta);
		
		topBtn.addItemListener(this);
		midBtn.addItemListener(this);
		botBtn.addItemListener(this);
		
		javaChk.addItemListener(this);
		jspChk.addItemListener(this);
		springChk.addItemListener(this);
		locBox.addItemListener(this);
		
		
		
		
		
		
		setSize(300,400);	//윈도우창 가로 300 세로 400 픽셀단위로 설정가능.
		setVisible(true);	//d윈도우 창을 화면에 표시 창이 보이게 하려면 True 가 필요하다.

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//위의 주석과 같은 효과를 가진다.
	}//end multidata()

	@Override
	public void itemStateChanged(ItemEvent arg0) {		//자동으로 생성이 되는 부분이다.
		ta.setText(" ");					//class MultiData extends JFrame implements ItemListener{ 에서 임플리먼트 작성시  자동생성.
		if(topBtn.isSelected()) {
			ta.append(topBtn.getText()+"\r\n");
		}else if (midBtn.isSelected()) {
			ta.append(midBtn.getText()+"\r\n");
		}else if(botBtn.isSelected()) {
			ta.append(botBtn.getText()+"\r\n");
		}
		
		
		if(javaChk.isSelected()) {
			ta.append(javaChk.getText() + "\r\n");
		}
		if(jspChk.isSelected()) {
			ta.append(jspChk.getText() + "\r\n");
		}
		if(springChk.isSelected()) {
			ta.append(springChk.getText() + "\r\n");
		}
		
		//선택된 항목의 인덱스 리턴
		int index = locBox.getSelectedIndex();
		//선택된 항목의 문자열리턴
		String txt = (String) locBox.getSelectedItem();
		ta.append(index+":"+txt);
		
		
		
		
		
		
	}//end itemStateChanged()
}//end Multidata

public class java219_gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultiData();

	}//end main

}//end class
