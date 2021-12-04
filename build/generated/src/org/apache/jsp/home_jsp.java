package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <style>\n");
      out.write("          body{\n");
      out.write("background-image :linear-gradient(rgba(0,0,0,0.2),rgba(0,0,0,0.2)),url(oo.jpg);\n");
      out.write("}\n");
      out.write("\n");
      out.write("      .topnav{\n");
      out.write("float:right;\n");
      out.write("list-style:none;\n");
      out.write("margin-top:30px;\n");
      out.write("}\n");
      out.write("\n");
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
      out.write("}  \n");
      out.write(".heading{\n");
      out.write("    \n");
      out.write("    color: white;\n");
      out.write("    font-size: 70px;\n");
      out.write("    top:80%;\n");
      out.write("\tleft:50%;       \n");
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
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("<ul class=\"topnav\">\n");
      out.write("  <li><a href=\"home.jsp\">HOME</a></li>\n");
      out.write("  <lI><a href=\"Registration.html\">REGISTRATION</a></li>\n");
      out.write("  <li><a href=\"about.html\">ABOUT US</a></li>\n");
      out.write("  <li><a href=\"login.html\">LOGIN</a></li>\n");
      out.write("  </ul>\n");
      out.write("</div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br><br><br><br>\n");
      out.write("        <div class=\"heading\">\n");
      out.write("        INVENTORY MANAGEMENT<br> SYSTEM\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <div class=\"footer  col-12\">\n");
      out.write("\n");
      out.write("            © Copyright 2020. All rights reserved.\n");
      out.write("        </div>          \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
