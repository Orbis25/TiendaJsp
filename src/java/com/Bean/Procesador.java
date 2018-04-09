
package com.Bean;


public class Procesador {
    
   private int id_modelo;
   private String modelo;

    public Procesador(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
   


    public Procesador(int id_modelo) {
        this.id_modelo = id_modelo;
    }
    
    public Procesador() {
    }

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }


    
}
