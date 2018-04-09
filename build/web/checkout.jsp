

<%@page import="com.Bean.Marca"%>
<%@page import="com.Bean.Venta"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.Bean.Categoria"%>
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


</head>

<body>
	<!-- HEADER -->
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
                                                                                 
                                                                        <a href="checkout.jsp" class="text-center main-btn btn-block"> Checkout</a>
                                                                    <!--crear algo para el total-->
                                                                    <button class="primary-btn btn-block">Total: $  <%=total%></button>
										
									</div>
									
								</div>
                                                                   
							</div>
						</li>
						<!-- /Cart -->

						<!-- Mobile nav toggle-->
						<li class="nav-toggle">
							<button class="nav-toggle-btn main-btn icon-btn "><i class="fa fa-bars"></i></button>
						</li>
						<!-- / Mobile nav toggle -->
                                                <%if(total==0){%>
                                                        
                                                         <br><br><br><br><br><br>
                                                        <div class="container">
                                                    <div class="row justify-content-center mt-5 ">
                                                        <div class="col-8 bg-light alert">
                                                            <h2 class="alert-heading  bg-heading"> Su carrito esta vacio
                                                                <span class="span-comp"><img src="img/icons8-truck-48.png"></span>
                                                            </h2>
                                                            <p>Porfavor elija un producto y vuelva
                                                                <span class="fa fa-meh-o"></span> <br>
                                                                <a class="btn main-btn" href="index.jsp">Volver a la tienda <span class="fa fa-shopping-cart"></span> </a>
                                                            </p>
                                                            <hr>
                                                            
                                                        </div>
                                                    </div>
                                                </div>
                                                   
                                                     
                                                    
                                                    
                                                    <%}%>
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
                                                                                 <img src="./img/funcionamiento.png" alt="" >
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
						
							
						<li><a href="products.jsp">Ver Todas</a></li>
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
				<li><a href="index.jsp">Home</a></li>
				<li class="active">Checkout</li>
			</ul>
		</div>
	</div>
	<!-- /BREADCRUMB -->

	<!-- section -->
	<div class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
                            <form id="checkout-form" class="clearfix" method="post" action="VentaC">
					<div class="col-md-6">
                                             
						<div class="billing-details">
                                                     <%if(sesionOK.getAttribute("usuario")==null){
                                                                %>
							<p>¿Ya eres cliente? <a href="Login.jsp">Iniciar Sesion</a></p>
							<div class="section-title">
								<h3 class="title">Detalle de factura</h3>
							</div>
							<div class="form-group">
                                                            <input class="input" type="text" name="fNombre" placeholder="Nombre" required>
							</div>
							<div class="form-group">
								<input class="input" type="text" name="fApellidos" placeholder="Apellidos" required>
							</div>
							<div class="form-group">
								<input class="input" type="email" name="email_noUser" placeholder="Email" required>
							</div>
                                                        <input class="input" type="hidden" name="accion" value="noUser">
                                                        <input class="input" type="hidden" name="usuario" value="<%=usu.getId_user()%>">
                                                        <input class="input" type="hidden" name="email_usuario" value="<%=usu.getCorreo()%>">
                                                         <input class="input" type="hidden" name="nombre_usuario" value="<%=usu.getNombre()%>">
                                                        <%}%>
                                                        <input class="input" type="hidden" name="accion" value="User">
                                                        <input class="input" type="hidden" name="usuario" value="<%=usu.getId_user()%>">
                                                        <input class="input" type="hidden" name="email_usuario" value="<%=usu.getCorreo()%>">
                                                         <input class="input" type="hidden" name="nombre_usuario" value="<%=usu.getNombre()%>">
							<div class="form-group">
								<input class="input" type="text" name="fDireccion" placeholder="Direccion" required>
							</div>
							<div class="form-group">
								<input class="input" type="text" name="fCiudad" placeholder="Ciudad" required>
							</div>
							<div class="form-group">
								<input class="input" type="text" name="fPais" placeholder="Pais" required>
							</div>
							<div class="form-group">
                                                            <input class="input" id="number" type="text" name="fcodigo-postal" placeholder="Codigo Postal" required>
							</div>
							<div class="form-group">
								<input class="input" type="tel" name="ftelefono" placeholder="Telefono" required>
							</div>
							
						</div>
					</div>

					<div class="col-md-6">
						<div class="shiping-methods">
							<div class="section-title">
								<h4 class="title">Metodos de envio</h4>
							</div>
							<div class="input-checkbox">
                                                            <input type="radio" name="envio" value="free" id="shipping-1" checked>
								<label for="shipping-1">Envio Gratuito -  $0.00</label>
								<div class="caption">
									<p>Su pedido llegara en 10 dias<p>
								</div>
							</div>
							<div class="input-checkbox">
                                                              <input type="radio" name="envio" value="pago" id="shipping-2">
								<label for="shipping-2">Standard - $4.00</label>
								<div class="caption">
									<p>Su pedido llegara en 2 dias<p>
								</div>
							</div>
						</div>

						<div class="payments-methods">
							<div class="section-title">
								<h4 class="title">Metodos de Pago</h4>
							</div>
							<div class="input-checkbox">
								<input type="radio" name="payments" id="payments-1" checked>
								<label for="payments-1">Pago al momento de llevarle su pedido</label>
								<div class="caption">
                                                                <p>Debera pagar al momento de entregarle el pedido y presentar la factura</p>
								</div>
							</div>
							
						</div>
					</div>

					<div class="col-md-12">
						<div class="order-summary clearfix">
							<div class="section-title">
								<h3 class="title">Revision del Producto</h3>
							</div>
							<table class="shopping-cart-table table">
								<thead>
									<tr>
										<th>Producto</th>
										<th></th>
										<th class="text-center">Pricio</th>
										<th class="text-center">Cantidad</th>
										<th class="text-right"></th>
									</tr>
								</thead>
								<tbody>
									<tr>
                                                                              <%                                                                                
                                                                                  for(Venta v : car){
                                                                                      
                                                                              %>
                                                                      
                                                                                    <td class="thumb"><img src="./img/<%=v.getProduct().getImagen()%>" alt=""></td>
										<td class="details">
											<a href="#"><%=v.getProduct().getNombre()%></a>
											<ul>
												<li><span>Color: <%=v.getProduct().getColor()%></span></li>
											</ul>
										</td>
										<td class="price text-center"><strong>$<%=v.getProduct().getPrecio()%></strong><br></td>
                                                                                <td class="qty text-center"><input class="input" type="text"  placeholder="<%=v.getCantidad_producto()%>" disabled="true"></td>
                                                                                <input class="input" name="cantidad_v" type="hidden" value="<%=v.getCantidad_producto()%>" placeholder="<%=v.getCantidad_producto()%>">
                                                                                <td class="qty text-center"><input class="input" name="producto_v" type="hidden" value="<%=v.getProduct().getId_producto()%>" ></td>
                                                                                <input type="hidden" name="total" value="<%=total%>">
                                                                                </form>
                                                                                <td class="text-right">
                                                                                    <form action="Car" method="post">
                                                                                        <input class="input" name="producto_v" type="hidden" value="<%=v.getProduct().getId_producto()%>" >
                                                                                         <input type="hidden" name="accion" value="eliminar_p">
                                                                                    <button type="submit" class="main-btn icon-btn"><i class="fa fa-close"></i></button>
                                                                                    </form>
                                                                                </td>
									</tr>
									<%  
                                                                          }
                                                                        %>       
								</tbody>
								<tfoot>						
									<tr>
										<th class="empty" colspan="3"></th>
										<th>TOTAL</th>
										<th colspan="2" class="total">$<%=total%></th>
									</tr>
								</tfoot>
							</table>
							<div class="pull-right">
								<button class="primary-btn">Realizar Pedido</button>
							</div>
						</div>

					</div>
                                                                        
				
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
        <script src="js/jquery.numeric.js"></script>
        <script>
             $(document).ready(function () {
            $("#number").numeric();
            });
        </script>
</body>

</html>
