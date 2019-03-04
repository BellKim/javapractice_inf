package java0928_jdbc;

import java.util.List;

//jobs 테이블값을 가져와서 콘솔창에 뿌려주라
public class java234_jdbc_jobs {

	public static void main(String[] args) {
//		JobsDAO dao = new JobsDAO();
		JobsDAO dao =JobsDAO.getInstance();
		
		
		List<JobsDTO> aList = dao.listMethod();
		
		
		
		for(int i=0; i<aList.size(); i++) {
			JobsDTO dto = aList.get(i);
			System.out.printf("%s %s %d %d \n",
					dto.getJob_id(),
					dto.getJob_title(),
					dto.getMin_salary(),
					dto.getMax_salary());
		}//for

	}//end main()

}//end class 
