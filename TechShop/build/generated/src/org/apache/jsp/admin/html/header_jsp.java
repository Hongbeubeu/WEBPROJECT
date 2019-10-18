package org.apache.jsp.admin.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("    <!-- Preloader - style you can find in spinners.css -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <div class=\"preloader\">\n");
      out.write("        <div class=\"loader\">\n");
      out.write("            <div class=\"loader__figure\"></div>\n");
      out.write("            <p class=\"loader__label\">Admin Wrap</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- Main wrapper - style you can find in pages.scss -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <div id=\"main-wrapper\">\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- Topbar header - style you can find in pages.scss -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <header class=\"topbar\">\n");
      out.write("            <nav class=\"navbar top-navbar navbar-expand-md navbar-light\">\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- Logo -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"dashboard.jsp\">\n");
      out.write("                        <!-- Logo icon --><b>\n");
      out.write("                            <!--You can put here icon as well // <i class=\"wi wi-sunset\"></i> //-->\n");
      out.write("                            <!-- Dark Logo icon -->\n");
      out.write("                            <img src=\"../assets/images/logo-icon.png\" alt=\"homepage\" class=\"dark-logo\" />\n");
      out.write("                            <!-- Light Logo icon -->\n");
      out.write("                            <img src=\"../assets/images/logo-light-icon.png\" alt=\"homepage\" class=\"light-logo\" />\n");
      out.write("                        </b>\n");
      out.write("                        <!--End Logo icon -->\n");
      out.write("                        <!-- Logo text --><span>\n");
      out.write("                         <!-- dark Logo text -->\n");
      out.write("                         <img src=\"../assets/images/logo-text.png\" alt=\"homepage\" class=\"dark-logo\" />\n");
      out.write("                         <!-- Light Logo text -->    \n");
      out.write("                         <img src=\"../assets/images/logo-light-text.png\" class=\"light-logo\" alt=\"homepage\" /></span> </a>\n");
      out.write("                </div>\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- End Logo -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <div class=\"navbar-collapse\">\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("                    <!-- toggle and nav items -->\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item\"> <a class=\"nav-link nav-toggler hidden-md-up waves-effect waves-dark\" href=\"javascript:void(0)\"><i class=\"fa fa-bars\"></i></a> </li>\n");
      out.write("                        <!-- ============================================================== -->\n");
      out.write("                        <!-- Search -->\n");
      out.write("                        <!-- ============================================================== -->\n");
      out.write("                        <li class=\"nav-item hidden-xs-down search-box\"> <a class=\"nav-link hidden-sm-down waves-effect waves-dark\" href=\"javascript:void(0)\"><i class=\"fa fa-search\"></i></a>\n");
      out.write("                            <form class=\"app-search\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Search & enter\"> <a class=\"srh-btn\"><i class=\"fa fa-times\"></i></a></form>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("                    <!-- User profile and search -->\n");
      out.write("                    <!-- ============================================================== -->\n");
      out.write("                    <ul class=\"navbar-nav my-lg-0\">\n");
      out.write("                        <!-- ============================================================== -->\n");
      out.write("                        <!-- Profile -->\n");
      out.write("                        <!-- ============================================================== -->\n");
      out.write("                        <li class=\"nav-item dropdown u-pro\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle waves-effect waves-dark profile-pic\" href=\"\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"><img src=\"../assets/images/users/5.jpg\" alt=\"user\" class=\"\" /> <span class=\"hidden-md-down\">Hồng Bêu &nbsp;</span> </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
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
