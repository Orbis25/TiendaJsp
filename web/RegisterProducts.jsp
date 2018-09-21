<%@page import="com.Controller.Admin"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.dao.Conexion"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.Bean.Procesador"%>
<%@page import="com.dao.AdminImpl"%>

<%@page session="true"%>

<%
com.Bean.Admin n = new com.Bean.Admin();
HttpSession sesionOK = request.getSession();
if(sesionOK.getAttribute("admin")!=null){
n = (com.Bean.Admin) sesionOK.getAttribute("admin");

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
        <meta  content="">
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
                                        <a href="tableUser.jsp">
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
                        <h1 class="page-header">Productos</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->            
            
                <!-- /#page-wrapper -->
             <div class="row ">
                <div class="col-sm-12">
                    <form action="Admin" method="POST" class="form-group">
                        <%
                        String img = request.getParameter("img");
                        %>
                        <div class="col-sm-6">
                        <label>Registrar Producto</label>
                        <input type="text" class="form-control " placeholder="Nombre" name="nombre" required>
                        <br>
                        <select class="form-control" name="marca" required>
                              <option value="" disabled selected>marca</option>
                            <%
                               Conexion cn = new Conexion();
                            try{
                              
                               Connection con = cn.getConnection();
                               String sql = "Select id_marca,marca from marca";
                               Statement st = con.createStatement();
                               ResultSet rs = st.executeQuery(sql);
                               while(rs.next()){
                            %>
                           
                                
                            <option value="<%=rs.getInt("id_marca")%>"><%=rs.getString("marca")%></option>;
                              
                            <%
                             }
                             }catch(Exception e){
                         System.out.println("error en la conexion marca"+e);
                            }finally{
                            cn.cerrar();
                            }
                            %>
                             </select>  
                        <br>
                        <input type="text" name="modelo_pc" class="form-control " placeholder="modelo" required>
                        <br>

                       <select class="form-control" name="categoria" required>
                              <option value="" disabled selected>categoria</option>
                            <%
                               
                            try{
                              
                               Connection con = cn.getConnection();
                               String sql = "Select id_categoria,categoria from categoria";
                               Statement st = con.createStatement();
                               ResultSet rs = st.executeQuery(sql);
                               while(rs.next()){
                            %>
                           
                                
                            <option value="<%=rs.getInt("id_categoria")%>"><%=rs.getString("categoria")%></option>;
                              
                            <%
                             }
                             }catch(Exception e){
                            System.out.println("categoria"+e);
                            }finally{
                            cn.cerrar();
                            }
                            %>
                             </select>
                        <br>
                        <input type="text" class="form-control" id="numero" placeholder="precio" name="precio" required>
                        <br>
                        <select class="form-control" name="color" required>
                            <option value="" disabled selected>Color</option>
                            <option value="negro">Negro</option>
                            <option value="blanco">Blanco</option>
                            <option value="plateado">plateado</option>
                            <option value="rojo">rojo</option>
                        </select>
                        <br>
                             <select class="form-control" name="procesador" required>
                              <option value="" disabled selected>Procesador</option>
                            <%
                               
                            try{
                              
                               Connection con = cn.getConnection();
                               String sql = "Select idProcesador,modelo from procesador";
                               Statement st = con.createStatement();
                               ResultSet rs = st.executeQuery(sql);
                               while(rs.next()){
                            %>
                           
                                
                            <option value="<%=rs.getInt("idProcesador")%>"><%=rs.getString("modelo")%></option>;
                              
                            <%
                             }
                             }catch(Exception e){
                         System.out.println("procesador"+e);
                            }finally{
                            cn.cerrar();
                            }
                            %>
                             </select>  
                        <br>
                         <select class="form-control" name="ram" required>
                              <option value="" disabled selected>Ram</option>
                            <%
                               
                            try{
                              
                               Connection con = cn.getConnection();
                               String sql = "Select id_ram,ram from ram";
                               Statement st = con.createStatement();
                               ResultSet rs = st.executeQuery(sql);
                               while(rs.next()){
                            %>
                           
                                
                            <option value="<%=rs.getInt("id_ram")%>"><%=rs.getInt("ram")%></option>;
                              
                            <%
                             }
                             }catch(Exception e){
                         System.out.println("procesador"+e);
                            }finally{
                            cn.cerrar();
                            }
                            %>
                             </select>  
                        <br>
                        <br>
                        </div>
                        <div class="col-sm-6">
                            <br>
                           
                            <br>
                            <select class="form-control" name="disco" required>
                              <option value="" disabled selected>Disco Duro</option>
                            <%
                               
                            try{
                              
                               Connection con = cn.getConnection();
                               String sql = "Select id_disco,disco,tipo from disco_duro";
                               Statement st = con.createStatement();
                               ResultSet rs = st.executeQuery(sql);
                               while(rs.next()){
                            %>
                           
                                
                            <option value="<%=rs.getInt("id_disco")%>"><%=rs.getString("disco")+"  "+rs.getString("tipo")%></option>;
                              
                            <%
                             }
                             }catch(Exception e){
                         System.out.println("procesador"+e);
                            }finally{
                            cn.cerrar();
                            }
                            %>
                             </select>  
                            <br>                 
                            <label >Descripcion</label><br>
                             <input type="text" class="form-control" placeholder="descripcion" name="descripcion" required>
                            <br>                           
                              <select class="form-control" name="disponible" required>
                              <option value="" disabled selected>Disponibilidad</option>
                              <option value="si">si</option>
                              <option value="no">no</option>
                              </select>
                            <br>
                            <button type="submit"  class="btn btn-primary btn-block center-block">Registrar</button>
                            <input type="hidden" name="txtimagen" value="<%=img%>">
                            <input type="hidden" name="accion" value="registrarProducto">
                            <br>
                            <a href="tableProducts.jsp" class="btn btn-danger center-block">Regresar</a>
                        </div>      
                    </form>
                </div>
             </div>
                </div>     
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
        <!--for numeric and decimals-->
        <script src="js/jquery.numeric.js"></script>
        <script>
            $(document).ready(function() {
                $('#dataTables-example').DataTable({
                        responsive: true
                });
            });      
            $(document).ready(function () {
            $("#numero").numeric();
            })

        </script>
    </body>
</html>
