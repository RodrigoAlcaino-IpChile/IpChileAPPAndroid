package example.appipchile;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class video extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.video);

		VideoView video = (VideoView) findViewById(R.id.videoView1);

		MediaController mc = new MediaController(this);
		video.setMediaController(mc);

		Uri path = Uri.parse("android.resource://example.appipchile/"
				+ R.raw.video);

		video.setVideoURI(path);
		video.start();

	}

	public void Back(View view) {

		finish();

	}

}
