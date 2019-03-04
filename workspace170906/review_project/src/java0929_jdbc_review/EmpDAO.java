package java0929_jdbc_review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmpDAO {
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public EmpDAO() {
	
	}//end EmpDAO
	
	private static EmpDAO dao = new EmpDAO();
	public static EmpDAO getInstance() {
		return dao;
	}
	
	private Connection init() throws ClassNotFoundException, SQLException{
		// 1.드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");

		// 2. 서버연결
		String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		return DriverManager.getConnection(url, username, password);
	}// end init()
	
	private void exit() throws SQLException{
		if(rs!= null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(stmt!=null)
			stmt.close();
		if(conn!=null)
			conn.close();	
		}
	
	public List<EmpDTO> rangeMethod(HashMap<String, Integer> map){//hashmap 에 스트링과 인티저가 들어간다.
		List<EmpDTO> aList = new ArrayList<EmpDTO>();
		
		try {
			conn=init();
			//map 에서 변수를 받아서 넣어야하므로 ? 로 처리해야한다.
			String sql = "SELECT test.* FROM " + 
					"(SELECT rownum as rm, emp.* FROM(SELECT * FROM employees " + 
					"ORDER BY employee_id)emp)test " + 
					"WHERE test.rm>=? and test.rm<=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, map.get("start"));
			pstmt.setInt(2, map.get("end"));
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setSalary(rs.getInt("salary"));
				dto.setHire_date(rs.getDate("hire_date"));
				aList.add(dto);
			}//end while
			
			pstmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {	
			e.printStackTrace();
		} finally {
			try {
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return aList;
		
		
	}//end rangeMethod();
	
	

	

	public List<EmpDTO> searchMethod(String word) {
		List<EmpDTO> aList = new ArrayList<EmpDTO>();
		
		try {
			conn = init();
			String sql ="SELECT * " +
					"FROM employees "+
					"WHERE lower(first_name) like lower(?)"; 
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+word+"%");
						
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setSalary(rs.getInt("salary"));
				dto.setHire_date(rs.getDate("hire_date"));
				aList.add(dto);
				
				
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aList;
	}//end seacrhMethod();
	
	
	
	
	
	
	
	
	
	
	

}








