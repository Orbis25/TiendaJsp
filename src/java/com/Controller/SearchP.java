/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author orbis
 */
@WebServlet(name = "SearchP", urlPatterns = {"/SearchP"})
public class SearchP extends HttpServlet {
public static String busqueda;
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(request.getParameter("busqueda")!=null){
            busqueda = request.getParameter("busqueda");
            request.getRequestDispatcher("productsSearch.jsp?page=1").forward(request, response);
            File fichero = new File("index.jsp"); 
            System.out.println("esta es la ruta "+fichero.getAbsolutePath()); 
        }
     
    }
}
