import java.sql.*;

class db_update_using_preparedStatement {
	
	public static void main(String[] args) {
		
		try {

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/arjit", "postgres", "8580");
			PreparedStatement st = con.prepareStatement("insert into student values (?, ?, ?, ?)");
			
			st.setInt(1, 26);
			st.setString(2, "Prerna");
			st.setString(3, "MCA");
			st.setString(4, "Danapur");


			st.execute();

			con.close();
		} 
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
