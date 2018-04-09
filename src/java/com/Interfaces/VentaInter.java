/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Interfaces;

import com.Bean.Venta;
import java.util.ArrayList;

/**
 *
 * @author orbis
 */
public interface VentaInter {
    
    public boolean insertSaleUser(Venta venta,ArrayList<Venta> List);
    public boolean insertSaleNoUser(Venta venta,ArrayList<Venta> List);
    public boolean emailSale(Venta venta);
    public boolean queryFK();
    public boolean queryFK2();
    
}
