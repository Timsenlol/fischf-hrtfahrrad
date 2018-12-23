package dlg_javafx.schadensfallverwaltung;

import javafx.scene.control.TextField;
import kern.Schadenfallverwaltungs.entity.internal.Adresse;
import kern.schadenfallverwaltung.usecase.ISchadensfallpflegen;
import kern.schadensfallverwaltung.factory.ISchadenfallverwaltungFactory;
import kern.schadensfallverwaltung.factory.impl.SchadensfallverwaltungFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import dlg_javafx.Hauptmenü;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

public class Schadensfallanlage_Controller implements Initializable {
	
	 @FXML
	  private Hauptmenü screencontroller;
	    
	 @FXML
	 private ComboBox<String> cmb_schadensart;

	 @FXML
	 private TextField txt_versNr;
	 @FXML
	 private TextField txt_vorname;
	 @FXML
	 private TextField txt_nachname;
	 @FXML
	 private TextField txt_straße;
	 @FXML
	 private TextField txt_hsnr;
	 @FXML
	 private TextField txt_plz;
	 @FXML
	 private TextField txt_ort;
	 @FXML
	 private TextField txt_tarif;
	 @FXML
	 private TextField txt_schadenshöhe;
	 @FXML
	 private TextField txt_beschreibung;
	 @FXML
	 private DatePicker zeitpunkt;
	 
	 @FXML
	 private DatePicker date_gb;
	 
	 public void initialize(URL location, ResourceBundle resources) {
		 cmb_schadensart.getItems().removeAll(cmb_schadensart.getItems());
		 cmb_schadensart.getItems().addAll("Unfall", "Diebstahl", "Beschädigung");
		 cmb_schadensart.getSelectionModel().select("Unfall");
	 }


	 
	  public void setScreenController (Hauptmenü screencontroller) {
	    	this.screencontroller = screencontroller;   	
	  }
	public void anlegen() {
		Adresse schadensort=new Adresse();
		schadensort.setHausNr(txt_hsnr.getText());
		schadensort.setOrt(txt_ort.getText());
		schadensort.setPlz(txt_plz.getText());
		schadensort.setStraße(txt_straße.getText());
		
		
		String schadensart=cmb_schadensart.getValue();
		String versichertennummer=txt_versNr.getText();
		String schadenshöhe=txt_schadenshöhe.getText();
		String tarif=txt_tarif.getText();
		String beschreibung=txt_beschreibung.getText();
		
		
				
		LocalDate zeitpunkte= zeitpunkt.getValue();
		LocalDate gb=date_gb.getValue();
		
		ISchadenfallverwaltungFactory sfFac=new SchadensfallverwaltungFactory();
		ISchadensfallpflegen sfp= sfFac.getSchadenfallpflegen();
		sfp.schadensfallPrüfenundAnlegen(tarif, zeitpunkte, beschreibung, schadenshöhe, schadensart, versichertennummer, schadensort);
		
		
	}
	
}
