package java1031_plsql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//프로시저를 생성하기 위한 테이블을 생성해준다.
//sql 명령줄에서 실행해준다. 

/*
테이블생성
create table pltest(
  num number,
  message varchar2(50)
);

프로시저 생성
create or replace procedure projdbc01
(msg in varchar2)
is
begin
 for i in 1..10 loop
  insert into pltest values(i,msg);
 end loop;
 commit;
end;
/
 
 //프로시저가 생성되었습니다. 
  
  select * from pltest;
  //선택된 레코드가 없습니다. 
   
*/

public class java240_plsql {
	private Connection conn;
	private CallableStatement cstmt;
	public java240_plsql() {
		process();
		
	}//end java240_plsql()
	
	public void process() {
	
		try {
			// 1.드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
		
//			// 2. 서버연결
			String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
			conn = DriverManager.getConnection(url, username, password);
			
			String sql = "{call projdbc01(?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setString(1, "start");
			cstmt.execute();
			System.out.println("program end");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		

		
	}//end process()
	

	public static void main(String[] args) {
		
		new java240_plsql();

	}//end main

}//end class 
