package example.appipchile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sede extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sede);
		
		
		
	}
	
	public void IrVideo(View view){
		
		Intent e = new Intent(this, video.class);
		startActivity(e);	
		
	}
	
public void Back (View view){
		
		finish();
		
	}
	
	
}
