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
public class Sistema {
    
    private String sistema;
    private int id_sistema;

    public int getId_sistema() {
        return id_sistema;
    }

    public void setId_sistema(int id_sistema) {
        this.id_sistema = id_sistema;
    }

    public Sistema(int id_sistema) {
        this.id_sistema = id_sistema;
    }

    
    
    public Sistema() {
    }

    public Sistema(String sistema) {
        this.sistema = sistema;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }
    
    
    
    
    
}
