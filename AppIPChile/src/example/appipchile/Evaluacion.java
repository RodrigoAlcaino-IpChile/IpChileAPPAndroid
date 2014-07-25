package example.appipchile;

import Entidades.Asignatura;
import Negocio.BsAsignatura;
import Negocio.BsEvaluacion;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Evaluacion extends Activity {
	
	private Spinner listadoAsignaturas;
	private TextView notas;

    BsAsignatura bsAsignatura = new BsAsignatura();
	Asignatura asignatura = new Asignatura();
	BsEvaluacion bsEvaluacion = new BsEvaluacion();
	Entidades.Evaluacion evaluacion = new Entidades.Evaluacion();
	
    public int position;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evaluacion);
        
        listadoAsignaturas = (Spinner) findViewById(R.id.spListadoAsignatura);
        //listadoNotas = (GridView) findViewById(R.id.GvNotas);
        notas = (TextView) findViewById(R.id.tvNota);
		
		String []opciones = bsAsignatura.VerAsignatura(asignatura);
		
		  ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
	        listadoAsignaturas.setAdapter(adapter);     
	        

	        listadoAsignaturas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

				@Override
	            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {  
	            	
	            	TraerNotas(view);
	            	//listadoNotas.seta(bsEvaluacion.LlamarNotas(evaluacion));
	            }

	            @Override
	            public void onNothingSelected(AdapterView<?> parent) {
	            }
	        });  
	        
	        
	}
	


	public void TraerNotas(View view){
		
		evaluacion.setId_asignatura(listadoAsignaturas.getSelectedItemPosition() + 1);
		
		String listadoNotas = bsEvaluacion.LlamarNotas(evaluacion);
		
		notas.setText(listadoNotas);
		
//		String[] items =  listadoNotas.split(";");
//		
//		for (String item : items){
//			
//			System.out.println("item = " + item);
//			
//		}
		
		
		
		
	}

public void Back (View view){
		
		finish();
		
	}
	

}
