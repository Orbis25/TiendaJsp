package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Bean.Venta;
import com.Bean.User;
import com.Bean.Categoria;
import com.Bean.Marca;
import com.Bean.Producto;
import java.util.ArrayList;
import com.dao.ProductoImpl;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    //capturando la session
User usu = new User();

HttpSession sesionOk =  request.getSession();
if(sesionOk.getAttribute("usuario")!=null){
usu = (User) sesionOk.getAttribute("usuario");

      out.write('\r');
      out.write('\n');

}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("\t<title>Tech-Shop</title>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Google font -->\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Hind:400,700\" rel=\"stylesheet\">\r\n");
      out.write("\t<!-- Bootstrap -->\r\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\r\n");
      out.write("\t<!-- Slick -->\r\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick.css\" />\r\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/slick-theme.css\" />\r\n");
      out.write("\r\n");
      out.write("\t<!-- nouislider -->\r\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/nouislider.min.css\" />\r\n");
      out.write("\r\n");
      out.write("\t<!-- Font Awesome Icon -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"icon\" href=\"img/laptop.ico\">\t\t\r\n");
      out.write("\r\n");
      out.write("\t<!-- Custom stlylesheet -->\r\n");
      out.write("\t<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- HEADER -->\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<!-- top Header -->\r\n");
      out.write("\t\t<div id=\"top-header\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t<span>Bienvenido a Tech-Shop!</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"pull-right\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"header-top-links\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown default-dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"true\">USD </a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"custom-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">USD ($)</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /top Header -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- header -->\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"pull-left\">\r\n");
      out.write("\t\t\t\t\t<!-- Logo -->\r\n");
      out.write("\t\t\t\t\t<div class=\"header-logo\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"logo\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<h2> <span><img src=\"img/biglaptop.png\" alt=\"\" class=\"logoimg \"></span><span class=\"logo\">Tech</span>-Shop</h2>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Search -->\r\n");
      out.write("\t\t\t\t\t<div class=\"header-search\">\r\n");
      out.write("                                            <form action=\"SearchP\" method=\"post\">\r\n");
      out.write("                                                <input class=\"input search-input\" name=\"busqueda\" type=\"text\" placeholder=\"Ingrese para buscar\">\r\n");
      out.write("                                                <button type=\"submit\" class=\"search-btn\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /Search -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"pull-right\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"header-btns\">\r\n");
      out.write("\t\t\t\t\t\t<!-- Account -->\r\n");
      out.write("\t\t\t\t\t\t<li class=\"header-account dropdown default-dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dropdown-toggle\" role=\"button\" data-toggle=\"dropdown\" aria-expanded=\"true\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"header-btns-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-user-o\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                ");
if(sesionOk.getAttribute("usuario")!=null){
                                                                
      out.write("\r\n");
      out.write("                                                                <strong class=\"text-uppercase\">");
      out.print(usu.getNombre()+"");
      out.write(' ');
      out.print(usu.getApellido());
      out.write("<i class=\"fa fa-caret-down\"></i></strong>\r\n");
      out.write("                                                                \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"custom-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--<li><a href=\"#\"><i class=\"fa fa-user-o\"></i> Mi CUENTA</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"checkout.jsp\"><i class=\"fa fa-check\"></i> Checkout</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"UserL?var=cerrar_sesion_user\"><i class=\"fa fa-unlock-alt\"></i>Cerrar Sesion</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!--<li><a href=\"new_acount.jsp\"><i class=\"fa fa-user-plus\"></i> CREAR CUENTA</a></li>-->\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("                                                                ");

                                                                }else{
                                                                    
      out.write("\r\n");
      out.write("                                                                      <strong class=\"text-uppercase\">Mi Cuenta<i class=\"fa fa-caret-down\"></i></strong>\r\n");
      out.write("                                                                \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                            <ul class=\"custom-menu\">\r\n");
      out.write("\r\n");
      out.write("                                                                    <li><a href=\"checkout.jsp\"><i class=\"fa fa-check\"></i> Checkout</a></li>\r\n");
      out.write("                                                                    <li><a href=\"Login.jsp\"><i class=\"fa fa-unlock-alt\"></i>Login</a></li>\r\n");
      out.write("                                                                    <li><a href=\"new_acount.jsp\"><i class=\"fa fa-user-plus\"></i> CREAR CUENTA</a></li>\r\n");
      out.write("                                                            </ul>\r\n");
      out.write("                                                                    \r\n");
      out.write("                                                                    ");
 
                                                                   }
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<!-- /Account -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Cart -->\r\n");
      out.write("\t\t\t\t\t\t<li class=\"header-cart dropdown default-dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"true\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"header-btns-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-shopping-cart\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong class=\"text-uppercase\">MI Carrito:</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"custom-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"shopping-cart\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"shopping-cart-list\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
double total = 0; int qyt=0;
                                                                                ArrayList<Venta> car = (ArrayList<Venta>)session.getAttribute("carrito");
                                                                                 if(car!=null){
                                                                                  for(Venta v : car){
                                                                                    
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"product product-widget\">\r\n");
      out.write("                                                                                    \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div  class=\"product-thumb\">\r\n");
      out.write("                                                                                            <img src=\"img/");
      out.print(v.getProduct().getImagen());
      out.write("\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"product-body\">\r\n");
      out.write("                                                                                            <h3 class=\"product-price\"><span>$</span>");
      out.print(v.getProduct().getPrecio());
      out.write(" <span class=\"qty\">x");
      out.print(v.getCantidad_producto());
      out.write("</span></h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h2 class=\"product-name\"><a href=\"#\">");
      out.print(v.getProduct().getNombre());
      out.write("</a></h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                                                      \r\n");
      out.write("                                                                                </div>\r\n");
      out.write("                                                                                        \r\n");
      out.write("                                                                                 ");
  
                                                                                      total = total+(v.getProduct().getPrecio() *v.getCantidad_producto());  
                                                                                              }
                                                                                    }
                                                                                 
      out.write("       \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"shopping-cart-btns\">\r\n");
      out.write("                                                                            ");
if(total==0){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t      <button class=\"main-btn btn-block\">Carrito Vacio <span class=\"fa fa-meh-o\"></span> </button>\r\n");
      out.write("                                                                              <button class=\"primary-btn btn-block\">Total: $  ");
      out.print(total);
      out.write("</button>\r\n");
      out.write("                                                                              ");
}else{
      out.write("\r\n");
      out.write("                                                                                  \r\n");
      out.write("                                                                              <a class=\"main-btn btn-block text-center\" href=\"checkout.jsp\">Checkout <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t      <button class=\"primary-btn btn-block\">Total: $  ");
      out.print(total);
      out.write("</button>\r\n");
      out.write("                                                                              ");
}
      out.write("\r\n");
      out.write("                                                                             \r\n");
      out.write("                                                                        </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<!-- /Cart -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Mobile nav toggle-->\r\n");
      out.write("\t\t\t\t\t\t<li class=\"nav-toggle\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"nav-toggle-btn main-btn icon-btn \"><i class=\"fa fa-bars\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<!-- / Mobile nav toggle -->\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- header -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- container -->\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!-- /HEADER -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- NAVIGATION -->\r\n");
      out.write("\t<div id=\"navigation\">\r\n");
      out.write("\t\t<!-- container -->\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div id=\"responsive-nav\">\r\n");
      out.write("\t\t\t\t<!-- category nav -->\r\n");
      out.write("\t\t\t\t<div class=\"category-nav\">\r\n");
      out.write("\t\t\t\t\t<span class=\"category-header\">Categorias<i class=\"fa fa-list\"></i></span>\r\n");
      out.write("\t\t\t\t\t<ul class=\"category-list\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown side-dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"true\">Laptops y Pc's <i class=\"fa fa-angle-right\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"custom-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("                                                                    <div class=\"col-md-6\">\r\n");
      out.write("                                                                                 <img src=\"./img/funcionamiento.png\" alt=\"\" >\r\n");
      out.write("                                                                                </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("                                                                            \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<ul class=\"list-links\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<li><h3 class=\"list-links-title\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tNuestras Marcas\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h3> </li>\r\n");
      out.write("                                                                                        ");

                                                                                         ProductoImpl p = new ProductoImpl();
                                                                                         ArrayList<Marca> marca = p.Marcas();

                                                                                         for(Marca mr: marca){ 
                                                                                          
      out.write("\r\n");
      out.write("                                                                                        \r\n");
      out.write("                                                                                          <li><a href=\"#\"");
      out.print(mr.getId_marca());
      out.write('>');
      out.write(' ');
      out.print(mr.getNombre_marca());
      out.write(" </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                                                                        ");

                                                                                        }
                                                                                        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</ul>   \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row hidden-sm hidden-xs\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"banner banner-1\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"./img/banner05.jpg\" alt=\"\" height=\"400\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"products.jsp?page=1\">Ver Todo</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /category nav -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- menu nav -->\r\n");
      out.write("\t\t\t\t<div class=\"menu-nav\">\r\n");
      out.write("\t\t\t\t\t<span class=\"menu-header\">Menu <i class=\"fa fa-bars\"></i></span>\r\n");
      out.write("\t\t\t\t\t<ul class=\"menu-list\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"products.jsp?page=1\">Shop</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#lonuevo\">Laptops</a></li>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- menu nav -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /container -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /NAVIGATION -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- HOME -->\r\n");
      out.write("\t<div id=\"home\">\r\n");
      out.write("\t\t<div class=\"container\">\t\t\t\r\n");
      out.write("\t\t\t<div class=\"home-wrap\">\t\t\t\t \r\n");
      out.write("                            <div id=\"home-slick\"  >\r\n");
      out.write("                                         ");

                                             ArrayList<Producto> slider = p.Slider();
                                               for(Producto pr: slider){ 
                                                
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"banner banner-1\">\r\n");
      out.write("                                            <img src=\"img/");
      out.print(pr.getImagen());
      out.write("\" width=\"625\" height=\"550\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"banner-caption text-center\">\r\n");
      out.write("                                                    \r\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"color-banner\">");
      out.print(pr.getNombre());
      out.write("</h1>\r\n");
      out.write("\t\t\t\t\t\t\t<br><br>\r\n");
      out.write("                                                         <form action=\"ProductsC\" method=\"POST\">\r\n");
      out.write("                                                             <input name=\"var\" value=\"randon\" type=\"hidden\">\r\n");
      out.write("                                                         <input name=\"id_product_rand\" type=\"hidden\" value=\"");
      out.print(pr.getId_producto());
      out.write("\">\r\n");
      out.write("                                                         <input name=\"model_pc\" type=\"hidden\" value=\"");
      out.print(pr.getModelo_pc());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t <input name=\"price_pc\" type=\"hidden\" value=\"");
      out.print(pr.getPrecio());
      out.write("\">\r\n");
      out.write("                                                         <button class=\"main-btn quick-view\"><i class=\"fa fa-search-plus\"></i> Ver Producto</button>\r\n");
      out.write("                                                       </form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                                           ");

                                            }
                                     
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /HOME -->\r\n");
      out.write("        \r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<!-- section -->\r\n");
      out.write("\t<div class=\"section\">\r\n");
      out.write("\t\t<!-- container -->\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<!-- row -->\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<!-- section-title -->\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"section-title\">\r\n");
      out.write("\t\t\t\t\t\t<h2 class=\"title\" id=\"lonuevo\">Nuestras Laptops</h2>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"pull-right\">\r\n");
      out.write("                                                    <div class=\"product-slick-dots-1 custom-dots\">\r\n");
      out.write("                                                        </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /section-title -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- banner -->\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"banner banner-2\">\r\n");
      out.write("                                                   ");

                                                ArrayList<Producto> ramdon = p.ProductRamdon();
                                                for(Producto pl: ramdon){
                                                
      out.write("\r\n");
      out.write("                                                <img src=\"./img/");
      out.print(pl.getImagen());
      out.write("\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"banner-caption\">\r\n");
      out.write("                                                    \r\n");
      out.write("                                               \t\t\t\t\t\t                                                                                                          \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                                                    <div class=\"product-body\">      \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2 class=\"text-info\"><br>");
      out.print(pl.getNombre());
      out.write("</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-btns\">\r\n");
      out.write("                                                                        <br><br>\r\n");
      out.write("                                                                        <form action=\"ProductsC\" method=\"POST\">\r\n");
      out.write("                                                                             <input name=\"var\" value=\"randon\" type=\"hidden\">\r\n");
      out.write("                                                                            <input name=\"id_product_rand\" type=\"hidden\" value=\"");
      out.print(pl.getId_producto());
      out.write("\">\r\n");
      out.write("                                                                            <input name=\"model_pc\" type=\"hidden\" value=\"");
      out.print(pl.getModelo_pc());
      out.write("\">\r\n");
      out.write("                                                                             <input name=\"price_pc\" type=\"hidden\" value=\"");
      out.print(pl.getPrecio());
      out.write("\">\r\n");
      out.write("                                                                            <button type=\"submit\" class=\"primary-btn btn-sm btn-block add-to-cart text-center\">Ver Producto</button>\r\n");
      out.write("                                                                        </form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                ");

                                            }
                                            
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                                        \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /banner -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Product Slick -->\r\n");
      out.write("\t\t\t\t<div class=\"col-md-9 col-sm-6 col-xs-6\">\r\n");
      out.write("                                    \r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("                                           \r\n");
      out.write("\t\t\t\t\t\t<div id=\"product-slick-1\" class=\"product-slick product-slick-1 \">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product Single -->\r\n");
      out.write("                                                         ");

                                             
                                               ArrayList<Producto> lista = p.ListLaptops();
                                               
                                               for(Producto pr: lista){
                                                 
                                                
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product product-single \">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"product-thumb\">\r\n");
      out.write("                                                                  <form action=\"ProductsC\" method=\"POST\">\r\n");
      out.write("                                                                        <input name=\"var\" value=\"randon\" type=\"hidden\">\r\n");
      out.write("                                                                            <input name=\"id_product_rand\" type=\"hidden\" value=\"");
      out.print(pr.getId_producto());
      out.write("\">\r\n");
      out.write("                                                                            <input name=\"model_pc\" type=\"hidden\" value=\"");
      out.print(pr.getModelo_pc());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t  <input name=\"price_pc\" type=\"hidden\" value=\"");
      out.print(pr.getPrecio());
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("                                                                            <button class=\"main-btn quick-view\"><i class=\"fa fa-search-plus\"></i> Ver Producto</button>\r\n");
      out.write("                                                                        </form>\r\n");
      out.write("                                                                        <img src=\"img/");
      out.print(pr.getImagen());
      out.write("\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"product-body\">\r\n");
      out.write("                                                                    <h3 class=\"product-price \"><span>$</span>");
      out.print(pr.getPrecio());
      out.write(" </h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2 class=\"product-name text-center \"><a href=\"#\" >");
      out.print(pr.getNombre());
      out.write("</a></h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-btns\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                           \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /Product Single -->\r\n");
      out.write("                                            ");

                                            }
                                            
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /Product Slick -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /row -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- row -->\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<!-- section title -->\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"section-title\">\r\n");
      out.write("                                            <h2 class=\"title\" id=\"lonuevo\">Nuestras Pc's</h2>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-slick-dots-2 custom-dots\">\r\n");
      out.write("                                                          \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("                               </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- section title -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"banner banner-2\">\r\n");
      out.write("                                                  ");

                                               
                                               ArrayList<Producto> ramdon1 = p.ProductRamdon1();
                                               
                                               for(Producto pr: ramdon1){
                                                 
                                                
      out.write("\r\n");
      out.write("                                                <img src=\"./img/");
      out.print(pr.getImagen());
      out.write("\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"banner-caption\">\r\n");
      out.write("                                                   \r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                                                          <div class=\"product-body\">      \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2 class=\"text-info\"><br>");
      out.print(pr.getNombre());
      out.write("</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-btns\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br><br>\r\n");
      out.write("                                                                        <form action=\"ProductsC\" method=\"POST\">\r\n");
      out.write("                                                                        <input name=\"var\" value=\"randon\" type=\"hidden\">\r\n");
      out.write("                                                                            <input name=\"id_product_rand\" type=\"hidden\" value=\"");
      out.print(pr.getId_producto());
      out.write("\">\r\n");
      out.write("                                                                            <input name=\"model_pc\" type=\"hidden\" value=\"");
      out.print(pr.getModelo_pc());
      out.write("\">\r\n");
      out.write("                                                                           \t\t\t\t\t\t\t\t\t  <input name=\"price_pc\" type=\"hidden\" value=\"");
      out.print(pr.getPrecio());
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("                                                                            <button type=\"submit\" class=\"primary-btn btn-sm btn-block add-to-cart text-center\">Ver Producto</button>\r\n");
      out.write("                                                                        </form>\r\n");
      out.write("                                                                        \r\n");
      out.write("                                                                        </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                ");

                                            }
                                            
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- Product Single -->\r\n");
      out.write("                               \r\n");
      out.write("\t\t\t\t<!-- Product Slick -->\r\n");
      out.write("\t\t\t\t<div class=\"col-md-9 col-sm-6 col-xs-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"product-slick-2\" class=\"product-slick\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- Product Single -->\r\n");
      out.write("                                                         ");

                                               
                                               ArrayList<Producto> pc = p.ListPc();
                                               
                                               for(Producto pr: pc){
                                                 
                                                
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product product-single\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"product-thumb\">\r\n");
      out.write("                                                                    <form action=\"ProductsC\" method=\"POST\">\r\n");
      out.write("                                                                            <input name=\"var\" value=\"randon\" type=\"hidden\">\r\n");
      out.write("                                                                            <input name=\"id_product_rand\" type=\"hidden\" value=\"");
      out.print(pr.getId_producto());
      out.write("\">\r\n");
      out.write("                                                                            <input name=\"model_pc\" type=\"hidden\" value=\"");
      out.print(pr.getModelo_pc());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <input name=\"price_pc\" type=\"hidden\" value=\"");
      out.print(pr.getPrecio());
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("                                                                            <button class=\"main-btn quick-view\"><i class=\"fa fa-search-plus\"></i> Ver Producto</button>\r\n");
      out.write("                                                                        </form>\r\n");
      out.write("                                                                        <img src=\"img/");
      out.print(pr.getImagen());
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"product-body\">\r\n");
      out.write("                                                                    <h3 class=\"product-price\"><span> $ </span>");
      out.print(pr.getPrecio());
      out.write("</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2 class=\"product-name\"><a href=\"#\">");
      out.print(pr.getNombre());
      out.write("</a></h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"product-btns\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- /Product Single -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("                                                         ");

                                                             }
                                                        
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /Product Slick -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /row -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /container -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- /section -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- section -->\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<!-- FOOTER -->\r\n");
      out.write("\t<footer id=\"footer\" class=\"section section-grey\">\r\n");
      out.write("\t\t<!-- container -->\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<!-- row -->\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<!-- footer widget -->\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t\t\t\t<!-- footer logo -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"footer-logo\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"logo\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<h2> <span><img src=\"img/biglaptop.png\" alt=\"\" class=\"logoimg \"></span><span class=\"logo\">Tech</span>-Shop</h2>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- /footer logo -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- footer social -->\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"footer-social\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-pinterest\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<!-- /footer social -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /footer widget -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- footer widget -->\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"footer-header\">Mi Cuenta</h3>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"list-links\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Mi Cuenta</a></li>\r\n");
      out.write("                                                         ");
if(sesionOk.getAttribute("usuario")==null){
                                                                
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"Login.jsp\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("                                                        \r\n");
      out.write("                                                        ");
}
                                                        
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                                        \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /footer widget -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"clearfix visible-sm visible-xs\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- footer widget -->\r\n");
      out.write("\t\t\t\t<div class=\"col-md-3 col-sm-6 col-xs-6\">\r\n");
      out.write("\t\t\t\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"footer-header\">Servicios</h3>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"list-links\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Sobre Nosotros</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Envio y Devolucion</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Guia de envio</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">FAQ</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /footer widget -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- footer subscribe -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- /footer subscribe -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /row -->\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<!-- row -->\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-8 col-md-offset-2 text-center\">\r\n");
      out.write("\t\t\t\t\t<!-- footer copyright -->\r\n");
      out.write("\t\t\t\t\t<div class=\"footer-copyright\">\r\n");
      out.write("\t\t\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t\t\t\t\t\tCopyright &copy;<script>document.write(new Date().getFullYear());</script> Orbisalonzo@gmail.com <i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /footer copyright -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /row -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- /container -->\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!-- /FOOTER -->\r\n");
      out.write("        \r\n");
      out.write("\t<!-- jQuery Plugins -->\r\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/slick.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/nouislider.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.zoom.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
