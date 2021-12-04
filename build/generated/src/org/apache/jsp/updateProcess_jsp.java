package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class updateProcess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/inventory";
String user = "root";
String psw = "";
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
      out.write("<!DOCTYPE html>\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

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
                out.print("<h3>Record Updated Successfully</h3> <a href='stock.jsp'>See the Stock</a>");
               
            } else {
                out.print("There is a problem in updating Record.");
            }
        } catch (SQLException sql) {
            request.setAttribute("error", sql);
            out.println(sql);
        }
    }

      out.write('\n');
      out.write('\n');
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
