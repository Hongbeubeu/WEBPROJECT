package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Contact</title>\n");
      out.write("        <meta name=\"description\" content=\"OneTech shop project\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/bootstrap4/bootstrap.min.css\">\n");
      out.write("        <link href=\"plugins/fontawesome-free-5.0.1/css/fontawesome-all.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/contact_styles.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles/contact_responsive.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <!-- Contact Info -->\n");
      out.write("\n");
      out.write("            <div class=\"contact_info\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-10 offset-lg-1\">\n");
      out.write("                            <div class=\"contact_info_container d-flex flex-lg-row flex-column justify-content-between align-items-between\">\n");
      out.write("\n");
      out.write("                                <!-- Contact Item -->\n");
      out.write("                                <div class=\"contact_info_item d-flex flex-row align-items-center justify-content-start\">\n");
      out.write("                                    <div class=\"contact_info_image\"><img src=\"images/contact_1.png\" alt=\"\"></div>\n");
      out.write("                                    <div class=\"contact_info_content\">\n");
      out.write("                                        <div class=\"contact_info_title\">Phone</div>\n");
      out.write("                                        <div class=\"contact_info_text\">+38 068 005 3570</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Contact Item -->\n");
      out.write("                                <div class=\"contact_info_item d-flex flex-row align-items-center justify-content-start\">\n");
      out.write("                                    <div class=\"contact_info_image\"><img src=\"images/contact_2.png\" alt=\"\"></div>\n");
      out.write("                                    <div class=\"contact_info_content\">\n");
      out.write("                                        <div class=\"contact_info_title\">Email</div>\n");
      out.write("                                        <div class=\"contact_info_text\">fastsales@gmail.com</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <!-- Contact Item -->\n");
      out.write("                                <div class=\"contact_info_item d-flex flex-row align-items-center justify-content-start\">\n");
      out.write("                                    <div class=\"contact_info_image\"><img src=\"images/contact_3.png\" alt=\"\"></div>\n");
      out.write("                                    <div class=\"contact_info_content\">\n");
      out.write("                                        <div class=\"contact_info_title\">Address</div>\n");
      out.write("                                        <div class=\"contact_info_text\">10 Suffolk at Soho, London, UK</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Contact Form -->\n");
      out.write("\n");
      out.write("            <div class=\"contact_form\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-10 offset-lg-1\">\n");
      out.write("                            <div class=\"contact_form_container\">\n");
      out.write("                                <div class=\"contact_form_title\">Get in Touch</div>\n");
      out.write("\n");
      out.write("                                <form action=\"#\" id=\"contact_form\">\n");
      out.write("                                    <div class=\"contact_form_inputs d-flex flex-md-row flex-column justify-content-between align-items-between\">\n");
      out.write("                                        <input type=\"text\" id=\"contact_form_name\" class=\"contact_form_name input_field\" placeholder=\"Your name\" required=\"required\" data-error=\"Name is required.\">\n");
      out.write("                                        <input type=\"text\" id=\"contact_form_email\" class=\"contact_form_email input_field\" placeholder=\"Your email\" required=\"required\" data-error=\"Email is required.\">\n");
      out.write("                                        <input type=\"text\" id=\"contact_form_phone\" class=\"contact_form_phone input_field\" placeholder=\"Your phone number\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"contact_form_text\">\n");
      out.write("                                        <textarea id=\"contact_form_message\" class=\"text_field contact_form_message\" name=\"message\" rows=\"4\" placeholder=\"Message\" required=\"required\" data-error=\"Please, write us a message.\"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"contact_form_button\">\n");
      out.write("                                        <button type=\"submit\" class=\"button contact_submit_button\">Send Message</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel\"></div>\n");
      out.write("            </div>\n");
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
