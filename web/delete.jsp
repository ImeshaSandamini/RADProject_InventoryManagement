<%-- 
    Document   : delete
    Created on : Jan 27, 2020, 9:18:39 PM
    Author     : pc
--%>



<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String itemId = request.getParameter("itemId");
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "");
        Statement st = con.createStatement();
        String query = "delete from item where itemId= '" + itemId + "'";
        int i = st.executeUpdate(query);
        if (i != 0) {
            out.println("Data Deleted Successfully!");
            response.sendRedirect("productReport.jsp");
        } else {
            out.println("<h1>Error while Delete</h1>");
        }
    } catch (Exception e) {
        out.println(e.getMessage());
    }
%>
