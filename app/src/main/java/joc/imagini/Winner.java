package joc.imagini;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


public class Winner extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		//Sets the layout of welcome_screen.xml
		setContentView(R.layout.winner);
		final MediaPlayer mp;
		mp = MediaPlayer.create(this,R.raw.aplauze);
		mp.start();


		Thread timer = new Thread() {
			public void run() {
				try {
					//Display for 3 seconds
					sleep(3000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				} finally {
					Intent i = new Intent(Winner.this, joc.imagini.Joculet.class);
					mp.stop();
					startActivity(i);

				}
			}
		};
		timer.start();
	}


	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();

	}
}
