/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class BdAdministrador {
    
     
	 String drv="com.mysql.jdbc.Driver";
       String url="jdbc:mysql://localhost:3306/elcorteingles";
      public ArrayList<String> artis; //cambiar String por la clase que vayas a necesitar
       
	Connection cn = null; //conexiones
	Statement st; //consultas
	public ResultSet rs;
	public PreparedStatement psInsertar;
	public BdAdministrador(){
		super();
		
		
	}

	public void abrirConexion() {
		// TODO Auto-generated method stub
		
		
		try{
			
			Class.forName(drv);
			cn=(Connection) DriverManager.getConnection(url, "root", "trebujena");
			st=cn.createStatement();
		}
		catch(Exception e){
			
			System.out.println("No se pudo conectar con la base de datos");
			
		}
		
	}
	
	
	public void cerrarConexion() throws SQLException {
		
		//if(rs!=null) rs.close();
		
		if(cn!=null) cn.close();
		System.out.println("Conexión cerrada");
		
	}
        
        /*
       Borra los registros seleccionados con los checkbox, recibe un arraylist de la tabla entera hecha en crearTabla(), 
        el array valueof pasado a int y el array valueof string original
        
        */
     
        
        //hace un select de toda la tabla, saca sus valores y los mete en un arraylist, usalo para crear tablas
         public ArrayList<String> crearTabla() throws SQLException{
            
            String consulta = "SELECT * from provincias";
            
            ArrayList<String> artis = new ArrayList();
            
            rs=st.executeQuery(consulta);
            
       
                        
            while(rs.next()){
                
               String usuario= rs.getString("nombre");
 
               artis.add(usuario);
               
            }
            
            return(artis);
            
        }
         
         
         
          //inserta un registro 
        public void insertarRegistro(String usuario, String clave, String tipo, String nombre, String direccion, String email) throws SQLException{
            
            String insertar="INSERT INTO cliente (Nombre, Apellidos, mail, password, dni, iban) VALUES ('"+usuario+"', '"+clave+"', '"+tipo+"', '"+nombre+"', '"+direccion+"', '"+email+"')";
            
            int rs=st.executeUpdate(insertar);
        }
         
         
        
}
