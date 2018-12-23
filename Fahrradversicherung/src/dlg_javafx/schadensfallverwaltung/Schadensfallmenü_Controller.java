package dlg_javafx.schadensfallverwaltung;



import dlg_javafx.Hauptmenü;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



public class Schadensfallmenü_Controller {

	@FXML Button b_suche;
	@FXML Button b_erstellen;
	
private Hauptmenü screencontroller;
	
    public void setScreenController (Hauptmenü screencontroller) {
    	this.screencontroller = screencontroller;
    }
    
 
    
    
    
    @FXML
	public void schadensfallsuche() {
		screencontroller.anzeigen(Hauptmenü.SCHADENSFALLSUCHE);
	}
	
    @FXML
	public void schadensfallanlage() {
		screencontroller.anzeigen(Hauptmenü.SCHADENSFALLANLAGE);
	}
	
}
