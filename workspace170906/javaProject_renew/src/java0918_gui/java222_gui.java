package java0918_gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Research extends JFrame implements ActionListener{		//implements ActionListener 추가하고 Research누르면 오버라이드 생성됨.
	JTextField nameTxt;
	JRadioButton manRad, womanRad;
	JComboBox<String> locBox;
	JButton saveBtn, openBtn;
	JTextArea multiLine;
	
	public Research() {
		nameTxt = new JTextField(10);
		manRad = new JRadioButton("남");
		womanRad = new JRadioButton("여");
		ButtonGroup bg = new ButtonGroup();
		bg.add(manRad);
		bg.add(womanRad);
		
		String[] city = new String[] {"seoul", "jeju", "pusan", "daejon"};
		locBox = new JComboBox<String>(city);
		
		saveBtn = new JButton("파일저장");
		openBtn = new JButton("파일열기");
		
		///////////////////////////////////////////////////////////////////////////
		JPanel jp1 = new JPanel();
		jp1.add(new JLabel("이름"));
		jp1.add(nameTxt);
		
		JPanel jp2 = new JPanel();
		jp2.add(new JLabel("성별"));
		jp2.add(manRad);
		jp2.add(womanRad);
		
		JPanel jp3 = new JPanel();
		jp3.add(new JLabel("지역"));
		jp3.add(locBox);
		
		JPanel jp4 = new JPanel();
		jp3.add(saveBtn);
		jp3.add(openBtn);
		
		JPanel top = new JPanel(new GridLayout(4,1));//jp1~4까지 이어줌. 
		top.add(jp1);
		top.add(jp2);
		top.add(jp3);
		top.add(jp4);
		
		multiLine = new JTextArea(10,20);
		
		//JFrame의 Layout을 GridLagout 2행 1열로 변경한다.
		setLayout(new GridLayout(2,1));
		
		add(top);
		add(multiLine);
		
		saveBtn.addActionListener(this);
		openBtn.addActionListener(this);
		
		

		
		
		setSize(300,400);	//윈도우창 가로 300 세로 400 픽셀단위로 설정가능.
		setLocation(400,200);	//윈도우창이 열리는 위치
		setVisible(true);	//d윈도우 창을 화면에 표시 창이 보이게 하려면 True 가 필요하다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//위의 주석과 같은 효과를 가진다
	}//end Research()

	@Override
	public void actionPerformed(ActionEvent e) {
		//현재 이벤트가 발생된 컴포넌트 정보를 리턴한다.
		Object obj = e.getSource();
		if(obj==saveBtn) {
			saveMethod();
		}else if(obj==openBtn) {
			openMethod();
		}
		
	}//end actionPerformed()
	
	private void init() {
		nameTxt.setText("");
		manRad.setSelected(true);
		locBox.setSelectedIndex(0);
		nameTxt.requestFocus();
		
		
	}//end init()
	
	private void saveMethod() {
		String name = nameTxt.getText();
		String gen = manRad.isSelected() ? "남":"여";
		String loc = (String)locBox.getSelectedItem();
		
		
		JFileChooser save = new JFileChooser();//파일저장누르면 창뜬다.
		int chk = save.showSaveDialog(this);//파일저장 누르면 창뜬다.
		//취소를 선택헀으면
		if(chk==JFileChooser.CANCEL_OPTION)
			return;
		
		File file = save.getSelectedFile();
		FileWriter fw = null;
		try {
			//false:업데이트, true:append, 기본은 false
			fw = new FileWriter(file,true);
			fw.write(name +"/"+gen+"/"+loc+"/"+"\r\n");
			fw.flush();
			init();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}//end saveMethod()
	
	private void openMethod() {
		JFileChooser open = new JFileChooser();//파일열기누르면 창뜬다.
		int chk = open.showSaveDialog(this);//파일열기 누르면 창뜬다.
		if(chk==JFileChooser.CANCEL_OPTION)
			return;
		File file = open.getSelectedFile();
		Scanner sc = null;
		multiLine.setText("");
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				multiLine.append(sc.nextLine()+"\r\n");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
		
		
	}//end open method()
	
	
}//end research

public class java222_gui {

	public static void main(String[] args) {
		new Research();
		

	}

}
