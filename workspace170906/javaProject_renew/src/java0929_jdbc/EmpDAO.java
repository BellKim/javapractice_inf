package java0929_jdbc;

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

	private EmpDAO() {//무인자생성자

	}// end EmpDAO
	
	private static EmpDAO dao = new EmpDAO();
	public static EmpDAO getInstance() {
		return dao;
	}
	
	private Connection init() throws ClassNotFoundException, SQLException {
		// 1.드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");

		// 2. 서버연결
		String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		return DriverManager.getConnection(url, username, password);
	}// end init()

	private void exit() throws SQLException {
		if (rs != null)
			rs.close();

		if (stmt != null)
			stmt.close();

		if (pstmt != null)
			pstmt.close();

		if (conn != null)
			conn.close();
	}// end exit

	// dao 는 data access 객체
	// dto는 데이터를 처리
	// 화면에 출력하는 객체 따로

	public List<EmpDTO> rangeMethod(HashMap<String, Integer> map){
		List<EmpDTO> aList = new ArrayList<EmpDTO>();
		
		
		try {
			conn=init();
			
//			String sql = "SELECT * FROM employees ORDER BY employee_id;";
			String sql = "SELECT test.* FROM " + 
					"(SELECT rownum as rm, emp.* FROM(SELECT * FROM employees " + 
					"ORDER BY employee_id)emp)test " + 
					"WHERE test.rm>=30 and test.rm<=35";
			//------------------------------------------
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
				
			}
			
			
			pstmt.executeUpdate();

			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				exit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return aList;
		
	}// end rangeMethod()

	public List<EmpDTO> searchMethod(String word) {
		List<EmpDTO> aList = new ArrayList<EmpDTO>();
		
		try {
			conn=init();
			String sql="SELECT * " + 
					"FROM employees " + 
					"WHERE lower(first_name) like lower(?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+word+"%");
			
//			System.out.println(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setSalary(rs.getInt("salary"));
				dto.setHire_date(rs.getDate("hire_date"));
				aList.add(dto);
				
			}//end while
	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				exit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return aList;
	}//end searchMethod()
	
	
	
	
	
	
	
	
	
	

} // end class
