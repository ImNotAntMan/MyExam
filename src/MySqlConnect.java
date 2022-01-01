import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class MySqlConnect {

	public static void main(String[] args) {
		DBConnection dbConn = new DBConnection();
		ArrayList<DBConnection> dbcList = new ArrayList<DBConnection>();
		dbConn.connect();
		System.out.println(dbConn.insert("insert into users set username='홍범도', userpwd='22222', email ='email', cellphone='111-111-12313'"));
		dbConn.select("select * from users");
		System.out.println(dbConn.delete("delete from users where users.id=39"));
		dbConn.update("UPDATE users SET username = '이만기' WHERE users.id = 37");
	}

}