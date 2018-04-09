/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author orbis
 */
public class Conexion {
    
   protected Connection con = null;
   private final String url = "jdbc:mysql://localhost:3306/tienda?user=root&password=";
   private final String clase = "com.mysql.jdbc.Driver";      
    public Connection getConnection(){
      try{
          Class.forName(clase);
          con = DriverManager.getConnection(url);
          System.out.println("conecxion satisfactoria");
          
      }catch(Exception e){
      
          System.out.println("Ocurrio un error al connectarse"+e);
      }
     return con;     
    }
    
    public void cerrar(){
     try{
     if(con !=null){
         if(!con.isClosed()){
             con.close();
             System.out.println("Cerrada correctamente");
         }
     }   
     
     }catch(SQLException e){
         System.out.println("error al cerrar conection"+e);
    }
    }
}
