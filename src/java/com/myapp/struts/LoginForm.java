/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import clases.BdAdministrador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author asus
 */
public class LoginForm extends org.apache.struts.action.ActionForm {
    
      
    private String email;
    private String email2;
    private String contra;
    private String contra2;
    private String nombre;
    private String apellidos;
    private String dni;
    private String iban;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getContra2() {
        return contra2;
    }

    public void setContra2(String contra2) {
        this.contra2 = contra2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    
    
    
    
    
    /**
     *
     */
    public LoginForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errores = new ActionErrors();
        
        
        if ( nombre == null ||nombre.length() == 0) { errores.add("nombre", new ActionMessage("error.login.nombre2")); }
        else{
            
            
            String[]ropa={"0","1","2","3","4","5","6","7","8","9"};
        
        boolean bulean = false;
        
        for(int i = 0;i<ropa.length;i++){
             for(int j = 0;j<nombre.length();j++){
            if(nombre.substring(j,j+1).equals(ropa[i])){
               errores.add("nombre", new ActionMessage("error.login.nombre"));
            }
        }
        }
            
            
        }
        if ( apellidos == null ||apellidos.length() == 0) { errores.add("apellidos", new ActionMessage("error.vacio.apellidos")); }
        else{
       
            String[]ropa={"0","1","2","3","4","5","6","7","8","9"};
        
        boolean bulean = false;
        
        for(int i = 0;i<ropa.length;i++){
             for(int j = 0;j<apellidos.length();j++){
            if(apellidos.substring(j,j+1).equals(ropa[i])){
               errores.add("apellidos", new ActionMessage("error.login.apellidos"));
            }
        }
        }
            
            
        }
        if ( dni == null ||dni.length() == 0) { errores.add("dni", new ActionMessage("error.vacio.nif")); }
        else{
            
      Pattern pdni = Pattern.compile("[0-9]{8}[A-Z]{1}");
      Matcher m7 = pdni.matcher(dni);
      if (!m7.find() ){         
     errores.add("dni", new ActionMessage("error.login.nif"));

         }
      else{
           int dni2, restodni;
				String letra, nif;
				
                               String textdni = dni;
                               
                               textdni = textdni.toUpperCase();
				
				dni2=Integer.parseInt(textdni.substring(0,8));
				
				
				 String[]letrasDNI={"T","R","W","A","G",",M","Y","F","P","D","X","B","N","J","Z","S"
			                ,"Q","V","H","L","C","K","E"};
				 
				 restodni= dni2%23;
				 
				 letra = letrasDNI[restodni];
                                 
                                 letra = letra.toUpperCase();
				 
				 nif=Integer.toString(dni2)+letra;
				 
				 if(nif.equals(textdni)){
					 
					
				 }
				 else{
					errores.add("dni", new ActionMessage("error.login.nif"));
				 }
                                 
      }
        }
        if ( iban == null ||iban.length() == 0) { errores.add("iban", new ActionMessage("error.vacio.iban")); }
        else{
             Pattern piban = Pattern.compile("[E]{1}[S]{1}[0-9]{22}");
      Matcher m9 = piban.matcher(iban);
      if (!m9.find()){
          errores.add("iban", new ActionMessage("error.login.iban"));
      }
        }
        
        if ( contra == null ||contra.length() == 0) { errores.add("contra", new ActionMessage("error.vacio.clave")); }
             if ( contra2 == null ||contra2.length() == 0) { errores.add("contra2", new ActionMessage("error.vacio.clave2")); }
             else{
                 Pattern pcontra2 = Pattern.compile("[a-zA-Z0-9]{8,35}");
      Matcher m4 = pcontra2.matcher(contra2);
      if (!m4.find() || !contra.equals(contra2)){
          errores.add("contra2", new ActionMessage("error.login.clave2"));
      }
             }
         if ( email == null ||email.length() == 0) { errores.add("email", new ActionMessage("error.vacio.email")); }
         else{
             Pattern pemail = Pattern.compile("[a-zA-Z0-9]{1,25}[@]{1}[a-zA-Z]{1,10}[.]{1}[a-zA-Z]{1,3}");
      Matcher m = pemail.matcher(email);
      if (!m.find()){
          errores.add("email", new ActionMessage("error.login.email"));
      }
         }
        if ( email2 == null ||email2.length() == 0) { errores.add("email2", new ActionMessage("error.vacio.email2")); }
        else{
             Pattern pemail2 = Pattern.compile("[a-zA-Z0-9]{1,25}[@]{1}[a-zA-Z]{1,10}[.]{1}[a-zA-Z]{1,3}");
      Matcher m2 = pemail2.matcher(email2);
      if (!m2.find() || !email2.equals(email)){
          errores.add("email2", new ActionMessage("error.login.email2"));
      }
        }
        
         
        
        
      
      
    
  /*    
      admin.abrirConexion();
      
        try {
            admin.insertarRegistro(nombre, apellidos, email, contra, dni, iban);
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
 
        return errores;
    }
}
