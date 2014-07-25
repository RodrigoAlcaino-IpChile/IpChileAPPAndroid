package Negocio;

import Datos.DbdaoAsignatura;
import Entidades.Asignatura;

public class BsAsignatura {
	
	public String[] VerAsignatura(Asignatura asignatura){
		
		return new DbdaoAsignatura().VerAsignatura(asignatura);
		
		
		
	}
	

}
