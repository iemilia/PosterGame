package joc.imagini;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;



public class Meniu extends Activity {
	MediaPlayer mp;
    
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.meniu);
     
        play(R.raw.cantec);
        }
	

	public void start(View sender)
	{
	startActivity(new Intent(this, Joculet.class));
	play(R.raw.pling);
	}
	public void options(View sender)
	{
		startActivity(new Intent(this,Options.class));
		play(R.raw.pling);
	}
	/*public void exit(View sender)
	{
		finish();
	}*/
	private void play (int sound)
	 {
		 mp = MediaPlayer.create(this,sound);
		 mp.start();
		 
	 }
	@Override
	protected void onPause() {
		super.onPause();
		mp.pause();
	}
}
