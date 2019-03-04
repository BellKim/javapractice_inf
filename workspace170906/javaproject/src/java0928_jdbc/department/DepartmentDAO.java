package java0928_jdbc.department--;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public DepartmentDAO() {

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
	
	//dao 는 data access 객체
	//dto는 데이터를 처리
	//화면에 출력하는 객체 따로
	public List<DepartmentDTO> listMethod(){
		List<DepartmentDTO> aList = new ArrayList<DepartmentDTO>();
			try {
				conn= init();
				stmt= conn.createStatement();
				String sql = "SELECT * FROM departments ORDER BY department_id";
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					DepartmentDTO dto = new DepartmentDTO();
					dto.setDepartment_id(rs.getInt("department_id"));
					dto.setDepartment_name(rs.getString("department_name"));
					dto.setManager_id(rs.getInt("manager_id"));
					dto.setLocation_id(rs.getInt("location_id"));
					aList.add(dto);
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			} finally{
				try {
					exit();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		return aList;
	}// end listMethod()
}// end class
