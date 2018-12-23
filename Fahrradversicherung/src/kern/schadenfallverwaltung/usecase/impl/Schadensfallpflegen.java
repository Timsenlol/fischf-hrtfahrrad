package kern.schadenfallverwaltung.usecase.impl;

import java.time.LocalDate;


import kern.Schadenfallverwaltungs.entity.internal.Adresse;
import kern.schadenfallverwaltung.usecase.ISchadensfallpflegen;

public class Schadensfallpflegen implements ISchadensfallpflegen{
	
	
	
	//public boolean validateSchadensfall(String tarif, LocalDate zeitpunkt, String beschreibung, String schadenshöhe,String schadensart, String versichertennummer) {
	//	boolean validate=true; 
//	double schadensgrenze = 1000.00; //Schadengrenze könnte man auch noch aus der DB holen
	
	//if (schadenshöhe>schadensgrenze) {
		//validate = false;
		//persönliche ?
		
	//	return false;
//	}
	//Rest aufruf gegen KundenKompente und Versichternnummer validiern?
	
	
		
		//return validate;
	//}
	
	public boolean schadensfallPrüfenundAnlegen(String tarif, LocalDate zeitpunkt, String beschreibung, String schadenshöhe,String schadensart, String versichertennummer, Adresse schadensort) {
		
		
		Schadensfallmanager sMngr= new Schadensfallmanager();
		sMngr.schadenfallAnlegen(tarif, zeitpunkt, beschreibung, schadenshöhe, schadensart, versichertennummer, schadensort);
		
	
	
	return false;
	}
	}


