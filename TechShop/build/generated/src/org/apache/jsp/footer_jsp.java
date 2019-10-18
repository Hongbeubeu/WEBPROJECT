package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!-- Newsletter -->\n");
      out.write("\n");
      out.write("            <div class=\"newsletter\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <div class=\"newsletter_container d-flex flex-lg-row flex-column align-items-lg-center align-items-center justify-content-lg-start justify-content-center\">\n");
      out.write("                                <div class=\"newsletter_title_container\">\n");
      out.write("                                    <div class=\"newsletter_icon\"><img src=\"images/send.png\" alt=\"\"></div>\n");
      out.write("                                    <div class=\"newsletter_title\">Sign up for Newsletter</div>\n");
      out.write("                                    <div class=\"newsletter_text\"><p>...and receive %20 coupon for first shopping.</p></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"newsletter_content clearfix\">\n");
      out.write("                                    <form action=\"#\" class=\"newsletter_form\">\n");
      out.write("                                        <input type=\"email\" class=\"newsletter_input\" required=\"required\" placeholder=\"Enter your email address\">\n");
      out.write("                                        <button class=\"newsletter_button\">Subscribe</button>\n");
      out.write("                                    </form>\n");
      out.write("                                    <div class=\"newsletter_unsubscribe_link\"><a href=\"#\">unsubscribe</a></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Footer -->\n");
      out.write("\n");
      out.write("            <footer class=\"footer\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-3 footer_col\">\n");
      out.write("                            <div class=\"footer_column footer_contact\">\n");
      out.write("                                <div class=\"logo_container\">\n");
      out.write("                                    <div class=\"logo\"><a href=\"#\">OneTech</a></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"footer_title\">Got Question? Call Us 24/7</div>\n");
      out.write("                                <div class=\"footer_phone\">+38 068 005 3570</div>\n");
      out.write("                                <div class=\"footer_contact_text\">\n");
      out.write("                                    <p>17 Princess Road, London</p>\n");
      out.write("                                    <p>Grester London NW18JR, UK</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"footer_social\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\"><i class=\"fab fa-twitter\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\"><i class=\"fab fa-youtube\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\"><i class=\"fab fa-google\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\"><i class=\"fab fa-vimeo-v\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-2 offset-lg-2\">\n");
      out.write("                            <div class=\"footer_column\">\n");
      out.write("                                <div class=\"footer_title\">Find it Fast</div>\n");
      out.write("                                <ul class=\"footer_list\">\n");
      out.write("                                    <li><a href=\"#\">Computers & Laptops</a></li>\n");
      out.write("                                    <li><a href=\"#\">Cameras & Photos</a></li>\n");
      out.write("                                    <li><a href=\"#\">Hardware</a></li>\n");
      out.write("                                    <li><a href=\"#\">Smartphones & Tablets</a></li>\n");
      out.write("                                    <li><a href=\"#\">TV & Audio</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <div class=\"footer_subtitle\">Gadgets</div>\n");
      out.write("                                <ul class=\"footer_list\">\n");
      out.write("                                    <li><a href=\"#\">Car Electronics</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-2\">\n");
      out.write("                            <div class=\"footer_column\">\n");
      out.write("                                <ul class=\"footer_list footer_list_2\">\n");
      out.write("                                    <li><a href=\"#\">Video Games & Consoles</a></li>\n");
      out.write("                                    <li><a href=\"#\">Accessories</a></li>\n");
      out.write("                                    <li><a href=\"#\">Cameras & Photos</a></li>\n");
      out.write("                                    <li><a href=\"#\">Hardware</a></li>\n");
      out.write("                                    <li><a href=\"#\">Computers & Laptops</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-2\">\n");
      out.write("                            <div class=\"footer_column\">\n");
      out.write("                                <div class=\"footer_title\">Customer Care</div>\n");
      out.write("                                <ul class=\"footer_list\">\n");
      out.write("                                    <li><a href=\"#\">My Account</a></li>\n");
      out.write("                                    <li><a href=\"#\">Order Tracking</a></li>\n");
      out.write("                                    <li><a href=\"#\">Wish List</a></li>\n");
      out.write("                                    <li><a href=\"#\">Customer Services</a></li>\n");
      out.write("                                    <li><a href=\"#\">Returns / Exchange</a></li>\n");
      out.write("                                    <li><a href=\"#\">FAQs</a></li>\n");
      out.write("                                    <li><a href=\"#\">Product Support</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("            <!-- Copyright -->\n");
      out.write("\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("\n");
      out.write("                            <div class=\"copyright_container d-flex flex-sm-row flex-column align-items-center justify-content-start\">\n");
      out.write("                                <div class=\"copyright_content\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                                    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("                                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"logos ml-sm-auto\">\n");
      out.write("                                    <ul class=\"logos_list\">\n");
      out.write("                                        <li><a href=\"#\"><img src=\"images/logos_1.png\" alt=\"\"></a></li>\n");
      out.write("                                        <li><a href=\"#\"><img src=\"images/logos_2.png\" alt=\"\"></a></li>\n");
      out.write("                                        <li><a href=\"#\"><img src=\"images/logos_3.png\" alt=\"\"></a></li>\n");
      out.write("                                        <li><a href=\"#\"><img src=\"images/logos_4.png\" alt=\"\"></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"styles/bootstrap4/popper.js\"></script>\n");
      out.write("        <script src=\"styles/bootstrap4/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"plugins/greensock/TweenMax.min.js\"></script>\n");
      out.write("        <script src=\"plugins/greensock/TimelineMax.min.js\"></script>\n");
      out.write("        <script src=\"plugins/scrollmagic/ScrollMagic.min.js\"></script>\n");
      out.write("        <script src=\"plugins/greensock/animation.gsap.min.js\"></script>\n");
      out.write("        <script src=\"plugins/greensock/ScrollToPlugin.min.js\"></script>\n");
      out.write("        <script src=\"plugins/OwlCarousel2-2.2.1/owl.carousel.js\"></script>\n");
      out.write("        <script src=\"plugins/slick-1.8.0/slick.js\"></script>\n");
      out.write("        <script src=\"plugins/easing/easing.js\"></script>\n");
      out.write("        <script src=\"plugins/Isotope/isotope.pkgd.min.js\"></script>\n");
      out.write("        <script src=\"plugins/jquery-ui-1.12.1.custom/jquery-ui.js\"></script>\n");
      out.write("        <script src=\"plugins/parallax-js-master/parallax.min.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("</body>\n");
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
