package persistence.impl;

import persistence.ISchadenfallverwaltungDAO;
import persistence.ISchadenfallverwaltungDAOFactory;

public class SchadenfallverwaltungDAOFactory implements ISchadenfallverwaltungDAOFactory {

	
	public ISchadenfallverwaltungDAO getschadenfallverwaltungDAO() {
		return new SchadenfallverwaltungDAO();
	}
}
