

<%-- 
    Document   : login
    Created on : Jan 24, 2020, 9:13:01 PM
    Author     : pc
--%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
        <style>
            
       
            
            
            
        </style>
    </head>
    <body>
        
        
 
      
        
      <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "");
                Statement stmt = con.createStatement();


               
                    String query = "select * from registration where username='" + username + "' and password='" + password + "'";
                    ResultSet rs = stmt.executeQuery(query);
                    rs = stmt.executeQuery(query);
                    if (rs.next()) {
                        session.setAttribute("id", rs.getString("id"));
                        response.sendRedirect("admin.html");
                    } else {
                        out.println("<p>Invalid Login, Try with Correct Username and Password</p>");
                    }
                

            } catch (Exception e) {
                out.println("<p>ERROR:" + e.getMessage() + "</p>");
            }


        %>
    </body>
</html>
