package kern.schadenfallverwaltung.usecase.impl;


import java.time.LocalDate;


import kern.Schadenfallverwaltungs.entity.SchadensfallTO;
import kern.Schadenfallverwaltungs.entity.internal.Adresse;
import kern.Schadenfallverwaltungs.entity.internal.Schadensfall;
import persistence.ISchadenfallverwaltungDAO;
import persistence.ISchadenfallverwaltungDAOFactory;
import persistence.impl.SchadenfallverwaltungDAOFactory;

public class Schadensfallmanager {
	ISchadenfallverwaltungDAOFactory ssDAO= new SchadenfallverwaltungDAOFactory();
	ISchadenfallverwaltungDAO sDAO = ssDAO.getschadenfallverwaltungDAO();
	
	
	public void schadenfallAnlegen(String tarif, LocalDate zeitpunkt, String beschreibung, String schadenshöhe,String schadensart, String versichertennummer, Adresse schadensort) {
		
		SchadensfallTO sTO=new SchadensfallTO(tarif, zeitpunkt, beschreibung, schadenshöhe, schadensart, versichertennummer, schadensort);
		
		this.sDAO.schadensfallanlegen(sTO);
		
		
		
	}
	
	public Schadensfall schadensfallsuchen(String versichertennummer) {
		
	sDAO.schadensfallsuchen(versichertennummer);
		
		
		
		return null;
	}
	

}
