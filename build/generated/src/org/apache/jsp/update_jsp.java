package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;

      out.write('\n');

    try {
        con = DriverManager.getConnection(connectionUrl + database, userid, password);
        statement = con.createStatement();
        String sql = "select * from item where itemId=" + itemId;
        resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("            <title>Update</title>\n");
      out.write("            <meta charset=\"UTF-8\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("            <style>\n");
      out.write("\n");
      out.write("                         body{\n");
      out.write("\n");
      out.write("background-image:linear-gradient(rgba(0,0,0,0.2),rgba(0,0,0,0.2)),url(kar.jpg);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("                .login input[type=\"text\"]\n");
      out.write("                {\n");
      out.write("                    width:330px;\n");
      out.write("                    padding: 10px 10px;\n");
      out.write("                    margin: 8px 1px;\n");
      out.write("                    border-bottom:1px solid #fff;\n");
      out.write("                    background:transparent;\n");
      out.write("                    outline:none;\n");
      out.write("                    height:10px;\n");
      out.write("                    color:white;\n");
      out.write("                    font-size:16px;\n");
      out.write("                    border-radius:20px;\n");
      out.write("\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                h1{\n");
      out.write("                    color:green;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                .login input[type=\"submit\"]\n");
      out.write("                {\n");
      out.write("\n");
      out.write("                    outline:none;\n");
      out.write("                    height:30px;\n");
      out.write("                    background:#fb2525;\n");
      out.write("                    color:#fff;\n");
      out.write("                    font-size:18px;\n");
      out.write("                    border-radius:20px;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                .login input[type=\"text\"]\n");
      out.write("                {\n");
      out.write("                    width:438px;\n");
      out.write("                    padding: 8px 8px;\n");
      out.write("                    margin: 8px 1px;\n");
      out.write("                    border-bottom:1px solid #fff;\n");
      out.write("                    background:transparent;\n");
      out.write("                    outline:none;\n");
      out.write("                    height:10px;\n");
      out.write("                    color:white;\n");
      out.write("                    font-size:16px;\n");
      out.write("                    border-radius:20px;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .login input[type=\"password\"]\n");
      out.write("                {\n");
      out.write("                    width:438px;\n");
      out.write("                    padding: 8px 8px;\n");
      out.write("                    margin: 8px 1px;\n");
      out.write("                    border-bottom:1px solid #fff;\n");
      out.write("                    background:transparent;\n");
      out.write("                    outline:none;\n");
      out.write("                    height:10px;\n");
      out.write("                    color:white;\n");
      out.write("                    font-size:16px;\n");
      out.write("                    border-radius:20px;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                .login input[type=\"number\"]\n");
      out.write("                {\n");
      out.write("                    width:438px;\n");
      out.write("                    padding: 8px 8px;\n");
      out.write("                    margin: 8px 1px;\n");
      out.write("                    border-bottom:1px solid #fff;\n");
      out.write("                    background:transparent;\n");
      out.write("                    outline:none;\n");
      out.write("                    height:10px;\n");
      out.write("                    color:white;\n");
      out.write("                    font-size:16px;\n");
      out.write("                    border-radius:20px;\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                .login{\n");
      out.write("                    width:600px;\n");
      out.write("                    height:450px;\n");
      out.write("                    background:rgba(0,0,0,0.7);\n");
      out.write("                    color:#fff;\n");
      out.write("                    top:55%;\n");
      out.write("                    left:50%; \n");
      out.write("                    position:absolute;\n");
      out.write("                    transform:translate(-50%,-50%);\n");
      out.write("                    box-sizing:border-box;\n");
      out.write("                    padding:70px 30px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("                .topnav{\n");
      out.write("                    float:right;\n");
      out.write("                    list-style:none;\n");
      out.write("                    margin-top:30px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .topnav li{\n");
      out.write("                    display:inline-block;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .topnav li a{\n");
      out.write("                    color:white;\n");
      out.write("                    text-decoration:none;\n");
      out.write("                    padding:5px 20px;\n");
      out.write("                    font-family:\"Roboto\",sans-serif;\n");
      out.write("                    font-size:15px;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .topnav li.active a{\n");
      out.write("                    border:2px solid white;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .topnav li a:hover{\n");
      out.write("                    border:2px solid white;\n");
      out.write("                }      \n");
      out.write("\n");
      out.write("            </style>\n");
      out.write("        </head>\n");
      out.write("        <body> \n");
      out.write("            \n");
      out.write("                           <div class=\"row\">\n");
      out.write("<ul class=\"topnav\">\n");
      out.write("  <li><a href=\"home.jsp\">HOME</a></li>\n");
      out.write("  <li><a href=\"item.html\">ADD ITEM</a></li>\n");
      out.write("  <li><a href=\"productReport.jsp\">STOCK BALANCE</a></li>\n");
      out.write("  <li><a href=\"about.html\">ABOUT US</a></li>\n");
      out.write("  <li><a href=\"logout.jsp\">LOG OUT</a></li>\n");
      out.write(" \n");
      out.write("  </ul>\n");
      out.write("</div>\n");
      out.write("                <div class=\"login\">\n");
      out.write("                    <form name=\"form2\" action=\"updateProcess.jsp\" method=\"POST\">\n");
      out.write("                        \n");
      out.write("                <input type=\"hidden\" name=\"id\" value=\"");
      out.print(resultSet.getString("itemId"));
      out.write("\">\n");
      out.write("                <input type=\"text\" name=\"id\" value=\"");
      out.print(resultSet.getString("itemId"));
      out.write("\">\n");
      out.write("                        <table border=\"0\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Item Id</td>\n");
      out.write("                                <td><input type=\"text\" name=\"itemId\" value=\"\" placeholder=\"Item ID\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Item Name</td>\n");
      out.write("                                <td><input type=\"text\" name=\"itemName\" value=\"\" placeholder=\"Item Name\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Purchasing Price</td>\n");
      out.write("                                <td><input type=\"text\" name=\"purchasePrice\" value=\"\" placeholder=\"Purchasing  Price\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Selling Price</td>\n");
      out.write("                                <td><input type=\"text\" name=\"sellingPrice\" value=\"\" placeholder=\"Selling  Price\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Quantity</td>\n");
      out.write("                                <td><input type=\"number\" name=\"quantity\" value=\"\" placeholder=\"Quantity\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Category</td>\n");
      out.write("                                <td><input type=\"text\" name=\"category\" value=\"\" placeholder=\"Category\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td style=\"text-align: right\"><input type=\"submit\" value=\"Update\" name=\"btn1\" /></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                        ");

                        }
                        con.close();
                        } catch (Exception e) {
                        e.printStackTrace();
                        }
                        
      out.write("\n");
      out.write("                        </body>\n");
      out.write("                        </html>\n");
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
