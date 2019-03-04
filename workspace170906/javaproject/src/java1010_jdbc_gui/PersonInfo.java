package java1010_jdbc_gui;
//회원정보관리.

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PersonInfo extends JFrame implements ActionListener, MouseListener {
	PersonMain main;
	PersonToolbar tool;
	PersonMenu menu;
	int crow = -1;// crow 를 -1로 하지않으면 기본0이다. 인덱스번호가 0부터 시작되는데 0번인덱스가 선택되어있는것으로 인식되므로??? 뭔소리여

	public PersonInfo() {
		this.setTitle(" 개인정보관리 ");// 최상단타이틀.

		menu = new PersonMenu();
		setJMenuBar(menu);
		main = new PersonMain();// 객체생성후
		tool = new PersonToolbar();	//최상단 바로아래 버튼
		
		

		add(BorderLayout.CENTER, main);// 센터에 연결함.
		add(BorderLayout.NORTH, tool);// 다음엔 툴바를 붙힘.

		main.registerB.addActionListener(this);
		main.modifyB.addActionListener(this);
		main.deleteB.addActionListener(this);
		main.clearB.addActionListener(this);
		main.table.addMouseListener(this);
		
		menu.fsave.addActionListener(this);//상단메뉴저장
		tool.saveB.addActionListener(this);//툴바버튼저장.
		
		menu.fopen.addActionListener(this);//상단메뉴
		tool.openB.addActionListener(this);//툴바버튼 저장.
		
		

		main.registerB.addMouseListener(this);
		main.modifyB.addMouseListener(this);
		main.deleteB.addMouseListener(this);
		main.clearB.addMouseListener(this);

		this.setSize(520, 550);
		this.setVisible(true);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				String title = "종료";
				String message = "정말 종료하시곘습니까?";
				if(getConfirmMessage(title, message) == JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}			
			}//end windowCloseing(0);	//////////////////////////////////
		});

	}// end personinfo() ///////////////////////////////////

	public static void main(String[] args) {
		new PersonInfo();
	}// end main

	@Override
	public void actionPerformed(ActionEvent e) {// implements ActionListener 추가해주면 personinfo 에 나타난다.
		Object obj = e.getSource();
		if (obj == main.registerB)
			setRegister();// [등록]

		else if (obj == main.modifyB)
			setModify(); // [수정]
		else if (obj == main.deleteB)
			delete(); // [삭제]
		else if (obj == main.clearB)
			allClear();
		else if (obj == menu.fsave ||  obj == tool.saveB)
			saveFile();
		
		else if (obj == menu.fopen || obj == tool.openB)
			fileOpen(); 
		 

	}// end actionPerformed()
	
	private void fileOpen() {
		JFileChooser chooser = new JFileChooser();
		
		if(chooser.showOpenDialog(this) == JFileChooser.CANCEL_OPTION) {

		}
		tableClear();
		File file = chooser.getSelectedFile();
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			int row = 0;
			while(sc.hasNextLine()) {
				String[] line = sc.nextLine().split(" / ");
				//문자열을 분석하여 쪼개서 스트링 배열로 분해해서 라인단위로 넣어준다. 
				//테이블의 셀에 넣어주기.
				main.table.setValueAt(Integer.toString(row+1), row, 0);
				main.table.setValueAt(line[0], row, 0);
				main.table.setValueAt(line[1], row, 1);
				main.table.setValueAt(line[2], row, 2);
				main.table.setValueAt(line[3], row, 3);
				main.table.setValueAt(line[4], row, 4);
				row++;

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();			
		}
	}//end fileopen();

	public void saveFile() {
		JFileChooser chooser = new JFileChooser();
		if (chooser.showSaveDialog(this) == JFileChooser.CANCEL_OPTION)
			return;
		File file = chooser.getSelectedFile();
		FileWriter fw = null;

		try {
			fw = new FileWriter(file);
			for (int i = 0; i < main.table.getRowCount(); i++) {
				if (main.table.getValueAt(i, 0) == null)
					break;
				String num = main.table.getValueAt(i, 0).toString();
				String name = main.table.getValueAt(i, 1).toString();
				String sex = main.table.getValueAt(i, 3).toString();
				String tel = main.table.getValueAt(i, 3).toString();
				String email = main.table.getValueAt(i, 4).toString();
				fw.write(num + " / " + name + " / " + sex + " / " + tel + " / " + email + " \r\n");
			}
			fw.flush();
			setMessage("저장되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}// end saveFile()////////////////////////////

	public void allClear() {
		setClear();// 텍스트 클리어
		tableClear();// 하단 테이블 클리어.
	}// end allClear() //////////////////////////////////

	// 테이블만 초기화 시켜줄 메소드
	public void tableClear() {

		main.tableModel.setRowCount(0);// 테이블에 있는갯수를 0으로 초기화해줌
		main.tableModel.setRowCount(50);// 테이블에 있는갯수를 50으로 초기화해줌

	}// end tableClear() ////////////////////////////////////

	private void delete() {
		// 현재 데이터에서 선택되어있는 셀을 선택.
		int row = main.table.getSelectedRow();

		if (main.table.getValueAt(row, 0) == null) {// 비어있는것을 선ㅌ택했을때
			setMessage("데이터가 입력된 레코드를 선택하시죠?");
			return;
		}

		// 삭제하기전에 물어보고 삭제를 한다.
		// 0 : yes 1 : no
		String title = "삭제";
		String message = "선택한 레코드를 삭제하시겠습니까?";
		if (getConfirmMessage(title, message) == 1) {
			return;
		}

		main.tableModel.removeRow(row);// 삭제할 행의 번호를 row 에 넣어라. 그 row 는 삭제된다.

		if (main.table.getRowCount() < 50)
			main.tableModel.setNumRows(50);

		createNumber();
		setClear();// 정보 입력하다가 삭제버튼 누르면 입력한내용이 다 사라지도록함.

	}// end delete()//////////////////////////////////////////////////////////

	public void createNumber() {
		// 123행이 있을떄 1행을 삭제시 2,3 만남을경우를 바로잡아주기위한것
		for (int i = 0; i < main.table.getRowCount(); i++) {
			if (main.table.getValueAt(i, 0) == null) {
				break;
			}
			main.table.setValueAt(Integer.toString(i + 1), i, 0);
		}

	}// end createNumber();

	public int getConfirmMessage(String title, String msg) {
		return JOptionPane.showConfirmDialog(this, msg, title, JOptionPane.YES_NO_CANCEL_OPTION);

	}// end getConfirmMessage()////////////////////////////////////////////////
	

	public void setMessage(String msg) {
		JLabel label = new JLabel(msg);
		label.setFont(new Font("sanSerif", 0, 13));
		label.setForeground(Color.blue);
		JOptionPane.showMessageDialog(this, label);

	}// end set Message();;;;//////////////////

	private void setModify() { // 수정부분이 등록부분 어디와 유사한지 관찰하기.
		String name = main.nameF.getText().trim();// trim 공백제거
		String sex = main.manR.isSelected() ? "남" : "여"; // 메소드명이 is와 had면 결과값이 논리값이다.
		// String tel1= main.telC.getSelectedItem().toString();//두가지 방법이다.
		String tel1 = (String) main.telC.getSelectedItem();
		String tel2 = main.tel1F.getText().trim();
		String tel3 = main.tel2F.getText().trim();
		String email = main.emailF.getText().trim();

		// 모든 항목을 입력하지 않았을때 경고.
		if (name.length() < 1 || tel2.length() < 1 || tel3.length() < 1 || email.length() < 1) {
			setMessage("모든 항목을 입력하십시요");
			return;
		}

		// 테이블에서 선택한 레코드(행)에 갱신함 -> crow가 값을 가지고 있음.

		main.table.setValueAt(name, crow, 1);
		main.table.setValueAt(sex, crow, 2);
		main.table.setValueAt(tel1 + "-" + tel2 + "-" + tel3, crow, 3);
		main.table.setValueAt(email, crow, 4);
		setClear();

		// 현재상태 정보를 등록이 가능하도록 값을 변경ㅇ한다.
		crow = -1;
	}// end setModify();//////////////////////////////

	private void setRegister() {

		// crow변수값이 -1이면 등록이란 버튼이 눌리지않고 메시지를 띄워준다.

		if (crow >= 0) { // 이미 등록이 되어있는 레코드
			setMessage("이미 등록된 레코드입니다.");
			return;
		}

		String name = main.nameF.getText().trim();// trim 공백제거
		String sex = main.manR.isSelected() ? "남" : "여"; // 메소드명이 is와 had면 결과값이 논리값이다.
		// String tel1= main.telC.getSelectedItem().toString();//두가지 방법이다.
		String tel1 = (String) main.telC.getSelectedItem();
		String tel2 = main.tel1F.getText().trim();
		String tel3 = main.tel2F.getText().trim();
		String email = main.emailF.getText().trim();

		/*
		 * //1행에 고정으로 데이터가 입력되는형태. 반복문의형태로 다음행에 들어가도록 해줘야한다.
		 * main.table.setValueAt(Integer.toString(1), 0, 0); main.table.setValueAt(name,
		 * 0, 1); main.table.setValueAt(sex, 0, 2); main.table.setValueAt(tel1 + "-" +
		 * tel2 + "-" + tel3, 0, 3); main.table.setValueAt(email, 0, 4);
		 */

		/*
		 * for(int i=0; i<main.table.getRowCount(); i++) {
		 * main.table.setValueAt(Integer.toString(1), i, 0); main.table.setValueAt(name,
		 * i, 1); main.table.setValueAt(sex, i, 2); main.table.setValueAt(tel1 + "-" +
		 * tel2 + "-" + tel3, i, 3); main.table.setValueAt(email, i, 4); }// end for
		 */
		// 모든 항목을 입력하지 않았을때 경고.
		if (name.length() < 1 || tel2.length() < 1 || tel3.length() < 1 || email.length() < 1) {
			setMessage("모든 항목을 입력하십시요");
			return;
		}

		// 항목추가
		for (int i = 0; i < main.table.getRowCount(); i++) {
			if (main.table.getValueAt(i, 0) == null) {
				main.table.setValueAt(Integer.toString(1 + i), i, 0);
				main.table.setValueAt(name, i, 1);
				main.table.setValueAt(sex, i, 2);
				main.table.setValueAt(tel1 + "-" + tel2 + "-" + tel3, i, 3);
				main.table.setValueAt(email, i, 4);
				break;
			}
		} // end for
		setClear();
	}// end setRegister() ?////////////////////////////

	// 입력된 항목 초기화 해줌.
	public void setClear() {
		main.nameF.setText("");
		main.tel1F.setText("");
		main.tel2F.setText("");
		main.emailF.setText("");
		main.telC.setSelectedIndex(0);
		main.manR.setSelected(true);
		// 커서위치
		main.nameF.requestFocus();
	}// end setClear()//////////////////////////////////

	private void setInputRecord() {
		int row = main.table.getSelectedRow();// 수정버튼을 눌렀을때

		if (row < 0 || main.table.getValueAt(row, 0) == null) {
			setMessage("데이터가 입력된 레코드를 선택하세요");
			return;
		}

		crow = row;// 처리를한다.
		// 더블클릭한 레코드의 행값을 얻는다.
		main.nameF.setText(main.table.getValueAt(row, 1).toString());
		String sex = main.table.getValueAt(row, 2).toString();
		if (sex.equals("남"))
			main.manR.setSelected(true);
		else
			main.womanR.setSelected(true);
		String tel1 = main.table.getValueAt(row, 3).toString();
		StringTokenizer st = new StringTokenizer(tel1, "-");
		main.telC.setSelectedItem(st.nextToken());
		main.tel1F.setText(st.nextToken());
		main.tel2F.setText(st.nextToken());
		main.emailF.setText(main.table.getValueAt(row, 4).toString());

	}// end setInputRecord()/////////////////////////

	@Override
	public void mouseClicked(MouseEvent e) {// main.table.addMouseListener(this);를 작성하고온다.
		Object obj = e.getSource();
		if (obj == main.table && e.getClickCount() == 2) {
			setInputRecord();

		}

	}// end mouseClicked ()//////////////////////

	@Override
	public void mouseEntered(MouseEvent e) {
		Object obj = e.getSource();

		if (obj == main.registerB) {
			main.registerB.setText("RegisterB");
		} else if (obj == main.modifyB) {
			main.modifyB.setText("modify");
		} else if (obj == main.deleteB) {
			main.deleteB.setText("DELETE");
		} else if (obj == main.clearB) {
			main.clearB.setText("Clear");
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Object obj = e.getSource();

		if (obj == main.registerB) {
			main.registerB.setText("등록");
		} else if (obj == main.modifyB) {
			main.modifyB.setText("수정");
		} else if (obj == main.deleteB) {
			main.deleteB.setText("삭제");
		} else if (obj == main.clearB) {
			main.clearB.setText("초기황");
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

}// end class
