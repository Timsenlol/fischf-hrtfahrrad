package kern.Schadenfallverwaltungs.entity;

import java.time.LocalDate;


import kern.Schadenfallverwaltungs.entity.internal.Adresse;

public class SchadensfallTO {

	
	public String tarif;
	public LocalDate zeitpunkt;
	public String beschreibung;
	public String schadenshöhe;
	public String schadensart;
	public String versichertennummer;//nochmal überprüfen
	public Adresse schadensort;
	
	
	public SchadensfallTO(){
		
	}
	
	public SchadensfallTO(String tarif, LocalDate zeitpunkt, String beschreibung, String schadenshöhe,String schadensart, String versichertennummer, Adresse schadensort) {
		this.tarif=tarif;
		this.zeitpunkt=zeitpunkt;
		this.beschreibung=beschreibung;
		this.schadenshöhe=schadenshöhe;
		this.schadensart=schadensart;
		this.versichertennummer=versichertennummer;
		this.schadensort=schadensort;
	}

	public String getTarif() {
		return tarif;
	}

	public void setTarif(String tarif) {
		this.tarif = tarif;
	}

	public LocalDate getZeitpunkt() {
		return zeitpunkt;
	}

	public void setZeitpunkt(LocalDate zeitpunkt) {
		this.zeitpunkt = zeitpunkt;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getSchadenshöhe() {
		return schadenshöhe;
	}

	public void setSchadenshöhe(String schadenshöhe) {
		this.schadenshöhe = schadenshöhe;
	}

	public String getSchadensart() {
		return schadensart;
	}

	public void setSchadensart(String schadensart) {
		this.schadensart = schadensart;
	}

	public String getVersichertennummer() {
		return versichertennummer;
	}

	public void setVersichertennummer(String versichertennummer) {
		this.versichertennummer = versichertennummer;
	}

	public Adresse getSchadensort() {
		return schadensort;
	}

	public void setSchadensort(Adresse schadensort) {
		this.schadensort = schadensort;
	}
	
	

	
	
	
	
}
