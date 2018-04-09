package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Bean.Admin;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");

    //capturando la session
    Admin n = new Admin();
String admin = "";
HttpSession sesionOk =  request.getSession();
if(sesionOk.getAttribute("admin")==null){


      out.write('\n');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("Login.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("msg", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Tiene que Loguearse", request.getCharacterEncoding()));
        return;
      }
      out.write('\n');
      out.write('\n');

}else{

 n = (Admin) sesionOk.getAttribute("admin");
 
}


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Admin</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"css/bootstrapa.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- MetisMenu CSS -->\n");
      out.write("    <link href=\"css/metisMenu.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- DataTables CSS -->\n");
      out.write("    <link href=\"css/dataTables/dataTables.bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- DataTables Responsive CSS -->\n");
      out.write("    <link href=\"css/dataTables/dataTables.responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/startmin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href=\"css/font/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Admin</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <!-- Top Navigation: Left Menu -->\n");
      out.write("            <ul class=\"nav navbar-nav navbar-left navbar-top-links\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">\n");
      out.write("                        <i class=\"fa fa-home fa-fw\"></i> Website</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <!-- Top Navigation: Right Menu -->\n");
      out.write("            <ul class=\"nav navbar-right navbar-top-links\">\n");
      out.write("                <li class=\"dropdown navbar-inverse\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                        <i class=\"fa fa-bell fa-fw\"></i>\n");
      out.write("                        <b class=\"caret\"></b>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-alerts\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div>\n");
      out.write("                                    <i class=\"fa fa-comment fa-fw\"></i> Mensajes\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\n");
      out.write("                                <strong>todos los mensajes</strong>\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"dropdown\">\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                        <i class=\"fa fa-user fa-fw\"></i> \n");
      out.write("                        \n");
      out.write("                        ");
      out.print(n.getNombre());
      out.write("\n");
      out.write("                        <b class=\"caret\"></b>\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("                        <li class=\"divider\"></li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"UserL?var=cerrar_sesion\">\n");
      out.write("                                <i class=\"fa fa-sign-out fa-fw\"></i>Cerrar sesion</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <!-- Sidebar -->\n");
      out.write("            <div class=\"navbar-default sidebar\" role=\"navigation\">\n");
      out.write("                <div class=\"sidebar-nav navbar-collapse\">\n");
      out.write("\n");
      out.write("                    <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\" class=\"active\">\n");
      out.write("                                <i class=\"fa fa-home fa-fw\"></i> Inicio</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <span class=\"fa fa-users\"></span> Usuarios\n");
      out.write("                                <span class=\"fa arrow\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"nav nav-third-level\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"UserL?var=tableProducts\">\n");
      out.write("                                        <span class=\"fa fa-eye\"></span> Ver Usuarios</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <span class=\"fa fa-product-hunt\"></span> Productos\n");
      out.write("                                <span class=\"fa arrow\"></span>\n");
      out.write("                            </a>\n");
      out.write("                             <ul class=\"nav nav-third-level\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"tableProducts.jsp\">\n");
      out.write("                                            <span class=\"fa fa-eye\"></span> Ver Productos</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"Components.jsp\">\n");
      out.write("                                            <span class=\"fa fa-boxes\"></span> Componentes</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    \n");
      out.write("                                </ul>   \n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <h1 class=\"page-header\">Factura</h1>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.col-lg-12 -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            Listado de Facturas\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel-heading -->\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <div class=\"dataTable_wrapper\">\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>cod factura</th>\n");
      out.write("                                            <th>fecha</th>\n");
      out.write("                                            <th>tipo de pago</th>\n");
      out.write("                                            <th>tipo de envio</th>\n");
      out.write("                                            <th>pais</th>\n");
      out.write("                                            <th>Ciudad</th>\n");
      out.write("                                            <th>Costo envio</th>\n");
      out.write("                                            <th>cod postal</th>\n");
      out.write("                                            <th>direccion</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr class=\"odd gradeX\">\n");
      out.write("                                            <td>Trident</td>\n");
      out.write("                                            <td>Internet Explorer 4.0</td>\n");
      out.write("                                            <td>Win 95+</td>\n");
      out.write("                                            <td>Trident</td>\n");
      out.write("                                            <td>Internet Explorer 4.0</td>\n");
      out.write("                                            <td>Win 95+</td>\n");
      out.write("                                            <td>Trident</td>\n");
      out.write("                                            <td>Internet Explorer 4.0</td>\n");
      out.write("                                            <td>Win 95+</td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr class=\"even gradeC\">\n");
      out.write("                                            <td>Trident</td>\n");
      out.write("                                            <td>Internet Explorer 5.0</td>\n");
      out.write("                                            <td>Win 95+</td>\n");
      out.write("                                            <td>Trident</td>\n");
      out.write("                                            <td>Internet Explorer 4.0</td>\n");
      out.write("                                            <td>Win 95+</td>\n");
      out.write("                                            <td>Trident</td>\n");
      out.write("                                            <td>Internet Explorer 4.0</td>\n");
      out.write("                                            <td>papa</td>\n");
      out.write("\n");
      out.write("                                        </tr>\n");
      out.write("                                      \n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.table-responsive -->\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel-body -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.panel -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.col-lg-12 -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"js/js/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"js/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Metis Menu Plugin JavaScript -->\n");
      out.write("        <script src=\"js/js/metisMenu.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- DataTables JavaScript -->\n");
      out.write("        <script src=\"js/js/dataTables/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"js/js/dataTables/dataTables.bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Custom Theme JavaScript -->\n");
      out.write("        <script src=\"js/js/startmin.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Page-Level Demo Scripts - Tables - Use for reference -->\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#dataTables-example').DataTable({\n");
      out.write("                    responsive: true\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
