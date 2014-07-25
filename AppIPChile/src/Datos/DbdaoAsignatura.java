package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import android.widget.ArrayAdapter;

import Entidades.Asignatura;
import Interface.IdaoAsignatura;

public class DbdaoAsignatura implements IdaoAsignatura{


	
		private String[] result;
	@Override
	
	public String[] VerAsignatura(Asignatura asignatura) {
		// TODO Auto-generated method stub
		
		
		Connection conn = null;
		PreparedStatement pst = null;

		String sql = "select id_asignatura, nombre_asignatura from asignatura";
	
		try {	
		conn = Conexion.conectorBd();
		Statement stmt = conn.createStatement();
		ResultSet res = stmt.executeQuery(sql);

        ArrayList<String> list= new ArrayList<String>();
        while (res.next()) {
        	
            list.add(res.getString("id_asignatura") + " " + res.getString("nombre_asignatura"));

            result = new String[list.size()];
            result = list.toArray(result);

//            for(int i =0; i<result.length; i++){
//                System.out.println(result[i]);
//            }   
        }
    	
		return result;  
	 

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return null;
		}
		
		
		
	}
	


}
