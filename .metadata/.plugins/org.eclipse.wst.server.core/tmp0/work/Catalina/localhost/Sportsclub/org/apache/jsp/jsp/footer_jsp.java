/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2015-05-20 18:19:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div id=\"templatemo_bottom_wrapper\">\r\n");
      out.write("\t<div id=\"templatemo_bottom\">\r\n");
      out.write("    \t<div class=\"col one_fourth\">\r\n");
      out.write("            <h4>About Club..</h4>\r\n");
      out.write("          \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("    \t<div class=\"col one_fourth\">\r\n");
      out.write("            <h4>Photo Gallery</h4>\r\n");
      out.write("            <ul class=\"footer_gallery\">\r\n");
      out.write("            \t<li><a href=\"images/templatemo_image_06_l.jpg\"  rel=\"lightbox[portfolio]\"><img src=\"/Sportsclub/images/10.jpg\" alt=\"image 6\" /></a></li>\r\n");
      out.write("                <li><a href=\"images/templatemo_image_07_l.jpg\"  rel=\"lightbox[portfolio]\"><img src=\"images/templatemo_image_07.jpg\" alt=\"image 7\" /></a></li>\r\n");
      out.write("                <li><a href=\"images/templatemo_image_08_l.jpg\"  rel=\"lightbox[portfolio]\"><img src=\"images/templatemo_image_08.jpg\" alt=\"image 8\" /></a></li>\r\n");
      out.write("                <li><a href=\"images/templatemo_image_09_l.jpg\"  rel=\"lightbox[portfolio]\"><img src=\"images/templatemo_image_09.jpg\" alt=\"image 9\" /></a></li>\r\n");
      out.write("                <li><a href=\"images/templatemo_image_10_l.jpg\"  rel=\"lightbox[portfolio]\"><img src=\"images/templatemo_image_10.jpg\" alt=\"image 10\" /></a></li>\r\n");
      out.write("                <li><a href=\"images/templatemo_image_11_l.jpg\"  rel=\"lightbox[portfolio]\"><img src=\"images/templatemo_image_11.jpg\" alt=\"image 11\" /></a></li>\r\n");
      out.write("                <li><a href=\"images/templatemo_image_12_l.jpg\"  rel=\"lightbox[portfolio]\"><img src=\"images/templatemo_image_12.jpg\" alt=\"image 12\" /></a></li>\r\n");
      out.write("                <li><a href=\"images/templatemo_image_13_l.jpg\"  rel=\"lightbox[portfolio]\"><img src=\"images/templatemo_image_13.jpg\" alt=\"image 13\" /></a></li>\r\n");
      out.write("                <li><a href=\"images/templatemo_image_14_l.jpg\"  rel=\"lightbox[portfolio]\"><img src=\"images/templatemo_image_14.jpg\" alt=\"image 14\" /></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <div class=\"clear\"></div>\r\n");
      out.write("            <a href=\"#\" class=\"more\">more</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t\r\n");
      out.write("    \t<div class=\"col one_fourth\">\r\n");
      out.write("    \t<h4>Recent <a href=\"#\"   class=\"recent_post\" target=\"_blank\">Posts</a></h4>\r\n");
      out.write("        <ul class=\"no_bullet\">\r\n");
      out.write("            <li>\r\n");
      out.write("                <span class=\"header\"><a href=\"#\">Sachin Tendulkar</a></span>\r\n");
      out.write("                <i>I am Glad to be part of such a Prestigious Club... </i>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <span class=\"header\"><a href=\"#\"><strong>CLUB</strong> </a></span>\r\n");
      out.write("                <i>We are happy to celebrate first 1000 players joining in club.</i>\r\n");
      out.write("            </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                <span class=\"header\"><a href=\"#\">New York Times...</a></span>\r\n");
      out.write("               <i>One of World's Best Leading SportsClub</i>......\r\n");
      out.write("            </li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("\t\t\r\n");
      out.write("    </div><!-- END of templatemo_bottom -->\r\n");
      out.write("    </div><!-- END of templatemo_bottom_wrapper -->\t\t\r\n");
      out.write("\t\t\t\t<div id=\"templatemo_footer_wrapper\">\r\n");
      out.write("    <div id=\"templatemo_footer\" style=\"text-align:right\"><h6>\r\n");
      out.write("    \t<p>Copyright 2014 <a href=\"https://www.facebook.com/prashant.singh.501151\"><i>SportsClub</i> </a></br> <br>\r\n");
      out.write("        \tAll rights reserved by<a rel=\"nofollow\" href=\"http://www.thakurprashantsingh.webs.com\">Club Administator</a>  </p></h6>\r\n");
      out.write("    </div><!-- END of templatemo_footer -->\r\n");
      out.write("</div><!-- END of templatemo_footer_wrapper -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</html>");
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