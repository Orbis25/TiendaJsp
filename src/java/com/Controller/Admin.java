/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller;

import com.Bean.Categoria;
import com.Bean.Disco;
import com.Bean.Marca;
import com.Bean.Procesador;
import com.Bean.Producto;
import com.Bean.Ram;
import com.Bean.Sistema;
import com.dao.AdminImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author orbis
 */
@WebServlet(name = "Admin", urlPatterns = {"/Admin"})
public class Admin extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String eliminar = request.getParameter("delete");
        
         if(eliminar!=null){
             int delete = Integer.parseInt(eliminar);
             Producto p = new Producto(delete);
             AdminImpl dao = new AdminImpl();
             dao.deleteProducts(p);
             request.getRequestDispatcher("tableProducts.jsp").forward(request, response);
        }
         String up = request.getParameter("update");
         if(up!=null){
             request.getRequestDispatcher("UpdateProducts.jsp").forward(request, response);
         }else{
         if(request.getParameter("deleteC")!=null){
             
            String desencriptado = desencriptarGet(request.getParameter("deleteC"));
             
             int delete = Integer.parseInt(desencriptado);
             Categoria c = new Categoria(delete);
             AdminImpl dao = new AdminImpl();
             dao.deleteCategories(c);
             request.getRequestDispatcher("Components.jsp").forward(request, response);
            
         }else{
         if(request.getParameter("deleteD")!=null){
             
          String desencriptado = desencriptarGet(request.getParameter("deleteD"));
          int delete = Integer.parseInt(desencriptado);
          Disco disco = new Disco(delete);
          AdminImpl dao = new AdminImpl();
          dao.deleteDisk(disco);
          request.getRequestDispatcher("Components.jsp").forward(request, response);         
         }else{
         if(request.getParameter("deletePr")!=null){
         String desencriptado = desencriptarGet(request.getParameter("deletePr"));
                 int delete = Integer.parseInt(desencriptado);
                 Procesador procesador = new Procesador(delete);
                 AdminImpl dao = new AdminImpl();
                 dao.deleteProcesor(procesador);
                 request.getRequestDispatcher("Components.jsp").forward(request, response);         
         }else{
             if(request.getParameter("deleteR")!=null){
                 String desencriptado = desencriptarGet(request.getParameter("deleteR"));
                 int delete = Integer.parseInt(desencriptado);
                 Ram ram = new Ram(delete);
                 AdminImpl dao = new AdminImpl();
                 dao.deleteRam(ram);
                 request.getRequestDispatcher("Components.jsp").forward(request, response);       
             }else{
             if(request.getParameter("deleteS")!=null){
                 String desencriptado = desencriptarGet(request.getParameter("deleteS"));
                 int delete = Integer.parseInt(desencriptado);
                 Sistema sistema = new Sistema(delete);
                 AdminImpl dao = new AdminImpl();
                 dao.deleteSistem(sistema);
                 request.getRequestDispatcher("Components.jsp").forward(request, response);  
             }
           }
         }
        }
      }  
        switch (request.getParameter("deleteM")){
            case "":
            request.getRequestDispatcher("errorNumber.jsp").forward(request, response);         
            break;
            default:
                 String desencriptado = desencriptarGet(request.getParameter("deleteM"));
                 int delete = Integer.parseInt(desencriptado);
                 Marca m = new Marca(delete);
                 AdminImpl dao = new AdminImpl();
                 dao.deleteMarca(m);
                 request.getRequestDispatcher("Components.jsp").forward(request, response);
            break;
        }

       }    
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accion = request.getParameter("accion");
        if(accion.equals("registrarProducto")){
        
        try{
        double precio2 = Double.valueOf( request.getParameter("precio"));
        Marca marca =  new Marca(Integer.parseInt(request.getParameter("marca")));
        Categoria categoria = new Categoria(Integer.parseInt(request.getParameter("categoria")));
        Procesador procesador = new Procesador(Integer.parseInt(request.getParameter("procesador")));
        Ram ram = new Ram(Integer.parseInt(request.getParameter("ram")));
        Disco disco = new Disco(Integer.parseInt(request.getParameter("disco")));
        
        String imagen = request.getParameter("txtimagen");               
        Producto producto = new Producto(request.getParameter("nombre"),imagen,
        precio2,request.getParameter("color"),request.getParameter("descripcion"),marca,procesador
                ,disco,categoria,ram,request.getParameter("modelo_pc"),request.getParameter("disponible"));
        
        AdminImpl imp = new AdminImpl();
        imp.RegisterProducts(producto);
                
        request.getRequestDispatcher("tableProducts.jsp").forward(request, response); 
            
        }catch(Exception e){
       
            
            System.out.println("error en el castin del servlet "+e);
        
        }
        }else{
        if(accion.equals("updateProducts")){
               
            try {
                String up = request.getParameter("id");
                int update = Integer.parseInt(up);
                
                double precio2 = Double.valueOf( request.getParameter("precio"));              
                Marca marca =  new Marca(Integer.parseInt(request.getParameter("marca")));
                Categoria categoria = new Categoria(Integer.parseInt(request.getParameter("categoria")));
                Procesador procesador = new Procesador(Integer.parseInt(request.getParameter("procesador")));
                Ram ram = new Ram(Integer.parseInt(request.getParameter("ram")));
                Disco disco = new Disco(Integer.parseInt(request.getParameter("disco")));
                
                String imagen = request.getParameter("img");  
                
                //falta imagen actualizar
                             
                Producto producto = new Producto(request.getParameter("nombre"),imagen,
                precio2,request.getParameter("color"),request.getParameter("descripcion"),marca,procesador
                        ,disco,categoria,ram,request.getParameter("modelo_pc"),update,request.getParameter("disponible"));
                 
                AdminImpl imp = new AdminImpl();
                imp.updateProducts(producto);
                request.getRequestDispatcher("tableProducts.jsp").forward(request, response);
            } catch (Exception e) {
                System.out.println("error al actualizar "+e);
            }   
        }
        }
        if(accion.equals("cp_categoria")){
            
            Categoria ct = new Categoria(request.getParameter("cp_categoria"));
            AdminImpl dao = new AdminImpl();
            dao.RegisterCategories(ct);
            request.getRequestDispatcher("Components.jsp").forward(request, response);

        }else{
          if(accion.equals("cp_disco")){
             
            Disco disco = new Disco(request.getParameter("cp_capacidad"),request.getParameter("cp_tipo"));
            AdminImpl dao = new AdminImpl();
            dao.RegisterDisk(disco);
            request.getRequestDispatcher("Components.jsp").forward(request, response);
          }else{
          if(accion.equals("cp_marca")){
              int sistema = Integer.parseInt(request.getParameter("cp_msistema"));
              Sistema s = new Sistema(sistema);
              Marca m = new Marca(request.getParameter("nombre_marca"),s);
              AdminImpl dao = new AdminImpl();
              dao.RegisterMarca(m, s);
              request.getRequestDispatcher("Components.jsp").forward(request, response);
          }else{
              if(accion.equals("cp_procesador")){
                  Procesador p = new Procesador(request.getParameter("modelo_procesador"));
                  AdminImpl dao = new AdminImpl();
                  dao.RegisterProcesor(p);
                  request.getRequestDispatcher("Components.jsp").forward(request, response);
                }
              else{
              if(accion.equals("cp_ram")){
                  int capacidad = Integer.parseInt(request.getParameter("cp_capacidad"));
                  Ram ram = new Ram();
                  ram.setCapacidad(capacidad);
                  AdminImpl dao = new AdminImpl();
                  dao.RegisterRam(ram);
                  request.getRequestDispatcher("Components.jsp").forward(request, response);
              
            }else{
              if(accion.equals("cp_sistema")){
                  Sistema s = new Sistema(request.getParameter("nombre_sistema"));
                  AdminImpl dao = new AdminImpl();
                  dao.RegisterSistems(s);
                  request.getRequestDispatcher("Components.jsp").forward(request, response);
              }
            }      
          }
          }      
        }   
    }
  }
    
    
    
    public String desencriptarGet(String encriptado){
    
        char arrayD[]=encriptado.toCharArray(); 
        for(int i=0;i<arrayD.length;i++){ 
            arrayD[i]=(char)(arrayD[i]-(char)14); 
        } 
      String desencriptado =String.valueOf(arrayD);
    return desencriptado;
    }
    
}
