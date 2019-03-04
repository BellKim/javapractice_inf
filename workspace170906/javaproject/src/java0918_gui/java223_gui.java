package java0918_gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

class Research2 extends JFrame implements ActionListener, MouseListener {		//implements ActionListener 추가하고 Research누르면 오버라이드 생성됨.
	JTextField nameTxt;
	JRadioButton manRad, womanRad;
	JComboBox<String> locBox;
	JButton saveBtn, openBtn, regBtn ;
	JTable table;
	//table에서 사용되는 데이터를 관리해주는 객체이다.
	DefaultTableModel model;
	
	public Research2() {
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
		regBtn = new JButton("정보등록.");
		
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
		jp4.add(regBtn);
		jp4.add(saveBtn);
		jp4.add(openBtn);
		
		JPanel top = new JPanel(new GridLayout(4,1));//jp1~4까지 이어줌. 
		top.add(jp1);
		top.add(jp2);
		top.add(jp3);
		top.add(jp4);
		
		//테이블의 컬럼명을 배열에 저장한다.
		String[] columnNames = {"이름", "성별", "지역"};
		//테이블의 데이터를 관리해줄 model을 생성한다.
		//생성자를 호출할때 컬ㄹ럼명, 행의 갯수를 넘겨준다.
		model = new DefaultTableModel(columnNames, 0);
		table = new JTable(model);
		
		//하단컬럼테이블 사이즈 고정하기
		table.setAutoResizeMode(0);
		JTableHeader header = table.getTableHeader();
		//칼람상단탭 고정하기
		header.setReorderingAllowed(false);
		//컬럼모델을 리턴한다.
		TableColumnModel columnModel = header.getColumnModel();
		//컬럼별로 크기를 설정한다.
		columnModel.getColumn(0).setPreferredWidth(100);
		columnModel.getColumn(1).setPreferredWidth(50);
		columnModel.getColumn(2).setPreferredWidth(150);
		//테이블의 행의 높이값을 설정한다.
		table.setRowHeight(25);
		//테이블 편집 불가
		table.setEnabled(false);
		
			
		
		
		
		
		
		//JFrame의 Layout을 GridLagout 2행 1열로 변경한다.
		setLayout(new GridLayout(2,1));
		
		add(top);
		//add(table);
		add(new JScrollPane(table));//컬럼명 (이름, 성별, 지역) 나오는곳.
		
		saveBtn.addActionListener(this);
		openBtn.addActionListener(this);
		regBtn.addActionListener(this);
		saveBtn.addMouseListener(this);
		openBtn.addMouseListener(this);
		regBtn.addMouseListener(this);
		
		

		
		
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
		}else if(obj==regBtn)
			regMethod();
		
	}//end actionPerformed()
	
	private void init() {
		nameTxt.setText("");
		manRad.setSelected(true);
		locBox.setSelectedIndex(0);
		nameTxt.requestFocus();
		
		
	}//end init()
	
	private void regMethod() {
		String[] line = new String[3];
		line[0] = nameTxt.getText();
		line[1] =manRad.isSelected() ? "남":"여";
		line[2] =(String)locBox.getSelectedItem();
		model.addRow(line);
		init();
		
	}//end regMethod()
	
	
	private void saveMethod() {
		
		JFileChooser save = new JFileChooser();//파일저장누르면 창뜬다.
		int chk = save.showSaveDialog(this);//파일저장 누르면 창뜬다.
		//취소를 선택헀으면
		if(chk==JFileChooser.CANCEL_OPTION)
			return;
		
		File file = save.getSelectedFile();
		FileWriter fw = null;
		try {
			//false:업데이트, true:append, 기본은 false
			fw = new FileWriter(file);
			for (int i = 0; i <table.getRowCount(); i++) {
				String name = (String)table.getValueAt(i, 0);
				String gen = (String)table.getValueAt(i, 1);
				String loc = (String)table.getValueAt(i, 2);
				
				fw.write(name+"/"+gen+"/"+loc+"\r\n");
				
			}
			fw.flush();
			JOptionPane.showMessageDialog(this, "저장되엉씁니다");
			
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
		int chk = open.showOpenDialog(this);//파일열기 누르면 창뜬다.
		if(chk==JFileChooser.CANCEL_OPTION)
			return;
		File file = open.getSelectedFile();
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			model.setRowCount(0);//계속 파일열기하면 데이터가 지속적으로 추가되니까 줄수를 초기화해준다.
			while(sc.hasNextLine()) {
				String[] line = sc.nextLine().split("/");
				model.addRow(line);
			}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}//end open method()

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Object obj = e.getSource();
		if(obj==regBtn)
			regBtn.setText("REGISTER");
		else if(obj == saveBtn)
			saveBtn.setText("SAVE");
		else if(obj == openBtn)
			openBtn.setText("OPEN");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Object obj = e.getSource();
		if(obj==regBtn)
			regBtn.setText("정보등록");
		else if(obj == saveBtn)
			saveBtn.setText("파일저장");
		else if(obj == openBtn)
			openBtn.setText("파일열기");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}//end research

public class java223_gui {

	public static void main(String[] args) {
		new Research2();

	}

}
