import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


class java_db_fetch_data_using_loop {

	public static void main(String[] args) {

		try {
			
			// Register JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Open a connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arjit","root","8580");
			
			// Create a statement with scrollable ResultSet
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			// Execute a query
			ResultSet rs = st.executeQuery("select * from Students");
			//rs.first();

			// Display query
        	while (rs.next()) {
                
                // Retrieve by column name
                int roll = rs.getInt("Roll");
                String name = rs.getString("Name");
                String dept = rs.getString("Dept");
                String dist = rs.getString("Dist");
                String state = rs.getString("State");

                // Display values
                System.out.print("Roll: " + roll);
                System.out.print(", Name: " + name);
                System.out.print(", Department: " + dept);
                System.out.print(", Distric: " + dist);
                System.out.println(", State: " + state);

            }


		}

		catch(Exception e) {
			//System.out.println("Error");
			e.printStackTrace();
		}
  }
}
