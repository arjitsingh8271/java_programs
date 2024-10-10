import java.sql.DriverManager;
import java.sql.Connection;

class java_db_connect {

	public static void main(String[] args) {

		try {
			// Register JDBC driver
			// Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Open a connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arjit","root","8580");
			System.out.println("Connect!.");
		}

		catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
		}
  	}
}
