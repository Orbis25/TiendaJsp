<%@page import="com.Bean.Admin"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.dao.Conexion"%>
<%@page session="true" %>

<%
Admin n = new Admin();
HttpSession sesionOK = request.getSession();
if(sesionOK.getAttribute("admin")!=null){
n = (Admin) sesionOK.getAttribute("admin");
}else{
%>
<jsp:forward page="Login.jsp">
    <jsp:param name="msg" value="Tiene que Loguearse"/>
</jsp:forward>
<%
}
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Admin</title>

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrapa.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="css/metisMenu.min.css" rel="stylesheet">

        <!-- DataTables CSS -->
        <link href="css/dataTables/dataTables.bootstrap.css" rel="stylesheet">

        <!-- DataTables Responsive CSS -->
        <link href="css/dataTables/dataTables.responsive.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/startmin.css" rel="stylesheet">

            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <!-- Custom Fonts -->
        <link href="css/font/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
    
        <div id="wrapper">
    
            <!-- Navigation -->
    <nav class="navbar navbar-danger navbar-fixed-top" style="background: #f95959; color: white" role="navigation">
            <div class="navbar-header">
                <a class="navbar-brand" style="color: white" href="#">ShopGeek Admin</a>
            </div>
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
    
                <!-- Top Navigation: Left Menu -->
          
    
                <!-- Top Navigation: Right Menu -->
                <ul class="nav navbar-right navbar-top-links">
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-user fa-fw"></i>
                            <%=n.getNombre()%>
                            <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li class="divider"></li>
                            <li>
                                <a href="UserL?var=cerrar_sesion">
                                    <i class="fa fa-sign-out fa-fw"></i>Cerrar sesion</a>
                            </li>
                        </ul>
                    </li>
                </ul>
    
                <!-- Sidebar -->
                <div class="navbar-default sidebar" role="navigation">
                    <div class="sidebar-nav navbar-collapse">
    
                        <ul class="nav" id="side-menu">
    
                            <li>
                                <a href="admin.jsp" class="active">
                                    <i class="fa fa-home fa-fw"></i> Inicio</a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="fa fa-users"></span> Usuarios
                                    <span class="fa arrow"></span>
                                </a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="#">
                                            <span class="fa fa-eye"></span> Ver Usuarios</a>
                                    </li>
                                </ul>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="fa fa-product-hunt"></span> Productos
                                    <span class="fa arrow"></span>
                                </a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="tableProducts.jsp">
                                            <span class="fa fa-eye"></span> Ver Productos</a>
                                    </li>
                                    <li>
                                        <a href="Components.jsp">
                                            <span class="fa fa-boxes"></span> Componentes</a>
                                    </li>
                                   
                                </ul>   
                            </li>
    
                        </ul>
    
                    </div>
                </div>
            </nav>

            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Usuarios</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                               Listado de Usuarios
                            </div>
                            <!-- /.panel-heading -->
                            <div class="panel-body">
                                <div class="dataTable_wrapper">
                                    <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                        <thead>
                                            <tr>
                                                <th>Nombre</th>
                                                <th>Apellidos</th>
                                                <th>Correo</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                           <%
                                        Conexion cn = new Conexion();
                                     try{

                                        Connection con = cn.getConnection();
                                        String sql = "Select nombre,apellido,correo from usuario";
                                        Statement st = con.createStatement();
                                        ResultSet rs = st.executeQuery(sql);
                                        while(rs.next()){
                                                %>
                                                
                                                <tr>
                                                    <td><%=rs.getString("nombre")%></td>
                                                    <td><%=rs.getString("apellido")%></td>
                                                    <td><%=rs.getString("correo")%></td>
                                                </tr>

                                       <%
                                        }
                                        }catch(Exception e){
                                    System.out.println("usuario "+e);
                                       }finally{
                                       cn.cerrar();
                                       }
                                       %>
                                        </tbody>
                                    </table>
                                </div>
                                <!-- /.table-responsive -->
                                
                            </div>
                            <!-- /.panel-body -->
                        </div>
                        <!-- /.panel -->
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
             
                    
            <!-- /#page-wrapper -->

        </div>
        <!-- /#wrapper -->

        <!-- jQuery -->
        <script src="js/js/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="js/js/metisMenu.min.js"></script>

        <!-- DataTables JavaScript -->
        <script src="js/js/dataTables/jquery.dataTables.min.js"></script>
        <script src="js/js/dataTables/dataTables.bootstrap.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="js/js/startmin.js"></script>

        <!-- Page-Level Demo Scripts - Tables - Use for reference -->
        <script>
            $(document).ready(function() {
                $('#dataTables-example').DataTable({
                        responsive: true
                });
            });
        </script>

    </body>
</html>
