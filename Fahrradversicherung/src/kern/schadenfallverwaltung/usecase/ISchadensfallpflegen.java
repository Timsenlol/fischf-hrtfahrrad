package kern.schadenfallverwaltung.usecase;

import java.time.LocalDate;


import kern.Schadenfallverwaltungs.entity.internal.Adresse;

public interface ISchadensfallpflegen {
	
	public boolean schadensfallPr�fenundAnlegen(String Tarif, LocalDate Zeitpunkt, String beschreibung, String schadensh�he,String Schadensart, String Versichertennummer, Adresse schadensort );

}
