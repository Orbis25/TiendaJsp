

<%@page import="com.Bean.Venta"%>
<%@page import="com.Bean.User"%>
<%@page import="com.Bean.Categoria"%>
<%@page import="com.Bean.Marca"%>
<%@page import="com.Bean.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.dao.ProductoImpl"%>
<%@page session = "true"%>

<%
    //capturando la session
User usu = new User();

HttpSession sesionOk =  request.getSession();
if(sesionOk.getAttribute("usuario")!=null){
usu = (User) sesionOk.getAttribute("usuario");
%>
<%
}
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>Shop-Geek</title>

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
	<link type="text/css" rel="stylesheet" href="css/style.css"/>
</head>

<body>
	<!-- HEADER -->
	<header>
		<!-- top Header -->
		<div id="top-header">
			<div class="container">
				<div class="pull-left">
					<span>Bienvenido a Shop-Geek!</span>
				</div>
				<div class="pull-right">
					<ul class="header-top-links">
						<li class="dropdown default-dropdown">
							<a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">USD </a>
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
						
                                                    <h2> <a href="index.jsp"> <span><img src="img/logo 1.png" width="150" alt="" class="logoimg "></span></a></h2>
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
                                                                <%if(sesionOk.getAttribute("usuario")!=null){
                                                                %>
                                                                <strong class="text-uppercase"><%=usu.getNombre()+""%> <%=usu.getApellido()%><i class="fa fa-caret-down"></i></strong>
    							</div>
							<ul class="custom-menu">
								
								<li><a href="checkout.jsp"><i class="fa fa-check"></i> Checkout</a></li>
								<li><a href="UserL?var=cerrar_sesion_user"><i class="fa fa-unlock-alt"></i>Cerrar Sesion</a></li>
							</ul>
                                                                <%
                                                                }else{
                                                                    %>
                                                                      <strong class="text-uppercase">Mi Cuenta<i class="fa fa-caret-down"></i></strong>
                                                                
							</div>
                                                            <ul class="custom-menu">

                                                                    <li><a href="checkout.jsp"><i class="fa fa-check"></i> Checkout</a></li>
                                                                    <li><a href="Login.jsp"><i class="fa fa-unlock-alt"></i>Login</a></li>
                                                                    <li><a href="new_acount.jsp"><i class="fa fa-user-plus"></i> CREAR CUENTA</a></li>
                                                            </ul>
                                                                    
                                                                    <% 
                                                                   }%>
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
									</div>
									<div class="shopping-cart-btns">
                                                                            <%if(total==0){%>
									      <button class="main-btn btn-block">Carrito Vacio <span class="fa fa-meh-o"></span> </button>
                                                                              <button class="primary-btn btn-block">Total: $  <%=total%></button>
                                                                              <%}else{%>
                                                                                  
                                                                              <a class="main-btn btn-block text-center" href="checkout.jsp">Checkout <i class="fa fa-arrow-circle-right"></i></a>
									      <button class="primary-btn btn-block">Total: $  <%=total%></button>
                                                                              <%}%>
                                                                             
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
				<div class="category-nav">
					<span class="category-header">Menu<i class="fa fa-list"></i></span>
					<ul class="category-list">
						<li class="dropdown side-dropdown">
							<a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">Conoce nuestras marcas <i class="fa fa-angle-right"></i></a>
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
									</div>
								</div>
								<div class="row hidden-sm hidden-xs">
									<div class="col-md-12">
										<hr>
										<a class="banner banner-1" href="#">
											<img src="./img/banner05.jpg" alt="" height="400">
										</a>
									</div>
								</div>
							</div>
						</li>
					
							
						<li><a href="products.jsp?page=1">Ver Todo</a></li>
					</ul>
				</div>
				<!-- /category nav -->

				<!-- menu nav -->
				<div class="menu-nav">
					<span class="menu-header">Menu <i class="fa fa-bars"></i></span>
					<ul class="menu-list">
						<li><a href="index.jsp">Home</a></li>
						<li><a href="products.jsp?page=1">Shop</a></li>
						<li><a href="#lonuevo">Laptops</a></li>																										
				</div>
				<!-- menu nav -->
			</div>
		</div>
		<!-- /container -->
	</div>
	<!-- /NAVIGATION -->

	<!-- HOME -->
	<div id="home">
		<div class="container">			
			<div class="home-wrap">				 
                            <div id="home-slick"  >
                                         <%
                                             ArrayList<Producto> slider = p.Slider();
                                               for(Producto pr: slider){ 
                                                %>
					<div class="banner banner-1">
                                            <img src="img/<%=pr.getImagen()%>" width="625" height="550">
						<div class="banner-caption text-center">
                                                    
							<h1 class="color-banner"><%=pr.getNombre()%></h1>
							<br><br>
                                                         <form action="ProductsC" method="POST">
                                                             <input name="var" value="randon" type="hidden">
                                                         <input name="id_product_rand" type="hidden" value="<%=pr.getId_producto()%>">
                                                         <input name="model_pc" type="hidden" value="<%=pr.getModelo_pc()%>">
							 <input name="price_pc" type="hidden" value="<%=pr.getPrecio()%>">
                                                         <button class="main-btn quick-view"><i class="fa fa-search-plus"></i> Ver Producto</button>
                                                       </form>
						</div>
					</div>
                                           <%
                                            }
                                     %>
				</div>
			</div>
		</div>
	</div>
	<!-- /HOME -->
        
	

	<!-- section -->
	<div class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
				<!-- section-title -->
				<div class="col-md-12">
					<div class="section-title">
						<h2 class="title" id="lonuevo">Nuestras Laptops</h2>
						<div class="pull-right">
                                                    <div class="product-slick-dots-1 custom-dots">
                                                        </div>
						</div>
					</div>
				</div>
				<!-- /section-title -->

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
				<div class="col-md-9 col-sm-6 col-xs-6">
					<div class="row">
						<div id="product-slick-1" class="product-slick product-slick-1 ">
							<!-- Product Single -->
                                                         <%
                                             
                                               ArrayList<Producto> lista = p.ListLaptops();
                                               
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
                                                                    <h3 class="product-price "><span>$</span><%=pr.getPrecio()%> </h3>
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
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="section-title">
                                            <h2 class="title" id="lonuevo">Otros productos</h2>
						<div class="pull-right">
							<div class="product-slick-dots-2 custom-dots">
							</div>
						</div>
					</div>
				</div>
                               </div>
				<!-- section title -->
				<div class="col-md-3 col-sm-6 col-xs-6">
					<div class="banner banner-2">
                                                  <%
                                               ArrayList<Producto> ramdon1 = p.ProductRamdon1();
                                               for(Producto pr: ramdon1){
                                                %>
                                                <img src="./img/<%=pr.getImagen()%>" alt="">
						<div class="banner-caption">
						</div>
                                                          <div class="product-body">      
									<h2 class="text-info"><br><%=pr.getNombre()%></h2>
									<div class="product-btns">
									<br><br>
                                                                        <form action="ProductsC" method="POST">
                                                                        <input name="var" value="randon" type="hidden">
                                                                            <input name="id_product_rand" type="hidden" value="<%=pr.getId_producto()%>">
                                                                            <input name="model_pc" type="hidden" value="<%=pr.getModelo_pc()%>">
                                                                            <input name="price_pc" type="hidden" value="<%=pr.getPrecio()%>">
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
                               
				<!-- Product Slick -->
				<div class="col-md-9 col-sm-6 col-xs-6">
					<div class="row">
						<div id="product-slick-2" class="product-slick">
							<!-- Product Single -->
                                                         <%
                                               
                                               ArrayList<Producto> pc = p.ListPc();
                                               
                                               for(Producto pr: pc){
                                                 
                                                %>
							<div class="product product-single">
								<div class="product-thumb">
                                                                    <form action="ProductsC" method="POST">
                                                                            <input name="var" value="randon" type="hidden">
                                                                            <input name="id_product_rand" type="hidden" value="<%=pr.getId_producto()%>">
                                                                            <input name="model_pc" type="hidden" value="<%=pr.getModelo_pc()%>">
									    <input name="price_pc" type="hidden" value="<%=pr.getPrecio()%>">
                                                                            <button class="main-btn quick-view"><i class="fa fa-search-plus"></i> Ver Producto</button>
                                                                        </form>
                                                                        <img src="img/<%=pr.getImagen()%>" >
								</div>
								<div class="product-body">
                                                                    <h3 class="product-price"><span> $ </span><%=pr.getPrecio()%></h3>
									
									<h2 class="product-name"><a href="#"><%=pr.getNombre()%></a></h2>
									<div class="product-btns">
									</div>
								</div>
							</div>
							<!-- /Product Single -->

							
                                                         <%
                                                             }
                                                        %>
						</div>
					</div>
				</div>
				<!-- /Product Slick -->
			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	
	<!-- /section -->

	<!-- section -->

	

	<!-- FOOTER -->
	<footer id="footer" class="section section-grey">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row ">
				<!-- footer widget -->
				<div class="col-md-3 col-sm-6 col-xs-6">
					<div class="footer">
						<!-- footer logo -->
						<div class="footer-logo">
						<a class="logo" href="#">
						
							<h2> <span><img src="img/logo 1.png" width="200" alt="" class="logoimg "></span></h2>
						</a>
						</div>
						<!-- /footer logo -->

						<p>ShopGeek tu tienda online, Brindando los mejores Productos Tecnológicos Para Nuestros Clientes.</p>
					</div>
				</div>
				<div class="col-md-3 col-sm-6 col-xs-6"></div>
				<!-- footer widget -->
				<div class="col-md-3 col-sm-6 col-xs-6">
						<h3 class="footer-header">Informaciones</h3>
						<ul class="list-links">
							
                                                </ul> <br>
                                                <ul class="list-links">
                                                         <%if(sesionOk.getAttribute("usuario")==null){
                                                                %>
                                                         <h3 class="footer-header">Mi Cuenta</h3>
							<li><a href="Login.jsp">Login</a></li>
						</ul>
                                                        <%}
                                                        %></div>
                                                        <h1>Desarolladores</h1>
                                                    <div class="col-md-3 col-sm-6 col-xs-6">
                                                    <img src="img/carlitos.jpg" class="dev" width="50" height="50" alt="carlitos"/>
                                                    <span>Carlos Montero Q.</span><br><br>
                                                    <img src="img/orbis.jpg" class="dev" width="50" height="50" alt="carlitos"/>
                                                     <span>Orbis Alonzo G.</span>
						</div>      
			</div>
			<!-- /row -->
			<hr>
			<!-- row -->
			<div class="row">
				<div class="col-md-8 col-md-offset-2 text-center">
					<!-- footer copyright -->
					<div class="footer-copyright">
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						Copyright &copy;<script>document.write(new Date().getFullYear());</script> ShopGeek.com</a>
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
