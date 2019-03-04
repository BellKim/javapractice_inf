package java0928_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/*
 * 1. ClassNotFoundException 
*  해결) JRE System Library에서 ojdbc14.jar파일 확인
 *      Class.forName(): 경로확인
 *      
 * 2. java.sql.SQLException: 
 *     IO예외 상황:  The Network Adapter...
 *                 Listener refused.....  
 *                 
 *     해결) 제어판->관리도구->서비스->OracleServiceXE,
 *            OracleXETNSListener을 다시 시작한다.
 *            
* java.sql.PreparedStatement
 * 1 반복되는 쿼리문의 수행에 사용한다.
 * 2 미리 정의된 SQL문을 수행하기 때문에 Statement에 비해 속도가 빠르다.
 * 3 위치표시자(placeholder)(?)를 사용하여 쿼리문을 간략하게 작성한다.
 */    
//DAO (Data Access Object) : 데이터 접근 객체


/*
 * 싱글톤 패턴 : 하나의 객체만을 생성해서 사용할 수 있도록 설계한 구조이다. 
 * 1.생성자의 접근제어자는 private
 * 2. 객체자시을 생성한다.
 * 3. 생성된 객체를 넘겨줄 수 있는 메소드를 정의한다.
 */
public class DepartmentDAO {
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	static DepartmentDAO dao = new DepartmentDAO();

	private DepartmentDAO() {

	}
	
	public static DepartmentDAO getInstance() {
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
	
	//dao 는 data access 객체
	//dto는 데이터를 처리
	//화면에 출력하는 객체 따로
	public List<DepartmentDTO> listMethod(){
		List<DepartmentDTO> aList = new ArrayList<DepartmentDTO>();
		//똑같은 방식으로 객체생성을 하게된다. 
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
	
	public List<DepartmentDTO> searchMethod(String data){
		List<DepartmentDTO> aList = new ArrayList<DepartmentDTO>();
		
		try {
			conn = init();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM department WHERE lower(department_name) like lower('%"+data+")%'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				DepartmentDTO dto = new DepartmentDTO();
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				aList.add(dto);
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
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
		
	}//end searchMethod
	
	
	
	
	
	
	
	
}// end class
