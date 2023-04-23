/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wbpat
 */
public class ConexionDB {
    private Connection con = null;
	
	private static ConexionDB cx = null;

	// Patrón Singleton
	public static ConexionDB getInstance() {
		if(cx == null)
			cx = new ConexionDB();
		return cx;
	}

	private ConexionDB() {
            
	try{

            String url = "jdbc:postgresql://127.0.0.1:5432/ejemplo";
            String user = "postgres";
            String pass = "123456";
            
            con = DriverManager.getConnection(url, user, pass);
            
            Logger.getLogger(ConexionDB.class.getName()).log(Level.INFO, "Se conectó a la BD");
            
        }
       
        	catch(SQLException ex){
            		Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        	}
	}

	public boolean execute(String sql) {
		return true;
	}
	// Inyección de dependencias
	public boolean execute(TransaccionDB tdb) {
		return tdb.execute(con);
	}


}
