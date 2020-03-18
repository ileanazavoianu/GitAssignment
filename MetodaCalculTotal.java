package ro.ase.csie.cts.tema2;

import java.beans.ExceptionListener;

public abstract class MetodaCalculTotal implements ExceptionListener{
	
	public static float CalculeazaCostProduse(ProdusCosmetic produs) throws Exception 
	{
		float costTotal=0;
		if(produs.getCantitate() <=0)
		{
			throw new Exception("Produsul " + produs.getDenumire()+ "nu a fost achizitionat");
		}
			
		
		costTotal= costTotal+ (produs.getPret())  * (produs.getCantitate()) ;
	
		return costTotal; 
	}

}
