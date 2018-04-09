
package com.Bean;

public class Venta {
  
  private int codigo_p;
   private int id_venta;
   private User user;
   private Producto product;
   private int cantidad_producto;

  private double total_pagado;
  private String tipo_envio;
  private String pais;
  private String codigo_postal;
  private String Direccion;
  private String numero_t;
  private String fecha;
  private String Codfactura;
  
    
    public Venta(int codigo_p,Producto producto, int cantidad_producto) {
        this.product = producto;
        this.cantidad_producto = cantidad_producto;
        this.codigo_p = codigo_p;
        
    }


    //insertar
    public Venta(User user, Producto product, double total_pagado,int cantidad_producto, String tipo_envio, String pais, String  codigo_postal, String Direccion,String numero_t) {
        this.user = user;
        this.product = product;
        this.cantidad_producto = cantidad_producto;
        this.total_pagado = total_pagado;
        this.tipo_envio = tipo_envio;
        this.pais = pais;
        this.codigo_postal = codigo_postal;
        this.Direccion = Direccion;
        this.numero_t = numero_t;
       
    }

    //admin fact
    public Venta(User user, Producto product,String Codfactura, String fecha , String tipo_envio, String pais, String numero_t,  String Direccion,int cantidad_producto,String codigo_postal,double total_pagado) {
        this.user = user;
        this.product = product;
        this.tipo_envio = tipo_envio;
        this.pais = pais;
        this.codigo_postal = codigo_postal;
        this.Direccion = Direccion;
        this.numero_t = numero_t;
        this.fecha = fecha;
        this.Codfactura = Codfactura;
        this.total_pagado = total_pagado;
        this.cantidad_producto = cantidad_producto;
    }

    
    //email
    
    
    public Venta(Producto product, int cantidad_producto) {
        this.product = product;
        this.cantidad_producto = cantidad_producto;
    } 

    public Venta() {
    }

    public String getCodfactura() {
        return Codfactura;
    }

    public void setCodfactura(String Codfactura) {
        this.Codfactura = Codfactura;
    }

    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    public String getNumero_t() {
        return numero_t;
    }

    public void setNumero_t(String numero_t) {
        this.numero_t = numero_t;
    }
    
    
    public int getCodigo_p() {
        return codigo_p;
    }

    public void setCodigo_p(int codigo_p) {
        this.codigo_p = codigo_p;
    }

    public String getTipo_envio() {
        return tipo_envio;
    }

    public void setTipo_envio(String tipo_envio) {
        this.tipo_envio = tipo_envio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    

    public String  getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
  
    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Producto getProduct() {
        return product;
    }

    public void setProduct(Producto product) {
        this.product = product;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

   

    public double getTotal_pagado() {
        return total_pagado;
    }

    public void setTotal_pagado(double total_pagado) {
        this.total_pagado = total_pagado;
    }
  
  
    
    
    
}
