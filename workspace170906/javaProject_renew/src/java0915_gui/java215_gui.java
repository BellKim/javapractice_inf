package java0915_gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class UserSize extends Frame{
	Button btn;
	
	public UserSize() {
		//Frame 컨테이너의 LAYOUT 을 null로 초기화한다.
		this.setLayout(null);
		btn=new Button("button");
		
		//가로위치, 세로위치, 가로크기, 세로크기
		btn.setBounds(50,50,200,150);
		
		this.add(btn);
		
		
		setSize(300,300);	//윈도우창 가로 300 세로 400 픽셀단위로 설정가능.
		setVisible(true);	//d윈도우 창을 화면에 표시 창이 보이게 하려면 True 가 필요하다.
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});//end addWindowListener//////
	}//end user size
	
}//end class user size


public class java215_gui {

	public static void main(String[] args) {
		new UserSize();

	}

}
