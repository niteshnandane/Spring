package in.sp.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    public static Connection getConnection(){
        Connection con=null;
        try{
            String url="jdbc:mysql://localhost:3306/mvc_db";
            String username="root";
            String password="2000@nitesh";

            Class.forName("com.mysql.cj.jdbc.Driver");
             con= DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return con;
    }
}
