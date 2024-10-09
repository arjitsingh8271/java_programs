package MyPackages.DBConnection;

import java.sql.DriverManager;
import java.sql.Connection;

public class PostgreSqlDB {

	public static Connection connection;

	public static Connection getConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/arjit","postgres","8580");
		}
		catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
		System.out.println("Connect!");
		return connection;
	}


	public static void closeConnection() {
		if(connection != null) {
			try {
				connection.close();
				System.out.println("Connection Close!.");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
  	}

  	// For check 
  	public static void main(String[] args) {
  		PostgreSqlDB.getConnection();
  	}
}
