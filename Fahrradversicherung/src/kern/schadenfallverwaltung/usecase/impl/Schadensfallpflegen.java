package kern.schadenfallverwaltung.usecase.impl;

import java.time.LocalDate;


import kern.Schadenfallverwaltungs.entity.internal.Adresse;
import kern.schadenfallverwaltung.usecase.ISchadensfallpflegen;

public class Schadensfallpflegen implements ISchadensfallpflegen{
	
	
	
	//public boolean validateSchadensfall(String tarif, LocalDate zeitpunkt, String beschreibung, String schadensh�he,String schadensart, String versichertennummer) {
	//	boolean validate=true; 
//	double schadensgrenze = 1000.00; //Schadengrenze k�nnte man auch noch aus der DB holen
	
	//if (schadensh�he>schadensgrenze) {
		//validate = false;
		//pers�nliche ?
		
	//	return false;
//	}
	//Rest aufruf gegen KundenKompente und Versichternnummer validiern?
	
	
		
		//return validate;
	//}
	
	public boolean schadensfallPr�fenundAnlegen(String tarif, LocalDate zeitpunkt, String beschreibung, String schadensh�he,String schadensart, String versichertennummer, Adresse schadensort) {
		
		
		Schadensfallmanager sMngr= new Schadensfallmanager();
		sMngr.schadenfallAnlegen(tarif, zeitpunkt, beschreibung, schadensh�he, schadensart, versichertennummer, schadensort);
		
	
	
	return false;
	}
	}


