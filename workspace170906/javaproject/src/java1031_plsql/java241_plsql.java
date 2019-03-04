package java1031_plsql;

import java.sql.CallableStatement;
import java.sql.Connection;
/*
sql> begin
--매개벼수로 아무런 값도 안넣을때 디폴트 값이 들어감.
proc06_othermode;
--각각 v_name, v_location변수에 저장. 
proc06_othermode('정소라', '대전');

end;
/

*/
import java.sql.DriverManager;
import java.sql.SQLException;

public class java241_plsql {
	private Connection conn;
	private CallableStatement cstmt;
	
	public java241_plsql() {
		process();
		
	}//end java241_plsql()
	
	public void process() {
		try {
			// 1.드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
		
			// 2. 서버연결
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
		}finally {
			
		}
		
		
		
	}//end process
	

	public static void main(String[] args) {
		new java241_plsql();

	}//end main

}//end class
