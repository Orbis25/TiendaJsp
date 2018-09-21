<%@page import="org.apache.commons.codec.digest.DigestUtils"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.dao.Conexion"%>


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
        <meta name="description" content="">
        <meta name="author" content="">

        <script defer src="https://use.fontawesome.com/releases/v5.0.8/js/solid.js" integrity="sha384-+Ga2s7YBbhOD6nie0DzrZpJes+b2K1xkpKxTFFcx59QmVPaSA8c7pycsNaFwUK6l"
            crossorigin="anonymous"></script>
        <script defer src="https://use.fontawesome.com/releases/v5.0.8/js/fontawesome.js" integrity="sha384-7ox8Q2yzO/uWircfojVuCQOZl+ZZBg2D2J5nkpLqzH1HY0C1dHlTKIbpRz/LG23c"
            crossorigin="anonymous"></script>
        <title>Admin</title>


        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="css/metisMenu.min.css" rel="stylesheet">

        <!-- DataTables CSS -->
        <link href="css/dataTables/dataTables.bootstrap.css" rel="stylesheet">

        <!-- DataTables Responsive CSS -->
        <link href="css/dataTables/dataTables.responsive.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/startmin.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
    
        <div class="container-fluid" id="wrapper">
    
            
            
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
                            <i class="fa fa-user fa-fw"></i> <%=n.getNombre()%>
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
                                        <a href="#">
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
                        <h1 class="page-header">Componentes</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <!-- /.col-lg-12 -->
                    <div class="col-lg-6">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Listado de Categorias <a href="#" data-toggle="modal" data-target="#Modalct"><img src="img/laptop24.png"></a>
                            </div>
                            <!-- /.panel-heading -->
                            <div class="panel-body">
                                <div class="dataTable_wrapper">
                                    <table class="table table-striped table-bordered table-hover dataTable" >
                                        <thead>
                                            <tr>
                                                <th>Nombre</th>
                                                <th>Action</th>
                                                
                                            </tr>
                                        </thead>
                                        <tbody>
                                             <% 
                                            
                                            Conexion c = new Conexion();
                                            try{
                                            Connection con = c.getConnection();
                                            String sql = "Select *from categoria";
                                            Statement st = con.createStatement();
                                            ResultSet rs = st.executeQuery(sql);
                                            while(rs.next()){
                                            %>
                                            <tr class="odd gradeX">
                                                <td><%=rs.getString(2)%></td>
                                             <td>
                                                 <%
                                                 char array[]=rs.getString(1).toCharArray(); 
                                                for(int i=0;i<array.length;i++){ 
                                                    array[i]=(char)(array[i]+(char)14); 
                                                } 
                                                String encriptado =String.valueOf(array); 
                                                 %>
                                                 <a href="Admin?deleteC=<%=encriptado%>"><img src="img/delete.png"></a>
                                                
                                             </td>
                                            </tr>
                                                   
                                               <%
                                        }
                                        }catch(Exception e){
                                    System.out.println("usuario "+e);
                                       }finally{
                                       c.cerrar();
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
                    <div class="col-lg-6">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Disco Duros <a href="#" data-toggle="modal" data-target="#Modaldc"><img src="img/hdd24.png"></a>
                            </div>
                            <!-- /.panel-heading -->
                            <div class="panel-body">
                                <div class="dataTable_wrapper">
                                    <table class="table table-striped table-bordered table-hover dataTable">
                                        <thead>
                                            <tr>
                                                <th>Capacidad</th>
                                                <th>tipo</th>
                                                <th>Action</th>
                                                
                                            </tr>
                                        </thead>
                                        <tbody>
                                             <% 
                                            
                                            try{
                                            Connection con = c.getConnection();
                                            String sql = "Select *from disco_duro";
                                            Statement st = con.createStatement();
                                            ResultSet rs = st.executeQuery(sql);
                                            while(rs.next()){
                                            %>
                                            <tr class="odd gradeX">
                                                <td><%=rs.getString(2)%></td>
                                                <td><%=rs.getString(3)%></td>
                                                
                                                <%
                                                 char array[]=rs.getString(1).toCharArray(); 
                                                for(int i=0;i<array.length;i++){ 
                                                    array[i]=(char)(array[i]+(char)14); 
                                                } 
                                                String encriptado =String.valueOf(array); 
                                                 %>
                                                
                                                
                                                <td><a href="Admin?deleteD=<%=encriptado%>"><img src="img/delete.png"></a></td>
                                            </tr>
                                                  <%
                                        }
                                        }catch(Exception e){
                                    System.out.println("usuario "+e);
                                       }finally{
                                       c.cerrar();
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
                </div>
                <div class="row">
                    <!-- /.col-lg-12 -->
                  <div class="col-lg-6">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Listado de Marcas <a href="#" data-toggle="modal" data-target="#Modalmarcas" ><img src="img/Marca.png"></a>
                            </div>
                            <!-- /.panel-heading -->
                            <div class="panel-body">
                                <div class="dataTable_wrapper">
                                    <table class="table table-striped table-bordered table-hover dataTable">
                                       <thead>
                                            <tr>
                                                <th>Nombre</th>
                                                <th>Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                             <% 
                                            
                                            try{
                                            Connection con = c.getConnection();
                                            String sql = "Select *from marca";
                                            Statement st = con.createStatement();
                                            ResultSet rs = st.executeQuery(sql);
                                            while(rs.next()){
                                            %>
                                            <%
                                                 char array[]=rs.getString(1).toCharArray(); 
                                                for(int i=0;i<array.length;i++){ 
                                                    array[i]=(char)(array[i]+(char)14); 
                                                } 
                                                String encriptado =String.valueOf(array); 
                                              %>
                                        
                                            <tr class="odd gradeX">
                                                <td><%=rs.getString(3)%></td>
                                               <td><a href="Admin?deleteM=<%=encriptado%>"><img src="img/delete.png"></a></td>
    
                                            </tr>
                                                 <%
                                        }
                                        }catch(Exception e){
                                    System.out.println("usuario "+e);
                                       }finally{
                                       c.cerrar();
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
                    <div class="col-lg-6">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Procesadores <a href="#" data-toggle="modal" data-target="#ModalP"><img src="img/procesador.png"></a>
                            </div>
                            <!-- /.panel-heading -->
                            <div class="panel-body">
                                <div class="dataTable_wrapper">
                                    <table class="table table-striped table-bordered table-hover dataTable">
                                        <thead>
                                            <tr>
                                                <th>Modelo</th>
                                                <th>action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <% 
                                            
                                            try{
                                            Connection con = c.getConnection();
                                            String sql = "Select *from procesador";
                                            Statement st = con.createStatement();
                                            ResultSet rs = st.executeQuery(sql);
                                            while(rs.next()){
                                            %>
                                             
                                        
                                            <tr class="odd gradeX">
                                                <td><%=rs.getString(2)%></td>
                                                <%
                                                 char array[]=rs.getString(1).toCharArray(); 
                                                for(int i=0;i<array.length;i++){ 
                                                    array[i]=(char)(array[i]+(char)14); 
                                                } 
                                                String encriptado =String.valueOf(array); 
                                              %>
                                             <td><a href="Admin?deletePr=<%=encriptado%>"><img src="img/delete.png"></a></td>
                
                                            </tr>
                                                      <%
                                        }
                                        }catch(Exception e){
                                    System.out.println("usuario "+e);
                                       }finally{
                                       c.cerrar();
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
                </div>
                <div class="row">
                    <!-- /.col-lg-12 -->
                    <div class="col-lg-6">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Listado de Rams <a href="#"  data-toggle="modal" data-target="#ModalR" ><img src="img/memory.png"></a>
                            </div>
                            <!-- /.panel-heading -->
                            <div class="panel-body">
                                <div class="dataTable_wrapper">
                                    <table class="table table-striped table-bordered table-hover dataTable">
                                        <thead>
                                            <tr>
                                                <th>Capacidad</th>
                                                <th>Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <% 
                                            
                                            try{
                                            Connection con = c.getConnection();
                                            String sql = "Select *from ram";
                                            Statement st = con.createStatement();
                                            ResultSet rs = st.executeQuery(sql);
                                            while(rs.next()){
                                            %>
                                            <tr class="odd gradeX">
                                                <td><%=rs.getString(2)%></td>
                                                <%
                                                 char array[]=rs.getString(1).toCharArray(); 
                                                for(int i=0;i<array.length;i++){ 
                                                    array[i]=(char)(array[i]+(char)14); 
                                                } 
                                                String encriptado =String.valueOf(array); 
                                              %>
                                             <td><a href="Admin?deleteR=<%=encriptado%>"><img src="img/delete.png"></a></td>
                
                
                                            </tr>
                                                         <%
                                        }
                                        }catch(Exception e){
                                    System.out.println("usuario "+e);
                                       }finally{
                                       c.cerrar();
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
                    <div class="col-lg-6">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Listado de Sistemas <a href="#" data-toggle="modal" data-target="#ModalS" ><img src="img/windows.png"></a>
                            </div>
                            <!-- /.panel-heading -->
                            <div class="panel-body">
                                <div class="dataTable_wrapper">
                                    <table class="table table-striped table-bordered table-hover dataTable">
                                        <thead>
                                            <tr>
                                                <th>Nombre</th>
                                                <th>Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            
                                            <%
                                                 try{
                                            Connection con = c.getConnection();
                                            String sql = "Select *from sistema";
                                            Statement st = con.createStatement();
                                            ResultSet rs = st.executeQuery(sql);
                                            while(rs.next()){
                                            %>
                                            <tr class="odd gradeX">
                                                <td><%=rs.getString(2)%></td>
                                           <%
                                                 char array[]=rs.getString(1).toCharArray(); 
                                                for(int i=0;i<array.length;i++){ 
                                                    array[i]=(char)(array[i]+(char)14); 
                                                } 
                                                String encriptado =String.valueOf(array); 
                                              %>
                                             <td><a href="Admin?deleteS=<%=encriptado%>"><img src="img/delete.png"></a></td>
                
                                            </tr>
                                                           <%
                                        }
                                        }catch(Exception e){
                                    System.out.println("usuario "+e);
                                       }finally{
                                       c.cerrar();
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
                </div>
                <!-- /.row -->
            <!-- /#page-wrapper -->

        </div>
        <!-- /#wrapper -->
      
             <div class="modal fade " id="Modalct" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="false" style="background-color: rgba(0, 0, 0, 0.5);">
                 <div class="modal-dialog" role="document"> 
                     <div class="modal-content"> <div class="modal-header"> <button type="button" class="close" data-dismiss="modal" aria-label="Close"> 
                      <span aria-hidden="true">&times;</span> 
                             </button> 
                             <h4 class="modal-title" id="myModalLabel">Registrar Categorias</h4> 
                         </div> 
                      <div class="modal-body col-lg-6">
                          <form class="form-group" method="POST" action="Admin">
                              <input type="hidden" name="accion" value="cp_categoria">
                              <input type="text" class="form-control" name="cp_categoria" placeholder="Categoria" required>
                              <br>
                              <button type="submit" class="btn btn-primary">Agregar</button> 
                              <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button> 
			</form>
                      </div> 
                         <div class="modal-footer"> 
                         
                            </div>
                     </div> 
                 </div>
                </div>
                <div class="modal fade" id="Modaldc" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="false" style="background-color: rgba(0, 0, 0, 0.5);">
                         <div class="modal-dialog" role="document"> <div class="modal-content"> <div class="modal-header"> <button type="button" class="close" data-dismiss="modal" aria-label="Close"> 
                              <span aria-hidden="true">&times;</span> 
                                     </button> 
                                     <h4 class="modal-title" id="myModalLabel">Registrar Discos</h4> 
                                 </div> 
                              <div class="modal-body col-lg-6">
                                  <form class="form-group" method="POST" action="Admin">
                                      <input type="text" class="form-control numero" name="cp_capacidad" placeholder="Capacidad" required>
                                     <br>
                                     <input type="text" class="form-control" name="cp_tipo" placeholder="Tipo" required>
                                     <input type="hidden" name="accion" value="cp_disco"><br>
                                     <button type="submit" class="btn btn-primary">Agregar</button>
                                   <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button> 
                                </form>
                              </div> 
                                 <div class="modal-footer"> 
                                   
                                    </div>
                             </div> 
                         </div>
                       </div>
                       <div class="modal fade" id="Modalmarcas" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="false" style="background-color: rgba(0, 0, 0, 0.5);">
                         <div class="modal-dialog" role="document"> <div class="modal-content"> <div class="modal-header"> <button type="button" class="close" data-dismiss="modal" aria-label="Close"> 
                              <span aria-hidden="true">&times;</span> 
                                     </button> 
                                     <h4 class="modal-title" id="myModalLabel">Registrar Marcas</h4> 
                                 </div> 
                              <div class="modal-body col-lg-6">
                                  <form class="form-group" action="Admin" method="POST">
                                      <input type="text" class="form-control" name="nombre_marca" placeholder="Nombre" required>
                                      <input type="hidden" name="accion" value="cp_marca">
                                      <br>
                                     <select class="form-control" name="cp_msistema" required>
                                    <option value="" disabled selected>sistema</option>
                                    <%

                                    try{

                                       Connection con = c.getConnection();
                                       String sql = "Select id_sistema,sistema from sistema";
                                       Statement st = con.createStatement();
                                       ResultSet rs = st.executeQuery(sql);
                                       while(rs.next()){
                                    %>


                                    <option value="<%=rs.getInt("id_sistema")%>"><%=rs.getString("sistema")%></option>;

                                    <%
                                     }
                                     }catch(Exception e){
                                 System.out.println("sistema"+e);
                                    }finally{
                                    c.cerrar();
                                    }
                                    %>
                                     </select>
                                     
                                      <br>
                                      <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button> 
                                      <button type="submit" class="btn btn-primary">Agregar</button> 
                                </form>
                              </div> 
                                 <div class="modal-footer"> 
                                  
                                    </div>
                             </div> 
                         </div>
                       </div>
                       <div class="modal fade" id="ModalP" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="false" style="background-color: rgba(0, 0, 0, 0.5);">
                         <div class="modal-dialog" role="document"> <div class="modal-content"> <div class="modal-header"> <button type="button" class="close" data-dismiss="modal" aria-label="Close"> 
                              <span aria-hidden="true">&times;</span> 
                                     </button> 
                                     <h4 class="modal-title" id="myModalLabel">Registrar Procesador</h4> 
                                 </div> 
                              <div class="modal-body col-lg-6">
                                  <form class="form-group" action="Admin" method="POST">
                                      <input type="text" class="form-control" name="modelo_procesador" placeholder="Modelo" required>
                                     <input type="hidden" name="accion" value="cp_procesador"><br>
                                   <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button> 
                                   <button type="submit" class="btn btn-primary">Agregar</button> 
                                </form>
                              </div> 
                                 <div class="modal-footer"> 
                                 
                                    </div>
                             </div> 
                         </div>
                       </div>
                     <div class="modal fade" id="ModalR" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="false" style="background-color: rgba(0, 0, 0, 0.5);">
                         <div class="modal-dialog" role="document"> <div class="modal-content"> <div class="modal-header"> <button type="button" class="close" data-dismiss="modal" aria-label="Close"> 
                              <span aria-hidden="true">&times;</span> 
                                     </button> 
                                     <h4 class="modal-title" id="myModalLabel">Memoria Ram</h4> 
                                 </div> 
                              <div class="modal-body col-lg-6">
                                  <form class="form-group" action="Admin" method="POST" >
                                      <input type="text" class="form-control numero" name="cp_capacidad" placeholder="Capacidad" required>
                                      <input type="hidden" name="accion" value="cp_ram"><br>
                                      <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button> 
                                      <button type="submit" class="btn btn-primary">Agregar</button> 
                                </form>
                              </div> 
                                 <div class="modal-footer"> 
                                  
                                    </div>
                             </div> 
                         </div>
                       </div>
                       <div class="modal fade" id="ModalS" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" data-backdrop="false" style="background-color: rgba(0, 0, 0, 0.5);">
                         <div class="modal-dialog" role="document"> <div class="modal-content"> <div class="modal-header"> <button type="button" class="close" data-dismiss="modal" aria-label="Close"> 
                              <span aria-hidden="true">&times;</span> 
                                     </button> 
                                     <h4 class="modal-title" id="myModalLabel">Sistemas</h4> 
                                 </div> 
                              <div class="modal-body col-lg-6">
                                  <form class="form-group" action="Admin" method="POST">
                                      <input type="text" class="form-control" name="nombre_sistema" placeholder="Nombre" required>
                                     <input type="hidden" name="accion" value="cp_sistema"><br>
                                      <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button> 
                                      <button type="submit" class="btn btn-primary">Agregar</button> 
                                </form>
                              </div> 
                                 <div class="modal-footer"> 
                                 
                                    </div>
                             </div> 
                         </div>
                       </div>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
        <!--solo valores numericos-->
         <script src="js/jquery.numeric.js"></script>
        <!-- Page-Level Demo Scripts - Tables - Use for reference -->
        <script>
            $(document).ready(function() {
                $('.dataTable').DataTable({
                        responsive: true                         
                });
            });
           $(document).ready(function () {
            $(".numero").numeric();
            });
        </script>
    </body>
</html>
