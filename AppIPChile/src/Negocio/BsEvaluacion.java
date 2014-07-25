package Negocio;

import Datos.DBdaoEvaluacion;
import Entidades.Evaluacion;


public class BsEvaluacion {
	
public String LlamarNotas(Evaluacion evaluacion){
		
		return new DBdaoEvaluacion().LlamarNotas(evaluacion);	
		
		
	}

}
