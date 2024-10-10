import DBConnection.PostgreSqlDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static DBConnection.PostgreSqlDB.con;


public class packDB_read_all_row_data {
    public static void main(String[] args) throws SQLException {
        PostgreSqlDB.getConnection();

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from from student");
        
        while (rs.next()) {
            System.out.print(rs.getInt(1) +" ");
            System.out.print(rs.getString(2) +" ");
            System.out.print(rs.getString(3) +" ");
            System.out.println(rs.getString(4));

        }

        con.close();
    }
}