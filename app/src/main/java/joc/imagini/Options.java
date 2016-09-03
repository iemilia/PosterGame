package joc.imagini;

import android.app.Activity;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.os.Bundle;
import android.preference.PreferenceManager;


public class Options extends Activity{
	boolean verificasunet=true;
	MediaPlayer mp;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    	
    	
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.meniu);
        setContentView(R.layout.options);
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
        verificasunet=settings.getBoolean("verificasunet",true);
	}
	public void onStop()
	{
		super.onStop();
		SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
    	//verificasunet=settings.getBoolean("verificasunet",false);
    	SharedPreferences.Editor editor=settings.edit();
    	editor.putBoolean ("verificasunet",verificasunet);
		editor.commit();
	}
	public void soundon(View sender)
	{
	verificasunet=true;	
	}
	public void soundoff(View sender)
	{
	verificasunet=false;
	}
	public void back(View sender)
	{
		finish();
	}
}