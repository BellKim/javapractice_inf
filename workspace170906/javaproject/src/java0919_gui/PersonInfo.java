package java0919_gui;

import java.awt.BorderLayout;
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

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.ws.handler.MessageContext;

public class PersonInfo extends JFrame implements ActionListener, MouseListener {
	PersonMenu menu;
	PersonToolbar tool;
	PersonMain main;

	private int crow = -1;

	public PersonInfo() {

		menu = new PersonMenu();
		setJMenuBar(menu);

		tool = new PersonToolbar();
		main = new PersonMain();

		add(BorderLayout.NORTH, tool);
		add(BorderLayout.CENTER, main);

		main.registerB.addActionListener(this);
		main.modifyB.addActionListener(this);
		main.deleteB.addActionListener(this);
		main.clearB.addActionListener(this);
		main.table.addMouseListener(this);
		
		menu.fopen.addActionListener(this);// 열기
		tool.openB.addActionListener(this);// 도구모음

		menu.fsave.addActionListener(this);// 저장
		tool.saveasB.addActionListener(this);// 도구모음

		main.registerB.addMouseListener(this);
		main.modifyB.addMouseListener(this);
		main.deleteB.addMouseListener(this);
		main.clearB.addMouseListener(this);

		setSize(520, 550);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// 위의 주석과 같은 효과를 가진다
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				String title = "종료";
				String message = "증말증말루 종료하시겠습니까";
				if (getConfirmMessage(title, message) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}// end windowClosing()
		});

	}// end PersonInfo

	public static void main(String[] args) {
		new PersonInfo();
	}// end main()

	@Override
	public void actionPerformed(ActionEvent e) {
		// JOptionPane.showMessageDialog(this, e.getSource());

		Object obj = e.getSource();
		if (obj == main.registerB) {
			setRegister();// 등록
		} else if (obj == main.modifyB) {
			setModify();// 수정
		} else if (obj == main.deleteB) {
			delete();// 삭제
		} else if (obj == main.clearB) {
			init(); // 초기화
		} else if (obj == menu.fsave || obj == tool.saveB) {
			fileSave();
		} else if (obj == menu.fopen || obj == tool.openB) {
			fileOpen();
		}

	}// end actionPerformed()

	
	public void setCrow(int crow) {
		this.crow = crow;
	}

	public int getCrow() {
		return crow;
	}

	private void init() {
		setClear();

		// 0개주고 50개를 다시생성.
		setTableClear();

	}// end init()

	private void fileSave() {			//파일로저장하기
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
				String sex = main.table.getValueAt(i, 2).toString();
				String tel = main.table.getValueAt(i, 3).toString();
				String email = main.table.getValueAt(i, 4).toString();
				fw.write(num + "/" + name + "/" + sex + "/" + tel + "/" + email + "\r\n");
			}
			fw.flush();
			setMessage("저장되었습니다. ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}// end fileSave()

	private int getConfirmMessage(String title, String message) {
		return JOptionPane.showConfirmDialog(this, message, title, JOptionPane.YES_NO_OPTION);

	}// end getConfirmMessage()
	
	private void fileOpen() {
		
		JFileChooser chooser = new JFileChooser();	//
		if(chooser.showOpenDialog(this) == JFileChooser.CANCEL_OPTION) {//취소로 빠져나가면			
		}
		setTableClear();	//기존파일 클리어		
		File file = chooser.getSelectedFile();
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			int row = 0;
			while(sc.hasNextLine()) {
				String[] line = sc.nextLine().split("/");
				//테이블의 셀에 넣어주기.
				
				main.table.setValueAt(Integer.toString(row+1), row, 0);
				main.table.setValueAt(line[0], row, 0);
				main.table.setValueAt(line[1], row, 1);
				main.table.setValueAt(line[2], row, 2);
				main.table.setValueAt(line[3], row, 3);
				main.table.setValueAt(line[4], row, 4);
				row++;
			}
			row=0;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			sc.close();
		}
	
		
	}//end fileOpen()

	private void delete() {
		int row = main.table.getSelectedRow();
		if (main.table.getValueAt(row, 0) == null) {
			setMessage("삭제할ㅁ레코드를 확인하세요");
			return;
		}
		String title = "삭제";
		String message = "선택한 레코드를 삭제하시겠습니까? ";
		if (getConfirmMessage(title, message) == JOptionPane.NO_OPTION) {
			return;
		}

		main.tableModel.removeRow(row);
		if (main.table.getRowCount() < 50)
			main.tableModel.setRowCount(50);



		// 새로운 번호 생성.(번호의 숫자를 맞춤)
		for (int i = 0; i < main.table.getRowCount(); i++) {
			if (getCrow() < 0 || main.table.getValueAt(i, 0) == null)
				return;
			main.table.setValueAt(Integer.toString(i + 1), i, 0);
		}

	}// end delete

	//테이블 레코드 초기화 및 생성.
	private void setTableClear() {
		main.tableModel.setRowCount(0);// 테이블 레코드 삭제
		main.tableModel.setRowCount(50);// 테이블의 레코드를 생성.

	}//end setTableClear





	private void setModify() {
		// trim : 불필요한 공백제거
		String name = main.nameF.getText().trim();
		String sex = main.manR.isSelected() ? "남 " : "여";
		String tel1 = (String) main.telC.getSelectedItem();// tostring();
		String tel2 = main.tel1F.getText().trim();
		String tel3 = main.tel2F.getText().trim();
		String email = main.emailF.getText().trim();

		// 모든 항목을 입력하지 않았을때 경고..
		if (name.length() < 1 || tel2.length() < 1 || tel3.length() < 1 || email.length() < 1) {
			// message 출력한다.
			setMessage("모든항목을 입력하세요 ");
			return;
		}
		main.table.setValueAt(name, getCrow(), 1);
		main.table.setValueAt(sex, getCrow(), 2);
		main.table.setValueAt(tel1 + "-" + tel2 + "-" + tel3, getCrow(), 3);
		main.table.setValueAt(email, getCrow(), 4);
		setCrow(-1);// 테이블 더블클릭- 수정후 등록을 눌렀을때 방지하기위함.

	}// end setModify()

	private void setRegister() {

		if (getCrow() > -1) {
			setMessage("수정버튼으로 눌러주세요");
		}


		// trim : 불필요한 공백제거
		String name = main.nameF.getText().trim();
		String sex = main.manR.isSelected() ? "남 " : "여";
		String tel1 = (String) main.telC.getSelectedItem();// tostring();
		String tel2 = main.tel1F.getText().trim();
		String tel3 = main.tel2F.getText().trim();
		String email = main.emailF.getText().trim();


		/*//		  main.table.setValueAt(name, 0, 1);
		//		  main.table.setValueAt(sex, 0, 2);
		//		  main.table.setValueAt(tel1+"tel2"+"-"+tel3,0,3);
		//		  main.table.setValueAt(email,0, 4);
		*/

		// 모든 항목을 입력하지 않았을때 경고..
		if (name.length() < 1 || tel2.length() < 1 || tel3.length() < 1 || email.length() < 1) {
			// message 출력한다.
			setMessage("모든항목을 입력하세요 ");
			return;
		}

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
	}// end setRegister()

	private void setMessage(String message) {
		JOptionPane.showMessageDialog(this, message);

	}

	private void setClear() { // 입력된항목 초기화
		main.nameF.setText(" ");
		main.tel1F.setText(" ");
		main.tel2F.setText(" ");
		main.emailF.setText(" ");
		main.telC.setSelectedIndex(0);
		main.manR.setSelected(true);

		// 초기화후 커서위치
		main.nameF.requestFocus();
	}// end setClear()

	private void setInputRecord() {
		// 더블클릭한 테이블의 행의 번호를 리턴.
		int row = main.table.getSelectedRow();
		if (row < 0 || main.table.getValueAt(row, 0) == null) {
			setMessage("빈 레코드를 선택하셧습니다. ");
			return;
		}

		setCrow(row);
		// 테이블 더블클릭하면 수정시킴.
		main.nameF.setText((String) main.table.getValueAt(row, 1)); // 앞에 (String) 지우고 getvalue().tostring() 해도됨.
		String sex = main.table.getValueAt(row, 2).toString();
		if (sex.equals("남"))
			main.manR.setSelected(true);
		else
			main.womanR.setSelected(true);

		String[] st = main.table.getValueAt(row, 3).toString().split("-");
		main.telC.setSelectedItem(st[0]);
		main.tel1F.setText(st[1]);
		main.tel2F.setText(st[2]);

		main.emailF.setText(main.table.getValueAt(row, 4).toString());
	}// end setInputRecord()

	@Override
	public void mouseClicked(MouseEvent e) {
		Object obj = e.getSource();
		if (obj == main.table && e.getClickCount() == 2) { // 클릭이 2번이면
			
			setInputRecord();

		} // if

	}//end mouseClicked

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
			main.deleteB.setText("삭제잉");
		} else if (obj == main.clearB) {
			main.clearB.setText("초기황");
		}

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}// end PersonInfo
