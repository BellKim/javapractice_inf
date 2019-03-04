package java0915_gui;
/*
 * 컴퓨터와 사용자 인터페이스
 * 1 CUI(Character User Interface) : 문자대화방식 - DOS, LINUX
 * 2 GUI(Graphics User Interface) : 그림대화방식 - WINDOW
 * 
 * 자바에서 GUI을 구현할 수 있도록 AWT, SWING을 제공한다.
 * 
 * Component(컴포넌트)
 * 1 비주얼 컴포넌트 : 자기 자신위에 다른 컴포넌트를 연결할 수 없는 컴포넌트이다.
 * 2 컨테이너 : 자기 자신위에 다른 컴포넌트를 연결할 수 있는 컴포넌트이다.
 * 3 메뉴컴포넌트 : 메뉴에 관련된 컴포넌트이다.
 * 
 * Event(이벤트) : 컴포넌트에서 키보드로 입력하고, 클릭하고 하는 행동을 컴포넌트에
 *    사건이 발생된 것인데 이를 이벤트라 한다.
 * 
 * eventListenr : 컴포넌트에서 이벤트가 발생되면 이를 해결해야 하는데 해결할
 *    메소드를 정의해놓은 인터페이스이다.
 *    
 *    Frame		WindowEvent		windowListener		addWindowListener
 *    Button	ActionEvert		ActionListener		addActionListenr
 *    Checkbox	ItemEvent		ItemListener		addItemListener
 */

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Win extends Frame{
	public Win() {
		setSize(300,400);	//윈도우창 가로 300 세로 400 픽셀단위로 설정가능.
		setVisible(true);	//d윈도우 창을 화면에 표시 창이 보이게 하려면 True 가 필요하다.
		
		Exit exit = new Exit();
		this.addWindowListener(exit);	//윈도우 닫는버튼.
		
		

	}//end win()
	
	class Exit implements WindowListener{		//이거 쓰면 Exit 에서 오버라이드 추가하기 누르면됨. 

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowActivated");
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowClosed");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowClosing");
			System.exit(0);
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowDeactivated");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowDeiconified");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowIconified");
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			System.out.println("windowOpened");
		}
		
	}//end Exit
	
}//end class

public class java211_gui {

	public static void main(String[] args) {
		new Win();

	}//end main

}//end class
