package java0915_gui;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/*
 * 
 * awt 				swing
 * Frame		->	Jframe
 * TextField	->	JTextField
 * Button		->	JButton
 * 
 */



//JButton	->	click	->	ActionEvent		->	ActionListener
//JTextField	->	enter	->	ActionEvent		->	ActionListener
class TextInput2 extends JFrame implements ActionListener{
	JTextField inputTxt;
	JButton clickBtn;
	JTextArea multiTra;
	JPanel pn;
	
	public TextInput2() {

		inputTxt = new JTextField(20);
		clickBtn = new JButton("input");
		pn = new JPanel();
		pn.add(inputTxt);
		pn.add(clickBtn);
		
		multiTra = new JTextArea(20,20);

		multiTra.setEditable(false);	//TextARea에서 편집 불가능.
		
		add(pn, BorderLayout.NORTH);
		add(multiTra, BorderLayout.CENTER);
		
		//Button에 ActionListener 연결
		clickBtn.addActionListener(this);
		//Textfile 에 ActionListener
		inputTxt.addActionListener(this);

		setSize(300,400);	//윈도우창 가로 300 세로 400 픽셀단위로 설정가능.
		setVisible(true);	//d윈도우 창을 화면에 표시 창이 보이게 하려면 True 가 필요하다.
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});//end addWindowListener//////
		
		
	}// end text input
		
	public void actionPerformed(ActionEvent e) {
		//textfile 에 입력된 문자열을 리턴한다.
		String line = inputTxt.getText();//왜 line은 String 인가 gettext가 리턴 스트링임.
		
		if(line.length()==0) {
			inputTxt.requestFocus();
			return;
		}
		
		//TextArea에 TEXTField에 입력된 문자열을 추가한다.
		multiTra.append(line+"\r\n");
		//textfile을 초기화한다.
		inputTxt.setText(" ");
		//text field 로 포커스를 이동한다.
		inputTxt.requestFocus();
	}// end actionperforaed
	
	
	
}//end TextInput//////////////////////////////////////////////////////////
	

public class java218_gui_SWING {//줄바꿈 됨 이거 다시봐야함.
	

	public static void main(String[] args) {
		
		
		new TextInput2();

	}

}
