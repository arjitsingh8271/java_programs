import MyPackages.DBConnection.PostgreSqlDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static MyPackages.DBConnection.PostgreSqlDB.connection;


public class packDB_fetch_single_column_data {
    public static void main(String[] args) throws SQLException {
        PostgreSqlDB.getConnection();

        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select name, dept, city from student where roll=7");
        rs.next();

        String name = rs.getString(1);
        String dept = rs.getString(2);
        String city = rs.getString(3);

        System.out.println("Name: " +name +" Dept: " +dept +" City: " +city);

        connection.close();
    }
}