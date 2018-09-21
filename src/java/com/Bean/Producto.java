
package com.Bean;


public class Producto {
    
   private String nombre;
   private  String imagen;
   private double precio;
   private String disponibilidad;
   private String color;
   private String descripcion;
   private String cantidad;
   private int id_producto;
   
   
   //detail
   private String marc;
   private String sistem;
   private String categories;
   private String procesor;
   private int disk;
   private String type;
   private int memory;

    public String getMarc() {
        return marc;
    }

    public void setMarc(String marc) {
        this.marc = marc;
    }

    public String getSistem() {
        return sistem;
    }

    public void setSistem(String sistem) {
        this.sistem = sistem;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

   
   //detail
    public Producto(int id_producto,String imagen,String nombre,  double precio, String disponibilidad, 
            String marc, String descripcion,String modelo_pc, String sistem, String categories, 
            String procesor, int disk, String type, int memory ) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.descripcion = descripcion;
        this.id_producto = id_producto;
        this.marc = marc;
        this.sistem = sistem;
        this.categories = categories;
        this.procesor = procesor;
        this.disk = disk;
        this.type = type;
        this.memory = memory;
        this.modelo_pc = modelo_pc;
    }
     
   
   //fk
   private Marca id_fkmarca;
   private Procesador id_fkprocesador;
   private Disco id_fkdisco;
   private Categoria id_fkcategoria;
   private Ram id_fkram;
   private String modelo_pc;
   

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
  
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    //delete and detail and cheekout
    public Producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public Producto(int id_producto,String cantidad) {
        this.id_producto = id_producto;
        this.cantidad = cantidad;
    }
    
    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
   
    
    
  

   
   //register
    public Producto(String nombre, String imagen, double precio, String color, String descripcion, Marca id_fkmarca, Procesador id_fkprocesador, Disco id_fkdisco, Categoria id_fkcategoria, Ram id_fkram,String modelo_pc,String disponibilidad) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
        this.color = color;
        this.descripcion = descripcion;
        this.id_fkmarca = id_fkmarca;
        this.id_fkprocesador = id_fkprocesador;
        this.id_fkdisco = id_fkdisco;
        this.id_fkcategoria = id_fkcategoria;
        this.id_fkram = id_fkram;
        this.modelo_pc = modelo_pc;
        this.disponibilidad = disponibilidad;

    }
    //update
      public Producto(String nombre, String imagen, double precio, String color, String descripcion, Marca id_fkmarca, Procesador id_fkprocesador, Disco id_fkdisco, Categoria id_fkcategoria, Ram id_fkram,String modelo_pc,int id_producto,String disponibilidad) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
        this.color = color;
        this.descripcion = descripcion;
        this.id_fkmarca = id_fkmarca;
        this.id_fkprocesador = id_fkprocesador;
        this.id_fkdisco = id_fkdisco;
        this.id_fkcategoria = id_fkcategoria;
        this.id_fkram = id_fkram;
        this.modelo_pc = modelo_pc;
        this.id_producto = id_producto;
        this.disponibilidad = disponibilidad;
    }
    //Detail
     
      
    //send_products
    public Producto(int id_producto,String nombre, String imagen, double precio,String modelo_pc) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
        this.id_producto = id_producto;
        this.modelo_pc = modelo_pc;
        
    }
 

    //toCar!
    public Producto(String nombre, String imagen, double precio, String color, int id_producto) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
        this.color = color;
        this.id_producto = id_producto;
    }
        
    //arreglar--
    public Producto(int id_producto,String nombre,String imagen) {
        this.nombre = nombre;
        this.id_producto = id_producto;
        this.imagen = imagen;
       
    }
  
    //colors and dips.

    public Producto(String color) {
        this.color = color;
    }

    public Producto(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    //email

    public Producto(String nombre, String color, String modelo_pc) {
        this.nombre = nombre;
        this.color = color;
        this.modelo_pc = modelo_pc;
    }
    
    
    
    public Producto() {
    }

    public String getModelo_pc() {
        return modelo_pc;
    }

    public void setModelo_pc(String modelo_pc) {
        this.modelo_pc = modelo_pc;
    }
   
    
   

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Marca getId_fkmarca() {
        return id_fkmarca;
    }

    public void setId_fkmarca(Marca id_fkmarca) {
        this.id_fkmarca = id_fkmarca;
    }

    public Procesador getId_fkprocesador() {
        return id_fkprocesador;
    }

    public void setId_fkprocesador(Procesador id_fkprocesador) {
        this.id_fkprocesador = id_fkprocesador;
    }

    public Disco getId_fkdisco() {
        return id_fkdisco;
    }

    public void setId_fkdisco(Disco id_fkdisco) {
        this.id_fkdisco = id_fkdisco;
    }

    public Categoria getId_fkcategoria() {
        return id_fkcategoria;
    }

    public void setId_fkcategoria(Categoria id_fkcategoria) {
        this.id_fkcategoria = id_fkcategoria;
    }

    public Ram getId_fkram() {
        return id_fkram;
    }

    public void setId_fkram(Ram id_fkram) {
        this.id_fkram = id_fkram;
    }
    
}
