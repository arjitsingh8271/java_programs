import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

class java_db_insert_data {

    public static void main(String[] args) {

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Open a connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arjit", "root", "8580");
            
            // Create a statement
            Statement st = con.createStatement();
            
            // Execute an insert query
            //String sql = "insert into Students values (7, 'Arjit', 'MCA', 'Dhanbad', 'Jharkhand')";
			//int rowsInserted = st.executeUpdate(sql);

			int rowsInserted = st.executeUpdate("insert into Students values (7, 'Arjit', 'MCA', 'Dhanbad', 'Jharkhand')");


            // Check if the insertion was successful
            if (rowsInserted > 0) {
                System.out.println("A new student was inserted successfully!");
            }

            // Close resources
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
