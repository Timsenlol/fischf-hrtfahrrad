package kern.schadenfallverwaltung.usecase.impl;

import kern.Schadenfallverwaltungs.entity.SchadensfallTO;
import kern.Schadenfallverwaltungs.entity.internal.Schadensfall;
import kern.schadenfallverwaltung.usecase.ISchadensfallSuchen;

public class SchadensfallSuchen implements ISchadensfallSuchen {
	
	
	public SchadensfallTO schadensfallsuche(String versichertennummer) {
		
		SchadensfallTO sfto= new SchadensfallTO();
		Schadensfall sf= new Schadensfall();
		
		Schadensfallmanager sfm= new Schadensfallmanager();
		sf=sfm.schadensfallsuchen(versichertennummer);
		
		sfto.setBeschreibung(sf.getBeschreibung());
		sfto.setSchadensart(sf.getSchadenart());
		sfto.setSchadenshöhe(sf.getSchadenshöhe());
		sfto.setTarif(sf.getTarif());
		sfto.setVersichertennummer(sf.getVersichternnummer());
		sfto.setZeitpunkt(sf.getZeitpunkt());
	
		
		
		
		return sfto;
	}

}
