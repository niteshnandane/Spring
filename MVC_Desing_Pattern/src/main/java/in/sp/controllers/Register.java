package in.sp.controllers;
// add apache tomcate servelet
import in.sp.dbcon.DbConnection;

import javax.crypto.spec.PSource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/regForm")
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out=resp.getWriter();
        resp.setContentType("text/html");

       String myname=req.getParameter("name1");
        String myemail=req.getParameter("email1");
        String mypass=req.getParameter("pass1");
        String mycity=req.getParameter("city1");

        try{
            Connection con= DbConnection.getConnection();
            String query="insert into register value(?,?,?,?)";
            PreparedStatement ps= con.prepareStatement(query);
            ps.setString(1,myname);
            ps.setString(2,myemail);
            ps.setString(3,mypass);
            ps.setString(4,mycity);
           int count= ps.executeUpdate();
           if(count>0){
               out.println("<h3 style='color:green'>Register Successfull </h3>");
               RequestDispatcher rd= req.getRequestDispatcher("/login.html");
               rd.include(req,resp);

           }else {
               out.println("<h3 style='color:red'>User not Register dua to some error </h3>");
               RequestDispatcher rd= req.getRequestDispatcher("/register.html");
               rd.include(req,resp);
           }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
