package java0915_gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

class EventTest extends JFrame implements ActionListener, ItemListener {
	JRadioButton topBtn, midBtn, botBtn;
	JTextArea ta;

	public EventTest() {

		topBtn = new JRadioButton("상", true);
		midBtn = new JRadioButton("중");
		botBtn = new JRadioButton("하");
		ta = new JTextArea(10, 10);

		ButtonGroup bg = new ButtonGroup();
		bg.add(topBtn);
		bg.add(midBtn);
		bg.add(botBtn);

		JPanel p1 = new JPanel();
		p1.add(topBtn);
		p1.add(midBtn);
		p1.add(botBtn);

		add(BorderLayout.NORTH, p1);
		add(BorderLayout.CENTER, ta);

		// 라디오 버튼과 Frame 연결
//		topBtn.addActionListener(this);
//		midBtn.addActionListener(this);
//		botBtn.addActionListener(this);
		 topBtn.addItemListener(this);
		 midBtn.addItemListener(this);
		 botBtn.addItemListener(this);

		setSize(400, 300);
		setVisible(true); // 항상 아래에 배치

		// 윈도우창 종료!! setDefaultCloseOperation() -> swing에서 제공!
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} // end EventTest()

	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();
		// if (obj == topBtn) {
		// ta.setText("top");
		// } else if (obj == midBtn) {
		// ta.setText("mid");
		// } else if (obj == botBtn) {
		// ta.setText("bot");
		// }
		// 액션 이벤트는 내가 현재 선택한 것에서만 이벤트가 발생 한다.
		// 액션이벤트에서는 한번만 일어난다.
		if (obj == topBtn) {
			ta.append(((JRadioButton) obj).getText());
		}
		if (obj == midBtn) {
			ta.append(((JRadioButton) obj).getText());
		}
		if (obj == botBtn) {
			ta.append(((JRadioButton) obj).getText());
		}
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// 아이템 이벤트는 해제 시에도 일어난다. 그래서 해제 할 때와 체크할 때 이벤트가 두번 일어나게 된다.
		// ta.setText("");
		// 이런식으로 구현을 하면 해제 시에도 이벤트가 발생이 되서
		// 두가지의 Text가 처리된다!
		Object obj = arg0.getSource();
		if (obj == topBtn) {
			ta.append(((JRadioButton) obj).getText());
		}
		if (obj == midBtn) {
			ta.append(((JRadioButton) obj).getText());
		}
		if (obj == botBtn) {
			ta.append(((JRadioButton) obj).getText());
		}

	}
} // end EventTest

public class Java220_gui_receivecheck_now {

	public static void main(String[] args) {
		new EventTest();
	} // end main()

} // end class
