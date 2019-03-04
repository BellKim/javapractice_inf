package java0929_jdbc_review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemDAO {
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public MemDAO() {
	}
	
	private static MemDAO dao = new MemDAO();
	
	public static MemDAO getInstance() {
		return dao;
	}// end getInstance()
	
	private Connection init() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		
		String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		return DriverManager.getConnection(url, username, password);
	}//end init()
	
	private void exit() throws SQLException{
		if(rs != null)
			rs.close();
		
		if(stmt != null)
			stmt.close();
		
		if(conn != null)
			conn.close();
		
	}//end exit();
	
	public List<MemDTO> listMethod(){
		List<MemDTO> aList = new ArrayList<MemDTO>();
		try {
			conn = init();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM mem ORDER by num";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				MemDTO dto = new MemDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("Age"));
				dto.setLoc(rs.getString("Loc"));
				aList.add(dto);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
			try {
				exit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		return aList;
		
	}
	
	
	
	
	
	

}//end memDAO














