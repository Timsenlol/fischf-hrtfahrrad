package kern.schadensfallverwaltung.factory;

import kern.schadenfallverwaltung.usecase.ISchadensfallSuchen;
import kern.schadenfallverwaltung.usecase.ISchadensfallpflegen;

public interface ISchadenfallverwaltungFactory {

	
	ISchadensfallpflegen getSchadenfallpflegen();
	ISchadensfallSuchen getSchadensfallsuchen();
}
