import java.sql.*;

class db_read_all_row_data {
	
	public static void main(String[] args) {
		
		try {

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/arjit", "postgres", "8580");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student");

			while(rs.next()) {
				System.out.print(rs.getInt(1) +" ");
            	System.out.print(rs.getString(2) +" ");
            	System.out.print(rs.getString(3) +" ");
            	System.out.println(rs.getString(4));
			}

			con.close();
		} 
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}


/*
OUTPUT:

7 Arjit MCA Dhanbad                                         
2 Abhishek MCA Dhanbad
11 Binit BCA Durgapur
51 Tanmay BCA Muchipara 
41 Shiltu BCA Bakura
*/