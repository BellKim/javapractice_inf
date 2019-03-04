package java0929_jdbc_review;

import java.util.List;

public class java235_review_1 {

	public static void main(String[] args) {
		MemDAO dao = MemDAO.getInstance();
		List<MemDTO>aList = dao.listMethod();
		
		for(MemDTO dto : aList)
			System.out.printf("%d %s %d %s \n",
								dto.getNum(),
								dto.getName(),
								dto.getAge(),
								dto.getLoc()
								);
		

	}//end main

}//end class
