package org.apache.jsp.admin.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <!-- Favicon icon -->\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"../assets/images/favicon.png\">\n");
      out.write("    <title>PROFILE</title>\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"../assets/node_modules/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"../assets/node_modules/perfect-scrollbar/css/perfect-scrollbar.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- This page CSS -->\n");
      out.write("    <!-- chartist CSS -->\n");
      out.write("    <link href=\"../assets/node_modules/morrisjs/morris.css\" rel=\"stylesheet\">\n");
      out.write("    <!--c3 CSS -->\n");
      out.write("    <link href=\"../assets/node_modules/c3-master/c3.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Dashboard 1 Page CSS -->\n");
      out.write("    <link href=\"css/pages/dashboard1.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- You can change the theme colors from here -->\n");
      out.write("    <link href=\"css/colors/default.css\" id=\"theme\" rel=\"stylesheet\">\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("    <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"page-wrapper\">\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <!-- Container fluid  -->\n");
      out.write("            <!-- ============================================================== -->\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- Bread crumb and right sidebar toggle -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <div class=\"row page-titles\">\n");
      out.write("                    <div class=\"col-md-5 align-self-center\">\n");
      out.write("                        <h3 class=\"text-themecolor\">Profile</h3>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"javascript:void(0)\">Home</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item active\">Profile</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-7 align-self-center\">\n");
      out.write("                        <a href=\"https://wrappixel.com/templates/adminwrap/\" class=\"btn waves-effect waves-light btn btn-info pull-right hidden-sm-down\"> Upgrade to Pro</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- End Bread crumb and right sidebar toggle -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- Start Page Content -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- Row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- Column -->\n");
      out.write("                    <div class=\"col-lg-4 col-xlg-3 col-md-5\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <center class=\"m-t-30\"> <img src=\"../assets/images/users/5.jpg\" class=\"img-circle\" width=\"150\" />\n");
      out.write("                                    <h4 class=\"card-title m-t-10\">Hanna Gover</h4>\n");
      out.write("                                    <h6 class=\"card-subtitle\">Accoubts Manager Amix corp</h6>\n");
      out.write("                                    <div class=\"row text-center justify-content-md-center\">\n");
      out.write("                                        <div class=\"col-4\"><a href=\"javascript:void(0)\" class=\"link\"><i class=\"icon-people\"></i> <font class=\"font-medium\">254</font></a></div>\n");
      out.write("                                        <div class=\"col-4\"><a href=\"javascript:void(0)\" class=\"link\"><i class=\"icon-picture\"></i> <font class=\"font-medium\">54</font></a></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </center>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Column -->\n");
      out.write("                    <!-- Column -->\n");
      out.write("                    <div class=\"col-lg-8 col-xlg-9 col-md-7\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <!-- Tab panes -->\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <form class=\"form-horizontal form-material\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-12\">Full Name</label>\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <input type=\"text\" placeholder=\"Johnathan Doe\" class=\"form-control form-control-line\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"example-email\" class=\"col-md-12\">Email</label>\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <input type=\"email\" placeholder=\"johnathan@admin.com\" class=\"form-control form-control-line\" name=\"example-email\" id=\"example-email\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-12\">Password</label>\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <input type=\"password\" value=\"password\" class=\"form-control form-control-line\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-12\">Phone No</label>\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <input type=\"text\" placeholder=\"123 456 7890\" class=\"form-control form-control-line\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-md-12\">Message</label>\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <textarea rows=\"5\" class=\"form-control form-control-line\"></textarea>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"col-sm-12\">Select Country</label>\n");
      out.write("                                        <div class=\"col-sm-12\">\n");
      out.write("                                            <select class=\"form-control form-control-line\">\n");
      out.write("                                                <option>London</option>\n");
      out.write("                                                <option>India</option>\n");
      out.write("                                                <option>Usa</option>\n");
      out.write("                                                <option>Canada</option>\n");
      out.write("                                                <option>Thailand</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"col-sm-12\">\n");
      out.write("                                            <button class=\"btn btn-success\">Update Profile</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Column -->\n");
      out.write("                </div>\n");
      out.write("                <!-- Row -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- End PAge Content -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
