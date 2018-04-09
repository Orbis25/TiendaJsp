package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_005facount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Registro</title>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <link rel=\"icon\" href=\"img/laptop.ico\" />\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/iconic/css/material-design-iconic-font.min.css\">\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/css-hamburgers/hamburgers.min.css\">\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animsition/css/animsition.min.css\">\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/daterangepicker/daterangepicker.css\">\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/utillogin.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/mainlogin.css\">\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col\">\r\n");
      out.write("     <div class=\"limiter\">\r\n");
      out.write("        <div class=\"container-login100\" style=\"background-image: url('img/back-login.jpg');\">\r\n");
      out.write("            <div class=\"wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54\">\r\n");
      out.write("                <form class=\"login100-form validate-form form-group\" method=\"POST\" action=\"UserS\">\r\n");
      out.write("                    <span class=\"login100-form-title p-b-49\">\r\n");
      out.write("                        Registro\r\n");
      out.write("                    </span>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"text\" class=\"form-control mb-4  inputR\" name=\"nombre\" placeholder=\"Nombre\" required >\r\n");
      out.write("                    <input type=\"text\" class=\"form-control mb-4 inputR\" name=\"apellido\" placeholder=\"Apellidos\" required>\r\n");
      out.write("                    <input type=\"email\" class=\"form-control mb-4 inputR\" name=\"correo\" placeholder=\"Correo\" required>\r\n");
      out.write("                    <input type=\"password\" class=\"form-control mb-4 inputR\" name=\"pass\" placeholder=\"Contraseña\" id=\"pass1\" required>\r\n");
      out.write("                    <div id=\"error1\" class=\"mb-2\"></div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-11\">\r\n");
      out.write("                        <input type=\"password\" class=\"form-control mb-4\"  name=\"conf_pass\" placeholder=\"Repita la Contraseña\" id=\"pass2\" required>                              \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-0.5 mt-1\" id=\"error2\" class=\"\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-outline-primary btn-block\" id=\"btn\" >Registrarse</button>\r\n");
      out.write("                     <div class=\"row justify-content-center \">\r\n");
      out.write("                    <div class=\"col-5 mt-4\">\r\n");
      out.write("                    <a href=\"Login.jsp\" class=\"text-center\">Tienes Cuenta?</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-6 mt-4\">\r\n");
      out.write("                    <a href=\"index.jsp\" class=\"text-center\">Pagina de inicio</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div id=\"dropDownSelect1\"></div>\r\n");
      out.write("\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <script src=\"vendor/animsition/js/animsition.min.js\"></script>\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <script src=\"vendor/bootstrap/js/popper.js\"></script>\r\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <script src=\"vendor/select2/select2.min.js\"></script>\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <script src=\"vendor/daterangepicker/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <script src=\"vendor/countdowntime/countdowntime.js\"></script>\r\n");
      out.write("    <!--===============================================================================================-->\r\n");
      out.write("    <script src=\"js/login_register.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
