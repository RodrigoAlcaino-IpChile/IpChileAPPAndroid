package example.appipchile;


import Entidades.Usuario;
import Negocio.BsUsuario;
import android.os.Bundle;
import android.os.StrictMode;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private EditText etUsuario, etPass;
	private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        logo = (ImageView) findViewById(R.id.ivLogo1);
        etUsuario = (EditText)findViewById(R.id.etUsuario);
        etPass = (EditText)findViewById(R.id.etPass);
        
        if (android.os.Build.VERSION.SDK_INT > 9) {
        	StrictMode.ThreadPolicy policy =
        	new StrictMode.ThreadPolicy.Builder().permitAll().build();
        	StrictMode.setThreadPolicy(policy);
        }
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
public void Conectar(View view){
    	
    	BsUsuario bsUsuario= new BsUsuario();
    	Usuario usuario = new Usuario();
    	   	
    	usuario.setUser(etUsuario.getText().toString());
    	usuario.setPass(etPass.getText().toString());
    	
    	
    	if(bsUsuario.ValidarUsuario(usuario)== true){
			Toast toast = Toast.makeText(this, "datos  ok", Toast.LENGTH_SHORT);
	        toast.show();
	        
	        Intent i = new Intent(this, example.appipchile.Menu.class);
	        startActivity(i);
	        
		}else{
			Toast toast = Toast.makeText(this, "datos erroneos", Toast.LENGTH_SHORT);
	        toast.show();
		}
	
    	
    }
  
}
