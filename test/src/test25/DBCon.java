package test25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {

	private static Connection con=null;
	private static final String url = "jdbc:mariadb://127.0.0.1:3306/oreo";
	private static final String userName = "root";
	private static final String userPwd ="12345678";
	
	private static void openCon() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con=DriverManager.getConnection(url, userName, userPwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getCon() {
		if(con==null) {
			openCon();
		}
		return DBCon.con;
	}
	
	public static void closeCon() {
		if(DBCon.con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		DBCon.con=null;
	}
	
}