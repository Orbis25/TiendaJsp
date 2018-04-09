/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Bean.User;
import com.dao.UserImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "UserS", urlPatterns = {"/UserS"})
public class UserS extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
         User user = new User(request.getParameter("nombre"),
                    request.getParameter("apellido"),request.getParameter("correo"),
                    request.getParameter("pass"));
            
            UserImpl dao = new UserImpl();
            dao.registrar(user);
            request.getRequestDispatcher("sendEmail.jsp").forward(request, response);
       
        
        
    }
}
