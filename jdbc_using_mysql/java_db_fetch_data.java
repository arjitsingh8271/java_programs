import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


class java_db_fetch_data {

	public static void main(String[] args) {

		try {
			// Register JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Open a connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arjit","root","8580");
			
			// Create a statement with scrollable ResultSet
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			// Execute a query
			ResultSet rs = st.executeQuery("select roll, name from Students where Roll=7");
			rs.first();

			// Display query
			System.out.println("Roll: " +rs.getInt(1) +", Name: " +rs.getString(2));
		
	        // Close resources
        	rs.close();
        	st.close();
        	con.close();


		}

		catch(Exception e) {
			//System.out.println("Error");
			e.printStackTrace();
		}
  }
}
