/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.Bean.Venta;
import com.Interfaces.VentaInter;
import static com.dao.UserImpl.aleatoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author orbis
 */
public class VentaImpl extends Conexion implements VentaInter{
 
    private String noFactura="";

    public  String getCadenaAlfanumAleatoria (int longitud){
    String cadenaAleatoria="";
    long milis = new java.util.GregorianCalendar().getTimeInMillis();
    Random r = new Random(milis);
    int i = 0;
    while ( i < longitud){
    char c = (char)r.nextInt(255);
    if ( (c >= '0' && c <=9) || (c >='A' && c <='Z') ){
    cadenaAleatoria += c;
    i ++;
    }
    }
    return cadenaAleatoria;
  }
    
    
    @Override
    public boolean insertSaleUser(Venta venta,ArrayList<Venta> List) {
        boolean o = false;
       
         noFactura=getCadenaAlfanumAleatoria(8);
         
         try {
            Date myDate = new Date();            
            Connection con = this.getConnection();
            String sql = "insert into venta(id_fU,id_fP,cantidad_Producto,total_pagado,tipo_envio,pais,codigo_postal,dirreccion,telefono,fecha,cod)"
                    + "values (?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);
                for(Venta v:List){
                ps.setInt(2, v.getProduct().getId_producto());
                ps.setInt(1, venta.getUser().getId_user());    
                ps.setInt(3, v.getCantidad_producto());
                ps.setDouble(4, venta.getTotal_pagado());
                ps.setString(5,venta.getTipo_envio());
                ps.setString(6, venta.getPais());
                ps.setString(7, venta.getCodigo_postal());
                ps.setString(8, venta.getDireccion());
                ps.setString(9, venta.getNumero_t());
                ps.setString(10,new SimpleDateFormat("dd-MM-yyyy").format(myDate));
                ps.setString(11,noFactura);
                ps.executeUpdate();
                }
                o = true;
                
        } catch (Exception e) {
            System.out.println("error al insertar venta "+e);
            o = false;
        }finally{
            this.cerrar();
        }
         return o;
    }

    
        @Override
    public boolean insertSaleNoUser(Venta venta,ArrayList<Venta> List) {
        boolean o = false;
       
         noFactura=getCadenaAlfanumAleatoria(8);
         
         try {
            Date myDate = new Date();            
            Connection con = this.getConnection();
            String sql = "insert into venta(id_fP,cantidad_Producto,total_pagado,tipo_envio,pais,codigo_postal,dirreccion,telefono,fecha,cod)"
                    + "values (?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);
                for(Venta v:List){
                ps.setInt(1, v.getProduct().getId_producto());
                ps.setInt(2, v.getCantidad_producto());
                ps.setDouble(3, venta.getTotal_pagado());
                ps.setString(4,venta.getTipo_envio());
                ps.setString(5, venta.getPais());
                ps.setString(6, venta.getCodigo_postal());
                ps.setString(7, venta.getDireccion());
                ps.setString(8, venta.getNumero_t());
                ps.setString(9,new SimpleDateFormat("dd-MM-yyyy").format(myDate));
                ps.setString(10,noFactura);
                ps.executeUpdate();
                }
                o = true;
                
        } catch (Exception e) {
            System.out.println("error al insertar venta "+e);
            o = false;
        }finally{
            this.cerrar();
        }
        

         return o;
    }
    
    
    @Override
    public boolean emailSale(Venta venta , String products) {
            boolean result = false;        
        try
        {
            // Propiedades de la conexión
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", "orbisalonzo25@gmail.com");
            props.setProperty("mail.smtp.auth", "true");
            
            String header = "Gracias por comprar en Shop-Geek";
 
            // Preparamos la sesion
            Session session = Session.getDefaultInstance(props);
 
            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);
            //la persona que enviara
            message.setFrom(new InternetAddress("orbisalonzo25@gmail.com"));
            message.addRecipient(
                Message.RecipientType.TO, new InternetAddress(venta.getUser().getCorreo()));
           
            message.setSubject("Porfavor no responder");
            message.setSubject(header);
            message.setText("<!DOCTYPE html" +
"	<head>" +
"		<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />" +
"		<meta name='viewport' content='width=device-width, initial-scale=1.0'>" +
"		<meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'>" +
"		<meta name='format-detection' content='telephone=no' /> <!-- disable auto telephone linking in iOS -->" +
"		<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'>" +
                    "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\n" +
"        crossorigin=\"anonymous\">"+
"		<title>Respmail is a response HTML email designed to work on all major email platforms and smartphones</title>" +
"		<style type='text/css'>" +
"			" +
"			html { background-color:#E1E1E1; margin:0; padding:0; }" +
"			body, #bodyTable, #bodyCell, #bodyCell{height:100% !important; margin:0; padding:0; width:100% !important;font-family:Helvetica, Arial, 'Lucida Grande', sans-serif;}" +
"			table{border-collapse:collapse;}" +
"			table[id=bodyTable] {width:100%!important;margin:auto;max-width:500px!important;color:#7A7A7A;font-weight:normal;}" +
"			img, a img{border:0; outline:none; text-decoration:none;height:auto; line-height:100%;}" +
"			a {text-decoration:none !important;border-bottom: 1px solid;}" +
"			h1, h2, h3, h4, h5, h6{color:#5F5F5F; font-weight:normal; font-family:Helvetica; font-size:20px; line-height:125%; text-align:Left; letter-spacing:normal;margin-top:0;margin-right:0;margin-bottom:10px;margin-left:0;padding-top:0;padding-bottom:0;padding-left:0;padding-right:0;}" +
"" +
"			" +
"			.ReadMsgBody{width:100%;} .ExternalClass{width:100%;} " +
"			.ExternalClass, .ExternalClass p, .ExternalClass span, .ExternalClass font, .ExternalClass td, .ExternalClass div{line-height:100%;} /* Force Hotmail/Outlook.com to display line heights normally. */" +
"			table, td{mso-table-lspace:0pt; mso-table-rspace:0pt;} /* Remove spacing between tables in Outlook 2007 and up. */" +
"			#outlook a{padding:0;} /* Force Outlook 2007 and up to provide a 'view in browser' message. */" +
"			img{-ms-interpolation-mode: bicubic;display:block;outline:none; text-decoration:none;} /* Force IE to smoothly render resized images. */" +
"			body, table, td, p, a, li, blockquote{-ms-text-size-adjust:100%; -webkit-text-size-adjust:100%; font-weight:normal!important;} /* Prevent Windows- and Webkit-based mobile platforms from changing declared text sizes. */" +
"			.ExternalClass td[class='ecxflexibleContainerBox'] h3 {padding-top: 10px !important;} /* Force hotmail to push 2-grid sub headers down */" +
"" +
"			" +
"			h1{display:block;font-size:26px;font-style:normal;font-weight:normal;line-height:100%;}" +
"			h2{display:block;font-size:20px;font-style:normal;font-weight:normal;line-height:120%;}" +
"			h3{display:block;font-size:17px;font-style:normal;font-weight:normal;line-height:110%;}" +
"			h4{display:block;font-size:18px;font-style:italic;font-weight:normal;line-height:100%;}" +
"			.flexibleImage{height:auto;}" +
"			.linkRemoveBorder{border-bottom:0 !important;}" +
"			table[class=flexibleContainerCellDivider] {padding-bottom:0 !important;padding-top:0 !important;}" +
"" +
"			body, #bodyTable{background-color:#E1E1E1;}" +
"			#emailHeader{background-color:#E1E1E1;}" +
"			#emailBody{background-color:#FFFFFF;}" +
"			#emailFooter{background-color:#E1E1E1;}" +
"			.nestedContainer{background-color:#F8F8F8; border:1px solid #CCCCCC;}" +
"			.emailButton{background-color:#ffffff; border-collapse:separate;}" +
"			.buttonContent{color:#FFFFFF; font-family:Helvetica; font-size:18px; font-weight:bold; line-height:100%; padding:15px; text-align:center;}" +
"			.buttonContent a{color:#FFFFFF; display:block; text-decoration:none!important; border:0!important;}" +
"			.emailCalendar{background-color:#FFFFFF; border:1px solid #CCCCCC;}" +
"			.emailCalendarMonth{background-color:#205478; color:#FFFFFF; font-family:Helvetica, Arial, sans-serif; font-size:16px; font-weight:bold; padding-top:10px; padding-bottom:10px; text-align:center;}" +
"			.emailCalendarDay{color:#ffffff; font-family:Helvetica, Arial, sans-serif; font-size:60px; font-weight:bold; line-height:100%; padding-top:20px; padding-bottom:20px; text-align:center;}" +
"			.imageContentText {margin-top: 10px;line-height:0;}" +
"			.imageContentText a {line-height:0;}" +
"			#invisibleIntroduction {display:none !important;} /* Removing the introduction text from the view */" +
"" +
"			/*FRAMEWORK HACKS & OVERRIDES */" +
"			span[class=ios-color-hack] a {color:#275100!important;text-decoration:none!important;} /* Remove all link colors in IOS (below are duplicates based on the color preference) */" +
"			span[class=ios-color-hack2] a {color:#ffffff!important;text-decoration:none!important;}" +
"			span[class=ios-color-hack3] a {color:#8B8B8B!important;text-decoration:none!important;}" +
"			" +
"			.a[href^='tel'], a[href^='sms'] {text-decoration:none!important;color:#606060!important;pointer-events:none!important;cursor:default!important;}" +
"			.mobile_link a[href^='tel'], .mobile_link a[href^='sms'] {text-decoration:none!important;color:#606060!important;pointer-events:auto!important;cursor:default!important;}" +
"" +
"" +
"			/* MOBILE STYLES */" +
"			@media only screen and (max-width: 480px){" +
"				/*////// CLIENT-SPECIFIC STYLES //////*/" +
"				body{width:100% !important; min-width:100% !important;} /* Force iOS Mail to render the email at full width. */" +
"" +
"				" +
"				table[id='emailHeader']," +
"				table[id='emailBody']," +
"				table[id='emailFooter']," +
"				table[class='flexibleContainer']," +
"				td[class='flexibleContainerCell'] {width:100% !important;}'" +
"				td[class='flexibleContainerBox'], td[class='flexibleContainerBox'] table {display: block;width: 100%;text-align: left;}" +
"				" +
"				td[class='imageContent'] img {height:auto !important; width:100% !important; max-width:100% !important; }'" +
"				img[class='flexibleImage']{height:auto !important; width:100% !important;max-width:100% !important;}'" +
"				img[class='flexibleImageSmall']{height:auto !important; width:auto !important;}'" +
"" +
"" +
"				" +
"				table[class='flexibleContainerBoxNext']{padding-top: 10px !important;}" +
"" +
"				" +
"				table[class='emailButton']{width:100% !important;}" +
"				td[class='buttonContent']{padding:0 !important;}" +
"				td[class='buttonContent'] a{padding:15px !important;}" +
"" +
"			}" +
"" +
"			" +
"" +
"			@media only screen and (-webkit-device-pixel-ratio:.75){" +
"				/* Put CSS for low density (ldpi) Android layouts in here */" +
"			}" +
"" +
"			@media only screen and (-webkit-device-pixel-ratio:1){" +
"				/* Put CSS for medium density (mdpi) Android layouts in here */" +
"			}" +
"" +
"			@media only screen and (-webkit-device-pixel-ratio:1.5){" +
"				/* Put CSS for high density (hdpi) Android layouts in here */" +
"			}" +
"			" +
"			@media only screen and (min-device-width : 320px) and (max-device-width:568px) {" +
"" +
"			}" +
"			" +
"		</style>" +
"		" +
"	</head>" +
"	<body bgcolor='#E1E1E1' leftmargin='0' marginwidth='0' topmargin='0' marginheight='0' offset='0'>" +
"" +
"		" +
"		<center style='background-color:#E1E1E1;'>" +
"			<table border='0' cellpadding='0' cellspacing='0' height='100%' width='100%' id='bodyTable' style='table-layout: fixed;max-width:100% !important;width: 100% !important;min-width: 100% !important;'>" +
"				<tr>" +
"					<td align='center' valign='top' id='bodyCell'>" +
"" +
"						" +
"						<table bgcolor='#E1E1E1' border='0' cellpadding='0' cellspacing='0' width='500' id='emailHeader'>" +
"" +
"							<!-- HEADER ROW // -->" +
"							<tr>" +
"								<td align='center' valign='top'>" +
"									<!-- CENTERING TABLE // -->" +
"									<table border='0' cellpadding='0' cellspacing='0' width='100%'>" +
"										<tr>" +
"											<td align='center' valign='top'>" +
"												<!-- FLEXIBLE CONTAINER // -->" +
"												<table border='0' cellpadding='10' cellspacing='0' width='500' class='flexibleContainer'>" +
"													<tr>" +
"														<td valign='top' width='500' class='flexibleContainerCell'>" +
"" +
"															<!-- CONTENT TABLE // -->" +
"															<table align='left' border='0' cellpadding='0' cellspacing='0' width='100%'>" +
"																<tr>" +
"																	" +
"																	<td align='left' valign='middle' id='invisibleIntroduction' class='flexibleContainerBox' style='display:none !important; mso-hide:all;'>" +
"																		<table border='0' cellpadding='0' cellspacing='0' width='100%' style='max-width:100%;'>" +
"																			<tr>" +
"																				<td align='left' class='textContent'>" +
"																					<div style='font-family:Helvetica,Arial,sans-serif;font-size:13px;color:#828282;text-align:center;line-height:120%;'>" +
"																						The introduction of your message preview goes here. Try to make it short." +
"																					</div>" +
"																				</td>" +
"																			</tr>" +
"																		</table>" +
"																	</td>" +
"																	<td align='right' valign='middle' class='flexibleContainerBox'>'" +
"																		<table border='0' cellpadding='0' cellspacing='0' width='100%' style='max-width:100%;'>" +
"																			<tr>" +
"																				<td align='left' class='textContent'>" +
"																					<!-- CONTENT // -->" +
"																					<div style='font-family:Helvetica,Arial,sans-serif;font-size:13px;color:#828282;text-align:center;line-height:120%;'>" +
"																						If you can't see this message, <a href='#' target='_blank' style='text-decoration:none;border-bottom:1px solid #828282;color:#828282;'><span style='color:#828282;'>view&nbsp;it&nbsp;in&nbsp;your&nbsp;browser</span></a>." +
"																					</div>" +
"																				</td>" +
"																			</tr>" +
"																		</table>" +
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
"							<!-- // END -->" +
"" +
"						</table>" +
"						" +
"						<table bgcolor='#FFFFFF'  border='0' cellpadding='0' cellspacing='0' width='500' id='emailBody'>" +
"" +
"							" +
"							<tr>" +
"								<td align='center' valign='top'>" +
"									" +
"									<table border='0' cellpadding='0' cellspacing='0' width='100%' style='color:#FFFFFF;' bgcolor='#f95959'>" +
"										<tr>" +
"											<td align='center' valign='top'>" +
"												" +
"												<table border='0' cellpadding='0' cellspacing='0' width='500' class='flexibleContainer'>" +
"													<tr>" +
"														<td align='center' valign='top' width='500' class='flexibleContainerCell'>" +
"" +
"															" +
"															<table border='0' cellpadding='30' cellspacing='0' width='100%'>" +
"																<tr>" +
"																	<td align='center' valign='top' class='textContent'>" +
"																		<h1 style='color:#FFFFFF;line-height:100%;font-family:Helvetica,Arial,sans-serif;font-size:35px;font-weight:normal;margin-bottom:5px;text-align:center;'>Gracias por comprar en ShopGeek <span class='fa fa-shopping-cart'> </span></h1>" +
                              "                                                                    <h2 style='text-align:center;font-weight:normal;font-family:Helvetica,Arial,sans-serif;font-size:23px;margin-bottom:10px;color:#ffffff;line-height:135%;'>Codigo Factura: "+noFactura+" </h2>"+
"																		<div style='text-align:center;font-family:Helvetica,Arial,sans-serif;font-size:15px;margin-bottom:0;color:#FFFFFF;line-height:135%;'>Porfavor guarde la factura y presentela al momento de entregarle su pedido. </div>" +
"																	</td>" +
"																</tr>" +
"															</table>" +
"															<!-- // CNTENT TABLE -->" +
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
"							" +
"							<tr mc:hideable>" +
"								<td align='center' valign='top'>" +
"									<!-- CENTERING TABLE // -->" +
"									<table border='0' cellpadding='0' cellspacing='0' width='100%'>" +
"										<tr>" +
"											<td align='center' valign='top'>" +
"												<!-- FLEXIBLE CONTAINER // -->" +
"												<table border='0' cellpadding='30' cellspacing='0' width='500' class='flexibleContainer'>" +
"													<tr>" +
"														<td valign='top' width='500' class='flexibleContainerCell'>" +
"" +
                                                                      " <div class=\"row justify-content-around\">\n" +
        "                                                            <div class=\"col-4 \">\n" +
        "\n" +                                                       
        "                                                        <label class=\"label\">Nombre: <span>"+venta.getUser().getNombre()+"</span></label><br><br>\n" +
        "                                                        <label class=\"label\">Telefono: <span>"+venta.getNumero_t()+"</span></label><br><br>\n" +
        "                                                        <label class=\"label\">Pais: <span>"+venta.getPais()+"</span></label><br><br>\n" +
        "                                                            </div>\n" +
        "                                                            <div class=\"col-4\">\n" +
        "\n" +
        "                                                        <label class=\"label\">Tipo de Envio: <span>"+venta.getTipo_envio()+"</span></label><br><br>\n" +
        "                                                        <label class=\"label\">Codigo Postal: <span>"+venta.getCodigo_postal()+"</span></label><br><br>\n" +
        "                                                        <label class=\"label\">Dirreccion: <span>"+venta.getDireccion()+"</span></label><br><br>\n" +
        "                                                        <label class=\"label\"><strong>Total:</strong><span>"+venta.getTotal_pagado()+"</span></label><br><br>\n" +
        "                                                            </div>\n" +
        "                                                        </div>"+
                    
                    
"														" +
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
"									<table border='0' cellpadding='0' cellspacing='0' width='100%'>" +
"										<tr style='padding-top:0;'>" +
"											<td align='center' valign='top'>" +
"												<!-- FLEXIBLE CONTAINER // -->" +
"												<table border='0' cellpadding='30' cellspacing='0' width='500' class='flexibleContainer'>" +
"													<tr>" +
"														<td style='padding-top:0;' align='center' valign='top' width='500' class='flexibleContainerCell'>" +
"" +
"															<!-- CONTENT TABLE // -->" +
"															<table border='0' cellpadding='0' cellspacing='0' width='50%' class='emailButton' style='background-color: #f95959;'>" +
"																<tr>" +
"																	<td align='center' valign='middle' class='buttonContent' style='padding-top:15px;padding-bottom:15px;padding-right:15px;padding-left:15px;'>" +
																		"<a style=\"color:#FFFFFF;text-decoration:none;font-family:Helvetica,Arial,sans-serif;font-size:20px;line-height:135%;\" href=\"#\"\n" +
"                                                                        target=\"_blank\">Felicidades</a>\n" +
"                                                                </td>\n" +
"                                                            </tr>\n" +
"                                                        </table>\n" +
"                                                        <!-- // CONTENT TABLE -->\n" +
"\n" +
"                                                    </td>\n" +
"                                                </tr>\n" +
"                                            </table>\n" +
"                                            <!-- // FLEXIBLE CONTAINER -->\n" +
"                                        </td>\n" +
"                                    </tr>\n" +
"                                </table>\n" +
"                                <!-- // CENTERING TABLE -->\n" +
"                            </td>\n" +
"                        </tr>\n" +
"                   \n" +
"\n" +
"                                            </table>\n" +
"                                            <!-- // FLEXIBLE CONTAINER -->\n" +
"                                        </td>\n" +
"                                    </tr>\n" +
"                                </table>\n" +
"                                <!-- // CENTERING TABLE -->\n" +
"                            </td>\n" +
"                        </tr>\n" +
"\n" +
"                    </table>\n" +
"                    <!-- // END -->\n" +
"\n" +
"                </td>\n" +
"            </tr>\n" +
"        </table>\n" +
"    </center>\n" +
"</body>\n" +
"\n" +"</html>","ISO-8859-1","html");

 
            // Lo enviamos.
            Transport t = session.getTransport("smtp");
            t.connect("orbisalonzo25@gmail.com", "alonzo25");
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
 
            // Cierre.
            t.close();
            System.out.println("enviado correcto");
            result = true;
        }
        catch (Exception e)
        {
           System.out.println("enviado incorrecto"+e);
            e.printStackTrace();
            result = false;
        }   
        
        return result;
}       

    @Override
    public boolean queryFK() {
        boolean t = false;
        try {
            
            Connection con = this.getConnection();
            String sql ="SET FOREIGN_KEY_CHECKS=0";
            Statement st = con.createStatement();
            st.executeQuery(sql);
            t = true;
        } catch (Exception e) {
            System.out.println("ocurio un error con las fk "+e);
            t= false;
        }finally{
        this.cerrar();}
        
        
        return t;
    }

    @Override
    public boolean queryFK2() {
        boolean t = false;
        try {
            
            Connection con = this.getConnection();
            String sql ="SET FOREIGN_KEY_CHECKS=1";
            Statement st = con.createStatement();
            st.executeQuery(sql);
            t = true;
        } catch (Exception e) {
            System.out.println("ocurio un error con las fk "+e);
            t= false;
        }finally{
        this.cerrar();}
        
        
        return t;

    }

   
}

