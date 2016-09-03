package joc.imagini;

public class ImageData
{

	public static final int PATE= 1;
	public static final int FOTO= 2;
	public static final int PALARIE = 3;
    public static final int BAKING= 4;
    public static final int BERE=5;
    public static final int CATEL=6;
    public static final int CIOCOLATA =7;
    public static final int FACE=8;
    public static final int MASINA=9;
	public static final int CRUCE=10;
	public static final int WWI=11;
	public static final int SPATE = 12;
	public static final int BLANK = 13;
	
	public static int getImageForId(int id)
	{
		switch (id)
		{
			case PATE:
	             return R.drawable.pate;	
			case FOTO:
				return R.drawable.foto;
			case PALARIE:
				return R.drawable.palarie;
			case BAKING:
			     return R.drawable.baking;
			case BERE:
			     return R.drawable.bere;
			case CATEL:
			     return R.drawable.catel;
			case CIOCOLATA:
			     return R.drawable.ciocolata;
			case FACE:
			     return R.drawable.face;
			case MASINA:
			     return R.drawable.masina;
			case CRUCE:
			     return R.drawable.crucearosie;
			case WWI:
			     return R.drawable.world;
			case SPATE:
			    return R.drawable.spate;
		    case BLANK:
				return R.drawable.iemy;

				
		}
		
		return 0;
	}
}
