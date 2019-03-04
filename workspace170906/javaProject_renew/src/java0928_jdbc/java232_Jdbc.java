package java0928_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class java232_Jdbc {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; // java.sql 인지 확인해봐야한다.

		try {
			// 1. 드라이버로딩
			Class.forName("oracle.jdbc.OracleDriver");// 대소문자 유의할것.
			// 2.서버연결
			String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
			conn = DriverManager.getConnection(url, username, password);
			// 3. 쿼리문을 실행하기 위한 statement타입의 객체를 리턴.
			stmt = conn.createStatement();
		
			String sql="SELECT * FROM departments ORDER BY department_id";
			rs=stmt.executeQuery(sql);//excutequery -> result set
			//결과값을 통째로 받아온다. 
			while(rs.next()) {//받아올때 int형과 string형의 자료형에 유의해서 받아온다. 
				int department_id=rs.getInt("department_id");
				String departName = rs.getString("department_name");
				int manId=rs.getInt("manager_id");
				int locId=rs.getInt("location_id");
				System.out.printf("%d %s %d %s \n",department_id, departName, manId, locId);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{		//다끝났으면 db 연결을 끊어야 한다. 최대접근자수가 제한이 걸려있는데 끊지않으면 연결이 누적되어 서버다운이된다. 
			
			if(rs!=null)
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}

	}// end main()

}// end class
