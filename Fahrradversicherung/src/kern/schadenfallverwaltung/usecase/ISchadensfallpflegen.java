package kern.schadenfallverwaltung.usecase;

import java.time.LocalDate;


import kern.Schadenfallverwaltungs.entity.internal.Adresse;

public interface ISchadensfallpflegen {
	
	public boolean schadensfallPrüfenundAnlegen(String Tarif, LocalDate Zeitpunkt, String beschreibung, String schadenshöhe,String Schadensart, String Versichertennummer, Adresse schadensort );

}
