package java0928_jdbc;

import java.util.List;
/*
 * MVC패턴
 * Model : 데이터에 관련된 작업(DepartmentDTO, DepartmentDAO)
 * View : 클라이언트에 보여줄 결과화면(Java233_Jdbc)
 * Controller: 요청, 응답처리(Java233_Jdbc)
 */

public class java233_jdbc_Development {

	public static void main(String[] args) {
	//	DepartmentDAO dao = new DepartmentDAO();
		DepartmentDAO dao =DepartmentDAO.getInstance();//->싱글톤패턴

		List<DepartmentDTO> aList = dao.listMethod();
		
		for(int i =0; i<aList.size() ; i++) {
			DepartmentDTO dto = aList.get(i);
			System.out.printf("%d %s %d %d\n",
							dto.getDepartment_id(),
							dto.getDepartment_name(),
							dto.getManager_id(),
							dto.getLocation_id());
		}//end for 

	}// end main()

}//end class
