<%-- 
    Document   : logout
    Created on : Jan 26, 2020, 12:46:54 PM
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    session.invalidate();
    response.sendRedirect("home.jsp");

%>