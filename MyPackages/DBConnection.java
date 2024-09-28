import java.sql.DriverManager;
import java.sql.Connection;

class DBConnection {

	public static Connection connection;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/arjit","root","8580");
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

  	// // For check 
  	// public static void main(String[] args) {
  	// 	MyDBConnection.getConnection();
  	// }
}
