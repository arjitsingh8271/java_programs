import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

class db_fetch_data {

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

			String str = "select name from student where roll=7";

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(str);
			rs.next();
	
			String name = rs.getString(1);
			System.out.println(name);

			con.close();
		}

		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}


  	}
}