import java.sql.DriverManager;
import java.sql.Connection;

class db_connection {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/arjit";
		String uname = "postgres";
		String pswd = "8580";

		try {
			// Register JDBC driver
			Class.forName("org.postgresql.Driver");

			// Open a connection
			Connection con = DriverManager.getConnection(url, uname, pswd);
			System.out.println("Connect!.");

			con.close();
		}

		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}


  	}
}