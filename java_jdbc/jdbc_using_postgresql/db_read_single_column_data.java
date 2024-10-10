import java.sql.*;

class db_read_single_column_data {
	
	public static void main(String[] args) throws Exception{
		
		try {

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/arjit", "postgres", "8580");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student where roll = 7");
			rs.next();

			int roll = rs.getInt(1);
			String name = rs.getString(2);
        	String dept = rs.getString(3);
        	String city = rs.getString(4);

        	System.out.println("Name: " +name +" Dept: " +dept +" City: " +city);

			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}


// Name: Arjit Dept: MCA City: Dhanbad	