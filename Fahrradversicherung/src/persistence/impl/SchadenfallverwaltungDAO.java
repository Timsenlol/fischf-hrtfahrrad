package persistence.impl;

import java.sql.Connection;
import java.sql.SQLException;

import kern.Schadenfallverwaltungs.entity.SchadensfallTO;
import kern.Schadenfallverwaltungs.entity.internal.Schadensfall;
import persistence.ISchadenfallverwaltungDAO;



public class SchadenfallverwaltungDAO implements ISchadenfallverwaltungDAO{
	
	Connection aConnection = Persistence.getConnection();
	public void schadensfallanlegen(SchadensfallTO schadensfall) {
		
		
		try {
		Persistence.executeUpdateStatement(
				aConnection, "INSERT INTO Schadensfall VALUES ( '" +
						schadensfall.getVersichertennummer() + "'," +
						"'"+ schadensfall.getTarif() + "'," +
						"'"+ schadensfall.getSchadensort().getStra�e() + "'," +
						"'"+ schadensfall.getSchadensort().getHausNr() + "'," +
						"'"+ schadensfall.getSchadensort().getPlz() + "'," +
						"'"+ schadensfall.getSchadensort().getOrt() + "'," +
						"'"+ schadensfall.getZeitpunkt()  + "'," + 
						"'"+ schadensfall.getSchadensart() + "'," +
						"'"+ schadensfall.getBeschreibung() +"'," + 
						"'"+ schadensfall.getSchadensh�he() + "')");




					





			}
	 catch (SQLException e) {
		e.printStackTrace();
	} finally {
		Persistence.closeConnection(aConnection);
	}
	}
	public Schadensfall schadensfallsuchen(String versichertennummer) {
		
		
		
		
	}
}

