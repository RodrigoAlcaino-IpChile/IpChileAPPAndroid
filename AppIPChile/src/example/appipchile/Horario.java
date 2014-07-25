package example.appipchile;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Horario extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.horarios);
	}
	
	
	
public void Back (View view){
		
		finish();
		
	}
	

}
