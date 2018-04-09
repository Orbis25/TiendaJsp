package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Controller.Admin;
import java.sql.ResultSet;
import java.sql.Statement;
import com.dao.Conexion;
import java.sql.Connection;
import java.util.ArrayList;
import com.Bean.Procesador;
import com.dao.AdminImpl;

public final class RegisterProducts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

com.Bean.Admin n = new com.Bean.Admin();
HttpSession sesionOK = request.getSession();
if(sesionOK.getAttribute("admin")!=null){
n = (com.Bean.Admin) sesionOK.getAttribute("admin");

}else{

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("Login.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("msg", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("Tiene que Loguearse", request.getCharacterEncoding()));
        return;
      }
      out.write('\n');

}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta  content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <title>Admin</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"css/bootstrapa.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- MetisMenu CSS -->\n");
      out.write("        <link href=\"css/metisMenu.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- DataTables CSS -->\n");
      out.write("        <link href=\"css/dataTables/dataTables.bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- DataTables Responsive CSS -->\n");
      out.write("        <link href=\"css/dataTables/dataTables.responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"css/startmin.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <link href=\"css/font/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("    \n");
      out.write("            <!-- Navigation -->\n");
      out.write("            <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Admin</a>\n");
      out.write("                </div>\n");
      out.write("    \n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("    \n");
      out.write("                <!-- Top Navigation: Left Menu -->\n");
      out.write("                <ul class=\"nav navbar-nav navbar-left navbar-top-links\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">\n");
      out.write("                            <i class=\"fa fa-home fa-fw\"></i> Website</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("    \n");
      out.write("                <!-- Top Navigation: Right Menu -->\n");
      out.write("                <ul class=\"nav navbar-right navbar-top-links\">\n");
      out.write("                    <li class=\"dropdown navbar-inverse\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-bell fa-fw\"></i>\n");
      out.write("                            <b class=\"caret\"></b>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-alerts\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <i class=\"fa fa-comment fa-fw\"></i> Mensajes\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a class=\"text-center\" href=\"#\">\n");
      out.write("                                    <strong>todos los mensajes</strong>\n");
      out.write("                                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                            <i class=\"fa fa-user fa-fw\"></i>                    \n");
      out.write("                            ");
      out.print(n.getNombre());
      out.write("\n");
      out.write("                            <b class=\"caret\"></b>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                              <a href=\"UserL?var=cerrar_sesion\">\n");
      out.write("                                <i class=\"fa fa-sign-out fa-fw\"></i>Cerrar sesion</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("    \n");
      out.write("                <!-- Sidebar -->\n");
      out.write("                <div class=\"navbar-default sidebar\" role=\"navigation\">\n");
      out.write("                    <div class=\"sidebar-nav navbar-collapse\">\n");
      out.write("    \n");
      out.write("                        <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("    \n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"admin.jsp\" class=\"active\">\n");
      out.write("                                    <i class=\"fa fa-home fa-fw\"></i> Inicio</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <span class=\"fa fa-users\"></span> Usuarios\n");
      out.write("                                    <span class=\"fa arrow\"></span>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"nav nav-third-level\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"tableUser.jsp\">\n");
      out.write("                                            <span class=\"fa fa-eye\"></span> Ver Usuarios</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    <span class=\"fa fa-product-hunt\"></span> Productos\n");
      out.write("                                    <span class=\"fa arrow\"></span>\n");
      out.write("                                </a>\n");
      out.write("                               <ul class=\"nav nav-third-level\">\n");
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
      out.write("                            </li>\n");
      out.write("    \n");
      out.write("                        </ul>\n");
      out.write("    \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <div id=\"page-wrapper\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h1 class=\"page-header\">Productos</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->            \n");
      out.write("            \n");
      out.write("                <!-- /#page-wrapper -->\n");
      out.write("             <div class=\"row \">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <form action=\"Admin\" method=\"POST\" class=\"form-group\">\n");
      out.write("                        ");

                        String img = request.getParameter("img");
                        
      out.write("\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                        <label>Registrar Producto</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control \" placeholder=\"Nombre\" name=\"nombre\" required>\n");
      out.write("                        <br>\n");
      out.write("                        <select class=\"form-control\" name=\"marca\" required>\n");
      out.write("                              <option value=\"\" disabled selected>marca</option>\n");
      out.write("                            ");

                               Conexion cn = new Conexion();
                            try{
                              
                               Connection con = cn.getConnection();
                               String sql = "Select id_marca,marca from marca";
                               Statement st = con.createStatement();
                               ResultSet rs = st.executeQuery(sql);
                               while(rs.next()){
                            
      out.write("\n");
      out.write("                           \n");
      out.write("                                \n");
      out.write("                            <option value=\"");
      out.print(rs.getInt("id_marca"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("marca"));
      out.write("</option>;\n");
      out.write("                              \n");
      out.write("                            ");

                             }
                             }catch(Exception e){
                         System.out.println("error en la conexion marca"+e);
                            }finally{
                            cn.cerrar();
                            }
                            
      out.write("\n");
      out.write("                             </select>  \n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"text\" name=\"modelo_pc\" class=\"form-control \" placeholder=\"modelo\" required>\n");
      out.write("                        <br>\n");
      out.write("                         <select class=\"form-control\" name=\"sistema\" required>\n");
      out.write("                              <option value=\"\" disabled selected>sistema</option>\n");
      out.write("                            ");

                               
                            try{
                              
                               Connection con = cn.getConnection();
                               String sql = "Select id_sistema,sistema from sistema";
                               Statement st = con.createStatement();
                               ResultSet rs = st.executeQuery(sql);
                               while(rs.next()){
                            
      out.write("\n");
      out.write("                           \n");
      out.write("                                \n");
      out.write("                            <option value=\"");
      out.print(rs.getInt("id_sistema"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("sistema"));
      out.write("</option>;\n");
      out.write("                              \n");
      out.write("                            ");

                             }
                             }catch(Exception e){
                         System.out.println("sistema"+e);
                            }finally{
                            cn.cerrar();
                            }
                            
      out.write("\n");
      out.write("                             </select>\n");
      out.write("                        <br>\n");
      out.write("                       <select class=\"form-control\" name=\"categoria\" required>\n");
      out.write("                              <option value=\"\" disabled selected>categoria</option>\n");
      out.write("                            ");

                               
                            try{
                              
                               Connection con = cn.getConnection();
                               String sql = "Select id_categoria,categoria from categoria";
                               Statement st = con.createStatement();
                               ResultSet rs = st.executeQuery(sql);
                               while(rs.next()){
                            
      out.write("\n");
      out.write("                           \n");
      out.write("                                \n");
      out.write("                            <option value=\"");
      out.print(rs.getInt("id_categoria"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("categoria"));
      out.write("</option>;\n");
      out.write("                              \n");
      out.write("                            ");

                             }
                             }catch(Exception e){
                            System.out.println("categoria"+e);
                            }finally{
                            cn.cerrar();
                            }
                            
      out.write("\n");
      out.write("                             </select>\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"numero\" placeholder=\"precio\" name=\"precio\" required>\n");
      out.write("                        <br>\n");
      out.write("                        <select class=\"form-control\" name=\"color\" required>\n");
      out.write("                            <option value=\"\" disabled selected>Color</option>\n");
      out.write("                            <option value=\"negro\">Negro</option>\n");
      out.write("                            <option value=\"blanco\">Blanco</option>\n");
      out.write("                            <option value=\"plateado\">plateado</option>\n");
      out.write("                            <option value=\"rojo\">rojo</option>\n");
      out.write("                        </select>\n");
      out.write("                        <br>\n");
      out.write("                             <select class=\"form-control\" name=\"procesador\" required>\n");
      out.write("                              <option value=\"\" disabled selected>Procesador</option>\n");
      out.write("                            ");

                               
                            try{
                              
                               Connection con = cn.getConnection();
                               String sql = "Select idProcesador,modelo from procesador";
                               Statement st = con.createStatement();
                               ResultSet rs = st.executeQuery(sql);
                               while(rs.next()){
                            
      out.write("\n");
      out.write("                           \n");
      out.write("                                \n");
      out.write("                            <option value=\"");
      out.print(rs.getInt("idProcesador"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("modelo"));
      out.write("</option>;\n");
      out.write("                              \n");
      out.write("                            ");

                             }
                             }catch(Exception e){
                         System.out.println("procesador"+e);
                            }finally{
                            cn.cerrar();
                            }
                            
      out.write("\n");
      out.write("                             </select>  \n");
      out.write("                        <br>\n");
      out.write("                         <select class=\"form-control\" name=\"ram\" required>\n");
      out.write("                              <option value=\"\" disabled selected>Ram</option>\n");
      out.write("                            ");

                               
                            try{
                              
                               Connection con = cn.getConnection();
                               String sql = "Select id_ram,ram from ram";
                               Statement st = con.createStatement();
                               ResultSet rs = st.executeQuery(sql);
                               while(rs.next()){
                            
      out.write("\n");
      out.write("                           \n");
      out.write("                                \n");
      out.write("                            <option value=\"");
      out.print(rs.getInt("id_ram"));
      out.write('"');
      out.write('>');
      out.print(rs.getInt("ram"));
      out.write("</option>;\n");
      out.write("                              \n");
      out.write("                            ");

                             }
                             }catch(Exception e){
                         System.out.println("procesador"+e);
                            }finally{
                            cn.cerrar();
                            }
                            
      out.write("\n");
      out.write("                             </select>  \n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <br>\n");
      out.write("                           \n");
      out.write("                            <br>\n");
      out.write("                            <select class=\"form-control\" name=\"disco\" required>\n");
      out.write("                              <option value=\"\" disabled selected>Disco Duro</option>\n");
      out.write("                            ");

                               
                            try{
                              
                               Connection con = cn.getConnection();
                               String sql = "Select id_disco,disco,tipo from disco_duro";
                               Statement st = con.createStatement();
                               ResultSet rs = st.executeQuery(sql);
                               while(rs.next()){
                            
      out.write("\n");
      out.write("                           \n");
      out.write("                                \n");
      out.write("                            <option value=\"");
      out.print(rs.getInt("id_disco"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("disco")+"  "+rs.getString("tipo"));
      out.write("</option>;\n");
      out.write("                              \n");
      out.write("                            ");

                             }
                             }catch(Exception e){
                         System.out.println("procesador"+e);
                            }finally{
                            cn.cerrar();
                            }
                            
      out.write("\n");
      out.write("                             </select>  \n");
      out.write("                            <br>                 \n");
      out.write("                            <label >Descripcion</label><br>\n");
      out.write("                             <input type=\"text\" class=\"form-control\" placeholder=\"descripcion\" name=\"descripcion\" required>\n");
      out.write("                            <br>\n");
      out.write("                            <button type=\"submit\"  class=\"btn btn-primary btn-block center-block\">Registrar</button>\n");
      out.write("                            <input type=\"hidden\" name=\"txtimagen\" value=\"");
      out.print(img);
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"accion\" value=\"registrarProducto\">\n");
      out.write("                            <br>\n");
      out.write("                            <a href=\"tableProducts.jsp\" class=\"btn btn-danger center-block\">Regresar</a>\n");
      out.write("                        </div>      \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("                </div>     \n");
      out.write("            <!-- /#page-wrapper -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /#wrapper -->\n");
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
      out.write("        <!-- Page-Level Demo Scripts - Tables - Use for reference -->\n");
      out.write("        <!--for numeric and decimals-->\n");
      out.write("        <script src=\"js/jquery.numeric.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $('#dataTables-example').DataTable({\n");
      out.write("                        responsive: true\n");
      out.write("                });\n");
      out.write("            });      \n");
      out.write("            $(document).ready(function () {\n");
      out.write("            $(\"#numero\").numeric();\n");
      out.write("            })\n");
      out.write("\n");
      out.write("        </script>\n");
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
