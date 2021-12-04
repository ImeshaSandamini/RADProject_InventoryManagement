<%-- 
    Document   : updateProcess
    Created on : Jan 27, 2020, 9:26:09 PM
    Author     : pc
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/inventory";%>
<%!String user = "root";%>
<%!String psw = "";%>
<%
            String itemId = request.getParameter("itemId");
            String itemName = request.getParameter("itemName");            
            String purchasePrice = request.getParameter("purchasePrice");
            String sellingPrice = request.getParameter("sellingPrice");
            int quantity = Integer.parseInt(request.getParameter("quantity"));
            String category = request.getParameter("category");
            
    if (itemId != null) {
        Connection con = null;
        PreparedStatement ps = null;
        int personID = Integer.parseInt(itemId);
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, user, psw);
            String sql = "Update item set itemId=?,itemName=?,purchasePrice=?,sellingPrice=?,quantity=?,category=? where itemId=" + itemId;
            ps = con.prepareStatement(sql);
            ps.setString(1, itemId);
            ps.setString(2, itemName);
            ps.setString(3, purchasePrice);
            ps.setString(4, sellingPrice);
            ps.setInt(5,quantity);
            ps.setString(6, category);
            int i = ps.executeUpdate();
            if (i > 0) {
                out.print("<h3>Record Updated Successfully</h3> <a href='productReport.jsp'>See the Stock</a>");
               
            } else {
                out.print("There is a problem in updating Record.");
            }
        } catch (SQLException sql) {
            request.setAttribute("error", sql);
            out.println(sql);
        }
    }
%>

