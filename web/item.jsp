<%-- 
    Document   : item
    Created on : Jan 26, 2020, 9:22:36 PM
    Author     : pc
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         

        <%
            String itemId = request.getParameter("itemId");
            String itemName = request.getParameter("itemName");            
            String purchasePrice = request.getParameter("purchasePrice");
            String sellingPrice = request.getParameter("sellingPrice");
            int quantity = Integer.parseInt(request.getParameter("quantity"));
            String category = request.getParameter("category");

         try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory", "root", "");
                Statement stmt=con.createStatement();
                String query="insert into item(itemId,itemName,purchasePrice,sellingPrice,quantity,category)values('"+itemId+"','"+itemName+"','"+purchasePrice+"','"+sellingPrice+"',"+quantity+",'"+category+"')";
                int a=stmt.executeUpdate(query);
                
                if(a>0){
                    out.println("<p> Successfully Entered the items.See Available Items <a href='productReport.jsp'>Here</a></p>");
                    
                }
                
                
                
            } catch (Exception e) {
                out.println("<p> ERROR: "+e.getMessage()+"</p>");
            }

        %>
            
            
       
     
    </body>
</html>
