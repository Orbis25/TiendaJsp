/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ProductsC", urlPatterns = {"/ProductsC"})
public class ProductsC extends HttpServlet {

    public static String modelo;
    public static int id_pc;
    public static double price;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             
        
        switch(request.getParameter("var")){
            case "randon":
            id_pc = Integer.parseInt(request.getParameter("id_product_rand")); 
            modelo = request.getParameter("model_pc");
            price = Double.parseDouble(request.getParameter("price_pc"));
            request.getRequestDispatcher("product-page.jsp").forward(request, response);
            break;
            default:
                 request.getRequestDispatcher("errorNumber.jsp").forward(request, response);
                break;
        }
        
        
    }
}
