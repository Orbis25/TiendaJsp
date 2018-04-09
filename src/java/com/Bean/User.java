
package com.Bean;


public class User {
    
    private String nombre;
    private String apellido;
    private String correo;
    private String pass;
    private String cod_confimacion;
    private int id_user;
    
    public User() {
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    //venta yesUser
    public User(int id_user,String correo,String nombre) {
        this.id_user = id_user;
        this.correo = correo;
        this.nombre = nombre;
    }
    //Venta noUser
    public User(String nombre,String correo,String nul) {
        this.correo = correo;
        this.nombre = nombre;
    }

    public User(String cod_confirmacion) {
        this.cod_confimacion = cod_confirmacion;
    }

    public User(String nombre, String apellido, String correo, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.pass = pass;
    }

    //login and fact
    public User(String correo, String pass) {
        this.correo = correo;
        this.pass = pass;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String getCod_confimacion() {
        return cod_confimacion;
    }

    public void setCod_confimacion(String cod_confimacion) {
        this.cod_confimacion = cod_confimacion;
    }
    
    
    
}
