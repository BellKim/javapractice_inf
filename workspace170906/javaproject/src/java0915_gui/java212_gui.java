package java0915_gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import java0915_gui.Win.Exit;

/*
 * 1. 컴포넌트 구성
 * 2. 리스너 구성
 * 3. 컴포넌트, 리스너 연결 (1,2,3과정 꼭 거치기)
 */

class Win2 extends Frame{	//1
	public Win2() {
		setSize(300,400);	//윈도우창 가로 300 세로 400 픽셀단위로 설정가능.
		setVisible(true);	//d윈도우 창을 화면에 표시 창이 보이게 하려면 True 가 필요하다.
		
/*		Exit exit = new Exit();
		this.addWindowListener(exit);	//윈도우 닫는버튼.
*/	//	컴포넌트.리스너 연결(동작);//3
		
		this.addWindowListener(new WindowAdapter() {	//익명클레스 new WindowsAdapter() 사용.
			//windowclosing 컨트롤 스페이스 하며 ㄴ오버라이듣뜸
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		

	}//end win2()
	class Exit extends WindowAdapter{//2	//windowClosing 하고  콘트롤 스페이스 
		@Override
		public void windowClosing(WindowEvent e) {
			//시스템종료
			System.exit(0);
		}
	}//end Exit
	
}//end class

public class java212_gui {

	public static void main(String[] args) {
		new Win2();

	}//end main

}//end class