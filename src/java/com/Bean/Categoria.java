/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Bean;

/**
 *
 * @author orbis
 */
public class Categoria {
    
    private int id_categoria;
    private String categoria;

    public Categoria(String categoria) {
        this.categoria = categoria;
    }
    
      public Categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public Categoria() {
    }

    public Categoria(int id_categoria, String categoria) {
        this.id_categoria = id_categoria;
        this.categoria = categoria;
    }
    
    
    
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    
    
    
}
