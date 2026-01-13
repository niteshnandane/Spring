package in.sp.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc_db,root,2000@nitesh");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return con;
    }
}
