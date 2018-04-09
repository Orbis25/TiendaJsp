/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces;

import com.Bean.Admin;
import com.Bean.Categoria;
import com.Bean.Disco;
import com.Bean.Marca;
import com.Bean.Procesador;
import com.Bean.Producto;
import com.Bean.Ram;
import com.Bean.Sistema;


public interface AdminInter {
    
    public boolean login(Admin admin);
    public void RegisterProducts(Producto producto);
    public void deleteProducts(Producto producto);
    public void updateProducts(Producto producto);
    public void RegisterCategories(Categoria categoria);
    public void RegisterDisk(Disco disco);
    public void RegisterMarca(Marca marca,Sistema sistema);
    public void RegisterProcesor(Procesador procesador);
    public void RegisterRam(Ram ram);
    public void RegisterSistems(Sistema sistema);
    public void deleteCategories(Categoria categoria);
    public void deleteDisk(Disco disco);
    public void deleteMarca(Marca marca);
    public void deleteProcesor(Procesador procesador);
    public void deleteRam(Ram ram);
    public void deleteSistem(Sistema sistema);
    
}
