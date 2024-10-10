import java.sql.*;

class db_update_insert_data {
	
	public static void main(String[] args) {
		
		try {

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/arjit", "postgres", "8580");
			Statement st = con.createStatement();
			boolean s = st.execute("insert into student values (16, 'Madhu', 'MCA', 'Patna')");

			con.close();
		} 
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
