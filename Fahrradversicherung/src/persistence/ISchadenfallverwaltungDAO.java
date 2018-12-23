package persistence;

import kern.Schadenfallverwaltungs.entity.SchadensfallTO;
import kern.Schadenfallverwaltungs.entity.internal.Schadensfall;

public interface ISchadenfallverwaltungDAO {

	public void schadensfallanlegen(SchadensfallTO schadensfall);
	public Schadensfall schadensfallsuchen(String versichertennummer);
	}
	

