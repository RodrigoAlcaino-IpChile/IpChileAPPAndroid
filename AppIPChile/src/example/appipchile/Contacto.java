package example.appipchile;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Contacto extends Activity {

	private EditText etMensaje;
	private EditText etAsunto;
	private Button enviar;
	private String asunto;
	private String mensaje;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contacto);
		
		etAsunto = (EditText) findViewById(R.id.etAsunto);
		etMensaje = (EditText) findViewById(R.id.etMensaje);
		enviar = (Button) findViewById(R.id.btnEnviar);
		
		enviar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				asunto = etAsunto.getText().toString();
				mensaje = etMensaje.getText().toString();

				Intent i = new Intent(Intent.ACTION_SEND);
				i.setData(Uri.parse("mailto:"));
				i.setType("message/rfc822");
				i.putExtra(
						Intent.EXTRA_EMAIL,
						new String[] { "rodrigo@tostring.cl" });
				i.putExtra(Intent.EXTRA_SUBJECT, asunto
						+ " Enviado App IpChile");
				i.putExtra(Intent.EXTRA_TEXT, mensaje);
				i.setType("message/rfc822");
				startActivity(Intent.createChooser(i,
						"Seleccione Cliente Email "));
			}
		});
	
}
public void Back (View view){
		
		finish();
		
	}
}
