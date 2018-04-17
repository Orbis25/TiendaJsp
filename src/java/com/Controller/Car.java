/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Bean.Producto;
import com.Bean.Venta;
import com.dao.ProductoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "Car", urlPatterns = {"/Car"})
public class Car extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(request.getParameter("accion").equals("EnviarCarrito")){
            this.AddCar(request, response); 
        }else{
            if(request.getParameter("accion").equals("eliminar_p")){
                HttpSession sesion = request.getSession();
                ArrayList<Venta> carrito = (ArrayList<Venta>) sesion.getAttribute("carrito");
                int id = Integer.parseInt(request.getParameter("producto_v"));
                int indice = Exist(id, carrito);
                carrito.remove(indice);
                sesion.setAttribute("carrito", carrito);
                request.getRequestDispatcher("checkout.jsp").forward(request, response);  
            }
        }       
    }
    
    protected void AddCar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //obtenemos la sesion
        HttpSession sesion = request.getSession();
        ArrayList<Venta> carrito;
        if(sesion.getAttribute("carrito") == null){
            carrito = new ArrayList<Venta>();
        }else{
            carrito = (ArrayList<Venta>) sesion.getAttribute("carrito");
        }
        ProductoImpl pr = new ProductoImpl();
        int id = Integer.parseInt(request.getParameter("id"));
        Producto p = pr.carP(id);
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        int Cvieja = Integer.parseInt(request.getParameter("cantidad"));
        int Cdisponible = Integer.parseInt(request.getParameter("c_disponible"));
        
        Venta venta = new Venta(Integer.parseInt(request.getParameter("id")),p, cantidad);
        
        double subTotal = p.getPrecio() * venta.getCantidad_producto();
        
         int indice = Exist(id, carrito);
       
         if(indice == -1){
            carrito.add(venta);
        }else{
            cantidad = carrito.get(indice).getCantidad_producto() + Cvieja;
            if(cantidad <= Cdisponible){
            carrito.get(indice).setCantidad_producto(cantidad);
            }
        }
        
        sesion.setAttribute("carrito", carrito);
                request.setAttribute("car", "Producto añadido con exito");

        request.getRequestDispatcher("product-page.jsp").forward(request, response);
        
    }
    
    public int Exist(int product_id,ArrayList<Venta> carrito){
        
        for(int i =0;i <carrito.size();i++){
         if(carrito.get(i).getProduct().getId_producto() == product_id){
         return i;
         }
        }
        return -1;
    }    
}
