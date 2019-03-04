package java0929_jdbc;

import java.util.HashMap;
import java.util.List;



public class java_235_Jdbc_USEmemDAODTO {

	public static void main(String[] args) {
		MemDAO dao = MemDAO.getInstance();
		
/*		MemDTO md = new MemDTO("야잉"
 * , 44, "부산");
		dao.insertMethod(md);*/
////////////////////////////////////////////////////////////////
		//num칼럼의 값이 1일때 name칼럼의 값을 "윤아"로 수정.
//		MemDTO dto = new MemDTO();
//		dto.setNum(1);
//		dto.setName("윤아");//이렇게 해줘되 되지만.
////////////////////////////////////////////////
		///////////////
/*		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", new String("윤아"));
		map.put("num", new Integer(1));
		
		dao.updateMethod(map);//이렇게 해줘두된다.
*/	
///////////////////////////////////////////////////////////////
		
//		dao.deleteMethod(2);
		
		
		List<MemDTO> aList = dao.listMethod();
		
		for(MemDTO dto : aList) 
			
			System.out.printf("%d %s %d %s\n",
							dto.getNum(),
							dto.getName(),
							dto.getAge(),
							dto.getLoc()
							);

	}//end main()

}//end class
