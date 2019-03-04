package java1031_plsql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.internal.OracleTypes;
/*
 * pl/sql 생성 .
 * 
create or replace procedure my_select
(v_empid in number,
v_name out varchar2 ,
v_salary out number)
is
begin 
select first_name,salary
into v_name,v_salary
from employees
where employee_id=v_empid;
end;
/
*/
public class java243_plsql {	
	private Connection conn;
private CallableStatement cstmt;
private ResultSet rs;

public java243_plsql() {
	process();
	
}//end java241_plsql()

public void process() {
	try {
		// 1.드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");
	
		// 2. 서버연결eeeeee
		String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		conn = DriverManager.getConnection(url, username, password);
		
		String sql = "{call my_select(?,?,?)}";
		cstmt = conn.prepareCall(sql);
		//입력값
		cstmt.setInt(1, 100);
		//반환값
		cstmt.registerOutParameter(2, Types.VARCHAR); //types =import java.sql;
		cstmt.registerOutParameter(3, Types.INTEGER); //types =import java.sql;
		cstmt.execute();
		System.out.printf("%s, %d \n", cstmt.getString(2), cstmt.getInt(3));
		
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
		 new java243_plsql();

	}

}
