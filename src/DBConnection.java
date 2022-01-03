import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
class DBConnection {
	Connection connection;
	
	public void connect() {
		String url = "jdbc:mysql://localhost:3306/webdb?serverTimezone=UTC";
		String user = "webapp";
		String password = "webapp";
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, user, password);
		} catch(ClassNotFoundException e) {
			System.out.println("로드오류:\n" + e);
		} catch(SQLException e) {
			System.out.println("아뒤비번 체크:\n" + e);
 	}
	
	public int insert(String sql) {
		int id = -1;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			statement = connection.createStatement();
			statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			rs = statement.getGeneratedKeys();
			if(rs.next()) {
				System.out.println(rs);
				id = rs.getInt(1);
				
				//String username = rs.getArray("username");				
			}
		} catch(SQLException e) {
			System.out.println("쿼리오류\n" + e);
		}
	return id;
	}
	
	public void select(String sql) {
		Statement statement = null;
		ResultSet rs = null;
		String rsresult = null;
		try {
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			//rs = statement.getGeneratedKeys();
			while(rs.next()) {
				rsresult = rs.getInt("id") + " " +
						rs.getString("username") + " " + 
						rs.getString("email") + " " +
						rs.getString("cellphone");
				System.out.println(rsresult);
				
			}
		} catch(SQLException e) {
			System.out.println("쿼리오류\n" + e);
		}
	}
	
	public int update(String sql) {
		int id = -1;
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = connection.createStatement();
			statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			rs = statement.getGeneratedKeys();
			if(rs.next()) {
				id = rs.getInt(1);
				return 0;
			}
		} catch(SQLException e) {
			System.out.println("쿼리오류\n" + e);
		}
		return 0;
	}
	public int delete(String sql) {
		int id = -1;
		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = connection.createStatement();
			statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			rs = statement.getGeneratedKeys();
		} catch(SQLException e) {
			System.out.println("쿼리오류\n" + e);
		}
		return id;
	}

	public void close() {
		try {
			if(connection != null) {
				connection.close();
			}
		} catch(SQLException e) {
			System.out.println("닫기 오류\n" + e);
		}	
	}
}