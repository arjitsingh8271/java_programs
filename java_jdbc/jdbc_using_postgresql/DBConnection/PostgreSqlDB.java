package DBConnection;

import java.sql.DriverManager;
import java.sql.Connection;

public class PostgreSqlDB {

	public static Connection con;

	public static Connection getConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/arjit","postgres","8580");
		}
		catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
		System.out.println("Connect!");
		return con;
	}


	public static void closeConnection() {
		if(con != null) {
			try {
				con.close();
				System.out.println("Connection Close!.");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
  	}

  	// For check 
  	// public static void main(String[] args) {
  	// 	PostgreSqlDB.getConnection();
  	// }
}
