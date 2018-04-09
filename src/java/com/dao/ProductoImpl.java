
package com.dao;

import com.Bean.Categoria;
import com.Bean.Marca;
import com.Bean.Producto;
import com.Bean.User;
import com.Bean.Venta;
import static com.Controller.ProductsC.id_pc;
import static com.Controller.ProductsC.modelo;
import static com.Controller.ProductsC.price;
import com.Interfaces.ProductoInter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class ProductoImpl extends Conexion implements ProductoInter {

    @Override
    public ArrayList<Producto> ListLaptops() {
        ArrayList<Producto> lista = new ArrayList<Producto>();
        try {
            Connection con = this.getConnection();
            String sql = "call proc_listarLaptops()";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){   
            Producto p = new Producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5));
            lista.add(p);
            
            }
            
        } catch (Exception e) {
            System.out.println("error al listar Productos "+e);
        } finally{
        this.cerrar();
        }      
        return lista;
    } 

    @Override
    public ArrayList<Producto> ProductRamdon() {
          ArrayList<Producto> lista = new ArrayList<Producto>();
        try {
            Connection con = this.getConnection();
            String sql = "call proc_RamdonP()";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){   
            Producto p = new Producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(5),rs.getString(4));
            lista.add(p);
            
            }
            
        } catch (Exception e) {
            System.out.println("error al listar Productos "+e);
        } finally{
        this.cerrar();
        }      
        return lista;


    }

    @Override
    public ArrayList<Producto> ProductRamdon1() {

          ArrayList<Producto> lista = new ArrayList<Producto>();
        try {
            Connection con = this.getConnection();
            String sql = "call proc_RamdonP1()";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){   
            Producto p = new Producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(5),rs.getString(4));
            lista.add(p);
            
            }
            
        } catch (Exception e) {
            System.out.println("error al listar Productos "+e);
        } finally{
        this.cerrar();
        }      
        return lista;

    }

    @Override
    public ArrayList<Producto> ListPc() {

          ArrayList<Producto> lista = new ArrayList<Producto>();
        try {
            Connection con = this.getConnection();
            String sql = "call proc_listarPc()";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){   
            Producto p = new Producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5));
            lista.add(p);
            
            }
            
        } catch (Exception e) {
            System.out.println("error al listar Productos "+e);
        } finally{
        this.cerrar();
        }      
        return lista;

    }

    @Override
    public ArrayList<Producto> Slider() {
        
        
          ArrayList<Producto> lista = new ArrayList<Producto>();
        try {
            Connection con = this.getConnection();
            String sql = "call proc_slider1()";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){   
            Producto p = new Producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(5),rs.getString(4));
            lista.add(p);
            
            }
            
        } catch (Exception e) {
            System.out.println("error slider "+e);
        } finally{
        this.cerrar();
        }      
        return lista;


    }    

    @Override
    public ArrayList<Marca> Marcas() {
        
        
          ArrayList<Marca> lista = new ArrayList<Marca>();
        try {
            Connection con = this.getConnection();
            String sql = "SELECT id_marca,marca FROM MARCA order by rand() limit 7;";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){   
            Marca m = new Marca(rs.getInt(1),rs.getString(2));
            lista.add(m);
            
            }
            
        } catch (Exception e) {
            System.out.println("error MARCAS "+e);
        }finally{
        this.cerrar();
        }       
        return lista;

    }

    @Override
    public ArrayList<Categoria> categories() {
       
        ArrayList<Categoria> lista = new ArrayList<Categoria>();
        try {
            Connection con = this.getConnection();
            String sql = "select *from categoria";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){   
            Categoria c = new Categoria(rs.getInt(1),rs.getString(2));
            lista.add(c);
            
            }
            
        } catch (Exception e) {
            System.out.println("error categorias "+e);
        } finally{
        this.cerrar();
        }      
        return lista;
    }

    @Override
    public ArrayList<Producto> otherP() {
        
         ArrayList<Producto> lista = new ArrayList<Producto>();
        try {
            Connection con = this.getConnection();
            String sql = "call proc_listarOtrosP()";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){   
            Producto p = new Producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5));
            lista.add(p);
            
            }
            
        } catch (Exception e) {
            System.out.println("error other "+e);
        } finally{
        this.cerrar();
        }      
        return lista;

    }

    @Override
    public ArrayList<Producto> Colors() {
         ArrayList<Producto> lista = new ArrayList<Producto>();
        try {
            Connection con = this.getConnection();
            String sql = "call proc_colorD('"+id_pc+"')";
            Statement call = con.prepareCall(sql);
            ResultSet rs = call.executeQuery(sql);
            while(rs.next()){   
            Producto p = new Producto(rs.getString(1));
            lista.add(p);
            }
        } catch (Exception e) {
            System.out.println("error colors "+e);
        } finally{
        this.cerrar();
        }      
        return lista;
    }

    @Override
    public ArrayList<Producto> CDips() {
        ArrayList<Producto> lista = new ArrayList<Producto>();
        try {
            Connection con = this.getConnection();
            String sql = "call proc_cantidadD('"+modelo+"','"+price+"')";
            Statement call = con.prepareCall(sql);
            ResultSet rs = call.executeQuery(sql);
            while(rs.next()){   
            Producto p = new Producto();
            p.setCantidad(rs.getString(1));
            lista.add(p);
            }
        } catch (Exception e) {
            System.out.println("error CDisp "+e);
        } finally{
        this.cerrar();
        }      
        return lista;
    }  

    @Override
    public ArrayList<Producto> productoD() {

        ArrayList<Producto> lista = new ArrayList<Producto>();
        try {
            Connection con = this.getConnection();
            String sql = "call tienda.proc_detailP('"+id_pc+"')";
            Statement call = con.prepareCall(sql);
            ResultSet rs = call.executeQuery(sql);
            while(rs.next()){   
            Producto p = new Producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5)
            ,rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getInt(12),
            rs.getString(13),rs.getInt(14));
            lista.add(p);
            }
        } catch (Exception e) {
            System.out.println("error all Details: "+e);
        } finally{
        this.cerrar();
        }      
        return lista;
        
    }       

    @Override
    public Producto carP(int codigo) {
        Producto p = null;
        try {
            CallableStatement cl = this.getConnection().prepareCall("{call proc_listCar(?)}");
            cl.setInt(1, codigo);
            ResultSet rs = cl.executeQuery();
            while(rs.next()){   
            p = new Producto(rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getInt(1)); 
            }
            
        } catch (Exception e) {
            System.out.println("error al agregar al carrito "+e);
        }finally{
        this.cerrar();
        }       
        return p;

    }

    @Override
    public ArrayList<Producto> allProducts(int star,int total) {

        ArrayList<Producto> lista = new ArrayList<Producto>();
        try {
            Connection con = this.getConnection();
            String sql = "call proc_listAll('"+(star-1)+"','"+total+"')";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){   
            Producto p = new Producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5));
            lista.add(p);
            
            }
            
        } catch (Exception e) {
            System.out.println("error al listar allProductos "+e);
        }  finally{
        this.cerrar();
        }     
        return lista;


    }

    @Override
    public int pagination() {
        int i = 0;
        try {
            Connection con = this.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT round((count(*)/6)+1) as paginas FROM producto;");
            while(rs.next()){
            i = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("error al paginar "+e);
        }

        return i;
    }

    @Override
    public ArrayList<Producto> allProductsSearch(int star,int total,String busqueda) {
    ArrayList<Producto> lista = new ArrayList<Producto>();
        try {
            Connection con = this.getConnection();
            String sql = "call proc_Search('"+(star-1)+"','"+total+"','"+busqueda+"')";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){   
            Producto p = new Producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5));
            lista.add(p);
            
            }
            
        } catch (Exception e) {
            System.out.println("error al listar allProductos "+e);
        }  finally{
        this.cerrar();
        }     
        return lista;}

    @Override
    public ArrayList<Venta> allSale() {

         ArrayList<Venta> lista = new ArrayList<Venta>();
        try {
            Connection con = this.getConnection();
            String sql = "call proc_listFact();";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()){   
            Producto p = new Producto(rs.getString(4),rs.getString(5));
            User use = new User();
            use.setNombre(rs.getString(3));
            Venta v = new Venta(use, p, rs.getString(1), rs.getString(2), rs.getString(6),rs.getString(7)
                    , rs.getString(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getInt(12));
            lista.add(v);            
            }
            
        } catch (Exception e) {
            System.out.println("error al listar factura "+e);
        } finally{
        this.cerrar();
        }      
        return lista;
    }
}
