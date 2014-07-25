package example.appipchile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu extends Activity {
	
	private ImageView logo;
//	private ImageView nota;
//	private ImageView contacto;
//	private ImageView sede;
//	private ImageView horario;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        
        logo = (ImageView) findViewById(R.id.ivLogo1);
//        nota = (ImageView) findViewById(R.id.ivNota);
//        contacto = (ImageView) findViewById(R.id.ivContacto);
//        sede = (ImageView) findViewById(R.id.ivSede);
//        horario = (ImageView) findViewById(R.id.ivHorario);
        
//        if (android.os.Build.VERSION.SDK_INT > 9) {
//        	StrictMode.ThreadPolicy policy =
//        	new StrictMode.ThreadPolicy.Builder().permitAll().build();
//        	StrictMode.setThreadPolicy(policy);
//        }     
    
       
	
	
	}
	
	public void sede(View view) {
		Intent e = new Intent(this, Sede.class);
		startActivity(e);
	}
	
	public void Evaluacion(View view) {
		Intent e = new Intent(this, Evaluacion.class);
		startActivity(e);
	}
	
	public void Horario(View view) {
		Intent e = new Intent(this, Horario.class);
		startActivity(e);
	}

	public void Registro(View view) {
		Intent e = new Intent(this, Contacto.class);
		startActivity(e);
	}

}
