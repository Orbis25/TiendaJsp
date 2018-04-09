
package com.dao;

import com.Bean.User;
import com.Interfaces.UserInter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.commons.codec.digest.DigestUtils;


public class UserImpl extends Conexion implements UserInter {
    
    public static  String aleatoria="";
    public UserImpl() {
     
    }
     //genera aleatoriamente una cadena
  public  String getCadenaAlfanumAleatoria (int longitud){
  String cadenaAleatoria="";
  long milis = new java.util.GregorianCalendar().getTimeInMillis();
  Random r = new Random(milis);
  int i = 0;
  while ( i < longitud){
  char c = (char)r.nextInt(255);
  //System.out.println("char:"+c);
  if ( (c >= '0' && c <=9) || (c >='A' && c <='Z') ){
  cadenaAleatoria += c;
  i ++;
  }
  }
  return cadenaAleatoria;
  }
    
    @Override
    public void registrar(User user) {
        
        int confirmacion = 0;
        aleatoria=getCadenaAlfanumAleatoria(8);
        
  
        try {
            
            String textoEncriptadoConMD5=DigestUtils.md5Hex(user.getPass()); 
            Connection conexion = this.getConnection();
            String SqlUsuario = "insert into usuario(nombre,apellido,correo,password,cod_confirmacion,confirmacion) values(?,?,?,?,?,?)";
            PreparedStatement ps = conexion.prepareStatement(SqlUsuario);
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getApellido());
            ps.setString(3, user.getCorreo());
            ps.setString(4, textoEncriptadoConMD5);
            ps.setString(5, aleatoria);
            ps.setInt(6, confirmacion);
            ps.executeUpdate();
              
        } catch (SQLException ex) {
            System.out.println("error al insertar datos"+ex);
        }finally{
        this.cerrar();
        }
        
        
        try
        {
            // Propiedades de la conexión
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", "orbisalonzo25@gmail.com");
            props.setProperty("mail.smtp.auth", "true");
            
            String header = "Bienvenido a TechShop";
 
            // Preparamos la sesion
            Session session = Session.getDefaultInstance(props);
 
            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);
            //la persona que enviara
            message.setFrom(new InternetAddress("orbisalonzo25@gmail.com"));
            message.addRecipient(
                Message.RecipientType.TO, new InternetAddress(user.getCorreo()));
           
            message.setSubject("Correo de verificacion, porfavor no responder");
            message.setSubject(header);
            message.setText(TemplateEmail.template+
                               "href='http://localhost:8084/Tienda/ActivationEmail?cod="+aleatoria+"' target='_blank'>Confirmacion <span class='fa fa-thumbs-up'></span></a>" +
"																	</td>" +
"																</tr>" +
"															</table>" +
"															<!-- // CONTENT TABLE -->" +
"" +
"														</td>" +
"													</tr>" +
"												</table>" +
"												<!-- // FLEXIBLE CONTAINER -->" +
"											</td>" +
"										</tr>" +
"									</table>" +
"									<!-- // CENTERING TABLE -->" +
"								</td>" +
"							</tr>" +
"							<!-- // MODULE ROW -->" +
"" +
"" +
"							<!-- MODULE ROW // -->" +
"							<tr>" +
"								<td align='center' valign='top'>" +
"									<!-- CENTERING TABLE // -->" +
"									<table border='0' cellpadding='0' cellspacing='0' width='100%' bgcolor='#F8F8F8'>" +
"										<tr>" +
"											<td align='center' valign='top'>" +
"												<!-- FLEXIBLE CONTAINER // -->" +
"												<table border='0' cellpadding='0' cellspacing='0' width='500' class='flexibleContainer'>" +
"													<tr>" +
"														<td align='center' valign='top' width='500' class='flexibleContainerCell'>" +
"															<table border='0' cellpadding='30' cellspacing='0' width='100%'>" +
"																<tr>" +
"																	<td align='center' valign='top'>" +
"" +
"																		<!-- CONTENT TABLE // -->" +
"																		<table border='0' cellpadding='0' cellspacing='0' width='100%'>" +
"																			<tr>" +
"																				<td valign='top' class='textContent'>" +
"																					" +
"																					<h3 mc:edit='header' style='color:#5F5F5F;line-height:125%;font-family:Helvetica,Arial,sans-serif;font-size:20px;font-weight:normal;margin-top:0;margin-bottom:3px;text-align:left;'>Recuerde</h3>" +
"																					<div mc:edit='body' style='text-align:left;font-family:Helvetica,Arial,sans-serif;font-size:15px;margin-bottom:0;color:#5F5F5F;line-height:135%;'>Este enlace solo servira una sola vez</div>" +
"																				</td>" +
"																			</tr>" +
"																		</table>" +
"																		<!-- // CONTENT TABLE -->" +
"" +
"																	</td>" +
"																</tr>" +
"															</table>" +
"														</td>" +
"													</tr>" +
"												</table>" +
"												<!-- // FLEXIBLE CONTAINER -->" +
"											</td>" +
"										</tr>" +
"									</table>" +
"									<!-- // CENTERING TABLE -->" +
"								</td>" +
"							</tr>" +
"								</td>" +
"							</tr>" +
"						</table>" +
"					</td>" +
"				</tr>" +
"			</table>" +
"		</center>" +
"	</body>" +
"</html>",
              "ISO-8859-1",
              "html");
           
 
            // Lo enviamos.
            Transport t = session.getTransport("smtp");
            t.connect("orbisalonzo25@gmail.com", "alonzo25");
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
 
            // Cierre.
            t.close();
            System.out.println("enviado correcto");
        }
        catch (Exception e)
        {
           System.out.println("enviado incorrecto"+e);
            e.printStackTrace();
        }      
        
    }
    
   @Override
   public boolean login(User user){
            
        try{
            String desencriptado=DigestUtils.md5Hex(user.getPass());
            Connection con = this.getConnection();
            String sql = "select id_usuario,nombre,apellido,correo,password from usuario where correo = ? and password = ?";
            PreparedStatement ps =  con.prepareStatement(sql);
            ps.setString(1, user.getCorreo());
            ps.setString(2, desencriptado);
            ResultSet rs = ps.executeQuery();
            String c = "";
            String p = "";
            
            while(rs.next()){
                c = rs.getString("correo");
                p = rs.getString("password"); 
                user.setId_user(rs.getInt(1));
                user.setNombre(rs.getString(2));
                user.setApellido(rs.getString(3));
                user.setCorreo(rs.getString(4));
            }
              
              if(c.equals(user.getCorreo()) && p.equals(desencriptado)){
                    System.out.println("correcto");
                    return true;
                    
                }
              else{
                  System.out.println("error loguin");
                  return false;
              }
              
              
              
              
        }catch(SQLException e){
        
            System.out.println("error-logueando"+e);
        
        }finally{
        this.cerrar();
        }
        return false;
    }

    public static int verificado = 0;
    @Override
    public int emailActivacion(User user) {
    try {
        
         String ale=user.getCod_confimacion();
         String aleC = "";
         int conf = 0;

         try{
          Connection con = this.getConnection();
          PreparedStatement st = con.prepareStatement("SELECT cod_confirmacion,confirmacion FROM usuario WHERE cod_confirmacion=?");
          st.setString(1, ale);
          ResultSet rs = st.executeQuery();
          
          while(rs.next()){
              aleC = rs.getString("cod_confirmacion");
              
              conf = rs.getInt("confirmacion");
          }
          System.out.println("conecxion satisfactoria");
   
      }catch(Exception e){
      
          System.out.println("Ocurrio un error al connectarse"+e);
      }finally{
        this.cerrar();
        }
   
   try {

        System.out.println("bien hecho");
        if(ale.equals(aleC)){
          if(conf == 0){
            verificado = 1;   
          System.out.println("El Usuario se ha registrado");  
          int usada = 1;
          
          try{
          
          Connection con = this.getConnection();
          PreparedStatement st = con.prepareStatement("update usuario set confirmacion = ?  where cod_confirmacion = ?");
          st.setInt(1, usada);
          st.setString(2, aleC);
          st.executeUpdate();
          
          }catch(Exception e){
          
              System.out.println("error al update de la tabla"+e);
          }

          }else{
          
               verificado = 2;
          }
           
        }else{
         verificado = 3;
         System.out.println("Lo sentimos no es el numero de registro");
        }
   } catch (Exception e) {
    System.out.println("Error de escritura:"+e);
   }finally{
    this.cerrar();
   }
  } catch (Exception e) {
   System.out.println("error"+e);
  }
   
    return verificado;
    
    
 }

}


