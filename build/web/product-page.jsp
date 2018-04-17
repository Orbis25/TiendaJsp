
<%@page import="com.Controller.ProductsC"%>
<%@page import="com.Controller.Car"%>
<%@page import="com.Bean.Venta"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.dao.Conexion"%>
<%@page import="com.Bean.Producto"%>
<%@page import="com.Bean.Marca"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.Bean.Categoria"%>
<%@page import="com.dao.ProductoImpl"%>
<%@page import="com.Bean.User"%>
<%@page session="true"%>
<%
User usu = new User();
HttpSession sesionOK = request.getSession();
if(sesionOK.getAttribute("usuario")!=null){
usu = (User) sesionOK.getAttribute("usuario");
}
%>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

	<title>Tech-Shop</title>

	<!-- Google font -->
	<link href="https://fonts.googleapis.com/css?family=Hind:400,700" rel="stylesheet">

	<!-- Bootstrap -->
	<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

	<!-- Slick -->
	<link type="text/css" rel="stylesheet" href="css/slick.css" />
	<link type="text/css" rel="stylesheet" href="css/slick-theme.css" />

	<!-- nouislider -->
	<link type="text/css" rel="stylesheet" href="css/nouislider.min.css" />

	<!-- Font Awesome Icon -->
	<link rel="stylesheet" href="css/font-awesome.min.css">

	<link rel="icon" href="img/laptop.ico">

	<!-- Custom stlylesheet -->
	<link type="text/css" rel="stylesheet" href="css/style.css" />

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->

</head>

<body>
	<header>
		<!-- top Header -->
		<div id="top-header">
			<div class="container">
				<div class="pull-left">
					<span>Bienvenido a Tech-Shop!</span>
				</div>
				<div class="pull-right">
					<ul class="header-top-links">
						<li class="dropdown default-dropdown">
							<a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">USD <i class="fa fa-caret-down"></i></a>
							<ul class="custom-menu">
								<li><a href="#">USD ($)</a></li>
							
							</ul>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- /top Header -->

		<!-- header -->
		<div id="header">
			<div class="container">
				<div class="pull-left">
					<!-- Logo -->
					<div class="header-logo">
						<a class="logo" href="#">
						
							<h2> <span><img src="img/biglaptop.png" alt="" class="logoimg "></span><span class="logo">Tech</span>-Shop</h2>
						</a>
					</div>
					

					<!-- Search -->
					<div class="header-search">
						  <form action="SearchP" method="post">
                                                <input class="input search-input" name="busqueda" type="text" placeholder="Ingrese para buscar">
                                                <button type="submit" class="search-btn"><i class="fa fa-search"></i></button>
						</form>
					</div>
					<!-- /Search -->
				</div>
				<div class="pull-right">
					<ul class="header-btns">
						<!-- Account -->
						<li class="header-account dropdown default-dropdown">
							<div class="dropdown-toggle" role="button" data-toggle="dropdown" aria-expanded="true">
								<div class="header-btns-icon">
									<i class="fa fa-user-o"></i>
								</div>
                                                                <%if(sesionOK.getAttribute("usuario")!=null){
                                                                %>
                                                                <strong class="text-uppercase"><%=usu.getNombre()+""%> <%=usu.getApellido()%><i class="fa fa-caret-down"></i></strong>
                                                                
							</div>
							<ul class="custom-menu">
								<!--<li><a href="#"><i class="fa fa-user-o"></i> Mi CUENTA</a></li>-->
								
								<li><a href="UserL?var=cerrar_sesion_user"><i class="fa fa-unlock-alt"></i>Cerrar Sesion</a></li>
								<!--<li><a href="new_acount.jsp"><i class="fa fa-user-plus"></i> CREAR CUENTA</a></li>-->
							</ul>
                                                                <%
                                                                }else{
                                                                    %>
                                                                      <strong class="text-uppercase">Mi Cuenta<i class="fa fa-caret-down"></i></strong>
                                                                
							</div>
                                                            <ul class="custom-menu">

                                                                  
                                                                    <li><a href="Login.jsp"><i class="fa fa-unlock-alt"></i>Login</a></li>
                                                                    <li><a href="new_acount.jsp"><i class="fa fa-user-plus"></i> CREAR CUENTA</a></li>
                                                            </ul>
                                                                    
                                                                    <% 
                                                                   };%>
						</li>
						<!-- /Account -->
                                                              
						<!-- Cart -->
						<li class="header-cart dropdown default-dropdown">
							<a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
								<div class="header-btns-icon">
									<i class="fa fa-shopping-cart"></i>
									

								</div>
								
                                                           
                                                                <strong class="text-uppercase">MI Carrito:</strong>
								<br>      
							</a>
                                                     
							<div class="custom-menu">
                                                            
								<div id="shopping-cart">
                                                                     
                                                                     <div class="shopping-cart-list">
                                                                          <%double total = 0; int qyt=0;
                                                                        ArrayList<Venta> car = (ArrayList<Venta>)session.getAttribute("carrito");
                                                                         if(car!=null){
                                                                          for(Venta v : car){
                                                                            %>
										<div class="product product-widget">
                                                                                    
											<div  class="product-thumb">
                                                                                            <img src="img/<%=v.getProduct().getImagen()%>" alt="">
											</div>
											<div class="product-body">
                                                                                            <h3 class="product-price"><span>$</span><%=v.getProduct().getPrecio()%> <span class="qty">x<%=v.getCantidad_producto()%></span></h3>
												<h2 class="product-name"><a href="#"><%=v.getProduct().getNombre()%></a></h2>
											</div>
											 
										</div>
                                                                                        
                                                                                 <%  
                                                                                      total = total+(v.getProduct().getPrecio() *v.getCantidad_producto());  
                                                                                              }
                                                                                    } 
                                                                                
                                                                                 %>       
									</div>
                                                                       <%if(total==0){%>
									      <button class="main-btn btn-block">Carrito Vacio <span class="fa fa-meh-o"></span> </button>
                                                                              <button class="primary-btn btn-block">Total: $  <%=total%></button>
                                                                              <%}else{%>
                                                                                  
                                                                              <a class="main-btn btn-block text-center" href="checkout.jsp">Checkout <i class="fa fa-arrow-circle-right"></i></a>
									      <button class="primary-btn btn-block">Total: $  <%=total%></button>
                                                                              <%}%>

									
								</div>
							</div>
						</li>
						<!-- /Cart -->

						<!-- Mobile nav toggle-->
						<li class="nav-toggle">
							<button class="nav-toggle-btn main-btn icon-btn "><i class="fa fa-bars"></i></button>
						</li>
						<!-- / Mobile nav toggle -->
					</ul>
				</div>
			</div>
			<!-- header -->
		</div>
		<!-- container -->
	</header>
	<!-- /HEADER -->

	<!-- NAVIGATION -->
	<div id="navigation">
		<!-- container -->
		<div class="container">
			<div id="responsive-nav">
				<!-- category nav -->
				<div class="category-nav show-on-click">
					<span class="category-header">Categorias<i class="fa fa-list"></i></span>
					<ul class="category-list">
						<li class="dropdown side-dropdown">
							<a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">Laptops y Pc's <i class="fa fa-angle-right"></i></a>
							<div class="custom-menu">
								<div class="row">
                                                                    <div class="col-md-6">
                                                                                 <img src="img/funcionamiento.png" alt="" >
                                                                                </div>
									<div class="col-md-4">
                                                                            
										<ul class="list-links">
											<li><h3 class="list-links-title">
												Nuestras Marcas
											</h3> </li>
                                                                                        <%    
                                                                                            ProductoImpl p = new ProductoImpl();
                                                                                         ArrayList<Marca> marca = p.Marcas();
                                                                                         for(Marca mr: marca){ 
                                                                                          %>
                                                                                          <li><a href="#"<%=mr.getId_marca()%>> <%=mr.getNombre_marca()%> </a></li>
                                                                                        <%
                                                                                        }
                                                                                        %>
                                                                                </ul>
										<hr class="hidden-md hidden-lg">
									</div>
									<div class="col-md-4">
										
									</div>
								</div>
								<div class="row hidden-sm hidden-xs">
									<div class="col-md-12">
										<hr>
										<a class="banner banner-1" href="#">
											<img src="img/banner05.jpg" alt="" height="400">
										</a>
									</div>
								</div>
							</div>
						</li>
						
							
						<li><a href="products.jsp">Ver Todo</a></li>
					</ul>
				</div>
				<!-- /category nav -->

				<!-- menu nav -->
				<div class="menu-nav">
					<span class="menu-header">Menu <i class="fa fa-bars"></i></span>
					<ul class="menu-list">
						<li><a href="index.jsp">Home</a></li>
						<li><a href="products.jsp?page=1">Shop</a></li>											
				</div>
				<!-- menu nav -->
			</div>
		</div>
		<!-- /container -->
	</div>
	<!-- /NAVIGATION -->

	<!-- BREADCRUMB -->
	<div id="breadcrumb">
		<div class="container">
			<ul class="breadcrumb">
				<li><a href="#">Home</a></li>
				<li><a href="#">Products</a></li>
                                
			</ul>
		</div>
	</div>
	<!-- /BREADCRUMB -->

	<!-- section -->
	<div class="section">
		<!-- container -->
		<div class="container">
                    <%if(request.getAttribute("car")!=null){
                                %>
                                
                                
                                
                                <div class=" alert alert-success text-center" role="alert">
                                <span class="fa fa-shopping-bag"></span> <strong><%out.print(request.getAttribute("car"));%></strong>
                                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                  <span aria-hidden="true">&times;</span>
                                </button>
                              </div>

                                
                                <%}%>
			<!-- row -->
			<div class="row"> <%String id_p = "";%>
				<!--  Product Details -->
				<div class="product product-details clearfix">
					<div class="col-md-6">
                                            <%
                                                    ArrayList<Producto> allDetails = p.productoD();

                                                                for(Producto pl: allDetails){

                                                                 %>
						<div id="product-main-view">
                                                    
							<div class="product-view">
                                                            <%id_p =  String.valueOf(pl.getId_producto());%>
                                                            <img src="./img/<%=pl.getImagen()%>" alt="">
							</div>
						</div>
						
					</div>
					<div class="col-md-6">
						<div class="product-body">
							
							<h2 class="product-name"><%=pl.getNombre()%></h2>
							<h3 class="product-price">$<%=pl.getPrecio()%> </h3>
							
							<p><strong>Disponibilidad: </strong><%=pl.getDisponibilidad()%></p>
							<p><strong>Marca:</strong> <%=pl.getMarc()%></p>
							<p><%=pl.getDescripcion()%></p>
							<div class="product-options ">
                                                            <%
                                                               }
                                                               %>
                                                               <select class="input search-categories" required>
                                                               <option  disabled selected>Color</option>
                                                               
                                                                <%
                                               
                                                                ArrayList<Producto> color = p.Colors();

                                                                for(Producto pl: color){

                                                                 %>
                                                                <option><%=pl.getColor()%></option>    
                                                                  <%
                                                                    }
                                                                  %>
                                                              
                                                               </select>
                                                           
							</div>
                                                                  <%int c = 0; %>
                                                                <%
                                               
                                                                ArrayList<Producto> cantidad = p.CDips();

                                                                for(Producto pl: cantidad){

                                                                 %>
                                                                 
                                                                     <p> <%=pl.getCantidad()%> disponibles</p>
                                                                     <%c = Integer.parseInt(pl.getCantidad());%>
                                                                     
							<div class="product-btns">
								<div class="qty-input">
									<span class="text-uppercase">Cantidad: </span>
                                                                        <form action="Car" method="POST">
                                                                            <input id="number" name="cantidad"  class="input float"  min="1"  max="<%=pl.getCantidad()%>" value="1" type="number">
                                                                        
                                                                            
                                                                            
                                                                            <br>
                                                                        <br>
                                                                         <%
                                                                    }
                                                                  %>
                                                                  
								</div>
                                                      		<div class="product-btns"><br>
                                                                    <% for(Producto pl: allDetails){
                                                                          if(pl.getDisponibilidad().equals("si")){
                                                                          %>
                                                                        
                                                                          <button type="submit" id="btn2" class="primary-btn btn-block add-to-cart"><i class="fa fa-shopping-cart"> </i> Añadir al carrito</button>
                                                                              <input type="hidden" name="accion" value="EnviarCarrito">
                                                                              <input type="hidden" name="id" value="<%=id_p%>">
                                                                              <input type="hidden" name="c_disponible" value="<%=c%>">
     
                                                                          </form>
                                                                    <%}%>
                                                                <%}%>                                                                
                                                                </div>
							</div>
						</div>
					</div>
					<div class="col-md-12">
						<div class="product-tab">
							<ul class="tab-nav"><%
								 for(Producto pl: allDetails){

                                                                 %>
								<li><a data-toggle="tab" href="#tab1">Detalles</a></li>
							</ul>
							<div class="tab-content">
								<div id="tab1" class="tab-pane fade in active">
                                                                    <ul>
                                                                        <li><img src="img/memory.png"> Ram : <%=pl.getMemory()%></li><br>
                                                                        <li><img src="img/windows.png"> <strong>/</strong> <img src="img/apple.png"> Sistema : <%=pl.getSistem()%></li>
                                                                        <br><li><img src="img/laptop.png"> Categoria : <%=pl.getCategories()%></li>
                                                                       <br><li><img src="img/procesador.png"> Procesador : <%=pl.getProcesor()%></li>
                                                                       <br><li><img src="img/hdd24.png"> Disco : <%=pl.getDisk()%> <%=pl.getType()%></li>
                                                                       <br><li><img src="img/laptop.png"> Modelo PC : <%=pl.getModelo_pc()%></li>
                                                                    </ul>
                                                                        <%
                                                                }%>
                                                                </div>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
				<!-- /Product Details -->
			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	<!-- /section -->

	<!-- section -->
	<div class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
				<!-- section title -->
				<div class="col-md-12">
					<div class="section-title">
						<h2 class="title">Otros Productos</h2>
					</div>
				</div>
				<!-- section title -->

                                <!-- banner -->
				<div class="col-md-3 col-sm-6 col-xs-6">
					<div class="banner banner-2">
                                                   <%
                                              
                                               ArrayList<Producto> ramdon = p.ProductRamdon();
                                               
                                               for(Producto pl: ramdon){
                                                 
                                                %>
                                                <img src="./img/<%=pl.getImagen()%>" alt="">
						<div class="banner-caption">
                                                    
                                               						                                                                                                          
						</div>
                                                    <div class="product-body">      
									<h2 class="text-info"><br><%=pl.getNombre()%></h2>
									<div class="product-btns">
									<br><br>
                                                                         <form action="ProductsC" method="POST">
                                                                        <input name="var" value="randon" type="hidden">
                                                                            <input name="id_product_rand" type="hidden" value="<%=pl.getId_producto()%>">
                                                                            <input name="model_pc" type="hidden" value="<%=pl.getModelo_pc()%>">
                                                                            									  <input name="price_pc" type="hidden" value="<%=pl.getPrecio()%>">
                                                                            <button type="submit" class="primary-btn btn-sm btn-block add-to-cart text-center">Ver Producto</button>
                                                                        </form>
                                                                        </div>
								</div>
                                                <%
                                            }
                                            %>
					</div>
                                        
				</div>
                                
				<!-- Product Single -->
				<div class="col-md-9 col-sm-6 col-xs-6">
                                    
					<div class="row">
                                           
						<div id="product-slick-1" class="product-slick product-slick-1 ">
							<!-- Product Single -->
                                                         <%
                                                             ArrayList<Producto> lista = p.otherP();
                                                             for(Producto pr: lista){
                                                          %>
							<div class="product product-single ">
								<div class="product-thumb">
                                                                <form action="ProductsC" method="POST">
                                                                        <input name="var" value="randon" type="hidden">
                                                                            <input name="id_product_rand" type="hidden" value="<%=pr.getId_producto()%>">
                                                                            <input name="model_pc" type="hidden" value="<%=pr.getModelo_pc()%>">
                                                                            <input name="price_pc" type="hidden" value="<%=pr.getPrecio()%>">
                                                               		<button class="main-btn quick-view"><i class="fa fa-search-plus"></i> Ver Producto</button>       
                                                               </form>
                                                                        <img src="img/<%=pr.getImagen()%>" alt="">
								</div>
								<div class="product-body">
                                                                    <h3 class="product-price ">$<%=pr.getPrecio()%> </h3>
									<h2 class="product-name text-center "><a href="#" ><%=pr.getNombre()%></a></h2>
									<div class="product-btns">
                                                                       </div>
								</div>
                                                           
							</div>
                                            <%
                                            }
                                            %>
					</div>
                                        </div>
				</div>
				<!-- /Product Single -->

				<!-- Product Single -->

				<!-- /Product Single -->
			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	<!-- /section -->


	<!-- FOOTER -->
	<footer id="footer" class="section section-grey">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
				<!-- footer widget -->
				<div class="col-md-3 col-sm-6 col-xs-6">
					<div class="footer">
						<!-- footer logo -->
						<div class="footer-logo">
						<a class="logo" href="#">
						
							<h2> <span><img src="img/biglaptop.png" alt="" class="logoimg "></span><span class="logo">Tech</span>-Shop</h2>
						</a>
						</div>
						<!-- /footer logo -->

						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna</p>

						<!-- footer social -->
						<ul class="footer-social">
							<li><a href="#"><i class="fa fa-facebook"></i></a></li>
							<li><a href="#"><i class="fa fa-twitter"></i></a></li>
							<li><a href="#"><i class="fa fa-instagram"></i></a></li>
							<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
							<li><a href="#"><i class="fa fa-pinterest"></i></a></li>
						</ul>
						<!-- /footer social -->
					</div>
				</div>
				<!-- /footer widget -->

				<!-- footer widget -->
				<div class="col-md-3 col-sm-6 col-xs-6">
					<div class="footer">
						<h3 class="footer-header">Mi Cuenta</h3>
						<ul class="list-links">
							<li><a href="#">Mi Cuenta</a></li>
                                                         <%if(sesionOK.getAttribute("usuario")==null){
                                                                %>
							<li><a href="Login.jsp">Login</a></li>
						</ul>
                                                        
                                                        <%}
                                                        %>
					</div>
                                        
				</div>
				<!-- /footer widget -->

				<div class="clearfix visible-sm visible-xs"></div>

				<!-- footer widget -->
				<div class="col-md-3 col-sm-6 col-xs-6">
					<div class="footer">
						<h3 class="footer-header">Servicios</h3>
						<ul class="list-links">
							<li><a href="#">Sobre Nosotros</a></li>
							<li><a href="#">Envio y Devolucion</a></li>
							<li><a href="#">Guia de envio</a></li>
							<li><a href="#">FAQ</a></li>
						</ul>
					</div>
				</div>
				<!-- /footer widget -->

				<!-- footer subscribe -->
				
				<!-- /footer subscribe -->
			</div>
			<!-- /row -->
			<hr>
			<!-- row -->
			<div class="row">
				<div class="col-md-8 col-md-offset-2 text-center">
					<!-- footer copyright -->
					<div class="footer-copyright">
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						Copyright &copy;<script>document.write(new Date().getFullYear());</script> Orbisalonzo@gmail.com <i class="fa fa-facebook" aria-hidden="true"></i></a>
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
					</div>
					<!-- /footer copyright -->
				</div>
			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</footer>
	<!-- /FOOTER -->
        
	<!-- jQuery Plugins -->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/slick.min.js"></script>
	<script src="js/nouislider.min.js"></script>
	<script src="js/jquery.zoom.min.js"></script>
	<script src="js/main.js"></script>
</body>

</html>
