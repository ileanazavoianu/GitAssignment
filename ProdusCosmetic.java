package ro.ase.csie.cts.tema2;
import java.util.*;
import ro.ase.csie.cts.tema2.CalculeazaCost;

import java.beans.ExceptionListener;

import java.beans.ExceptionListener;

import java.beans.ExceptionListener;
public class ProdusCosmetic {
	
	
	private String denumire;
	private float cantitate;
	private float pret;
	
	public ProdusCosmetic(String denumire, float cantitate, float pret) {
		super();
		this.denumire = denumire;
		this.cantitate = cantitate;
		this.pret = pret;
	}

	public String getDenumire() {
		return denumire;
	}

	public float getCantitate() {
		return cantitate;
	}

	public float getPret() {
		return pret;
	}

	public static  CalculeazaCost calculCost;

	
	public static void afisare(ProdusCosmetic p) throws Exception
	{
		
		try {
			System.out.println("Aici este totalul"+calculCost.CalculeazaCostProduse(p));
		} catch (Exception e) {
			
			System.out.println("Produsul " + p.getDenumire()+ " nu a fost achizitionat");
		}
	}
	

	
}
