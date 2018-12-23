package kern.schadenfallverwaltung.usecase;

import kern.Schadenfallverwaltungs.entity.SchadensfallTO;

public interface ISchadensfallSuchen {
	
	SchadensfallTO schadensfallsuche(String versichertennummer);

}
