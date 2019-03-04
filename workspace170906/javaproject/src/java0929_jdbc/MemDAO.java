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

/*java.sql.PreparedStatement
 * 1.반복되는 쿼리문의 수행에 사용한다.
 * 2. 미리정의된 sql 문을 수행하기 떄문에 STATEMENT에 비해 속도가 빠르다.
 * 3. 위치표시자(placeholder)(?) 를 사용하여 쿼리문을 간략하게 작성한다. 
 * 
 */

public class MemDAO {

	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;

	private MemDAO() {

	}// end memDAO

	private static MemDAO dao = new MemDAO();

	public static MemDAO getInstance() {
		return dao;

	}// end emeDAO

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

	public List<MemDTO> listMethod() {
		List<MemDTO> aList = new ArrayList<MemDTO>();
		try {
			conn = init();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM mem ORDER BY num";
			rs = stmt.executeQuery(sql);

			// 다음에 읽어올 것이 있으면 true 없으면 false
			// rs 를 dto에 담고 담은걸 리턴
			while (rs.next()) {
				// arraylist에 담아서 전송.
				MemDTO dto = new MemDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setLoc(rs.getString("loc"));
				aList.add(dto);

			}

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
	}// end listmethod()

	public void insertMethod(MemDTO dto) {

		try {
			conn = init();
			/*//1방법
			 * stmt = conn.createStatement(); // INSET UPDATE 할떄는executeUpdate(sql) 사용 ////여기에 sql 이 안들어간다.

			 * String sql =
			 * "INSERT INTO mem VALUES(mem_num_seq.nextval, 'dto.getName()',dto.getAge(), dto.getLoc()"
			 * ; String sql =
			 * "INSERT INTO mem VALUES(mem_num_seq.nextval,'"+dto.getName()+"','"+dto.getAge
			 * ()+"','"+dto.getLoc()+ "')"; stmt.executeUpdate(sql); //여기에 sql 이 들어간다.
			 */

			//2방법.
			String sql = "INSERT INTO mem VALUES(mem_num_seq.nextval, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);//여기에 sql 이 들어간다.

			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getLoc());
			pstmt.executeUpdate();		//여기엔 sql 이 안들어감. 
			// 오류생김

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

	}//end insert Method( )
	
	public void updateMethod(HashMap<String, Object> map) {
		try {
			conn=init();
			String sql = "UPDATE mem SET name=? WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, (String)map.get("name"));
			pstmt.setInt(2, (Integer)map.get("num"));
			pstmt.executeUpdate();
			
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
		

	}//end  updatemethod()
	
	
	public void deleteMethod(int num) {
		try {
			conn=init();
			String sql = "DELETE FROM mem WHERE num=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,num);
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
		
		
	}//end delete method //

}// end class





















