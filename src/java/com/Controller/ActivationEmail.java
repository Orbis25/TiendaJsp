
package com.Controller;

import com.Bean.User;
import com.dao.UserImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ActivationEmail", urlPatterns = {"/ActivationEmail"})
public class ActivationEmail extends HttpServlet {
    
    public ActivationEmail() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    
     String ale=request.getParameter("cod");  
        
     
        User user = new User(ale);

        UserImpl activacion = new UserImpl();
        activacion.emailActivacion(user);
        
        
        switch(UserImpl.verificado){
        
            case 1 :
                request.getRequestDispatcher("confirEmail.jsp").forward(request, response);
            break;
            
            case 2 :
                request.getRequestDispatcher("errorLink.jsp").forward(request, response);
            break;
            
            default:
                request.getRequestDispatcher("errorNumber.jsp").forward(request, response);
            break;
        }
        
    }

  
}
