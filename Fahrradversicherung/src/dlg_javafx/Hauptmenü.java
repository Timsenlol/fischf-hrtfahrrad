package dlg_javafx;


import dlg_javafx.schadensfallverwaltung.Schadensfallanlage_Controller;
import dlg_javafx.schadensfallverwaltung.Schadensfallmenü_Controller;
import dlg_javafx.schadensfallverwaltung.Schadensfallsuche_Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Hauptmenü extends Application {

	private Scene schadensfallmenü;
	private Scene schadensfallsuche;
	private Scene schadensfallanlage;
	
	
	public static final String SCHADENSFALLMENÜ = "schadensfallmenü";
	public static final String SCHADENSFALLSUCHE = "schadensfallsuche";
	public static final String SCHADENSFALLANLAGE = "schadensfallanlage";
	
	private Stage mainStage;
	public Hauptmenü screenscontroller;
	
	
	@Override
	public void start(Stage primaryStage) {
		this.mainStage = primaryStage;
		mainStage.setTitle("FischFährtFahrrad");
		try {
			FXMLLoader loader;
			
			loader = new FXMLLoader(getClass().getResource("schadensfallverwaltung/Schadensfallmenü.fxml"));			
			Parent menü_pane = (Parent) loader.load();
			this.schadensfallmenü = new Scene(menü_pane,600,600);
			this.schadensfallmenü.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Schadensfallmenü_Controller ctrlSchadensfallmenü = loader.getController();
			ctrlSchadensfallmenü.setScreenController(this);
			
			loader = new FXMLLoader(getClass().getResource("schadensfallverwaltung/Schadensfallsuche.fxml"));
			Parent schadenfallsuche_pane = (Parent)loader.load();
			this.schadensfallsuche = new Scene(schadenfallsuche_pane,700,500);
			this.schadensfallsuche.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Schadensfallsuche_Controller ctrlSchadenfallsuche = loader.getController();
			ctrlSchadenfallsuche.setScreenController(this);
			
			loader = new FXMLLoader(getClass().getResource("schadensfallverwaltung/Schadensfallanlage.fxml"));
			Parent schadenfallanlage_pane = (Parent) loader.load();
			this.schadensfallanlage = new Scene(schadenfallanlage_pane,600,400);
			this.schadensfallanlage.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Schadensfallanlage_Controller ctrlSchadenfallanlage = loader.getController();
			ctrlSchadenfallanlage.setScreenController(this);
			
			anzeigen(Hauptmenü.SCHADENSFALLMENÜ);
			
						
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	
	
		
	}
	public void anzeigen (String screen) {
		
		switch (screen) {
			case Hauptmenü.SCHADENSFALLMENÜ: mainStage.setScene(schadensfallmenü);
				break;
			case Hauptmenü.SCHADENSFALLSUCHE: mainStage.setScene(schadensfallsuche);
				break;
			case Hauptmenü.SCHADENSFALLANLAGE: mainStage.setScene(schadensfallanlage);
				break;
		}
		
		mainStage.sizeToScene();
		mainStage.show();
	}
	
	public static void Start_Dialog() {
		launch();
	}


}
