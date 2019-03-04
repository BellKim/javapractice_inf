package java0928_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JobsDAO {
	Connection conn = null;
	Statement stmt =null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	

	public JobsDAO() {
	
	}
	
	static JobsDAO dao = new JobsDAO();
	public static JobsDAO getInstance() {
		return dao;
	}
	
	private Connection init() throws ClassNotFoundException, SQLException{
		//1. 드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");// throws ClassNotFoundException 입력
		//2. 서버연결
		String url= "jdbc:oracle:thin://@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		return DriverManager.getConnection(url, username, password);
	}//end init()
	
	private void exit() throws SQLException{
		if(rs != null)
			rs.close();
		
		if(pstmt != null)
			pstmt.close();
		
		if(stmt != null)
			stmt.close();
		
		if(conn != null)
			conn.close();
	}
	//dao는 data access 객체
	//dto는 데이터를 처리
	//화며네 출력하는 객체는 따로 해준다.
	
	public List<JobsDTO> listMethod() {
		List<JobsDTO> aList = new ArrayList<JobsDTO>();
		
		try {
			conn = init();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM jobs ORDER BY job_id";
			rs = stmt.executeQuery(sql);
			//sql 에 값을 전달해준다. 
			while(rs.next()) {
				JobsDTO dto = new JobsDTO();
				 dto.setJob_id(rs.getString("JOB_ID"));          
				 dto.setJob_title(rs.getString("JOB_TITLE"));
				 dto.setMin_salary(rs.getInt("MIN_SALARY"));
				 dto.setMax_salary(rs.getInt("MAX_SALARY")); 
				 aList.add(dto);
			}
			
			
			
		} catch (ClassNotFoundException e) {
//		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (SQLException e) {
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
	}//end listMethod()



}//end class 
