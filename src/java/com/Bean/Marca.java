
package com.Bean;

public class Marca {
    

   private int id_marca;
   private Sistema id_fksistema;
   private String nombre_marca;

    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }

    public Marca(String nombre_marca,Sistema id_fksistema) {
        this.nombre_marca = nombre_marca;
        this.id_fksistema = id_fksistema;
    }

    public Marca(int id_marca, String nombre_marca) {
        this.id_marca = id_marca;
        this.nombre_marca = nombre_marca;
    }
   
    
   

    public Marca(int id_marca) {
        this.id_marca = id_marca;
        this.id_fksistema = id_fksistema;
    }

    public Marca(Sistema id_fksistema) {
        this.id_fksistema = id_fksistema;
    }

    
    public Marca() {
        }

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public Sistema getId_fksistema() {
        return id_fksistema;
    }

    public void setId_fksistema(Sistema id_fksistema) {
        this.id_fksistema = id_fksistema;
    }
   
   


    
}
