
package com.dao;

import com.Bean.Admin;
import com.Bean.Categoria;
import com.Bean.Disco;
import com.Bean.Marca;
import com.Bean.Procesador;
import com.Bean.Producto;
import com.Bean.Ram;
import com.Bean.Sistema;
import com.Interfaces.AdminInter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




public class AdminImpl extends Conexion implements AdminInter {

    @Override
    public boolean login(Admin admin) {
        
        try{

            Connection con =  this.getConnection();
            String sql = "select nombre,correo,password from admin where correo = ? and password = ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, admin.getCorreo());
            ps.setString(2, admin.getPass());
            ResultSet rs = ps.executeQuery();
            String c = "";
            String p = "";
            String n = "";
            
            while(rs.next()){
            
                c = rs.getString("correo");
                p = rs.getString("password");
                n = rs.getString("nombre");
                
            }
            
            if(c.equals(admin.getCorreo()) && p.equals(admin.getPass())){
                    admin.setNombre(n);
                    System.out.println("correcto");
                    return true;
                }
              else{
                  System.out.println("error loguin");
                  return false;
              }
            
            
        }catch(Exception e){
            System.out.println("error en la conexion login"+e);
        }finally{
        this.cerrar();
        }
        return false;
    }

    @Override
    public void RegisterProducts(Producto producto) {
       
          try{
            Connection con =  this.getConnection();
            String sql = "insert into Producto(id_fkprocesador,id_fkmarca,id_fkcategoria,id_fkram,id_fkdisco,nombre,imagen,precio,color"
                    + ",descripcion,modelo_pc,disponibilidad) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            
            Procesador p = new Procesador();
            Marca m = new Marca();
            Categoria c = new Categoria();
            Ram ram = new Ram();
            Disco d = new Disco();        
            p = producto.getId_fkprocesador();
            m = producto.getId_fkmarca();
            c = producto.getId_fkcategoria();
            ram = producto.getId_fkram();
            d = producto.getId_fkdisco();
            
              ps.setInt(1,p.getId_modelo());
              ps.setInt(2, m.getId_marca());
              ps.setInt(3, c.getId_categoria());
              ps.setInt(4, ram.getRam());
              ps.setInt(5, d.getId_disco());
              ps.setString(6, producto.getNombre());
              ps.setString(7, producto.getImagen());
              ps.setDouble(8, producto.getPrecio());
              ps.setString(9,producto.getColor());
              ps.setString(10,producto.getDescripcion());
              ps.setString(11,producto.getModelo_pc());
              ps.setString(12,producto.getDisponibilidad());
              ps.executeUpdate();            
        }catch(Exception e){
            System.out.println("error en registrar "+e);
        }finally{
        this.cerrar();
        }
    }
    @Override
    public void deleteProducts(Producto producto) {
        
        try {
            Connection con = this.getConnection();
            String sql = "delete from producto where id_producto=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,producto.getId_producto());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("error al eliminar producto "+e);
        }finally{
        
        this.cerrar();
        }
    }

    @Override
    public void updateProducts(Producto producto) {
      
      try {
            Connection con = this.getConnection();
            String sql = "call proc_updateP(?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            Procesador p = new Procesador();
            Marca m = new Marca();
            Categoria c = new Categoria();
            Ram ram = new Ram();
            Disco d = new Disco();
            
            
            p = producto.getId_fkprocesador();
            m = producto.getId_fkmarca();
            c = producto.getId_fkcategoria();
            ram = producto.getId_fkram();
            d = producto.getId_fkdisco();
            
            
              ps.setInt(1,producto.getId_producto());
              ps.setInt(2,p.getId_modelo());
              ps.setInt(3, m.getId_marca());
              ps.setInt(4, c.getId_categoria());
              ps.setInt(5, ram.getRam());
              ps.setInt(6, d.getId_disco());
              ps.setString(7, producto.getNombre());
//            ps.setString(7, producto.getImagen());
              ps.setDouble(8, producto.getPrecio());
              ps.setString(9,producto.getColor());
              ps.setString(10,producto.getDescripcion());
              ps.setString(11,producto.getModelo_pc());
              ps.setString(12,producto.getDisponibilidad());
              ps.executeUpdate();
          
            
        } catch (Exception e) {
            System.out.println("error al actualizar producto "+e);
        }finally{
        
        this.cerrar();
        }
    }

    @Override
    public void RegisterCategories(Categoria categoria) {
        
        try {
            Connection con =  this.getConnection();
            String sql = "insert into categoria(categoria) values(?)";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, categoria.getCategoria());
            ps.executeUpdate();
        } catch (Exception e) {
            
            System.out.println("Error al registrar categorias "+e);
        }finally{
        this.cerrar();
        }

    }

    @Override
    public void RegisterDisk(Disco disco) {

        try {
            
            Connection con =  this.getConnection();
            String sql = "insert into disco_duro(disco,tipo) values(?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, disco.getDisco());
            ps.setString(2, disco.getTipo());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("error al registrar discos "+e);
        }finally{
        this.cerrar();
        }
        

    }

    @Override
    public void RegisterMarca(Marca marca, Sistema sistema) {

         try {
            
            Connection con =  this.getConnection();
            String sql = "insert into marca(id_fksistema,marca) values(?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            sistema = marca.getId_fksistema();
            
            ps.setInt(1, sistema.getId_sistema());
            ps.setString(2, marca.getNombre_marca());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("error al registrar marca"+e);
        }finally{
        this.cerrar();
        }


    }

    @Override
    public void RegisterProcesor(Procesador procesador) {
        
        try {
            
            Connection con =  this.getConnection();
            String sql = "insert into procesador(modelo) values(?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, procesador.getModelo());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("error al registrar procesador"+e);
        }finally{
        this.cerrar();
        }
        
    }

    @Override
    public void RegisterRam(Ram ram) {

        try {
            
            Connection con =  this.getConnection();
            String sql = "insert into ram(ram) values(?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ram.getCapacidad());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("error al registrar Rams"+e);
        }finally{
        this.cerrar();
        }

    }

    @Override
    public void RegisterSistems(Sistema sistema) {
       try {
            
            Connection con =  this.getConnection();
            String sql = "insert into sistema(sistema) values(?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sistema.getSistema());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("error al registrar Sistema"+e);
        }finally{
        this.cerrar();
        }  
    }

    @Override
    public void deleteCategories(Categoria categoria) {

        try {
            Connection con = this.getConnection();
            String sql = "delete from categoria where id_categoria=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,categoria.getId_categoria());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("error al eliminar categoria "+e);
        }finally{
        
        this.cerrar();
        }
    }

    @Override
    public void deleteDisk(Disco disco) {

        try {
            Connection con = this.getConnection();
            String sql = "delete from disco_duro where id_disco=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,disco.getId_disco());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("error al eliminar disco "+e);
        }finally{
        
        this.cerrar();
        }


    } 

    @Override
    public void deleteMarca(Marca marca) {
        
        try {
           Connection con = this.getConnection();
            String sql = "delete from marca where id_marca=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,marca.getId_marca());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("error al eliminar marca "+e);
        }finally{
        
        this.cerrar();
        }

    }

    @Override
    public void deleteProcesor(Procesador procesador){
        try {
           Connection con = this.getConnection();
            String sql = "delete from procesador where idProcesador=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,procesador.getId_modelo());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("error al eliminar Procesador "+e);
        }finally{
        
        this.cerrar();
        }
        
    }

    @Override
    public void deleteRam(Ram ram) {

        try {
           Connection con = this.getConnection();
            String sql = "delete from ram where id_ram=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,ram.getRam());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("error al eliminar Ram "+e);
        }finally{
        
        this.cerrar();
        }
    }

    @Override
    public void deleteSistem(Sistema sistema) {
        try {
           Connection con = this.getConnection();
            String sql = "delete from sistema where id_sistema=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,sistema.getId_sistema());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("error al eliminar sistema "+e);
        }finally{
        
        this.cerrar();
        }

        
    }    

   

}
