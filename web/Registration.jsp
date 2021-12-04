<%-- 
    Document   : karan
    Created on : Jan 24, 2020, 1:51:31 PM
    Author     : pc
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration form</title>
        <style>

        </style>
    </head>
    <body>
        
       
         <%
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String gender = request.getParameter("gender");
            String nic = request.getParameter("nic");
            String address = request.getParameter("address");
             String email = request.getParameter("email");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
           

        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "");
        Statement stmt=con.createStatement();
        String query="insert into registration(firstname,lastname,gender,nic,address,email,username,password)values('"+firstname+"','"+lastname+"','"+gender+"','"+nic+"','"+address+"','"+email+"','"+username+"','"+password+"')";
         
         int a=stmt.executeUpdate(query);
        if(a!=0){
            out.println("<b>Registration successfully");
             response.sendRedirect("login.html");
        }
        
        }
        catch(Exception e){
        out.println("<a href='register.html>Try again</a>");
}
        
      %>  
        
 
           </body>
</html>
