package kern.Schadenfallverwaltungs.entity.internal;

import java.time.LocalDate;


public class Schadensfall {
	public String tarif;
	public LocalDate zeitpunkt;
	public String beschreibung;
	public String schadenshöhe;
	public String Schadenart;
	public String Versichternnummer;
	public Adresse schadensort;
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
	public String getSchadenart() {
		return Schadenart;
	}
	public void setSchadenart(String schadenart) {
		Schadenart = schadenart;
	}
	public String getVersichternnummer() {
		return Versichternnummer;
	}
	public void setVersichternnummer(String versichternnummer) {
		Versichternnummer = versichternnummer;
	}
	public Adresse getSchadensort() {
		return schadensort;
	}
	public void setSchadensort(Adresse schadensort) {
		this.schadensort = schadensort;
	}
	

	
	
	

}
