import java.sql.*;

class db_update_city_data {
	
	public static void main(String[] args) {
		
		try {

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/arjit", "postgres", "8580");
			Statement st = con.createStatement();
			st.execute("update student set city = 'Durgapur' where roll = 16 ");
			// st.execute("delete from student where roll=31");		// for delete the data from table


			con.close();
		} 
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
