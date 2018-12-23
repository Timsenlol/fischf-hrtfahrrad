package kern.schadensfallverwaltung.factory.impl;

import kern.schadenfallverwaltung.usecase.ISchadensfallSuchen;
import kern.schadenfallverwaltung.usecase.ISchadensfallpflegen;
import kern.schadenfallverwaltung.usecase.impl.SchadensfallSuchen;
import kern.schadenfallverwaltung.usecase.impl.Schadensfallpflegen;
import kern.schadensfallverwaltung.factory.ISchadenfallverwaltungFactory;

public class SchadensfallverwaltungFactory  implements ISchadenfallverwaltungFactory {

	
	public ISchadensfallpflegen getSchadenfallpflegen() {
		
		
		
		return new Schadensfallpflegen();
	}
	
	public ISchadensfallSuchen getSchadensfallsuchen() {
		return new SchadensfallSuchen();
	}

	
}
