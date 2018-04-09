/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces;

import com.Bean.Categoria;
import com.Bean.Marca;
import com.Bean.Producto;
import com.Bean.Venta;
import java.util.ArrayList;

public interface ProductoInter {
    
    public ArrayList<Producto> ListLaptops();
    public ArrayList<Producto> ProductRamdon();
    public ArrayList<Producto> ProductRamdon1();
    public ArrayList<Producto> ListPc();
    public ArrayList<Producto> Slider();
    public ArrayList<Marca> Marcas();
    public ArrayList<Categoria> categories();
    public ArrayList<Producto> otherP();
    public ArrayList<Producto> Colors();
    public ArrayList<Producto> CDips();
    public ArrayList<Producto> productoD();
    public Producto carP(int codigo);
    public ArrayList<Producto> allProducts(int star,int total);
    public ArrayList<Producto> allProductsSearch(int star,int total,String busqueda);
    public ArrayList<Venta> allSale();
    public int pagination();
    
    
}
