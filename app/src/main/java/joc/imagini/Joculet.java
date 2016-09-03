package joc.imagini;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import java.util.* ;


public class Joculet extends Activity {
	MediaPlayer mp;
	int i, j ,nrCartiIntoarse,i1x,i2x,j1y,j2y;
	byte [][]a=new byte [5][5];
    int r,s;
    int p[]= new int[12];
	ImageView[][] images = new ImageView[5][5];

	final static int MAX_IMAGE = 11;
		
    /** Called when the activity is first created. */
    @Override

	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		requestWindowFeature(Window.FEATURE_ACTION_BAR);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.main);
        //text=(TextView) findViewById(R.id.icon); 
        nrCartiIntoarse=0;
        for(int f=1;f<=11;f++)
        	p[f]=0;
        i1x=-1;
        j1y=-1;
        Random generator=new Random();
        for(i=0;i<4;i++)
        	for(j=0;j<=4;j++){
				s=0;
        		//r=generator.nextInt(MAX_IMAGE);
        	    do {
					r=generator.nextInt(MAX_IMAGE);
					Log.d("r=",String.valueOf(r));
				}
				while(r==0 ||  p[r]>=2);
        	    //while(r==0 ||){r=generator.nextInt(MAX_IMAGE);s++;}

				a[i][j]=(byte)(r*-1);
				p[r]++;


        	}
		for(i=0;i<4;i++)
			for(j=0;j<=4;j++)
			{
				Log.i("a[i][j]",String.valueOf(a[i][j]));
			}
        images[0][0] = (ImageView)findViewById(R.id.i00);
        images[0][1] = (ImageView)findViewById(R.id.i01);
        images[0][2] = (ImageView)findViewById(R.id.i02);
        images[0][3] = (ImageView)findViewById(R.id.i03);
        images[0][4] = (ImageView)findViewById(R.id.i04);
        images[1][0] = (ImageView)findViewById(R.id.i10);
        images[1][1] = (ImageView)findViewById(R.id.i11);
        images[1][2] = (ImageView)findViewById(R.id.i12);
        images[1][3] = (ImageView)findViewById(R.id.i13);
        images[1][4] = (ImageView)findViewById(R.id.i14);
        images[2][0] = (ImageView)findViewById(R.id.i20);
        images[2][1] = (ImageView)findViewById(R.id.i21);
        images[2][2] = (ImageView)findViewById(R.id.i22);
        images[2][3] = (ImageView)findViewById(R.id.i23);
        images[2][4] = (ImageView)findViewById(R.id.i24);
        images[3][0] = (ImageView)findViewById(R.id.i30);
        images[3][1] = (ImageView)findViewById(R.id.i31);
        images[3][2] = (ImageView)findViewById(R.id.i32);
        images[3][3] = (ImageView)findViewById(R.id.i33);
        images[3][4] = (ImageView)findViewById(R.id.i34);
        
    }
  /**  public void interpretare(int r,int i,int j)
    {
    	switch (r)
		{
			case 3:
				{a[i][j]=-ImageData.FOTO;
				break;}
			case 4:
				{a[i][j]=-ImageData.PATE;
				break;
				}
			case 5:
	             {a[i][j]=-ImageData.PALARIE;
				  break;
				  }
		}  }*/

    public void i00 (View image) {
    	verifica(0,0);
		play(R.raw.paper);
    }
    public void i01 (View image) {
    	verifica(0,1);
    	play(R.raw.paper);
    }
    public void i02 (View image) {
	    verifica(0,2);
	    play(R.raw.paper);
    }
    public void i03(View image) {
		verifica(0,3);
		play(R.raw.paper);
    }
    public void i04(View image){
		verifica(0,4);
    	play(R.raw.paper);
    }
    public void i10 (View image) {
	    verifica(1,0);
	    play(R.raw.paper);	
   	}	
    public void i11 (View image) {
	    verifica(1,1);
	    play(R.raw.paper);
		
    }
    public void i12 (View image)  
    {   
	    verifica(1,2);
	    play(R.raw.paper);
    }
	public void i13 (View image) {
		verifica(1,3);
		play(R.raw.paper);
	}
	public void i14 (View image) {
		verifica(1,4);
		play(R.raw.paper);
	}
	public void i20 (View image) {
		verifica(2,0);
		play(R.raw.paper);
	}
	public void i21 (View image) {
		verifica(2,1);
		play(R.raw.paper);
	}
	public void i22 (View image){
	    verifica(2,2);
	    play(R.raw.paper);
	}
	public void i23 (View image) {
		verifica(2,3);
		play(R.raw.paper);
	}
	public void i24 (View image) {
		verifica(2,4);
		play(R.raw.paper);
	}
	public void i30 (View image) {
		verifica(3,0);
		play(R.raw.paper);
	}
	public void i31 (View image) {
		verifica(3,1);
		play(R.raw.paper);
	}
	public void i32 (View image) {
		verifica(3,2);
		play(R.raw.paper);
	}
	public void i33 (View image) {
		verifica(3,3);
		play(R.raw.paper);
	}
	public void i34 (View image) {
		verifica(3,4);
		play(R.raw.paper);
	}
	public void verifica(int c, int b){
		int copie_c,copie_b;
		byte copie_a_c_b;
		copie_c=c;
		copie_b=b;
	         
	          
		if(a[c][b]<0){
			a[c][b]=(byte)(a[c][b]*-1);
	    	copie_a_c_b=a[c][b];
	    	if (a[c][b]>0) {
				nrCartiIntoarse++;
				i2x=i1x;
				j2y=j1y;
				i1x=c;
				j1y=b;
			}
	    	else if(a[c][b]<0){
				nrCartiIntoarse--;
				i1x = i2x;
				j1y = j2y;
			}
	    
	    	if(nrCartiIntoarse<=2){
				if(nrCartiIntoarse==2) {if(a[i1x][j1y]==a[i2x][j2y]) {
					a[i1x][j1y]=0;
					a[i2x][j2y]=0;
					nrCartiIntoarse=0;
				}
					afis(i1x,j1y);
					afis(i2x,j2y);
	    	                       						
				}
				else afis(c,b);
			}
	    	else {
	    		for(i=0;i<4;i++)
					for(j=0;j<5;j++)
						if(a[i][j]>0){
							a[i][j]=(byte)(a[i][j]*-1);
							afis(i,j);
						}
				a[copie_c][copie_b]=copie_a_c_b;
				nrCartiIntoarse=1;
				afis(copie_c,copie_b);
				i1x=copie_c;
				j1y=copie_b;
			}
		}
	}
	    	
	public void afis(int c,int b){
		if(a[c][b]>0)
			images[c][b].setImageResource(ImageData.getImageForId(a[c][b]));
		else{
			if(a[c][b]<0)
				images[c][b].setImageResource(ImageData.getImageForId(ImageData.SPATE));
			else
				images[c][b].setImageResource(ImageData.getImageForId(ImageData.BLANK));
		}
	    for(int x=0;x<4;x++){
			for(int y=0;y<5;y++)
				System.out.print(a[x][y]+" ");
			System.out.println();
		}
		System.out.println();
	    verifica_fin();
	}
	    
	private void verifica_fin(){
		int s=0;
		for(int x=0;x<4;x++){
			for(int y=0;y<5;y++)
				if(a[x][y]!=0)
					s=1;
		}
		if(s==0){
			startActivity(new Intent(this, Winner.class));
			}
	}

	    
	    private void play(int sound)
		 {
			 mp = MediaPlayer.create(this,sound);
			 mp.start();

		 }

}
    
    
    	
    