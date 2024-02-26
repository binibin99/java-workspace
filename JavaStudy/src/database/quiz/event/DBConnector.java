package database.quiz.event;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverPath = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static String id = "testuser";
	private static String pw = "4321";
	
	static {
		try {
			Class.forName(driverPath);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, id, pw);
	}
}
