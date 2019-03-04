package java0915_gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class UserLayout extends Frame{
	
	Button northBtn, centerBtn, southBtn, eastBtn, westBtn;
	
	public UserLayout() {
//		2,3 배열에 2,3위치 배열 뺴고 배치 (setLayout(new GridLayout(2,3));)
//		ㅁ ㅁ ㅁ
//		ㅁ ㅁ 
		
		northBtn = new Button("northBtn");
		centerBtn = new Button("centerBtn");
		southBtn = new Button("southBtn");
		eastBtn = new Button("eastBtn");
		westBtn = new Button("westBtn");
		setLayout(new GridLayout(2,3));
		
		this.add(BorderLayout.NORTH, northBtn);		//이방법이나
		this.add(centerBtn, BorderLayout.CENTER);	//이방법이나 둘다 사용가능하다
		this.add("SOUTH", southBtn);// 사용은 되지만 추천하지 않는방법.
		/*NORTH 를 보면 모두 대문자인데  
		 * final이 선언되어있음을 알수있다.
		 */
		this.add(BorderLayout.EAST, eastBtn);
		this.add(BorderLayout.WEST, westBtn);
		
		northBtn.setForeground(new Color(0,255,0));
		northBtn.setBackground(new Color(255, 0, 0));
		
		setBackground(Color.CYAN);//하늘색이라네
		

		
		
		
		
		
		
		setSize(300,300);	//윈도우창 가로 300 세로 400 픽셀단위로 설정가능.
		setVisible(true);	//d윈도우 창을 화면에 표시 창이 보이게 하려면 True 가 필요하다.
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});//end addWindowListener//////
		
	}//end user layout
}//end userlayout class 

public class java216_gui {

	
	public static void main(String[] args) {
		new UserLayout();

	}

}
