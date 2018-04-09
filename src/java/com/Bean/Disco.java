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
public class Disco {
    
    private int id_disco;
    private String disco;
    private String tipo;

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Disco(String disco, String tipo) {
        this.disco = disco;
        this.tipo = tipo;
    }

    public Disco(int id_disco) {
        this.id_disco = id_disco;
        
    }

    public Disco() {
    }
    public int getId_disco() {
        return id_disco;
    }

    public void setId_disco(int id_disco) {
        this.id_disco = id_disco;
    }  
    
    
}
