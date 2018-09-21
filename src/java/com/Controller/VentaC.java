/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Bean.Producto;
import com.Bean.User;
import com.Bean.Venta;
import com.dao.VentaImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author orbis
 */
@WebServlet(name = "VentaC", urlPatterns = {"/VentaC"})
public class VentaC extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                            String prd = request.getParameter("prd");

            if(request.getParameter("accion").equals("User")){
                HttpSession sesion = request.getSession();
              int cantidad = Integer.parseInt(request.getParameter("cantidad_v"));
              User n = new User(Integer.parseInt(request.getParameter("usuario")),request.getParameter("email_usuario")
              ,request.getParameter("nombre_usuario"));
              Producto p = new Producto(Integer.parseInt(request.getParameter("producto_v")));
              
              
              Venta v = new Venta(n,p,Double.parseDouble(request.getParameter("total")),cantidad,request.getParameter("envio")
              ,request.getParameter("fPais"),
                      request.getParameter("fcodigo-postal"),request.getParameter("fDireccion")
              ,request.getParameter("ftelefono"));
             
                ArrayList<Venta> lista = (ArrayList<Venta>) sesion.getAttribute("carrito");
                VentaImpl venta = new VentaImpl();
                if(venta.insertSaleUser(v,lista)){
                    if(venta.emailSale(v , prd) ){;
                    HttpSession sesionOk = request.getSession();
                    request.getSession().removeAttribute("carrito");
                    sesionOk.isNew();
                    request.getRequestDispatcher("pagoEmail.jsp").forward(request, response);
                    }else{
                     request.getRequestDispatcher("ErrorChekout.jsp").forward(request, response);
                    }
                }else{request.getRequestDispatcher("errorNumber.jsp").forward(request, response);}         
                
            }else{
                
            if(request.getParameter("accion").equals("noUser")){
                HttpSession sesion = request.getSession();
                int cantidad = Integer.parseInt(request.getParameter("cantidad_v"));
                User u = new User(request.getParameter("fNombre"), request.getParameter("email_noUser"), "nada");
                Producto p = new Producto(Integer.parseInt(request.getParameter("producto_v")));

                Venta v = new Venta(u,p,Double.parseDouble(request.getParameter("total")),cantidad,request.getParameter("envio")
              ,request.getParameter("fPais"),
                      request.getParameter("fcodigo-postal"),request.getParameter("fDireccion")
              ,request.getParameter("ftelefono"));
                 ArrayList<Venta> lista = (ArrayList<Venta>) sesion.getAttribute("carrito");
                 VentaImpl venta = new VentaImpl();
               
                 if(venta.queryFK()){
                    if(venta.insertSaleNoUser(v,lista)){
                   
                    if(venta.emailSale(v , prd)){
                    HttpSession sesionOk = request.getSession();
                    request.getSession().removeAttribute("carrito");
                    sesionOk.isNew();
                    request.getRequestDispatcher("pagoEmail.jsp").forward(request, response);
                    venta.queryFK2();
                    }else{
                     request.getRequestDispatcher("ErrorChekout.jsp").forward(request, response);
                    }
                    
                    }else{
                    request.getRequestDispatcher("errorNumber.jsp").forward(request, response);
                    } 
                }
            }
            }
    }
}
