package java1031_plsql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class java_240_prac {
	private Connection conn;
	private CallableStatement cstmt;
	
	
	
	public java_240_prac() {
		process();
		
	}//end java_240_prac()
	
	public void process() {
		
		try {
			// 1.드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
		
//			// 2. 서버연결
			String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
			conn = DriverManager.getConnection(url, username, password);
			
			String sql = "{call proc06_othermode(?,?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1, "정소라");
			cstmt.setString(2,"대전");
			
			cstmt.execute();
			System.out.println("program end");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		new java_240_prac();

	}//end main

}
