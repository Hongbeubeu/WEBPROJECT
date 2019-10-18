package org.apache.jsp.admin.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class table_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <!-- Favicon icon -->\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"../assets/images/favicon.png\">\n");
      out.write("        <title>MEMBER</title>\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"../assets/node_modules/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- You can change the theme colors from here -->\n");
      out.write("        <link href=\"css/colors/default.css\" id=\"theme\" rel=\"stylesheet\">\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("        <aside class=\"left-sidebar\">\n");
      out.write("            <!-- Sidebar scroll-->\n");
      out.write("            <div class=\"scroll-sidebar\">\n");
      out.write("                <!-- Sidebar navigation-->\n");
      out.write("                <nav class=\"sidebar-nav\">\n");
      out.write("                    <ul id=\"sidebarnav\">\n");
      out.write("                        <li> <a class=\"waves-effect waves-dark\" href=\"index.html\" aria-expanded=\"false\"><i class=\"fa fa-tachometer\"></i><span class=\"hide-menu\">Dashboard</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li> <a class=\"waves-effect waves-dark\" href=\"pages-profile.html\" aria-expanded=\"false\"><i class=\"fa fa-user-circle-o\"></i><span class=\"hide-menu\">Profile</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li> <a class=\"waves-effect waves-dark\" href=\"table-basic.html\" aria-expanded=\"false\"><i class=\"fa fa-table\"></i><span class=\"hide-menu\">Tables</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li> <a class=\"waves-effect waves-dark\" href=\"icon-fontawesome.html\" aria-expanded=\"false\"><i class=\"fa fa-smile-o\"></i><span class=\"hide-menu\">Icons</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li> <a class=\"waves-effect waves-dark\" href=\"map-google.html\" aria-expanded=\"false\"><i class=\"fa fa-globe\"></i><span class=\"hide-menu\">Map</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li> <a class=\"waves-effect waves-dark\" href=\"pages-blank.html\" aria-expanded=\"false\"><i class=\"fa fa-bookmark-o\"></i><span class=\"hide-menu\">Blank</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li> <a class=\"waves-effect waves-dark\" href=\"pages-error-404.html\" aria-expanded=\"false\"><i class=\"fa fa-question-circle\"></i><span class=\"hide-menu\">404</span></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"text-center m-t-30\">\n");
      out.write("                        <a href=\"https://wrappixel.com/templates/adminwrap/\" class=\"btn waves-effect waves-light btn-info hidden-md-down\"> Upgrade to Pro</a>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                <!-- End Sidebar navigation -->\n");
      out.write("            </div>\n");
      out.write("            <!-- End Sidebar scroll-->\n");
      out.write("        </aside>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- End Left Sidebar - style you can find in sidebar.scss  -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- Page wrapper  -->\n");
      out.write("        <!-- ============================================================== -->\n");
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
      out.write("                        <h3 class=\"text-themecolor\">Table Basic</h3>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"javascript:void(0)\">Home</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item active\">Table Basic</li>\n");
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
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- column -->\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\">Basic Table</h4>\n");
      out.write("                                <h6 class=\"card-subtitle\">Add class <code>.table</code></h6>\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    <table class=\"table\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>#</th>\n");
      out.write("                                                <th>First Name</th>\n");
      out.write("                                                <th>Last Name</th>\n");
      out.write("                                                <th>Username</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>1</td>\n");
      out.write("                                                <td>Deshmukh</td>\n");
      out.write("                                                <td>Prohaska</td>\n");
      out.write("                                                <td>@Genelia</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>2</td>\n");
      out.write("                                                <td>Deshmukh</td>\n");
      out.write("                                                <td>Gaylord</td>\n");
      out.write("                                                <td>@Ritesh</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>3</td>\n");
      out.write("                                                <td>Sanghani</td>\n");
      out.write("                                                <td>Gusikowski</td>\n");
      out.write("                                                <td>@Govinda</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>4</td>\n");
      out.write("                                                <td>Roshan</td>\n");
      out.write("                                                <td>Rogahn</td>\n");
      out.write("                                                <td>@Hritik</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>5</td>\n");
      out.write("                                                <td>Joshi</td>\n");
      out.write("                                                <td>Hickle</td>\n");
      out.write("                                                <td>@Maruti</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>6</td>\n");
      out.write("                                                <td>Nigam</td>\n");
      out.write("                                                <td>Eichmann</td>\n");
      out.write("                                                <td>@Sonu</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("                <!-- End PAge Content -->\n");
      out.write("                <!-- ============================================================== -->\n");
      out.write("            </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
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
