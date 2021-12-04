<%-- 
    Document   : stock
    Created on : Jan 26, 2020, 9:32:20 PM
    Author     : pc
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String itemId = request.getParameter("itemId");

    String driver = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String database = "inventory";
    String userid = "root";
    String password = "";
    try {
        Class.forName(driver);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>

<html>
    <head>
        <title>Inventory Management System</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <style>
          
        </style>
    </head>
    <body>

        
        <%
            try {
                connection = DriverManager.getConnection(connectionUrl + database, userid, password);
                statement = connection.createStatement();
                String sql = "select * from item";
                resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
        %>
        <tr>
            <td><%=resultSet.getString("itemId")%></td>
            <td><%=resultSet.getString("itemName")%></td>
            <td><%=resultSet.getString("purchasePrice")%></td>
            <td><%=resultSet.getString("sellingPrice")%></td>
            <td><%=resultSet.getString("quantity")%></td>
            <td><%=resultSet.getString("category")%></td>
        </tr>
        <%
                }
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </table>

</body>
</html>

</html>
