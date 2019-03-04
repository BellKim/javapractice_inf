package java0929_jdbc;

import java.util.HashMap;
import java.util.List;

public class java_236_jdbc_mem {

	public static void main(String[] args) {
		EmpDAO dao = EmpDAO.getInstance();
//SELECT * FROM employees ORDER BY employee_id; 
		//에서 30~35까지 데이터를 긁어오는 소스코드.
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", 30);
		map.put("end", 35);
		
		List<EmpDTO> aList = dao.rangeMethod(map);
//		map-> 변수생 성                                 변수 : list<empdto>
		for(EmpDTO dto : aList)
			System.out.printf("%d %s %d %s \n",
					dto.getEmployee_id(),
					dto.getFirst_name(),
					dto.getSalary(),
					dto.getHire_date()
					);
		
		
		
		
		

	}//end main

}//end class
