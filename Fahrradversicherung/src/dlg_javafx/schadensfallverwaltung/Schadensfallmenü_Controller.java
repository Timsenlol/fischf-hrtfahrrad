package dlg_javafx.schadensfallverwaltung;



import dlg_javafx.Hauptmen�;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



public class Schadensfallmen�_Controller {

	@FXML Button b_suche;
	@FXML Button b_erstellen;
	
private Hauptmen� screencontroller;
	
    public void setScreenController (Hauptmen� screencontroller) {
    	this.screencontroller = screencontroller;
    }
    
 
    
    
    
    @FXML
	public void schadensfallsuche() {
		screencontroller.anzeigen(Hauptmen�.SCHADENSFALLSUCHE);
	}
	
    @FXML
	public void schadensfallanlage() {
		screencontroller.anzeigen(Hauptmen�.SCHADENSFALLANLAGE);
	}
	
}
