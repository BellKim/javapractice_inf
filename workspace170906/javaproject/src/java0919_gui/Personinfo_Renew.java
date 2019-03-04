package java0919_gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Personinfo_Renew extends JFrame implements ActionListener, MouseListener{
	PersonMenu menu;
	PersonToolbar tool;
	PersonMain main;
	
	private int crow = -1;// getCrow,setCrow 를 위한 변수생성
		
	
	public Personinfo_Renew() {
		
		menu = new PersonMenu();
		setJMenuBar(menu);		//상단바  파일 편집 보기.
		
		tool = new PersonToolbar();	//상단 툴바 생성하기
		main = new PersonMain();	//개인정보와 하단 표 리스트 출려기하기.
		
		add(BorderLayout.NORTH, tool);	//상단 도구모음바
		add(BorderLayout.CENTER, main);	//개인정보입력란과 하단 리스트
		
		main.registerB.addActionListener(this);
		main.modifyB.addActionListener(this);
		main.deleteB.addActionListener(this);
		main.clearB.addActionListener(this);
		main.table.addMouseListener(this);
		
		/*menu.fsave.addActionListener(this);// 저장
		tool.saveasB.addActionListener(this);// 도구모음*/
		
		
		main.registerB.addMouseListener(this);
		main.modifyB.addMouseListener(this);
		main.deleteB.addMouseListener(this);
		main.clearB.addMouseListener(this);
		
		
		
		
		
		
		
		
		
		
		setSize(520, 550);	//윈도우창 가로 300 세로 400 픽셀단위로 설정가능.
		setVisible(true);	//d윈도우 창을 화면에 표시 창이 보이게 하려면 True 가 필요하다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//DO_NOTHING_);//위의 주석과 같은 효과를 가진다
		
/*		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				String title = "종료";
				String message = "증말증말 종료하시겠ㅅ브니까";
				if(getConfirmMessage(title, message)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});*/
		

		
	}//end Personinfo_renew()
	

	
	
	
	

	public static void main(String[] args) {
		new Personinfo_Renew();
	}//end main






	@Override
	public void actionPerformed(ActionEvent e) {// 상단 클레스에서 actionlistener 추가시 나타남. 
		Object obj = e.getSource();
		
		if(obj==main.registerB) {
			setRegister();	//등록
		} else if (obj == main.modifyB) {
			setModify();// 수정
		} else if (obj == main.deleteB) {
			delete();// 삭제
		} else if (obj == main.clearB) {
			init(); // 초기화
		} else if (obj == menu.fsave || obj == tool.saveB) {
			fileSave();//파일저장.
		}
	}//actionPerformed


	public int getCrow() {
		return crow;
	}



	public void setCrow(int crow) {
		this.crow = crow;
	}
	
	
	private void setModify() {	//수정
		// trim : 불필요한 공백제거
		String name = main.nameF.getText().trim();
		String sex = main.manR.isSelected() ? "남 " : "여";
		String tel1 = (String) main.telC.getSelectedItem();// tostring();
		String tel2 = main.tel1F.getText().trim();
		String tel3 = main.tel2F.getText().trim();
		String email = main.emailF.getText().trim();
		
		// 모든 항목을 입력하지 않았을때 경고..	//수정시에도 항목을 모두 추가하도록 유도한다.
		if (name.length() < 1 || tel2.length() < 1 || tel3.length() < 1 || email.length() < 1) {
			// message 출력한다.
			setMessage("모든항목을 입력하세요 ");
			return;
		}
		
		main.table.setValueAt(name, getCrow(), 1);
		main.table.setValueAt(sex, getCrow(), 2);
		main.table.setValueAt(tel1 + "-" + tel2 + "-" + tel3, getCrow(), 3);
		main.table.setValueAt(email, getCrow(), 4);
				//setValueAt=원하는 위치의 데이터를 변경해주는 메소드이다.
				//setValueAt(변화시킬값,행위치,열위치
				//getValueAt=데이터를 가져와서 출력한다.
		
		
		setCrow(-1);// 테이블 더블클릭- 수정후 등록을 눌렀을때 방지하기위함.
		//더블클릭을 하면 수정할수있도록 클릭을 감지.
		
		
		
		
	}//end setModify


	private void setRegister() {	//등록

		
		
		//trim : 불필요한 공백제거
		String name = main.nameF.getText().trim();
		String sex = main.manR.isSelected() ? "남 " : "여";
		String tel1 = (String) main.telC.getSelectedItem();// tostring();
		String tel2 = main.tel1F.getText().trim();
		String tel3 = main.tel2F.getText().trim();
		String email = main.emailF.getText().trim();
		
/*//		main.table.setValueAt(name, 0, 1);				//한개만 올리고자 할때 사용.
//		main.table.setValueAt(sex, 0, 2);
//		main.table.setValueAt(tel1+tel2+"-"+tel3,0,3);
//		main.table.setValueAt(email,0, 4);		//각 버튼을 눌렀을때 하단 테이블 구조에 설정한 열에 출력이된다.
*/		  
		// 모든 항목을 입력하지 않았을때 모든 메시지를 입력하도록 메시지를 출력한다.
		if (name.length() < 1 || tel2.length() < 1 || tel3.length() < 1 || email.length() < 1) {
		// message 출력한다.
			setMessage("모든항목을 입력하세요111 ");
			return;
		}	//end if
		
		for (int i = 0; i < main.table.getRowCount(); i++) {//입력받은값이 2개이상일때
			if (main.table.getValueAt(i, 0) == null) {
				main.table.setValueAt(Integer.toString(1 + i), i, 0);
				main.table.setValueAt(name, i, 1);
				main.table.setValueAt(sex, i, 2);
				main.table.setValueAt(tel1 + "-" + tel2 + "-" + tel3, i, 3);
				main.table.setValueAt(email, i, 4);
				break;
			}//if
			
		} // end for
		System.out.println("등록버튼클릭");
			
		setClear();//입력 다하고 입력창만 초기화 시킨다.
	}//end set Register())
	
	private void setMessage(String message) {
		JOptionPane.showMessageDialog(this, message);	
	}
	
	
	private void setClear() {//한번 등록후 입력창을 초기화시켜준다.
		main.nameF.setText(" ");
		main.tel1F.setText(" ");
		main.tel2F.setText(" ");
		main.emailF.setText(" ");
		main.telC.setSelectedIndex(0);
		main.manR.setSelected(true);	//입력창 초기화.
		
		//초기화후 커서위치를 셋팅힌다.
		main.nameF.requestFocus();	//nameF에 커서위치를 재배치한다.
		
	}//end setClear();
	

	
	
	
	private int getConfirmMessage(String title, String message) {
		return JOptionPane.showConfirmDialog(this, message, title, JOptionPane.YES_NO_OPTION);

	}// end getConfirmMessage()

	private void delete() {				//삭제
		// TODO Auto-generated method stub
		
	}
	
	
	private void init() {				//초기화
		// TODO Auto-generated method stub
		
	}

	private void fileSave() {			//파일 저장
		// TODO Auto-generated method stub
		
	}

	
	private void setInputRecord() {		//클릭후에 감지되었을때 수행될 이벤트들에 대한 함수들.
		// 더블클릭한 테이블의 행의 번호를 리턴해준다.
		int row = main.table.getSelectedRow();//테이블의 선택된열을 출력한다.(열번호출력)
		//getSelectedRow()=Returns the index of the first selected row, -1 if no row is selected.
		//첫번재로 선택된 열의 번호를 리턴한다. 만약 열이 선택되지 않았다면 -1을 리턴한다. 결론: 사용자가 선택한 행을 출력한다.
	
		if(row < 0 || main.table.getValueAt(row, 0)==null) {
			setMessage("빈레코드를 선택하셧습니다.");
			return;
		}
		
		setCrow(row);//열의 번호를 다시 출력하게됨.
		
		//테이블을 더블클릭하면 수정시킨다.
		main.nameF.setText((String)main.table.getValueAt(row, 1));//테이블의nameF의 값을 입력받은 row번호에 재셋팅 해준다.
		String sex = main.table.getValueAt(row, 2).toString();//sex정보를 불러온다. 해당 열의 2번열을 string형태로 출력.(1혹은2로 출력된다.)
		//1혹은2로 출력이 되므로 조건문으로  선택을해준다.(1.남자 아니면 여자)
		if(sex.equals("남"))
			main.manR.setSelected(true);		//setSelected() : Sets the state of the button.
		else
			main.womanR.setSelected(true);	//"남"일때 선택하고 아니면 womanR을 선택해라.
		
		String[] st = main.table.getValueAt(row, 3).toString().split("-");
		main.telC.setSelectedItem(st[0]);	//010,017 등등 드롭다운메뉴 선택
		main.tel1F.setText(st[1]);			//중간번호
		main.tel2F.setText(st[2]);			//마지막번호
		
		main.emailF.setText(main.table.getValueAt(row, 4).toString());	//이메일
		
		
	}//end setInputRecord()


	@Override
	public void mouseClicked(MouseEvent e) {
		Object obj = e.getSource();
		System.out.println("클릭됨");
		if(obj == main.table && e.getClickCount() == 2) {//클릭이 2번이면
			System.out.println("두번클릭됨");
			setInputRecord();
		}//if
	}//end mouseClicked()
	

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


}// end Personinfo_Renew//
