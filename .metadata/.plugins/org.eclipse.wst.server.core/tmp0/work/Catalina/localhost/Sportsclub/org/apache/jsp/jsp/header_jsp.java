/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2015-05-20 18:19:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\t\t<title>Limfa Sports Club </title>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var image1=new Image()\r\n");
      out.write("image1.src=\"/Sportsclub/images/1.jpg\"\r\n");
      out.write("var image2=new Image()\r\n");
      out.write("image2.src=\"/Sportsclub/images/a.jpeg\"\r\n");
      out.write("var image3=new Image()\r\n");
      out.write("image3.src=\"/Sportsclub/images/b.jpeg\"\r\n");
      out.write("var image4=new Image()\r\n");
      out.write("image4.src=\"/Sportsclub/images/4.jpg\"\r\n");
      out.write("var image5=new Image()\r\n");
      out.write("image5.src=\"/Sportsclub/images/5.jpg\"\r\n");
      out.write("var image6=new Image()\r\n");
      out.write("image6.src=\"/Sportsclub/images/6.jpg\"\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\t\t<link rel=\"icon\" href=\"/Sportsclub/images/sd.ico\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/Sportsclub/css/nps.css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/Sportsclub/css/menu.css\"/>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"/Sportsclub/css/temp.css\"/>\r\n");
      out.write("\t\t<link href=\"/Sportsclub/css/templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t <div id=\"whole_data\">\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<section id=\"top_name\">\r\n");
      out.write("\t\t\t\t\t <img src=\"logo.gif\" height=150px  align=left style=\"padding-left:150px; padding-top:0px;padding-bottom:0px\" >\r\n");
      out.write("\t\t\t\t\t <img src=\"logo2.jpg \" height=150px align=right style=\"padding-right:150px; padding-top:0px;padding-bottom:0px\" >\r\n");
      out.write("\t\t\t\t\t<div Style=\" font:BOLd 40px Elephant; color:white; padding:20px\"> Limfa Sports Club</div>\r\n");
      out.write("\t\t\t\t\t  <footer><h3 style=\"color:cyan; text-aign:left\"><i>Re-Defining Sports</i></h3></footer>\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("<!--   Menu ---------------------------------------------------------------------------------->\t\t\t\t\t\r\n");
      out.write("<div id='cssmenu'>\r\n");
      out.write("<ul>\r\n");
      out.write("   <li class='active'><a href='/Sportsclub/jsp/user4.jsp'>Home</a></li>\r\n");
      out.write("   <li class='has-sub'><a href='#'><span>Facilities</span></a>\r\n");
      out.write("      <ul>\r\n");
      out.write("         <li><a href='#'><span>Kits</span></a></li>\r\n");
      out.write("         <li><a href='#'><span>Expert's help</span></a></li>\r\n");
      out.write("         <li class='last'><a href='#'><span> Cards</span></a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("   </li>\r\n");
      out.write("   <li class='has-sub'><a href='#'><span>Games</span></a>\r\n");
      out.write("      <ul>\r\n");
      out.write("         <li><a href=#><span>Cricket</span></a></li>\r\n");
      out.write("\t\t <li><a href=#><span>Hockey</span></a></li>\r\n");
      out.write("\t\t          <li><a href=#><span>Football</span></a></li>\r\n");
      out.write("         <li class='last'><a href='#'><span>Fifa fever</span></a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("   </li>\r\n");
      out.write("   <li class='has-sub'><a href='#'><span>Services</span></a>\r\n");
      out.write("      <ul>\r\n");
      out.write("         <li><a href=#><span>Tournaments</span></a></li>\r\n");
      out.write("\t\t <li><a href=#><span>Coming Tournaments</span></a></li>\r\n");
      out.write("         <li class='last'><a href='#'><span>Results</span></a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("   </li>\r\n");
      out.write("    <li class='has-sub'><a href='/Sportsclub/jsp/login.jsp'><span>Login</span></a>\r\n");
      out.write("      <ul>\r\n");
      out.write("         <li><a href=\"/Sportsclub/jsp/login.jsp\"><span>User login</span></a></li>\r\n");
      out.write("\t\t <li><a href=#><span>Coach Login</span></a></li>\r\n");
      out.write("         <li class=#><a href='#'><span>Player Login</span></a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("   </li>\r\n");
      out.write("   <li class='has-sub'><a href='#'><span>Sign Up</span></a>\r\n");
      out.write("      <ul>\r\n");
      out.write("         <li><a href=\"/Sportsclub/jsp/userlogin.jsp\"><span>as a User</span></a></li>\r\n");
      out.write("\t\t <li><a href=\"/Sportsclub/jsp/registration.jsp\"><span>as A Coach</span></a></li>\r\n");
      out.write("         <li class=#><a href='/Sportsclub/jsp/registration.jsp'><span>AS a player/expert</span></a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("   </li>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   <li class='has-sub'><a href=#><span>About us </span></a></li>\r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("   \r\n");
      out.write("   <li class='last'><a href='#'><span>Contact us</span></a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</div>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}