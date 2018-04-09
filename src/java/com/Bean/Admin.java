
package com.Bean;


public class Admin {
  
    private String nombre;
    private String apellido;
    private String correo;
    private String pass;

    public Admin(String nombre, String apellido, String correo, String pass) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.pass = pass;
    }

    public Admin(String correo, String pass) {
        this.correo = correo;
        this.pass = pass;
    }
    
    public Admin(){}
    
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
    
}
