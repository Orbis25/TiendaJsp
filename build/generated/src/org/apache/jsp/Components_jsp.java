package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import com.dao.Conexion;

public final class Components_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <script defer src=\"https://use.fontawesome.com/releases/v5.0.8/js/solid.js\" integrity=\"sha384-+Ga2s7YBbhOD6nie0DzrZpJes+b2K1xkpKxTFFcx59QmVPaSA8c7pycsNaFwUK6l\"\n");
      out.write("            crossorigin=\"anonymous\"></script>\n");
      out.write("        <script defer src=\"https://use.fontawesome.com/releases/v5.0.8/js/fontawesome.js\" integrity=\"sha384-7ox8Q2yzO/uWircfojVuCQOZl+ZZBg2D2J5nkpLqzH1HY0C1dHlTKIbpRz/LG23c\"\n");
      out.write("            crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>Admin</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
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
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        <div class=\"container-fluid\" id=\"wrapper\">\n");
      out.write("    \n");
      out.write("            \n");
      out.write("            \n");
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
      out.write("                            <i class=\"fa fa-user fa-fw\"></i> Nombre\n");
      out.write("                            <b class=\"caret\"></b>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-user\">\n");
      out.write("                            <li class=\"divider\"></li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"Login.jsp\">\n");
      out.write("                                    <i class=\"fa fa-sign-out fa-fw\"></i>Cerrar sesion</a>\n");
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
      out.write("                                <ul class=\"nav nav-third-level\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"tableProducts.jsp\">\n");
      out.write("                                            <span class=\"fa fa-eye\"></span> Ver Productos</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                            <span class=\"fa fa-boxes\"></span> Componentes</a>\n");
      out.write("                                    </li>\n");
      out.write("\n");
      out.write("                                 </ul>\n");
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
      out.write("                        <h1 class=\"page-header\">Componentes</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                Listado de Categorias <a href=\"#\" data-toggle=\"modal\" data-target=\"#Modalct\"><img src=\"img/laptop24.png\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel-heading -->\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"dataTable_wrapper\">\n");
      out.write("                                    <table class=\"table table-striped table-bordered table-hover dataTable\" >\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Nombre</th>\n");
      out.write("                                                <th>Action</th>\n");
      out.write("                                                \n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                             ");
 
                                            
                                            Conexion c = new Conexion();
                                            try{
                                            Connection con = c.getConnection();
                                            String sql = "Select *from categoria";
                                            Statement st = con.createStatement();
                                            ResultSet rs = st.executeQuery(sql);
                                            while(rs.next()){
                                            
      out.write("\n");
      out.write("                                            <tr class=\"odd gradeX\">\n");
      out.write("                                                <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                                 <td><a href=\"#\"");
      out.print(rs.getString(2));
      out.write(" ><img src=\"img/delete.png\"></img></a> -||-\n");
      out.write("                                                    <a href=\"#\"");
      out.print(rs.getString(2));
      out.write(" ><img src=\"img/edit.png\"></img></a></td>\n");
      out.write("                                            </tr>\n");
      out.write("                                                   \n");
      out.write("                                               ");

                                        }
                                        }catch(Exception e){
                                    System.out.println("usuario "+e);
                                       }finally{
                                       c.cerrar();
                                       }
                                       
      out.write("\n");
      out.write("                                            \n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.table-responsive -->\n");
      out.write("                    \n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel-body -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel -->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                Disco Duros <a href=\"#\" data-toggle=\"modal\" data-target=\"#Modaldc\"><img src=\"img/hdd24.png\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel-heading -->\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"dataTable_wrapper\">\n");
      out.write("                                    <table class=\"table table-striped table-bordered table-hover dataTable\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Capacidad</th>\n");
      out.write("                                                <th>tipo</th>\n");
      out.write("                                                <th>Action</th>\n");
      out.write("                                                \n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                             ");
 
                                            
                                            try{
                                            Connection con = c.getConnection();
                                            String sql = "Select *from disco_duro";
                                            Statement st = con.createStatement();
                                            ResultSet rs = st.executeQuery(sql);
                                            while(rs.next()){
                                            
      out.write("\n");
      out.write("                                            <tr class=\"odd gradeX\">\n");
      out.write("                                                <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                                <td><a href=\"#\"");
      out.print(rs.getString(1));
      out.write("><img src=\"img/delete.png\"></img></a> -||-\n");
      out.write("                                                    <a href=\"#\"");
      out.print(rs.getString(1));
      out.write("><img src=\"img/edit.png\"></img></a></td>\n");
      out.write("                                            </tr>\n");
      out.write("                                                  ");

                                        }
                                        }catch(Exception e){
                                    System.out.println("usuario "+e);
                                       }finally{
                                       c.cerrar();
                                       }
                                       
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.table-responsive -->\n");
      out.write("                    \n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel-body -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                  <div class=\"col-lg-6\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                Listado de Marcas <a href=\"#\" data-toggle=\"modal\" data-target=\"#Modalmarcas\" ><img src=\"img/Marca.png\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel-heading -->\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"dataTable_wrapper\">\n");
      out.write("                                    <table class=\"table table-striped table-bordered table-hover dataTable\">\n");
      out.write("                                       <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Nombre</th>\n");
      out.write("                                                <th>Action</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                             ");
 
                                            
                                            try{
                                            Connection con = c.getConnection();
                                            String sql = "Select *from marca";
                                            Statement st = con.createStatement();
                                            ResultSet rs = st.executeQuery(sql);
                                            while(rs.next()){
                                            
      out.write("\n");
      out.write("                                        \n");
      out.write("                                            <tr class=\"odd gradeX\">\n");
      out.write("                                                <td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                               <td><a href=\"#\"");
      out.print(rs.getString(1));
      out.write("><img src=\"img/delete.png\"></img></a> -||-\n");
      out.write("                                                    <a href=\"#\"");
      out.print(rs.getString(1));
      out.write("><img src=\"img/edit.png\"></img></a></td>\n");
      out.write("    \n");
      out.write("                                            </tr>\n");
      out.write("                                                 ");

                                        }
                                        }catch(Exception e){
                                    System.out.println("usuario "+e);
                                       }finally{
                                       c.cerrar();
                                       }
                                       
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.table-responsive -->\n");
      out.write("                    \n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel-body -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel -->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                Procesadores <a href=\"#\" data-toggle=\"modal\" data-target=\"#ModalP\"><img src=\"img/procesador.png\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel-heading -->\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"dataTable_wrapper\">\n");
      out.write("                                    <table class=\"table table-striped table-bordered table-hover dataTable\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Modelo</th>\n");
      out.write("                                                <th>action</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                        ");
 
                                            
                                            try{
                                            Connection con = c.getConnection();
                                            String sql = "Select *from procesador";
                                            Statement st = con.createStatement();
                                            ResultSet rs = st.executeQuery(sql);
                                            while(rs.next()){
                                            
      out.write("\n");
      out.write("                                        \n");
      out.write("                                            <tr class=\"odd gradeX\">\n");
      out.write("                                                <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                             <td><a href=\"#\"");
      out.print(rs.getString(1));
      out.write("><img src=\"img/delete.png\"></img></a> -||-\n");
      out.write("                                                    <a href=\"#\"");
      out.print(rs.getString(1));
      out.write("><img src=\"img/edit.png\"></img></a></td>\n");
      out.write("                \n");
      out.write("                                            </tr>\n");
      out.write("                                                      ");

                                        }
                                        }catch(Exception e){
                                    System.out.println("usuario "+e);
                                       }finally{
                                       c.cerrar();
                                       }
                                       
      out.write("\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.table-responsive -->\n");
      out.write("                \n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel-body -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                Listado de Rams <a href=\"#\"  data-toggle=\"modal\" data-target=\"#ModalR\" ><img src=\"img/memory.png\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel-heading -->\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"dataTable_wrapper\">\n");
      out.write("                                    <table class=\"table table-striped table-bordered table-hover dataTable\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Capacidad</th>\n");
      out.write("                                                <th>Action</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            ");
 
                                            
                                            try{
                                            Connection con = c.getConnection();
                                            String sql = "Select *from ram";
                                            Statement st = con.createStatement();
                                            ResultSet rs = st.executeQuery(sql);
                                            while(rs.next()){
                                            
      out.write("\n");
      out.write("                                            <tr class=\"odd gradeX\">\n");
      out.write("                                                <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                                <td><a href=\"#\"");
      out.print(rs.getString(1));
      out.write("><img src=\"img/delete.png\"></img></a> -||-\n");
      out.write("                                                    <a href=\"#\"");
      out.print(rs.getString(1));
      out.write("><img src=\"img/edit.png\"></img></a></td>\n");
      out.write("                \n");
      out.write("                                            </tr>\n");
      out.write("                                                         ");

                                        }
                                        }catch(Exception e){
                                    System.out.println("usuario "+e);
                                       }finally{
                                       c.cerrar();
                                       }
                                       
      out.write("\n");
      out.write("                \n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.table-responsive -->\n");
      out.write("                \n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel-body -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.panel -->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                Listado de Sistemas <a href=\"#\" data-toggle=\"modal\" data-target=\"#ModalS\" ><img src=\"img/windows.png\"></a>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel-heading -->\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"dataTable_wrapper\">\n");
      out.write("                                    <table class=\"table table-striped table-bordered table-hover dataTable\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Nombre</th>\n");
      out.write("                                                <th>Action</th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>\n");
      out.write("                                            \n");
      out.write("                                            ");

                                                 try{
                                            Connection con = c.getConnection();
                                            String sql = "Select *from sistema";
                                            Statement st = con.createStatement();
                                            ResultSet rs = st.executeQuery(sql);
                                            while(rs.next()){
                                            
      out.write("\n");
      out.write("                                            <tr class=\"odd gradeX\">\n");
      out.write("                                                <td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("                                           <td><a href=\"#\"");
      out.print(rs.getString(1));
      out.write("><img src=\"img/delete.png\"></img></a> -||-\n");
      out.write("                                                    <a href=\"#\"");
      out.print(rs.getString(1));
      out.write("><img src=\"img/edit.png\"></img></a></td>\n");
      out.write("                \n");
      out.write("                                            </tr>\n");
      out.write("                                                           ");

                                        }
                                        }catch(Exception e){
                                    System.out.println("usuario "+e);
                                       }finally{
                                       c.cerrar();
                                       }
                                       
      out.write("\n");
      out.write("                \n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.table-responsive -->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel-body -->\n");
      out.write("                        </div>\n");
      out.write("                                       \n");
      out.write("                        <!-- /.panel -->\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("            <!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /#wrapper -->\n");
      out.write("      \n");
      out.write("             <div class=\"modal fade \" id=\"Modalct\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" data-backdrop=\"false\" style=\"background-color: rgba(0, 0, 0, 0.5);\">\n");
      out.write("                 <div class=\"modal-dialog\" role=\"document\"> \n");
      out.write("                     <div class=\"modal-content\"> <div class=\"modal-header\"> <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"> \n");
      out.write("                      <span aria-hidden=\"true\">&times;</span> \n");
      out.write("                             </button> \n");
      out.write("                             <h4 class=\"modal-title\" id=\"myModalLabel\">Registrar Categorias</h4> \n");
      out.write("                         </div> \n");
      out.write("                      <div class=\"modal-body col-lg-6\">\n");
      out.write("                          <form class=\"form-group\" method=\"POST\" action=\"Admin\">\n");
      out.write("                              <input type=\"hidden\" name=\"accion\" value=\"cp_categoria\">\n");
      out.write("                              <input type=\"text\" class=\"form-control\" name=\"cp_categoria\" placeholder=\"Categoria\" required>\n");
      out.write("                              <br>\n");
      out.write("                              <button type=\"submit\" class=\"btn btn-primary\">Agregar</button> \n");
      out.write("                              <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cerrar</button> \n");
      out.write("\t\t\t</form>\n");
      out.write("                      </div> \n");
      out.write("                         <div class=\"modal-footer\"> \n");
      out.write("                         \n");
      out.write("                            </div>\n");
      out.write("                     </div> \n");
      out.write("                 </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal fade\" id=\"Modaldc\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" data-backdrop=\"false\" style=\"background-color: rgba(0, 0, 0, 0.5);\">\n");
      out.write("                         <div class=\"modal-dialog\" role=\"document\"> <div class=\"modal-content\"> <div class=\"modal-header\"> <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"> \n");
      out.write("                              <span aria-hidden=\"true\">&times;</span> \n");
      out.write("                                     </button> \n");
      out.write("                                     <h4 class=\"modal-title\" id=\"myModalLabel\">Registrar Discos</h4> \n");
      out.write("                                 </div> \n");
      out.write("                              <div class=\"modal-body col-lg-6\">\n");
      out.write("                                  <form class=\"form-group\" method=\"POST\" action=\"Admin\">\n");
      out.write("                                      <input type=\"text\" class=\"form-control numero\" name=\"cp_capacidad\" placeholder=\"Capacidad\" required>\n");
      out.write("                                     <br>\n");
      out.write("                                     <input type=\"text\" class=\"form-control\" name=\"cp_tipo\" placeholder=\"Tipo\" required>\n");
      out.write("                                     <input type=\"hidden\" name=\"accion\" value=\"cp_disco\"><br>\n");
      out.write("                                     <button type=\"submit\" class=\"btn btn-primary\">Agregar</button>\n");
      out.write("                                   <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cerrar</button> \n");
      out.write("                                </form>\n");
      out.write("                              </div> \n");
      out.write("                                 <div class=\"modal-footer\"> \n");
      out.write("                                   \n");
      out.write("                                    </div>\n");
      out.write("                             </div> \n");
      out.write("                         </div>\n");
      out.write("                       </div>\n");
      out.write("                       <div class=\"modal fade\" id=\"Modalmarcas\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" data-backdrop=\"false\" style=\"background-color: rgba(0, 0, 0, 0.5);\">\n");
      out.write("                         <div class=\"modal-dialog\" role=\"document\"> <div class=\"modal-content\"> <div class=\"modal-header\"> <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"> \n");
      out.write("                              <span aria-hidden=\"true\">&times;</span> \n");
      out.write("                                     </button> \n");
      out.write("                                     <h4 class=\"modal-title\" id=\"myModalLabel\">Registrar Marcas</h4> \n");
      out.write("                                 </div> \n");
      out.write("                              <div class=\"modal-body col-lg-6\">\n");
      out.write("                                  <form class=\"form-group\" action=\"Admin\" method=\"POST\">\n");
      out.write("                                      <input type=\"text\" class=\"form-control\" name=\"nombre_marca\" placeholder=\"Nombre\" required>\n");
      out.write("                                      <input type=\"hidden\" name=\"accion\" value=\"cp_marca\">\n");
      out.write("                                      <br>\n");
      out.write("                                     <select class=\"form-control\" name=\"cp_msistema\" required>\n");
      out.write("                                    <option value=\"\" disabled selected>sistema</option>\n");
      out.write("                                    ");


                                    try{

                                       Connection con = c.getConnection();
                                       String sql = "Select id_sistema,sistema from sistema";
                                       Statement st = con.createStatement();
                                       ResultSet rs = st.executeQuery(sql);
                                       while(rs.next()){
                                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(rs.getInt("id_sistema"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("sistema"));
      out.write("</option>;\n");
      out.write("\n");
      out.write("                                    ");

                                     }
                                     }catch(Exception e){
                                 System.out.println("sistema"+e);
                                    }finally{
                                    c.cerrar();
                                    }
                                    
      out.write("\n");
      out.write("                                     </select>\n");
      out.write("                                     \n");
      out.write("                                      <br>\n");
      out.write("                                      <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cerrar</button> \n");
      out.write("                                      <button type=\"submit\" class=\"btn btn-primary\">Agregar</button> \n");
      out.write("                                </form>\n");
      out.write("                              </div> \n");
      out.write("                                 <div class=\"modal-footer\"> \n");
      out.write("                                  \n");
      out.write("                                    </div>\n");
      out.write("                             </div> \n");
      out.write("                         </div>\n");
      out.write("                       </div>\n");
      out.write("                       <div class=\"modal fade\" id=\"ModalP\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" data-backdrop=\"false\" style=\"background-color: rgba(0, 0, 0, 0.5);\">\n");
      out.write("                         <div class=\"modal-dialog\" role=\"document\"> <div class=\"modal-content\"> <div class=\"modal-header\"> <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"> \n");
      out.write("                              <span aria-hidden=\"true\">&times;</span> \n");
      out.write("                                     </button> \n");
      out.write("                                     <h4 class=\"modal-title\" id=\"myModalLabel\">Registrar Procesador</h4> \n");
      out.write("                                 </div> \n");
      out.write("                              <div class=\"modal-body col-lg-6\">\n");
      out.write("                                  <form class=\"form-group\">\n");
      out.write("                                     <input type=\"text\" class=\"form-control\" placeholder=\"Modelo\">\n");
      out.write("                                </form>\n");
      out.write("                              </div> \n");
      out.write("                                 <div class=\"modal-footer\"> \n");
      out.write("                                  <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cerrar</button> \n");
      out.write("                                   <button type=\"button\" class=\"btn btn-primary\">Agregar</button> \n");
      out.write("                                    </div>\n");
      out.write("                             </div> \n");
      out.write("                         </div>\n");
      out.write("                       </div>\n");
      out.write("                     <div class=\"modal fade\" id=\"ModalR\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" data-backdrop=\"false\" style=\"background-color: rgba(0, 0, 0, 0.5);\">\n");
      out.write("                         <div class=\"modal-dialog\" role=\"document\"> <div class=\"modal-content\"> <div class=\"modal-header\"> <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"> \n");
      out.write("                              <span aria-hidden=\"true\">&times;</span> \n");
      out.write("                                     </button> \n");
      out.write("                                     <h4 class=\"modal-title\" id=\"myModalLabel\">Memoria Ram</h4> \n");
      out.write("                                 </div> \n");
      out.write("                              <div class=\"modal-body col-lg-6\">\n");
      out.write("                                  <form class=\"form-group\">\n");
      out.write("                                     <input type=\"text\" class=\"form-control\" placeholder=\"Capacidad\">\n");
      out.write("                                </form>\n");
      out.write("                              </div> \n");
      out.write("                                 <div class=\"modal-footer\"> \n");
      out.write("                                  <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cerrar</button> \n");
      out.write("                                   <button type=\"button\" class=\"btn btn-primary\">Agregar</button> \n");
      out.write("                                    </div>\n");
      out.write("                             </div> \n");
      out.write("                         </div>\n");
      out.write("                       </div>\n");
      out.write("                       <div class=\"modal fade\" id=\"ModalS\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" data-backdrop=\"false\" style=\"background-color: rgba(0, 0, 0, 0.5);\">\n");
      out.write("                         <div class=\"modal-dialog\" role=\"document\"> <div class=\"modal-content\"> <div class=\"modal-header\"> <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"> \n");
      out.write("                              <span aria-hidden=\"true\">&times;</span> \n");
      out.write("                                     </button> \n");
      out.write("                                     <h4 class=\"modal-title\" id=\"myModalLabel\">Sistemas</h4> \n");
      out.write("                                 </div> \n");
      out.write("                              <div class=\"modal-body col-lg-6\">\n");
      out.write("                                  <form class=\"form-group\">\n");
      out.write("                                     <input type=\"text\" class=\"form-control\" placeholder=\"Nombre\">\n");
      out.write("                                </form>\n");
      out.write("                              </div> \n");
      out.write("                                 <div class=\"modal-footer\"> \n");
      out.write("                                  <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Cerrar</button> \n");
      out.write("                                   <button type=\"button\" class=\"btn btn-primary\">Agregar</button> \n");
      out.write("                                    </div>\n");
      out.write("                             </div> \n");
      out.write("                         </div>\n");
      out.write("                       </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- jQuery -->\n");
      out.write("       <script src=\"js/js/jquery.min.js\"></script>\n");
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
      out.write("        <!--solo valores numericos-->\n");
      out.write("         <script src=\"js/jquery.numeric.js\"></script>\n");
      out.write("        <!-- Page-Level Demo Scripts - Tables - Use for reference -->\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $('.dataTable').DataTable({\n");
      out.write("                        responsive: true                         \n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("           $(document).ready(function () {\n");
      out.write("            $(\".numero\").numeric();\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("        </script>\n");
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
