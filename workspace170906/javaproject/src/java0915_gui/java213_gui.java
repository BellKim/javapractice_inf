package java0915_gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java0915_gui.Win.Exit;

/*
 * 레이아웃(layout) : 컨테이너에 컴포넌트를 연결할 수 있도록 화면배치를 설계해주는 기능이다.
 * 레이아웃관리자(Layout Manager) : 컨테이너에 컴포넌트를 적절하게 배치할 수 있도록 자동적으로
 *           일을 담당하고 있다.
 * 레이아웃 종류
 * 1 BorderLayout : North, South, East, West, Center5개의 영역으로 이루어진 레이아웃이다.
 * 2 FlowLayout : 추가되는 컴포넌트에 따라 왼쪽에서 오른쪽으로 연결한다.
 * 3 GridLayout : 테이블처럼 행과 열로 나누어 컴포넌트를 배치한다.
 * 4 GridBagLayout : 컴포넌트의 크기를 다르게 해서 배치할때 사용한다.
 * 5 CardLayout : 여러 화면을 슬라이드처럼 바꿔가며 보여줄 수 있다.
 * 
 * 컨테이너별 기본레이아웃
 * 1 FlowLayout - Panel, Applet			
 * 2 BorderLayout - Window, Frame, Dialog
 * 
 * //applet은 현재 사용하지 않음. 윈도우 자바기반 웹프로그램일때 사용하는것. 현재는 서블릿, jsp를 사용한다. 
 * 
 *  
 */

class LayoutTest extends Frame{
	Button northBtn, centerBtn, southBtn, eastBtn, westBtn;
	public LayoutTest() {
		northBtn = new Button("northBtn");
		centerBtn = new Button("centerBtn");
		southBtn = new Button("southBtn");
		eastBtn = new Button("eastBtn");
		westBtn = new Button("westBtn");
		//컨테이너에 컴포넌트 연결 : add()
		//컨테이너 .add(컴포넌트)
		
		this.add(BorderLayout.NORTH, northBtn);		//이방법이나
		this.add(centerBtn, BorderLayout.CENTER);	//이방법이나 둘다 사용가능하다
		this.add(BorderLayout.SOUTH, southBtn);// 사용은 되지만 추천하지 않는방법.
		/*NORTH 를 보면 모두 대문자인데  
		 * final이 선언되어있음을 알수있다.
		 */
		this.add(BorderLayout.EAST, eastBtn);
		this.add(BorderLayout.WEST, westBtn);
		
		
		
		
		setSize(300,400);	//윈도우창 가로 300 세로 400 픽셀단위로 설정가능.
		setVisible(true);	//d윈도우 창을 화면에 표시 창이 보이게 하려면 True 가 필요하다.
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});
		
	
	}//end Layout_test()/////////////
}

public class java213_gui {

	public static void main(String[] args) {
		new LayoutTest();

	}

}
