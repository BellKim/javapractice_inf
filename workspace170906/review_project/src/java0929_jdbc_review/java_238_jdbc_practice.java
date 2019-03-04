package java0929_jdbc_review;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class DesignTest extends JFrame implements ActionListener {
	JTextField inputTxt;
	JButton searchBtn;
	JTable table;
	DefaultTableModel model;
	public DesignTest(){
		inputTxt = new JTextField(20);
		searchBtn = new JButton("검색");
		
		JPanel jp = new JPanel();
		jp.add(inputTxt);
		jp.add(searchBtn);
		
//		테이블 헤드
		Object[] obj = {"사원번호", "사원명", "연봉", "입사일"};
		
		model = new DefaultTableModel(obj,0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			};
		};
		table = new JTable(model);
		
		//칼럼이동 불가능기능 추가. 
		table.getTableHeader().setReorderingAllowed(false);
		
		//라인 높이 추가 
		table.setRowHeight(20);
		
		add(BorderLayout.NORTH, jp);
		add(BorderLayout.CENTER, new JScrollPane(table));//스크롤추가
		
		//엑션리스너 추가 .
		searchBtn.addActionListener(this);
		
		
		//기본 창 띄우기
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end DesignTest();
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//테이블에 검색한 검색어를 여기에서 가져오도록 함. 
		String data = inputTxt.getText();
		//입력된 검색어를 재입력 가능하도록 입력된 내용을 전부 블록시킴.
		inputTxt.requestFocus();
		inputTxt.select(0, data.length());//입력된 검색어를 재입력 가능하도록 블록시킨다. 
		
		
		//테이블 초기화 .
		model.setRowCount(0);
		//재검색을 위해서 검색버튼을 다시 누르면 테이블이 초기화 되게 하는것.
		
		EmpDAO dao = EmpDAO.getInstance();
		
		List<EmpDTO> aList = dao.searchMethod(data);
		if(aList.size() == 0) {
			JOptionPane.showMessageDialog(this, "검색된 데이터가 없습니다.");
			return;
		}
		
		for(EmpDTO dto : aList) {
			Object[] line = new Object[4];//4개의 칼럼생성. 
			line[0] = dto.getEmployee_id();
			line[1] = dto.getFirst_name();
			line[2] = dto.getSalary();
			line[3] = dto.getHire_date();
			model.addRow(line);
			
			
		};
		

	}//end actionPerformed();
	
	
	
	
	
	
	
}//end DesignTest class 





public class java_238_jdbc_practice {

	public static void main(String[] args) {
		new DesignTest();
		

	}

}
