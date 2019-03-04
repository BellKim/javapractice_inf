package java0915_gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FlowlayoutTest extends Frame{
	Button oneBtn, twoBtn, threeBtn;
	Panel pn;
	TextArea ta;
	
	public FlowlayoutTest() {
		oneBtn = new Button("oneBtn");
		twoBtn = new Button("twoBtn");
		threeBtn = new Button("threeBtn");
		
		/*pannel의 기본 레이우웃은 FlowLayout이다.
		 * FlowLayout에 컴포넌트를 연결할때는 add 해준 순서대로 
		 * 왼쪽에서 오른쪽으로 연결된다.*/
		pn = new Panel();//왼쪽에서 오른쪽으로 추가됨. 
		pn.add(oneBtn);
		pn.add(twoBtn);
		pn.add(threeBtn);
		
		
		ta = new TextArea(10,20);
		
		this.add(BorderLayout.NORTH, pn);
		this.add(BorderLayout.CENTER, pn);
		this.add(BorderLayout.SOUTH, ta);
		
		
		
		
		
		
		setSize(300,400);	//윈도우창 가로 300 세로 400 픽셀단위로 설정가능.
		setVisible(true);	//d윈도우 창을 화면에 표시 창이 보이게 하려면 True 가 필요하다.
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});
		
		
	}//end FlowLayoutTest
	
}// end FlowlayoutTest

public class java214_gui_flowLayout {

	public static void main(String[] args) {
		
		new FlowlayoutTest();

	}

}
