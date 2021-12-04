package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class productReport_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <head>\n");
      out.write("        <title>Inventory Management System</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            table {\n");
      out.write("                font-family: arial, sans-serif;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            td, th {\n");
      out.write("                border: 1px solid #dddddd;\n");
      out.write("                text-align: left;\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            tr:nth-child(even) {\n");
      out.write("                background-color: #dddddd;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("                  body{\n");
      out.write("padding: 15px 15px;\n");
      out.write("background-color:lightblue;\n");
      out.write("background-image :linear-gradient(rgba(0,0,0,0.2),rgba(0,0,0,0.2)),url(kar.jpg);\n");
      out.write("}\n");
      out.write("\n");
      out.write("      .topnav{\n");
      out.write("float:right;\n");
      out.write("list-style:none;\n");
      out.write("margin-top:30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav li{\n");
      out.write("display:inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav li a{\n");
      out.write("color:white;\n");
      out.write("text-decoration:none;\n");
      out.write("padding:5px 20px;\n");
      out.write("font-family:\"Roboto\",sans-serif;\n");
      out.write("font-size:15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav li.active a{\n");
      out.write("border:2px solid white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav li a:hover{\n");
      out.write("border:2px solid white;\n");
      out.write("}\n");
      out.write(".footer {\n");
      out.write("    position:absolute;\n");
      out.write("    bottom: 0;\n");
      out.write("    width: 100%;\n");
      out.write("    height :25px;\n");
      out.write("    text-align : center ;\n");
      out.write("    background-color: #20b2aa;\n");
      out.write("\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        \n");
      out.write("                      <div class=\"row\">\n");
      out.write("<ul class=\"topnav\">\n");
      out.write("  <li><a href=\"admin.html\">HOME</a></li>\n");
      out.write("  <li><a href=\"item.html\">ADD ITEM</a></li>\n");
      out.write("  <li><a href=\"about.html\">ABOUT US</a></li>\n");
      out.write("  \n");
      out.write("  <li><a href=\"logout.jsp\">LOG OUT</a></li>\n");
      out.write(" \n");
      out.write("  </ul>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <h2>Product Report</h2>\n");
      out.write("\n");
      out.write("        <table>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <th>Item ID</th>\n");
      out.write("                <th>Item Name</th>\n");
      out.write("                <th>Purchase Price</th>\n");
      out.write("                <th>Selling Price</th>\n");
      out.write("                <th>Quantity</th>\n");
      out.write("                <th>Category</th>\n");
      out.write("                <th>Action</th>\n");
      out.write("            </tr>\n");
      out.write("        ");

            try {
                connection = DriverManager.getConnection(connectionUrl + database, userid, password);
                statement = connection.createStatement();
                String sql = "select * from item";
                resultSet = statement.executeQuery(sql);
                int i=0;  
                while (resultSet.next()) {                                 
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(resultSet.getString("itemId"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("itemName"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("purchasePrice"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("sellingPrice"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("quantity"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("category"));
      out.write("</td>\n");
      out.write("            <td><a href=\"delete.jsp?itemId=");
      out.print(resultSet.getString("itemId") );
      out.write("\"><button type=\"button\" class=\"delete\">Delete</button></a>\n");
      out.write("                \n");
      out.write("                <a href=\"update.jsp?itemId=");
      out.print(resultSet.getString("itemId"));
      out.write("\">Update</a>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        ");

                }
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        
      out.write("\n");
      out.write("    </table>\n");
      out.write("        <div class=\"footer  col-12\">\n");
      out.write("\n");
      out.write("            © Copyright 2020. All rights reserved.\n");
      out.write("        </div>  \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
