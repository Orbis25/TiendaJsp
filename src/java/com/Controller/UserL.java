
package com.Controller;

import com.Bean.Admin;
import com.Bean.User;
import com.dao.AdminImpl;
import com.dao.UserImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "UserL", urlPatterns = {"/UserL"})
public class UserL extends HttpServlet {

  

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if(request.getParameter("var").equals("cerrar_sesion")){
            //cerrar sesion
            HttpSession sesionOk = request.getSession();
            request.getSession().removeAttribute("admin");
            sesionOk.invalidate();
            request.getRequestDispatcher("Login.jsp").forward(request, response);
           
        }else{
            if(request.getParameter("var").equals("cerrar_sesion_user")){
            //cerrar sesion
            HttpSession sesionOk = request.getSession();
            request.getSession().removeAttribute("usuario");
            request.getSession().removeAttribute("carrito");
            sesionOk.invalidate();
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
            }else{
            request.getRequestDispatcher("errorNumber.jsp").forward(request, response);
            }
            }  
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        User user =  new User(request.getParameter("correo"),request.getParameter("pass"));
        Admin admin = new Admin(request.getParameter("correo"),request.getParameter("pass"));
        
        UserImpl daoUser = new UserImpl();
        AdminImpl daoadmin = new AdminImpl();
        if(daoUser.login(user)){
             //creando session
                HttpSession sesionOk = request.getSession();
                //asignando un usuario  
                sesionOk.setAttribute("usuario", user);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }else{
            if(daoadmin.login(admin)){
                //creando session
                HttpSession sesionOk = request.getSession();
                //asignando un usuario  
                sesionOk.setAttribute("admin", admin);
                request.getRequestDispatcher("admin.jsp").forward(request, response);

            }else{
                request.setAttribute("msg", "Error de usuario o Contraseña");
            request.getRequestDispatcher("Login.jsp").forward(request, response);
            }
        }
       
 
    }
}
